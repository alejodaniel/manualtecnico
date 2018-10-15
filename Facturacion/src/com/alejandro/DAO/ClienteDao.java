package com.alejandro.DAO;

import com.alejandro.dominio.Cliente;
import java.util.List;
import javax.persistence.Query;

public class ClienteDao extends DAOAbstract<Cliente> {

    public ClienteDao(Cliente cliente) {
        super(cliente);
    }

    @Override
    public List<Cliente> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Selec c from Cliente c");
        return query.getResultList();
    }

    public List<Cliente> buscarPorCriterio(String escribir) {
        Query query = this.getEntityManager().createQuery("Select c from Cliente c where c.nombre like '%" + escribir + "%'");
        return query.getResultList();
    }
}
