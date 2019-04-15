package training.zadania;

        import java.util.Scanner;

//LICZBY PIERWSZE
//
//Użytkownik podaje liczbę większą od zera, np NNN. Program ma za zadanie przygotować tablicę liczb pierwszych mniejszą równą NNN.
//
//Otrzymana tablica jest prezentowana na konsoli.
public class LiczbyPierwsze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę ");
        int liczba = sc.nextInt();
        for (int i = 2; i <= liczba; i++) {
            for (int j = 2; j<=i; j++){
            if (j==i){
                System.out.println(i);
            }
            if (i%j==0){
                break;
            }
            }
        }
    }
}

