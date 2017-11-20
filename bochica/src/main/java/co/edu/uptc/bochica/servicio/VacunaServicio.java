package co.edu.uptc.bochica.servicio;

import co.edu.uptc.bochica.dto.*;
import co.edu.uptc.bochica.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Stateless
@Path("/Vacuna")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VacunaServicio {

    @EJB
    private VacunaLogica logica;

    /**
     * retorna una lista con los Vacuna que se encuentran en la base de datos
     *
     * @return retorna una lista de VacunaDTO
     * @generated
     */
    @GET
    public List<VacunaDTO> obtenerTodosVacunas() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Vacuna
     * @return Vacuna del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public VacunaDTO obtenerVacuna(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Vacuna
     *
     * @param dto Vacuna a guardar
     * @return Vacuna con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public VacunaDTO guardarVacuna(VacunaDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Vacuna con el identificador dado
     *
     * @param id identificador del Vacuna
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarVacuna(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
