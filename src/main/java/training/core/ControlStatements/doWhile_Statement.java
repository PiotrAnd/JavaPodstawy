package training.core.ControlStatements;

public class doWhile_Statement {
    public static void main(String[] args) {
        exampleWichStopNow(false);
    }

    private static void exampleWichStopNow(boolean isRun) {
        do {
            System.out.println("I`m running");
        }while (isRun);
    }
}
