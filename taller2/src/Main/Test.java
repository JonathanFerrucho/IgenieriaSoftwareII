package Main;

/**
 *
 * @author jonat
 */
public class Test {
    
    public static void main(String[] args) {
        Ascensor ascensor= Instancia.newAscensor();
        ascensor.subirDosPisos();
        ascensor.subirPiso();
        ascensor.bajarTresPisos();
        ascensor.subirPiso();
        
    }
}
