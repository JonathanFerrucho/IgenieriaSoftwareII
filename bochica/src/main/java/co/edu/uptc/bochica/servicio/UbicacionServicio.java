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
@Path("/Ubicacion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UbicacionServicio {

    @EJB
    private UbicacionLogica logica;

    /**
     * retorna una lista con los Ubicacion que se encuentran en la base de datos
     *
     * @return retorna una lista de UbicacionDTO
     * @generated
     */
    @GET
    public List<UbicacionDTO> obtenerTodosUbicacions() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Ubicacion
     * @return Ubicacion del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public UbicacionDTO obtenerUbicacion(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Ubicacion
     *
     * @param dto Ubicacion a guardar
     * @return Ubicacion con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public UbicacionDTO guardarUbicacion(UbicacionDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Ubicacion con el identificador dado
     *
     * @param id identificador del Ubicacion
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarUbicacion(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
