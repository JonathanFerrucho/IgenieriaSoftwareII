package co.edu.uptc.bochica.logica;

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
public class VacunaLogica {

    @EJB
    private VacunaDAO persistencia;

    /**
     * retorna una lista con los Vacuna que se encuentran en la base de datos
     *
     * @return retorna una lista de VacunaDTO
     * @generated
     */
    public List<VacunaDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Vacuna
     * @return Vacuna del id dado
     * @generated
     */
    public VacunaDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Vacuna
     *
     * @param dto Vacuna a guardar
     * @return Vacuna con los cambios realizados por el proceso de guardar
     * @generated
     */
    public VacunaDTO guardar(VacunaDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Vacuna con el identificador dado
     *
     * @param id identificador del Vacuna
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Vacuna
     *
     * @param dto Vacuna a guardar
     * @return Vacuna con los cambios realizados por el proceso de guardar
     * @generated
     */
    public void actualizar(VacunaDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    public Vacuna convertirDTO(VacunaDTO dto) {
        if (dto == null) {
            return null;
        }
        Vacuna entidad = new Vacuna();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setDescripcion(dto.getDescripcion());

        return entidad;
    }

    /**
     * @generated
     */
    public List<Vacuna> convertirDTO(List<VacunaDTO> dtos) {
        List<Vacuna> entidades = new ArrayList<Vacuna>();
        for (VacunaDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    public VacunaDTO convertirEntidad(Vacuna entidad) {
        VacunaDTO dto = new VacunaDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());
        dto.setDescripcion(entidad.getDescripcion());

        return dto;
    }

    /**
     * @generated
     */
    public List<VacunaDTO> convertirEntidad(List<Vacuna> entidades) {
        List<VacunaDTO> dtos = new ArrayList<VacunaDTO>();
        for (Vacuna entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
