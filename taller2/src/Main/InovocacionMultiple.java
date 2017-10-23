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
@Target (ElementType.METHOD)
public @interface InovocacionMultiple {
    
    int vecesAInvocar() default 1;
}
