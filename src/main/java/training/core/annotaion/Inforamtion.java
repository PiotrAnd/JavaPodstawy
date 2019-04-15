package training.core.annotaion;


import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.TYPE,
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.CONSTRUCTOR
        })

@Documented
public @interface Inforamtion {
    String author() default "Programmer";
    String date();
    String description();

}
