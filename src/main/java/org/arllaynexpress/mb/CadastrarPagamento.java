/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arllaynexpress.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.arllaynexpress.modelo.Pagamento;
import org.usuarioDAO.PagamentoDAO;

@Named(value = "mbCadastrarPagamento")
@RequestScoped
public class CadastrarPagamento {

    Pagamento pagamento = new Pagamento();
        @Inject
        PagamentoDAO pagamentoDAO;

    

    public void adicionar() {
        pagamentoDAO.salvar(pagamento);
        //System.out.println(usuario);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
