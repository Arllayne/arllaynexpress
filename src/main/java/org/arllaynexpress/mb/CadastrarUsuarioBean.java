package org.arllaynexpress.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.arllaynexpress.modelo.Usuario;
import org.usuarioDAO.UsuarioDAO;

@Named(value = "mbCadastrarUsuario")
@RequestScoped
public class CadastrarUsuarioBean {

    Usuario usuario = new Usuario();
    
    @Inject
    UsuarioDAO usuarioDAO;

    public void adicionar() {
     //   usuarioDAO.salvar(usuario);
        System.out.println(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
