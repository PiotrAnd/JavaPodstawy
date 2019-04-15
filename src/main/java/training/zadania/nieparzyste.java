package training.zadania;
import java.util.Scanner;
import java.util.Random;

//LICZBY NIEPARZYSTE
//
//Do tablicy o rozmiarze 100 elementów losowane są liczby typu całkowitego dodatnie.
//
//Użytkownik podaje dolny i górny index z którego chce zobaczyć liczby nieparzyste.
//
//Wybrane liczby są zapisane do nowej tablicy przeznaczonej do tego, np. o nazwie tablicaNieparzystych.
//
//Liczby są wyświetlane i prezentowane z tej tablicy przeznaczonej do tego.
public class nieparzyste {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nieparzyste = new int[100];
        //int[] nie = new int[200];
        System.out.println("Podaj dolny index: ");
        int min = new Scanner(System.in).nextInt();
        System.out.println("Podaj górny index: ");
        int max = new Scanner(System.in).nextInt();

        System.out.println("liczby nieparzyste z przedziału: "+ min +":"+ max);
        for (int j = 1; j < 100; j++) {
            nieparzyste[j] = (r.nextInt(max-min)+min);
            if (nieparzyste[j] % 2 == 0) {
                continue;
            }
            //else if (nieparzyste[j]>min && nieparzyste[j]<max);

            System.out.println(nieparzyste[j]);
        }
    }
}

