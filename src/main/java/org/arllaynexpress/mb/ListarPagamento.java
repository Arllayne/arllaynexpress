package org.arllaynexpress.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import org.arllaynexpress.modelo.Pagamento;
import org.usuarioDAO.PagamentoDAO;

/**
 *
 * @author ArllayneC
 */
@Named(value = "mbListarPagamentos")
@RequestScoped

public class ListarPagamento {

    @Inject
    private PagamentoDAO dao;
    private List<Pagamento> pagamentos;

    @PostConstruct
    private void init() {
        this.pagamentos = dao.buscarTodos();
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
}
