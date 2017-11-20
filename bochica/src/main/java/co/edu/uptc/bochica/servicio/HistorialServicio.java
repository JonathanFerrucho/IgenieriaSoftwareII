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
@Path("/Historial")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HistorialServicio {

    @EJB
    private HistorialLogica logica;

    /**
     * retorna una lista con los Historial que se encuentran en la base de datos
     *
     * @return retorna una lista de HistorialDTO
     * @generated
     */
    @GET
    public List<HistorialDTO> obtenerTodosHistorials() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Historial
     * @return Historial del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public HistorialDTO obtenerHistorial(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Historial
     *
     * @param dto Historial a guardar
     * @return Historial con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public HistorialDTO guardarHistorial(HistorialDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Historial con el identificador dado
     *
     * @param id identificador del Historial
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarHistorial(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
