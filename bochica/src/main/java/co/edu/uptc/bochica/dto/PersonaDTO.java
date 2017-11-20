package co.edu.uptc.bochica.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated @author daperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaDTO {

    public PersonaDTO() {
        //constructor base
    }

    public PersonaDTO(Long id) {
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
    private String documento;

    /**
     * @generated
     */
    private String tipoDocumento;

    /**
     * @generated
     */
    private String nombres;

    /**
     * @generated
     */
    private String apellidos;

    /**
     * @generated
     */
    private String fechaNacimiento;

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
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * @generated
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
