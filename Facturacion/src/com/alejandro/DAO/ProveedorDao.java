/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.DAO;

import com.alejandro.dominio.Proveedor;
import com.alejandro.dominio.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Alejandro
 */
public class ProveedorDao extends DAOAbstract<Proveedor> {

    public ProveedorDao(Proveedor instancia) {
        super(instancia);
    }

    @Override
    public List<Proveedor> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select p from Proveedor p");
        return query.getResultList();
    }

    public List<Proveedor> buscarPorCriterio(String escribir) {
        Query query = this.getEntityManager().createQuery("Select p from Proveedor p where p.nombreEmpresa like '%" + escribir + "%'");
        return query.getResultList();
    }
}
