package org.arllaynexpress.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import org.arllaynexpress.modelo.Voos;
import org.usuarioDAO.VoosDAO;

@Named(value = "mbListarVoos")
@RequestScoped

public class ListaarVoos {

    @Inject
    private VoosDAO dao;
    private List<Voos> vooss;
    Voos voos = new Voos();

    @PostConstruct
    public void init() {
        this.vooss = dao.buscarTodos();
    }

    public List<Voos> getVoos() {
        return vooss;
    }
}

