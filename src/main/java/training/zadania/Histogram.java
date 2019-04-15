package training.zadania;

import java.util.Random;

//HISTOGRAM
//Program losuje liczby z zakresu od 1 do 20. Losowanie jest dokonywane conajmniej 50 razy. Ilość ile razy dana liczba została wylosowana jest zapisywana do tablicy.
//Z wartości ile razy została wylosowana liczba tworzony jest histogram. Na początek w pierszym podejściu wystarczy wypisać informację:
//1 - 3 razy
//2 - 0 razy
//19 - 1 razy
//+
//Dla bardziej zaawansowanego ćwiczenia można zrobić pseudografikę w konsoli
//5 |
//4 |
//3 | X             X
//2 | X             X
//1 | X          X  X
//___________________
//    1 2 ..... 19 20
public class Histogram {
    public static void main(String[] args) {
        int[] tab = new int[20];
        Random random = new Random();
        for (int i = 0; i<50; i++){
            int ranNumber = random.nextInt(19)+1;
            tab[ranNumber-1] = tab[ranNumber-1]+1;
            }
            for (int i = 0; i<10; i++){
        System.out.println("Liczba " + (i+1) + " została wylosowana " + tab[i]+" razy.");
        }
    }
}
