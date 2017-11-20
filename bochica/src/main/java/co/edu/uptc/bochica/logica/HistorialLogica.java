package co.edu.uptc.bochica.logica;

import co.edu.uptc.bochica.persistencia.entidad.Persona;
import co.edu.uptc.bochica.persistencia.entidad.Historial;
import co.edu.uptc.bochica.dto.*;
import co.edu.uptc.bochica.persistencia.*;
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
public class HistorialLogica {

    @EJB
    private HistorialDAO persistencia;

    private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * retorna una lista con los Historial que se encuentran en la base de datos
     *
     * @return retorna una lista de HistorialDTO
     * @generated
     */
    public List<HistorialDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Historial
     * @return Historial del id dado
     * @generated
     */
    public HistorialDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Historial
     *
     * @param dto Historial a guardar
     * @return Historial con los cambios realizados por el proceso de guardar
     * @generated
     */
    public HistorialDTO guardar(HistorialDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Historial con el identificador dado
     *
     * @param id identificador del Historial
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Historial
     *
     * @param dto Historial a guardar
     * @return Historial con los cambios realizados por el proceso de guardar
     * @generated
     */
    public void actualizar(HistorialDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    public Historial convertirDTO(HistorialDTO dto) {
        if (dto == null) {
            return null;
        }
        Historial entidad = new Historial();
        entidad.setId(dto.getId());
        if (dto.getFechaCreacion() != null) {
            try {
                entidad.setFechaCreacion(fecha.parse(dto.getFechaCreacion()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha FechaCreacion " + dto.getFechaCreacion());
            }
        }

        if (dto.getPersona() != null) {
            entidad.setPersona(new Persona());
            entidad.getPersona().setId(dto.getPersona().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    public List<Historial> convertirDTO(List<HistorialDTO> dtos) {
        List<Historial> entidades = new ArrayList<Historial>();
        for (HistorialDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    public HistorialDTO convertirEntidad(Historial entidad) {
        HistorialDTO dto = new HistorialDTO();
        dto.setId(entidad.getId());
        if (entidad.getFechaCreacion() != null) {
            dto.setFechaCreacion(fecha.format(entidad.getFechaCreacion()));
        }

        if (entidad.getPersona() != null) {
            dto.setPersona(
                    new PersonaDTO(
                            entidad.getPersona().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    public List<HistorialDTO> convertirEntidad(List<Historial> entidades) {
        List<HistorialDTO> dtos = new ArrayList<HistorialDTO>();
        for (Historial entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
