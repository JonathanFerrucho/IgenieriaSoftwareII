package Main;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.net.URL;
import java.net.URLClassLoader;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;


/**
 *
 * @author jonat
 */
public class Instancia {
    
    public static Ascensor newAscensor() {
        try {
            return (Ascensor) newInstancia(Ascensor.class);
            
        } catch (Exception e) {
            throw new RuntimeException(
                    "No se pudo crear una nueva instancia de la clase: ",e);
        }
    }
    
    public static Object newInstancia(Class clase) throws Exception{
        
        // crar un nuevo archo con el proxy
        File src= new File("src");
        File f= new File(src, clase.getCanonicalName().replaceAll("\\.", "/")
                +"Proxy.java");
        
        // escribir en el archivo el codigo fuente requerido para el correcto
        // funcionamiento de la anotacion
        
        StringBuilder sb= new StringBuilder();
        sb.append("package "+ clase.getPackage().getName() +";"); // paquete
        sb.append("public class "+ clase.getSimpleName()+ "Proxy extends " +
                clase.getSimpleName()+ "{");
        
       
        
        
        // se validada si el metodo esta anotado
        for(Method metodo: clase.getDeclaredMethods()){
            if(metodo.getAnnotations()!= null){
                // los modificadores son los siguientes 
                sb.append(modifierFromString(metodo.getModifiers())+ " "
                        + metodo.getReturnType().getName()+ " "
                        + metodo.getName()+ "(");
                
                for (Parameter parametro: metodo.getParameters()) {
                    sb.append(parametro.getType().getName()+ " "
                            + parametro.getName());
                }
                sb.append(") {"); // cierre del parametro del metodo
                
                
                // procesar cada anotacion
                if(metodo.getAnnotation(InovocacionMultiple.class) != null){
                    InovocacionMultiple anotacion= metodo.getAnnotation(
                            InovocacionMultiple.class);
                    
                    // se llama un determindado numero de veces el metodo
                    for (int i = 0; i < anotacion.vecesAInvocar()-1; i++) {
                        sb.append("super."+ metodo.getName()+ "(");
                         for(Parameter parametro: metodo.getParameters()){
                             sb.append(parametro.getName());
                         }
                         sb.append(");"); //cierre del llamada del metodo
                    }
                    
                    //llama finalmente el metodo el elemento padre
                    sb.append("super. "+ metodo.getName()+ "(");
                    for(Parameter parametro: metodo.getParameters()){
                        sb.append(parametro.getName());
                    }
                    sb.append(");"); //cierre del llamada del metodo
                }
                sb.append("}");// cierre de la definicion del metodo P´roxy
            }
        }
        sb.append("}");// cierre de la definicion de la clase P´roxy
        
        //almacenar el codigo en el archivo
        FileWriter fw= new FileWriter(f);
        fw.write(sb.toString());
        fw.flush();
        fw.close();
        
        // se compila la clase Proxy
        JavaCompiler compiler= ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, f.getPath());
        
        // se incluye en el classpath        
        URLClassLoader classLoader= URLClassLoader.newInstance(
                new URL[] {src.toURI().toURL()}); 
        Class<?> cls= Class.forName(clase.getCanonicalName()+ "Proxy", 
                true, classLoader);
        
        //borramos el acrchivo
        f.delete();
        new File(src, clase.getCanonicalName().replaceAll("\\.", "/")+ 
                "Proxy.class").delete();
        
        //debuelve la instancia
        return cls.newInstance();
    }
    
    private static String modifierFromString(int m){
        switch (m){
            case Modifier.PUBLIC:
            return "public";
            
            case Modifier.PROTECTED:
            return "protected";
            
            case Modifier.PRIVATE:
            return "private";
            
            case Modifier.STATIC:
            return "static";
            
            case Modifier.FINAL:
            return "final";
            
            case Modifier.TRANSIENT:
            return "transient";
            
            case Modifier.VOLATILE:
            return "volatile";
        }
        return null;
    } 
}
