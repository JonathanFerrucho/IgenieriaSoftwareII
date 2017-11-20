package co.edu.uptc.bochica.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated @author daperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DosisDTO {

    public DosisDTO() {
        //constructor base
    }

    public DosisDTO(Long id) {
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
    private Integer valorTiempo;

    /**
     * @generated
     */
    private String unidadTiempo;

    /**
     * @generated
     */
    private VacunaDTO vacuna;

    /**
     * @generated
     */
    public Integer getValorTiempo() {
        return this.valorTiempo;
    }

    /**
     * @generated
     */
    public void setValorTiempo(Integer valorTiempo) {
        this.valorTiempo = valorTiempo;
    }

    /**
     * @generated
     */
    public String getUnidadTiempo() {
        return this.unidadTiempo;
    }

    /**
     * @generated
     */
    public void setUnidadTiempo(String unidadTiempo) {
        this.unidadTiempo = unidadTiempo;
    }

    /**
     * @generated
     */
    public VacunaDTO getVacuna() {
        return this.vacuna;
    }

    /**
     * @generated
     */
    public void setVacuna(VacunaDTO vacuna) {
        this.vacuna = vacuna;
    }

}
