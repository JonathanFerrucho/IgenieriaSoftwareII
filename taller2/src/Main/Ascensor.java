package Main;

/**
 *
 * @author jonat
 */
public class Ascensor {
    
    private int piso=1;

    @PostConstructor
    public Ascensor() {
        String nombre="NOMBRE ";
        
        System.out.println(nombre);
    }
    
    
    @InovocacionMultiple
    public  void subirPiso(){
        piso++;
        System.out.println("Subiendo 1 piso: "+ piso);
    }
    
    @InovocacionMultiple(vecesAInvocar = 2)
    public void subirDosPisos(){
        piso++;
            System.out.println("Subiendo 2 pisos: "+ piso);
    }
    
    @InovocacionMultiple(vecesAInvocar = 3)
    public void bajarTresPisos(){
        piso--;
        System.out.println("Bajando 3 pisos: "+ piso);
    }
    
}
