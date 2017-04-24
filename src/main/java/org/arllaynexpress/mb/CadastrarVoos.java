package org.arllaynexpress.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.arllaynexpress.modelo.Usuario;
import org.arllaynexpress.modelo.Voos;
import org.usuarioDAO.VoosDAO;

@Named(value = "mbCadastrarVoos")
@RequestScoped
public class CadastrarVoos {

    Voos voos = new Voos();
    
    @Inject
    VoosDAO voosDAO;

    public void adicionar() {
     //   usuarioDAO.salvar(usuario);
        System.out.println(voos);
    }

    public Voos getVoos() {
        return voos;
    }
}
