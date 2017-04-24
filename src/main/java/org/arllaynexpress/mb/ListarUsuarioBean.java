package org.arllaynexpress.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import org.usuarioDAO.UsuarioDAO;
import org.arllaynexpress.modelo.Usuario;

@Named(value = "mbListarUsuarios")
@RequestScoped
public class ListarUsuarioBean {

    @Inject
    private UsuarioDAO dao;
    private List<Usuario> usuarios;

    @PostConstruct
    private void init() {
        this.usuarios = dao.buscarTodos();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

}
