package training.zadania;


public class Triangle {
    public static void main(String[] args) {

        int size = 7;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i >= j)
                    System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("*************");
        for (int i = 0; i <= size; i++) {
            for (int j = size; j >= 0; j--) {
                if (i <= j)
                    System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("");
        for (int i = 0; i <= size; i++) {
            for (int j = size; j >= 0; j--) {
                if (i < j)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println(" ");
        }
        System.out.println("");
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i > j)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}

