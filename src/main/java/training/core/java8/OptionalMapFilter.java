package training.core.java8;
//czy hasło spełnia wymagania


import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

public class OptionalMapFilter {


        @Test
        public void passwordFillRequarments() {
            String pass = " TrustNo1";
            Optional<String> optPass = Optional.of(pass);
            Integer len = optPass.map(String::length)
                    .orElse(0);
            assertTrue("Too short",len >= 8);

            boolean correct = optPass
                    .filter(p -> test(p,"[A-Z]"))
                    .filter(p -> test(p,"[0-9]"))
                    .isPresent();
            assertTrue(correct);
        }

        public static boolean test(String p, String reg){
            Pattern pattern = Pattern
                    .compile(reg);
            Matcher matcher = pattern.matcher(p);
            return matcher.find();
        }
    }


    /* @Test
    public void passwordFillRequarments(){
        String pass = " TrustNo1";
        // Czy hasło ma odpowiednią długość???
        Optional<String> optPass = Optional.of(pass);
        //pobieramy długość
        Integer len = optPass.map(String::length).orElse(0);
        //sprawdzenei czy hasło ma wiecej niż 8 znaków
       assertTrue( "Too short", len >= 8);
       //Czy zawiera male i duze litery

        boolean correct = optPass
                .filter(p -> test(p, "[A-Z]"))
                .filter(p -> test(p, "[0-9]"))
                .isPresent();
        assertTrue(correct);
    }
    @Test
    public static boolean test(String p, String reg){
        Pattern pattern = Pattern
                .compile(reg);
        Matcher matcher = pattern.matcher(p);
        return matcher.find();
    }

}
*/
