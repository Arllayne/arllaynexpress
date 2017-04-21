package org.arllaynexpress.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import org.arllaynexpress.modelo.Passagem;
import org.usuarioDAO.PassagemDAO;

/**
 *
 * @author ArllayneC
 *
 */
@Named(value = "mbListarPassagens")
@RequestScoped
public class ListarPassagem {

    @Inject
    private PassagemDAO dao;
    private List<Passagem> passagens;

    @PostConstruct
    private void init() {
        this.passagens = dao.buscarTodos();
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }
}
