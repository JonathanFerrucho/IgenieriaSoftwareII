package Main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author jonat
 */

@Retention(RetentionPolicy.RUNTIME)
@Target (ElementType.CONSTRUCTOR)
public @interface PostConstructor {
    
    String nomre() default "JONATHAN FERRUCHO";
}
