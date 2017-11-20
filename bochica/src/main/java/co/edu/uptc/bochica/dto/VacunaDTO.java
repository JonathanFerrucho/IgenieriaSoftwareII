package co.edu.uptc.bochica.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated @author daperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VacunaDTO {

    public VacunaDTO() {
        //constructor base
    }

    public VacunaDTO(Long id) {
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
    /*private List<EnfermedadDTO> enfermedad;
    
    public List<EnfermedadDTO> getEnfermedad(){
    	if(this.enfermedad==null){
    		enfermedad=new ArrayList<EnfermedadDTO>();
    	}
    	return enfermedad;
    }
    
    public void setEnfermedad(List<EnfermedadDTO> enfermedad){
    	this.enfermedad=enfermedad;
    }
     */
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
