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
import org.arllaynexpress.modelo.Cliente;

/**
 *
 * @author ArllayneC
 */
public class ClienteDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Cliente cliente) {
        em.persist(cliente);
    }

    public List<Cliente> buscarTodos() {
        TypedQuery<Cliente> query = em.
                createQuery("Select c from Pagamento c", Cliente.class);
        return query.getResultList();
    }

}
