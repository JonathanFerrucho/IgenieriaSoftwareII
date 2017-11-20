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
@Path("/DosisAplicada")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DosisAplicadaServicio {

    @EJB
    private DosisAplicadaLogica logica;

    /**
     * retorna una lista con los DosisAplicada que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de DosisAplicadaDTO
     * @generated
     */
    @GET
    public List<DosisAplicadaDTO> obtenerTodosDosisAplicadas() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento DosisAplicada
     * @return DosisAplicada del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public DosisAplicadaDTO obtenerDosisAplicada(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de DosisAplicada
     *
     * @param dto DosisAplicada a guardar
     * @return DosisAplicada con los cambios realizados por el proceso de
     * guardar
     * @generated
     */
    @POST
    public DosisAplicadaDTO guardarDosisAplicada(DosisAplicadaDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro DosisAplicada con el identificador dado
     *
     * @param id identificador del DosisAplicada
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarDosisAplicada(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
