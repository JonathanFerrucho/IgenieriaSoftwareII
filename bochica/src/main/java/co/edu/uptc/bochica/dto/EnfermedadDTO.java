package co.edu.uptc.bochica.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated @author daperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnfermedadDTO {

    public EnfermedadDTO() {
        //constructor base
    }

    public EnfermedadDTO(Long id) {
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
    private String nombre;

    /**
     * @generated
     */
    private String descripcion;

    /**
     * @generated
     */
    private List<VacunaDTO> vacuna;
    
    public List<VacunaDTO> getVacuna(){
    	return vacuna;
    }
    
    public void setVacuna(List<VacunaDTO> vacuna){
    	this.vacuna=vacuna;
    }
    
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

}
