package co.edu.uptc.bochica.persistencia;

import co.edu.uptc.bochica.persistencia.entidad.Enfermedad;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class EnfermedadDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Enfermedad> obtenerTodos() {
        return em.createNamedQuery("Enfermedad.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Enfermedad obtener(Long id) {
        return em.find(Enfermedad.class, id);
    }

    /**
     * @generated
     */
    public Enfermedad guardar(Enfermedad entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Enfermedad.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Enfermedad entidad) {
        em.merge(entidad);
    }

}
