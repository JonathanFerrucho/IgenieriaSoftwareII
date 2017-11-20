package co.edu.uptc.bochica.persistencia;

import co.edu.uptc.bochica.persistencia.entidad.Ubicacion;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class UbicacionDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Ubicacion> obtenerTodos() {
        return em.createNamedQuery("Ubicacion.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Ubicacion obtener(Long id) {
        return em.find(Ubicacion.class, id);
    }

    /**
     * @generated
     */
    public Ubicacion guardar(Ubicacion entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Ubicacion.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Ubicacion entidad) {
        em.merge(entidad);
    }

}
