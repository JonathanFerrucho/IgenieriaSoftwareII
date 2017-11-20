package co.edu.uptc.bochica.persistencia;

import co.edu.uptc.bochica.persistencia.entidad.DosisAplicada;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class DosisAplicadaDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<DosisAplicada> obtenerTodos() {
        return em.createNamedQuery("DosisAplicada.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public DosisAplicada obtener(Long id) {
        return em.find(DosisAplicada.class, id);
    }

    /**
     * @generated
     */
    public DosisAplicada guardar(DosisAplicada entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(DosisAplicada.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(DosisAplicada entidad) {
        em.merge(entidad);
    }

}
