package training.core.ControlStatements;

public class while_Statement {
    public static void main(String[] args) {

        simpleExample();
        exampleWichChecking();
    }

    private static void exampleWichChecking() {
        int counter = 0;
        while (!isEnd(counter)) {
            System.out.println(++counter);
        }
    }

    private static boolean isEnd(int counter) {
        if (counter>15) return true;
        return false;
        }
    private static boolean isActive(int counter) {
        if (counter > 15) return false;
        return true;
    }

    private static void simpleExample() {
        int counter = 0;
        while (true) {
            if (++counter % 5 == 0) continue;
            if (counter > 23) break;

            System.out.println(counter);

        }
    }
}
