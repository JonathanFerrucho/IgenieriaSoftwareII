package co.edu.uptc.bochica.logica;

import co.edu.uptc.bochica.persistencia.entidad.Dosis;
import co.edu.uptc.bochica.dto.*;
import co.edu.uptc.bochica.persistencia.*;
import co.edu.uptc.bochica.persistencia.entidad.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @generated @author daperador
 */
@Stateless
public class DosisAplicadaLogica {

    @EJB
    private DosisAplicadaDAO persistencia;

    private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * retorna una lista con los DosisAplicada que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de DosisAplicadaDTO
     * @generated
     */
    public List<DosisAplicadaDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento DosisAplicada
     * @return DosisAplicada del id dado
     * @generated
     */
    public DosisAplicadaDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de DosisAplicada
     *
     * @param dto DosisAplicada a guardar
     * @return DosisAplicada con los cambios realizados por el proceso de
     * guardar
     * @generated
     */
    public DosisAplicadaDTO guardar(DosisAplicadaDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro DosisAplicada con el identificador dado
     *
     * @param id identificador del DosisAplicada
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de DosisAplicada
     *
     * @param dto DosisAplicada a guardar
     * @return DosisAplicada con los cambios realizados por el proceso de
     * guardar
     * @generated
     */
    public void actualizar(DosisAplicadaDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    public DosisAplicada convertirDTO(DosisAplicadaDTO dto) {
        if (dto == null) {
            return null;
        }
        DosisAplicada entidad = new DosisAplicada();
        entidad.setId(dto.getId());
        if (dto.getFecha() != null) {
            try {
                entidad.setFecha(fecha.parse(dto.getFecha()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha Fecha " + dto.getFecha());
            }
        }

        if (dto.getHistorial() != null) {
            entidad.setHistorial(new Historial());
            entidad.getHistorial().setId(dto.getHistorial().getId());
        }
        if (dto.getDosis() != null) {
            entidad.setDosis(new Dosis());
            entidad.getDosis().setId(dto.getDosis().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    public List<DosisAplicada> convertirDTO(List<DosisAplicadaDTO> dtos) {
        List<DosisAplicada> entidades = new ArrayList<DosisAplicada>();
        for (DosisAplicadaDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    public DosisAplicadaDTO convertirEntidad(DosisAplicada entidad) {
        DosisAplicadaDTO dto = new DosisAplicadaDTO();
        dto.setId(entidad.getId());
        if (entidad.getFecha() != null) {
            dto.setFecha(fecha.format(entidad.getFecha()));
        }

        if (entidad.getDosis() != null) {
            dto.setDosis(
                    new DosisDTO(
                            entidad.getDosis().getId()));
        }
        if (entidad.getHistorial() != null) {
            dto.setHistorial(
                    new HistorialDTO(
                            entidad.getHistorial().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    public List<DosisAplicadaDTO> convertirEntidad(List<DosisAplicada> entidades) {
        List<DosisAplicadaDTO> dtos = new ArrayList<DosisAplicadaDTO>();
        for (DosisAplicada entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
