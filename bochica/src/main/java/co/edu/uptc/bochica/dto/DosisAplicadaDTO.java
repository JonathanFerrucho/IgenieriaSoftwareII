package co.edu.uptc.bochica.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated @author daperador
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DosisAplicadaDTO {

    public DosisAplicadaDTO() {
        //constructor base
    }

    public DosisAplicadaDTO(Long id) {
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
    private String fecha;

    /**
     * @generated
     */
    private DosisDTO dosis;

    /**
     * @generated
     */
    private HistorialDTO historial;

    /**
     * @generated
     */
    public String getFecha() {
        return this.fecha;
    }

    /**
     * @generated
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @generated
     */
    public DosisDTO getDosis() {
        return this.dosis;
    }

    /**
     * @generated
     */
    public void setDosis(DosisDTO dosis) {
        this.dosis = dosis;
    }

    /**
     * @generated
     */
    public HistorialDTO getHistorial() {
        return this.historial;
    }

    /**
     * @generated
     */
    public void setHistorial(HistorialDTO historial) {
        this.historial = historial;
    }

}
