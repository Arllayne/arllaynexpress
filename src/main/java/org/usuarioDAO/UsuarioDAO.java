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
import org.arllaynexpress.modelo.Usuario;

/**
 *
 * @author ArllayneC
 */
public class UsuarioDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }

    public List<Usuario> buscarTodos() {
        TypedQuery<Usuario> query = em.
                createQuery("Select c from Usuario c", Usuario.class);
        return query.getResultList();
    }
}
