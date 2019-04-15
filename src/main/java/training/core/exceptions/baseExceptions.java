package training.core.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.logging.Level;
import java.util.logging.Logger;

public class baseExceptions {
    static Logger logger = Logger.getLogger(baseExceptions.class.getName());

    public static void main(String[] args) throws RangeException { // ctrl+alt+enter - wywoywanie//
        NullPointerExceptionMethod();

        try {
            RangeExceptionsMethod("word", 8);
        } catch (RangeException e) {
            e.printStackTrace();
        }
        readFileWithFinallyBlok();
        readFileWithTryResourceCatch();
    }

    private static void readFileWithTryResourceCatch() {
        try (FileReader fr= new FileReader( "dummy.xml")){
            char[] text = new char[50];
            fr.read(text);
        }catch (IOException e){
            System.out.println("*******************************");
            e.printStackTrace();
        }
    }

    private static void readFileWithFinallyBlok() {
        File file = new File("dummy.file.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] text = new char[50];
            fr.read(text);
            for (char c : text) {
                System.out.println(c);
            }
        } catch (IOException e) {//polecenie wejscia wyjscia - IOEx...
            e.printStackTrace();
        } finally {//gdy wystapi blad lub nie
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void RangeExceptionsMethod(String word, int pos) throws RangeException {
        if (pos >= 0 && pos < word.length()) {
            System.out.println(word.charAt(pos));
        } else {
            throw new RangeException();
        }
    }

    private static void NullPointerExceptionMethod() {
        String nullString = null;
        try {
            if (nullString == null) {
                throw new NullPointerException("String is null!!!");
            }
            Integer integer = Integer.parseInt(nullString);
        } catch (NumberFormatException | NullPointerException e) {
            logger.log(Level.SEVERE, "Try to perse: " + nullString);
            logger.log(Level.SEVERE, e.toString());

        } catch (Exception e) {
            logger.log(Level.SEVERE, "General exception");
        }
    }
}
