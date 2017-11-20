package co.edu.uptc.bochica.logica;

import co.edu.uptc.bochica.persistencia.entidad.Enfermedad;
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
public class EnfermedadLogica {

    @EJB
    private EnfermedadDAO persistencia;
    
    @EJB
    private VacunaLogica vacunaLogica;

    /**
     * retorna una lista con los Enfermedad que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de EnfermedadDTO
     * @generated
     */
    public List<EnfermedadDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Enfermedad
     * @return Enfermedad del id dado
     * @generated
     */
    public EnfermedadDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Enfermedad
     *
     * @param dto Enfermedad a guardar
     * @return Enfermedad con los cambios realizados por el proceso de guardar
     * @generated
     */
    public EnfermedadDTO guardar(EnfermedadDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Enfermedad con el identificador dado
     *
     * @param id identificador del Enfermedad
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Enfermedad
     *
     * @param dto Enfermedad a guardar
     * @return Enfermedad con los cambios realizados por el proceso de guardar
     * @generated
     */
    public void actualizar(EnfermedadDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    public Enfermedad convertirDTO(EnfermedadDTO dto) {
        if (dto == null) {
            return null;
        }
        Enfermedad entidad = new Enfermedad();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setDescripcion(dto.getDescripcion());

        return entidad;
    }

    /**
     * @generated
     */
    public List<Enfermedad> convertirDTO(List<EnfermedadDTO> dtos) {
        List<Enfermedad> entidades = new ArrayList<Enfermedad>();
        for (EnfermedadDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    public EnfermedadDTO convertirEntidad(Enfermedad entidad) {
        EnfermedadDTO dto = new EnfermedadDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());
        dto.setDescripcion(entidad.getDescripcion());

        if(!entidad.getVacunas().isEmpty()){
            dto.setVacuna(vacunaLogica.convertirEntidad(entidad.getVacunas()));
        }
        
        return dto;
    }

    /**
     * @generated
     */
    public List<EnfermedadDTO> convertirEntidad(List<Enfermedad> entidades) {
        List<EnfermedadDTO> dtos = new ArrayList<EnfermedadDTO>();
        for (Enfermedad entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
