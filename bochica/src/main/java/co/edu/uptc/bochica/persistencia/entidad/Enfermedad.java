package co.edu.uptc.bochica.persistencia.entidad;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
 * @generated @author daperador
 */
@Entity
@Table(name = "Enfermedad")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Enfermedad.obtenerTodos", query = "select e from Enfermedad e")
})
public class Enfermedad {

    @Id
    //@Column(name = "Enfermedad_id")
    @GeneratedValue(generator = "EnfermedadGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EnfermedadGen", sequenceName = "Enfermedad_SEQ", allocationSize = 1)
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

    /**
     * @generated 0--1-true
     */
    @ManyToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
    private List<Vacuna> vacunas;

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

    public List<Vacuna> getVacunas() {
        if (vacunas == null) {
            vacunas = new ArrayList<Vacuna>();
        }
        return this.vacunas;
    }

    public void setVacunas(List<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }
}
