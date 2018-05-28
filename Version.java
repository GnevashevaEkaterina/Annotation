import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    int value();
    String author();
    Date creationDate();
    Class<?> previous() default Void.class;

}
