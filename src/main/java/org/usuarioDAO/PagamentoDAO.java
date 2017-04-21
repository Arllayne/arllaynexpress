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
import org.arllaynexpress.modelo.Pagamento;

/**
 *
 * @author ArllayneC
 */
public class PagamentoDAO {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Pagamento pagamento) {
        em.persist(pagamento);
    }

    public List<Pagamento> buscarTodos() {
        TypedQuery<Pagamento> query = em.
                createQuery("Select c from Pagamento c", Pagamento.class);
        return query.getResultList();
    }
    
}
