package training.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    private static String regex;
    private static String input;


    public static void main(String[] args) {
        simpleRegexMatch();
        exaclyOneWord();
        testSentenceWithoutNumbers();
        passwordTest();
        replaceWordInSentence();
        removeSpaces();
    }

    private static void removeSpaces() {
        input = "    Ala       ma      kota    .";
        regex = "\\s\\s+";//regex ="( +)" equal to above
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String newSent = matcher.replaceAll( " ");
        System.out.println(input);
        System.out.println(newSent);
        bar();
    }

    private static void replaceWordInSentence() {
        input = "cats are very nice until don`t meet other cat.";
        regex = "cat";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String newSentence = matcher.replaceAll("dog");
        System.out.println(newSentence);
        bar();
    }

    private static void passwordTest() {
        input = "GGaaa12$";
        regex = "[a-zA-Z_0-9!@#]";
        System.out.println("Times: " + runTest(regex,input));
    }

    private static void testSentenceWithoutNumbers() {
        input = "Ola ma trzy koty i dwa psy";
        regex = "\\d";
        System.out.println("Is present number: " + (runTest(regex, input) >0) );
        bar();

    }

    private static void exaclyOneWord() {
        regex = "\\W+Ola\\W+";
        input = "K.ola,ma polanka a        Ola             nie";
        System.out.println("Times: " + runTest(regex,input));
    }

    private static void simpleRegexMatch() {

        regex = "ala";
        input = "Ala ma kota kalA";//ctrl+ alt+f - -dodawanie zmiennej
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        System.out.println("is there: " + matcher.find());
        System.out.println("times: " + runTest(regex, input));
        bar();
    }

    private static int runTest(String reg, String text){
        int matches = 0;
        Pattern pattern= Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            matches++;
        }

        return matches;
    }
    private static void bar(){
        System.out.println("---------------------------------");
    }
}
