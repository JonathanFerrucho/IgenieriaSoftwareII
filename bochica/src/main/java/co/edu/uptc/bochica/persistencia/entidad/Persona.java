package co.edu.uptc.bochica.persistencia.entidad;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
 * @generated @author daperador
 */
@Entity
@Table(name = "Persona")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Persona.obtenerTodos", query = "select e from Persona e")
})
public class Persona {

    @Id
    //@Column(name = "Persona_id")
    @GeneratedValue(generator = "PersonaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PersonaGen", sequenceName = "Persona_SEQ", allocationSize = 1)
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
    //@Column(name = "documento")
    private String documento;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "tipoDocumento")
    private String tipoDocumento;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "nombres")
    private String nombres;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "apellidos")
    private String apellidos;

    /**
     * @generated 1-1-false
     */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    
    
    @ManyToMany(cascade = {}, fetch = javax.persistence.FetchType.LAZY)
    private List<Persona> familiares;

    /**
     * @generated
     */
    public String getDocumento() {
        return this.documento;
    }

    /**
     * @generated
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @generated
     */
    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    /**
     * @generated
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @generated
     */
    public String getNombres() {
        return this.nombres;
    }

    /**
     * @generated
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @generated
     */
    public String getApellidos() {
        return this.apellidos;
    }

    /**
     * @generated
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @generated
     */
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * @generated
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Persona> getFamiliares() {
        if(familiares==null){
                familiares=new ArrayList<Persona>(); 
        }
        return this.familiares;
    }

    public void setFamiliares(List<Persona> familiares) {
        this.familiares = familiares;
    }

    
}
