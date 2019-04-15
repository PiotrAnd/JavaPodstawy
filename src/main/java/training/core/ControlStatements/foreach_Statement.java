package training.core.ControlStatements;

public class foreach_Statement {

    static String sentence = " Ala ma kota a to jest łaciaty i pstry.";

    public static void main(String[] args) {
        exampleWichCharArray();
        exampleWichStringArray();
    }

    private static void exampleWichStringArray() {
       String[] strings = sentence.split( " ");
       for (String word : strings) {
           System.out.println(word);
       }
    }

    private static void exampleWichCharArray() {
        char[] chars = sentence.toCharArray();

        System.out.println("default witch for");
        for (int i = 0 ; i< chars.length; i++) {
        }
        System.out.println("foreach example");
        for (char sign : chars) {
            System.out.println(sign);
        }
    }
}
