package training.core;

interface Greet {
    void sayHello();

    void greeting(String name);

    default void great(){
        System.out.println("Welcome");
    }
}
