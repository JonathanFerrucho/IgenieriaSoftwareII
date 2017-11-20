package co.edu.uptc.bochica.persistencia.entidad;

import javax.persistence.*;

@Entity
@Table(name = "Ubicacion")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Ubicacion.obtenerTodos", query = "select e from Ubicacion e")
})
public class Ubicacion {

    @Id
    //@Column(name = "Persona_id")
    @GeneratedValue(generator = "UbicacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "UbicacionGen", sequenceName = "Ubicacion_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Double latitud;

    private Double longitud;

    @ManyToOne (cascade = {}, fetch = FetchType.EAGER)
    private Persona persona;
    
    @ManyToOne (cascade = {}, fetch = FetchType.EAGER)
    private DosisAplicada dosisAplicada;

    @ManyToOne (cascade = {}, fetch = FetchType.EAGER)
    private Enfermedad enfermedad;

    /**
     * @generated
     */
    public Double getLatitud() {
        return this.latitud;
    }

    /**
     * @generated
     */
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    /**
     * @generated
     */
    public Double getLongitud() {
        return this.longitud;
    }

    /**
     * @generated
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    /**
     * @generated
     */
    public DosisAplicada getDosisAplicada() {
        return this.dosisAplicada;
    }

    /**
     * @generated
     */
    public void setDosisAplicada(DosisAplicada dosisAplicada) {
        this.dosisAplicada = dosisAplicada;
    }

    /**
     * @generated
     */
    public Enfermedad getEnfermedad() {
        return this.enfermedad;
    }

    /**
     * @generated
     */
    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     * @generated
     */
    public Persona getPersona() {
        return this.persona;
    }

    /**
     * @generated
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
