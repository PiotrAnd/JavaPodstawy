package training.zadania;
//LICZBY PODZIELNE PRZEZ
//
//Do tablicy o rozmiarze 100 elementów losowane są liczby typu całkowitego dodatnie. W losowaniu mogą zdarzyć się powtórzenia wylosowanych liczb.
//
//Do nowej tablicy wpisywane są liczby podzielne tylko przez 2
//
//Do nowej tablicy wpisywane są liczby podzielne tylko przez 3
//
//Do nowej tablicy wpisywane są liczby podzielne tylko przez liczbę podaną przez użytkownika.
//
//Wyświetlanie wyników tylko z nowo powstałych tablic z rezultatami.
import java.util.Random;

public class LiczbyPodzielnePrzez {
    public static void main(String[] args) {
        int tab[] =new int[100];
        int iloscLiczb = 0;
        int iloscLiczb2 = 0;
        int iloscLiczb3 = 0;

        Random losowanie = new Random();


        while (true){
            int wylosowanaLiczba = losowanie.nextInt(100);
            if (wylosowanaLiczba%2==0 || wylosowanaLiczba%3==0){
                tab[iloscLiczb]=wylosowanaLiczba;
                iloscLiczb=iloscLiczb+1;
            }
            if (iloscLiczb==100)
                break;
        }

        for (int i =0; i<100; i++){
            if (tab[i]%2==0)
                iloscLiczb2++;
            if (tab[i]%3==0)
                iloscLiczb3++;
        }
        int[] tab2 = new int[iloscLiczb2];
        int[] tab3 = new int[iloscLiczb3];
        int i2=0;
        int i3=0;
        for (int i = 0; i<100; i++){
            if (tab[i]%3==0){
                tab3[i3]= tab[i];
                i3++;
            }
        }
        for (int i =0; i<100; i++){
            if (tab[i]%2==0) {
                tab2[i2] = tab[i];
                i2++;
            }

        }
        System.out.println("Tablica liczb podzielnych przez 3");
        for (int i=0; i<tab3.length; i++)
            System.out.println(tab3[i]);
        System.out.println("Tablica liczb podzielnych przez 2");
        for (int i =0; i<tab2.length; i++)
            System.out.println(tab2[i]);
    }
}



