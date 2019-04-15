package training.zadania;

import java.util.Random;
import java.util.Scanner;

public class Zgadula {
    public static void main(String[] args) {
        int randomInt = new Random().nextInt(100);
        System.out.println("Podaj liczbę: ");
        int fromuser = new Scanner(System.in).nextInt();

        if (randomInt==fromuser)
            System.out.println("Winner");
        if(randomInt>fromuser)

        System.out.println("Za mała wartość");
        if (randomInt<fromuser)
            System.out.println("Za duża wartość");

    }
}
