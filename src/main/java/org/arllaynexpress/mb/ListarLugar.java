package org.arllaynexpress.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.persistence.TypedQuery;
import org.arllaynexpress.modelo.Lugar;
import org.usuarioDAO.LugarDAO;

/**
 *
 * @author ArllayneC
 */@Named(value = "mbListarLugares")
@RequestScoped

public class ListarLugar {

    @Inject
    private LugarDAO dao;
    private List<Lugar> lugares;

    @PostConstruct
    private void init() {
        this.lugares = dao.buscarTodos();
    }

    public List<Lugar> getLugares() {
        return lugares;
    }
}
