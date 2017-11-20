package co.edu.uptc.bochica.persistencia;

import co.edu.uptc.bochica.persistencia.entidad.Dosis;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class DosisDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Dosis> obtenerTodos() {
        return em.createNamedQuery("Dosis.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Dosis obtener(Long id) {
        return em.find(Dosis.class, id);
    }

    /**
     * @generated
     */
    public Dosis guardar(Dosis entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Dosis.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Dosis entidad) {
        em.merge(entidad);
    }

}
