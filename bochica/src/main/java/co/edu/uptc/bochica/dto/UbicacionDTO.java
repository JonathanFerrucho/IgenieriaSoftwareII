package co.edu.uptc.bochica.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated @author daperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UbicacionDTO {

    public UbicacionDTO() {
        //constructor base
    }

    public UbicacionDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    private Double latitud;

    /**
     * @generated
     */
    private Double longitud;

    /**
     * @generated
     */
    private EnfermedadDTO enfermedad;

    /**
     * @generated
     */
    private PersonaDTO persona;

    /**
     * @generated
     */
    private DosisAplicadaDTO dosisAplicada;

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
    public EnfermedadDTO getEnfermedad() {
        return this.enfermedad;
    }

    /**
     * @generated
     */
    public void setEnfermedad(EnfermedadDTO enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     * @generated
     */
    public PersonaDTO getPersona() {
        return this.persona;
    }

    /**
     * @generated
     */
    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    /**
     * @generated
     */
    public DosisAplicadaDTO getDosisAplicada() {
        return this.dosisAplicada;
    }

    /**
     * @generated
     */
    public void setDosisAplicada(DosisAplicadaDTO dosisAplicada) {
        this.dosisAplicada = dosisAplicada;
    }

}
