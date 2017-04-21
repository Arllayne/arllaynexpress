/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arllaynexpress.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.arllaynexpress.modelo.Cliente;
import org.usuarioDAO.ClienteDAO;

@Named(value = "mbCadastroCliente")
@RequestScoped
public class CadastrarCliente {

   Cliente cliente = new Cliente();
    
    @Inject
    ClienteDAO clienteDAO;

    public void adicionar() {
        clienteDAO.salvar(cliente);
        //System.out.println(usuario);
    }

    public Cliente getCliente() {
        return cliente;
    }
}

