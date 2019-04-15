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
public class WszystkiePodzielne {

    public static void main(String[] args) {
        przez2( 1, 100);
        System.out.println("******************************");
        przez3( 1, 100);

    }
    private static void przez2(int a, int b){
        for(int i = a; i <=b; i++){

            if( i%2 == 0)
                System.out.println("Podzielne przez 2:       " + i);
        }
    }

    private static void przez3(int a, int b){
    for(int i = a; i <=b; i++){

        if( i%3 == 0)
            System.out.println("Podzielne przez 3:       " + i);
    }
}
}


