package org.arllaynexpress.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.arllaynexpress.modelo.Passagem;
import org.usuarioDAO.PassagemDAO;

@Named(value = "mbCadastroPassagem")
@RequestScoped
public class CadastroPassagem {

    Passagem passagem = new Passagem();
    
    @Inject
    PassagemDAO passagemDAO;

    public void adicionar() {
        passagemDAO.salvar(passagem);
        //System.out.println(usuario);
    }

    public Passagem getPassagem() {
        return passagem;
    }
}
