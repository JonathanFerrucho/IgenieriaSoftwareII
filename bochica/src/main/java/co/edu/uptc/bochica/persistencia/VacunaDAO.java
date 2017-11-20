package co.edu.uptc.bochica.persistencia;

import co.edu.uptc.bochica.persistencia.entidad.Vacuna;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class VacunaDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Vacuna> obtenerTodos() {
        return em.createNamedQuery("Vacuna.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Vacuna obtener(Long id) {
        return em.find(Vacuna.class, id);
    }

    /**
     * @generated
     */
    public Vacuna guardar(Vacuna entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Vacuna.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Vacuna entidad) {
        em.merge(entidad);
    }

}
