package co.edu.uptc.bochica.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated @author daperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HistorialDTO {

    public HistorialDTO() {
        //constructor base
    }

    public HistorialDTO(Long id) {
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
    private String fechaCreacion;

    /**
     * @generated
     */
    private PersonaDTO persona;

    /**
     * @generated
     */
    public String getFechaCreacion() {
        return this.fechaCreacion;
    }

    /**
     * @generated
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

}
