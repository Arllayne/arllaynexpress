package org.arllaynexpress.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import org.arllaynexpress.modelo.Cliente;
import org.usuarioDAO.ClienteDAO;

/**
 *
 * @author ArllayneC
 */
@Named(value = "mbListarClientes")
@RequestScoped
public class ListarCliente {

    @Inject
    private ClienteDAO dao;
    private List<Cliente> clientes;
    Cliente cliente = new Cliente();

    @PostConstruct
    public void init() {
        this.clientes = dao.buscarTodos();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
