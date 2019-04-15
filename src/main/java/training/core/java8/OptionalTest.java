package training.core.java8;

import org.junit.Test;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OptionalTest {

    @Test
    public void emptyOptionalIsOK() {
        Optional<Stream> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void stringOptionalIsOK() {
        Optional<String> empty = Optional.of("Java");
        assertTrue(empty.isPresent());
    }

    @Test
    public void stringOptionalReturnIsOK() {
        String input = "Java";
        Optional<String> val = Optional.of(input);
        String expected = String.format("Optional[%s]", input);
        assertEquals(expected, val.toString());
    }

    @Test(expected = NullPointerException.class)// dopisujemu to czego się spodziewamy, bo inaczej test nie wyjdzie
    public void nullToOptionalIsNotOK() {
        Optional<String> empty = Optional.of(null);
        assertFalse(empty.isPresent());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void arrayBeyondIsNotOK() {
        int[] tab = {1, 3, 5, 6};
        int val = tab[-1];
    }

    @Test//null jest akceptowany, po to by nie wyskakiwal wyjatek gdy chcemy wyswietlic np 50 liczb i w ktorych wystepuje wartosc null
    public void nullToOptionalIsOK() {
        Optional<String> empty = Optional.ofNullable(null);
        assertFalse(empty.isPresent());
    }

    @Test
    public void stringOptionalIsOKAndMightProcced() {
        String word = "Java";
        if (word != null) {
            System.out.println(word.length());
        }
        Optional<String> WORD = Optional.of(word);
        if (WORD.isPresent()){
            System.out.println(WORD.get().length());
        }
        WORD.ifPresent(s-> System.out.println(s.length()));
    }
    @Test
    public void nullToOptionalIsOKWithElseOption() {
        String name = null;
        String person = Optional.ofNullable(name).orElse("NN");
        assertEquals( "NN",person);
    }
    @Test
    public void nullToOptionalIsOKWithElseOptionGetOption() {
        String name = null;
        String person = Optional
                .ofNullable(name)
                .orElseGet(()->"NN");
        assertEquals( "NN",person);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullToOptionalIsOKOrThrowExeption() {
        String name = null;
        String person = Optional.ofNullable(name).orElseThrow(IllegalArgumentException::new);
        assertEquals( "NN",person);
    }

}
