package com.alejandro.DAO;

import com.alejandro.dominio.Empresa;
import com.alejandro.dominio.Producto;
import java.util.List;
import javax.persistence.Query;

public class ProductoDao extends DAOAbstract<Producto> {

    public ProductoDao(Producto producto) {
        super(producto);
    }

    @Override
    public List<Producto> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select p from Producto p ");
        return query.getResultList();

    }

    public List<Producto> buscarPorCriterio(String escribir, Empresa empresa) {
        Query query = this.getEntityManager().createQuery("Select p from Producto p where p.nombre  like '%" + escribir + "%' AND p.empresa.nombreEmpresa ='"+empresa.getNombreEmpresa()+"'");
        return query.getResultList();
    }
}
