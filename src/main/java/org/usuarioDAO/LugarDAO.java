/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usuarioDAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.arllaynexpress.modelo.Lugar;
import org.arllaynexpress.modelo.Passagem;

/**
 *
 * @author ArllayneC
 */
public class LugarDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Lugar lugar) {
        em.persist(lugar);

    }

    public List<Lugar> buscarTodos() {
        TypedQuery<Lugar> query = em.
                createQuery("Select c from Lugar c", Lugar.class);
        return query.getResultList();
    }

}
