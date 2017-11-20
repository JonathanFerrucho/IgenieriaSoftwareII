package co.edu.uptc.bochica.logica;

import co.edu.uptc.bochica.persistencia.entidad.Dosis;
import co.edu.uptc.bochica.persistencia.entidad.Vacuna;
import co.edu.uptc.bochica.dto.*;
import co.edu.uptc.bochica.persistencia.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class DosisLogica {

    @EJB
    private DosisDAO persistencia;

    /**
     * retorna una lista con los Dosis que se encuentran en la base de datos
     *
     * @return retorna una lista de DosisDTO
     * @generated
     */
    public List<DosisDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Dosis
     * @return Dosis del id dado
     * @generated
     */
    public DosisDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Dosis
     *
     * @param dto Dosis a guardar
     * @return Dosis con los cambios realizados por el proceso de guardar
     * @generated
     */
    public DosisDTO guardar(DosisDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Dosis con el identificador dado
     *
     * @param id identificador del Dosis
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Dosis
     *
     * @param dto Dosis a guardar
     * @return Dosis con los cambios realizados por el proceso de guardar
     * @generated
     */
    public void actualizar(DosisDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    public Dosis convertirDTO(DosisDTO dto) {
        if (dto == null) {
            return null;
        }
        Dosis entidad = new Dosis();
        entidad.setId(dto.getId());
        entidad.setValorTiempo(dto.getValorTiempo());
        entidad.setUnidadTiempo(dto.getUnidadTiempo());

        if (dto.getVacuna() != null) {
            entidad.setVacuna(new Vacuna());
            entidad.getVacuna().setId(dto.getVacuna().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    public List<Dosis> convertirDTO(List<DosisDTO> dtos) {
        List<Dosis> entidades = new ArrayList<Dosis>();
        for (DosisDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    public DosisDTO convertirEntidad(Dosis entidad) {
        DosisDTO dto = new DosisDTO();
        dto.setId(entidad.getId());
        dto.setValorTiempo(entidad.getValorTiempo());
        dto.setUnidadTiempo(entidad.getUnidadTiempo());

        if (entidad.getVacuna() != null) {
            dto.setVacuna(
                    new VacunaDTO(
                            entidad.getVacuna().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    public List<DosisDTO> convertirEntidad(List<Dosis> entidades) {
        List<DosisDTO> dtos = new ArrayList<DosisDTO>();
        for (Dosis entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
