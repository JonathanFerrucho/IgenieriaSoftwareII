package co.edu.uptc.bochica.persistencia;

import co.edu.uptc.bochica.persistencia.entidad.Persona;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class PersonaDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Persona> obtenerTodos() {
        return em.createNamedQuery("Persona.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Persona obtener(Long id) {
        return em.find(Persona.class, id);
    }

    /**
     * @generated
     */
    public Persona guardar(Persona entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Persona.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Persona entidad) {
        em.merge(entidad);
    }

}
