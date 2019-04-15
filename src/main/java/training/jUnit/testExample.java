package training.jUnit;

import com.sun.javafx.binding.StringFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class testExample {

    @Test
    public void wordIsNotEmpty(){
        String word = "Ala";

        Assert.assertFalse(word.isEmpty());
    }
    @Test
    public void wordIsEqualToSelfUppercase(){
        String input = "Ala";
        String expected = "ALA";
        Assert.assertEquals(expected, input.toUpperCase());

    }
    @Test
    public void listContainsParticularWord_isMinLengthOf3(){
        List<String> list = Arrays.asList("Jan", "Tom", "Rob", "John", "Ala");
        assertTrue(list.size()>2);
        assertTrue("List without Ala",list.contains("Ala"));
    }


}
