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

import org.arllaynexpress.modelo.Voos;

public class VoosDAO {
    
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Voos voos) {
        em.persist(voos);
    }

    public List<Voos> buscarTodos() {
        TypedQuery<Voos> query = em.
                createQuery("Select c from Voos c", Voos.class);
        return query.getResultList();
    }
    
}
