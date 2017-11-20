package co.edu.uptc.bochica.logica;

import co.edu.uptc.bochica.persistencia.entidad.Ubicacion;
import co.edu.uptc.bochica.persistencia.entidad.Persona;
import co.edu.uptc.bochica.persistencia.entidad.Enfermedad;
import co.edu.uptc.bochica.persistencia.entidad.DosisAplicada;
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
public class UbicacionLogica {

    @EJB
    private UbicacionDAO persistencia;

    /**
     * retorna una lista con los Ubicacion que se encuentran en la base de datos
     *
     * @return retorna una lista de UbicacionDTO
     * @generated
     */
    public List<UbicacionDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Ubicacion
     * @return Ubicacion del id dado
     * @generated
     */
    public UbicacionDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Ubicacion
     *
     * @param dto Ubicacion a guardar
     * @return Ubicacion con los cambios realizados por el proceso de guardar
     * @generated
     */
    public UbicacionDTO guardar(UbicacionDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Ubicacion con el identificador dado
     *
     * @param id identificador del Ubicacion
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Ubicacion
     *
     * @param dto Ubicacion a guardar
     * @return Ubicacion con los cambios realizados por el proceso de guardar
     * @generated
     */
    public void actualizar(UbicacionDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    public Ubicacion convertirDTO(UbicacionDTO dto) {
        if (dto == null) {
            return null;
        }
        Ubicacion entidad = new Ubicacion();
        entidad.setId(dto.getId());
        entidad.setLatitud(dto.getLatitud());
        entidad.setLongitud(dto.getLongitud());

        if (dto.getDosisAplicada() != null) {
            entidad.setDosisAplicada(new DosisAplicada());
            entidad.getDosisAplicada().setId(dto.getDosisAplicada().getId());
        }
        if (dto.getEnfermedad() != null) {
            entidad.setEnfermedad(new Enfermedad());
            entidad.getEnfermedad().setId(dto.getEnfermedad().getId());
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
    public List<Ubicacion> convertirDTO(List<UbicacionDTO> dtos) {
        List<Ubicacion> entidades = new ArrayList<Ubicacion>();
        for (UbicacionDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    public UbicacionDTO convertirEntidad(Ubicacion entidad) {
        UbicacionDTO dto = new UbicacionDTO();
        dto.setId(entidad.getId());
        dto.setLatitud(entidad.getLatitud());
        dto.setLongitud(entidad.getLongitud());

        if (entidad.getEnfermedad() != null) {
            dto.setEnfermedad(
                    new EnfermedadDTO(
                            entidad.getEnfermedad().getId()));
        }
        if (entidad.getPersona() != null) {
            dto.setPersona(
                    new PersonaDTO(
                            entidad.getPersona().getId()));
        }
        if (entidad.getDosisAplicada() != null) {
            dto.setDosisAplicada(
                    new DosisAplicadaDTO(
                            entidad.getDosisAplicada().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    public List<UbicacionDTO> convertirEntidad(List<Ubicacion> entidades) {
        List<UbicacionDTO> dtos = new ArrayList<UbicacionDTO>();
        for (Ubicacion entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
