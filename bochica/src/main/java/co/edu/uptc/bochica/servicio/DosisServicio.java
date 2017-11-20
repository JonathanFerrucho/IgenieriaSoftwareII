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
@Path("/Dosis")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DosisServicio {

    @EJB
    private DosisLogica logica;

    /**
     * retorna una lista con los Dosis que se encuentran en la base de datos
     *
     * @return retorna una lista de DosisDTO
     * @generated
     */
    @GET
    public List<DosisDTO> obtenerTodosDosiss() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Dosis
     * @return Dosis del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public DosisDTO obtenerDosis(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Dosis
     *
     * @param dto Dosis a guardar
     * @return Dosis con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public DosisDTO guardarDosis(DosisDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Dosis con el identificador dado
     *
     * @param id identificador del Dosis
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarDosis(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
