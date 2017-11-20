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
@Path("/Enfermedad")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EnfermedadServicio {

    @EJB
    private EnfermedadLogica logica;

    /**
     * retorna una lista con los Enfermedad que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de EnfermedadDTO
     * @generated
     */
    @GET
    public List<EnfermedadDTO> obtenerTodosEnfermedads() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Enfermedad
     * @return Enfermedad del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public EnfermedadDTO obtenerEnfermedad(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Enfermedad
     *
     * @param dto Enfermedad a guardar
     * @return Enfermedad con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public EnfermedadDTO guardarEnfermedad(EnfermedadDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Enfermedad con el identificador dado
     *
     * @param id identificador del Enfermedad
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarEnfermedad(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
