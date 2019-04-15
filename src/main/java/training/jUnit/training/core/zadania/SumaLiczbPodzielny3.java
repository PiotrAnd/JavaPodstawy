package training.jUnit.training.core.zadania;
//Przy wykorzystaniu pętli for wypisz liczby z przedziału 200 – 299, zapamiętaj w tablicy, a następnie wyświetl sumę liczb podzielnych przez 3
public class SumaLiczbPodzielny3 {
    public static void main(String[] args) {
        suma( 200, 299, 0);

    }
    private static void suma(int a, int b, int sum) {
        for (int i = a; i <= b; i++) {

            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Suma liczb podzielnych przez 3 wynosi: " + sum);
    }
    }
