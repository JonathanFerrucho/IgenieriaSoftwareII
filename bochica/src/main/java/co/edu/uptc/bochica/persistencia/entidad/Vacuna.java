package co.edu.uptc.bochica.persistencia.entidad;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
 * @generated @author daperador
 */
@Entity
@Table(name = "Vacuna")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Vacuna.obtenerTodos", query = "select e from Vacuna e")
})
public class Vacuna {

    @Id
    //@Column(name = "Vacuna_id")
    @GeneratedValue(generator = "VacunaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "VacunaGen", sequenceName = "Vacuna_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated 1-1-false
     */
    //@Column(name = "nombre")
    private String nombre;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "descripcion")
    private String descripcion;

    @ManyToMany(cascade={},fetch=javax.persistence.FetchType.LAZY, mappedBy = "vacunas")
    private List<Enfermedad> enfermedades;
    
    /**
     * @generated 0--1-true
     */
    @OneToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY, mappedBy = "vacuna")
    private List<Dosis> dosis;
    
    /**
     * @generated
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @generated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @generated
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * @generated
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Enfermedad> getEnfermedades(){
        if(enfermedades==null){
                enfermedades=new ArrayList<Enfermedad>(); 
        }
        return this.enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades){
            this.enfermedades=enfermedades;
    }
    public List<Dosis> getDosis(){
        if(dosis==null){
                dosis=new ArrayList<Dosis>(); 
        }
        return this.dosis;
    }

    public void setDosis(List<Dosis> dosis){
            this.dosis=dosis;
    }
}
