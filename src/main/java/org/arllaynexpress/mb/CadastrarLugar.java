/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arllaynexpress.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.arllaynexpress.modelo.Lugar;
import org.arllaynexpress.modelo.Passagem;
import org.usuarioDAO.LugarDAO;

/**
 *
 * @author ArllayneC
 */
@Named(value = "mbCadastroLugar")
@RequestScoped

public class CadastrarLugar {

    Lugar lugar = new Lugar();

    @Inject
    LugarDAO lugarDAO;

    public void adicionar() {
        lugarDAO.salvar(lugar);
        //System.out.println(lugar);
    }

    public Lugar getLugar() {
        return lugar;
    }
}
