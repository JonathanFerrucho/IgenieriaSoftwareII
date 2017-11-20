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
@Path("/Persona")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaServicio {

    @EJB
    private PersonaLogica logica;

    /**
     * retorna una lista con los Persona que se encuentran en la base de datos
     *
     * @return retorna una lista de PersonaDTO
     * @generated
     */
    @GET
    public List<PersonaDTO> obtenerTodosPersonas() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Persona
     * @return Persona del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public PersonaDTO obtenerPersona(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Persona
     *
     * @param dto Persona a guardar
     * @return Persona con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public PersonaDTO guardarPersona(PersonaDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Persona con el identificador dado
     *
     * @param id identificador del Persona
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarPersona(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
