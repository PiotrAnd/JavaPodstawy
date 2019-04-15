package training.zadania;

import java.util.Scanner;

public class PalindromLiczby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int liczba = sc.nextInt();
        int temp = liczba, reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10;
            reverse = reverse + temp % 10;
            temp = temp / 10;
        }
        if (liczba == reverse)
            System.out.println("Liczba " + liczba + " jest Palindromem");
        else
            System.out.println("Liczba " + liczba + " nie jest Palindromem");
    }
}








