package co.edu.uptc.bochica.persistencia;

import co.edu.uptc.bochica.persistencia.entidad.Historial;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class HistorialDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Historial> obtenerTodos() {
        return em.createNamedQuery("Historial.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Historial obtener(Long id) {
        return em.find(Historial.class, id);
    }

    /**
     * @generated
     */
    public Historial guardar(Historial entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Historial.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Historial entidad) {
        em.merge(entidad);
    }

}
