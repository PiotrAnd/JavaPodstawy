package training.core.generic;

import sun.security.util.Length;

public class GenericMethodExample {

    static <T> void displayArray(T[] intArray){
        for (T i : intArray){
            System.out.printf("%s, ",i);
        }
        System.out.println();
    }
    @Deprecated
    static <E> Integer[] converter(E[] inputArray){
        Integer[] outputArray = new Integer[inputArray.length];
        int idx = 0;
        for (E el : inputArray){
            int lenght = new String(el.toString()).length();
            outputArray[idx++]  = lenght;
        }

        return outputArray;
    }

    public static void main(String[] args) {
        Integer[] integers = {3,5,1,6,7,8};
        Double[] doubles = {0.6,22.5,12.99,2.0};
        Character[] characters = {'H', 'E', 'L', 'L', 'O'};
        String[] strings = {"Hello", "World", "Welcome"};

        displayArray(integers);
        displayArray(doubles);
        displayArray(characters);
        displayArray(strings);

        displayArray(converter(strings));
        displayArray(converter(characters));
        displayArray(converter(integers));
        displayArray(converter(doubles));
    }
}
