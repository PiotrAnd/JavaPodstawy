package training.zadania;
//Zadnie z tablicami jednowymiarowymi:
//
//Do tablicy typu int wylosuj liczby a następnie:
//
//1. wyświetl najmniejszą wartość i info na jakiej pozycji występuje
//
//2. wyświetl wartość największą,  i info jak wyżej
//
//3. średnią wartość liczb
//
//4. sumę wszystkich liczb

import java.util.Random;

public class Tablice {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
            tab[i]= r.nextInt(10);
            System.out.println("n[" + i +"]="+ tab[i]);
        }
        int max = 0;
        int index=0;
        for (int i=0;i<tab.length;i++){
            if (tab[i]>max){
                max=tab[i];
                index=i;

            }

        }
        System.out.println("Wartość największa: " + max + " na indeksie: " + index);

        int min = 200;
        for (int i=0;i<tab.length;i++) {
            if (tab[i] < min) {
                min = tab[i];
                index = i;
            }
        }
        System.out.println("Wartość najmniejsza: " + min + " na indeksie: " + index);

        int suma = 0;
        for (int sumy:tab){
            suma+= sumy;
        }
        System.out.println("Suma wylosowanych liczb wynosi: " + suma);

        int srednia = suma/tab.length;
        System.out.println("Srednia wylosowanych liczb wynosi: " + srednia);

    }
}



