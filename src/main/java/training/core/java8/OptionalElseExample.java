package training.core.java8;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalElseExample {
    public String defaultValue() {
        System.out.println("Calculate default value");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "Default";
    }
    @Test
    public void getDefaultIfTextIsNull(){
        String text = null;
        System.out.println("OrElse");
        String exp_1 = Optional.ofNullable(text).orElse(defaultValue());
        assertEquals("Default", exp_1);
        System.out.println("OrElseGet");
        String exp_2 = Optional.ofNullable(text)
                .orElseGet(this::defaultValue);
        assertEquals("Default", exp_2);
    }
    @Test
    public void getDefaultIfTextIsNotNull(){
        String text = "Info";
        System.out.println("OrElse");
        String exp_1 = Optional.ofNullable(text).orElse(defaultValue());
        assertEquals("Info", exp_1);
        System.out.println("OrElseGet");
        String exp_2 = Optional.ofNullable(text)
                .orElseGet(this::defaultValue);
        assertEquals("Info", exp_2);
    }
}
