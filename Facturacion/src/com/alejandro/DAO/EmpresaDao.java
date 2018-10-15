package com.alejandro.DAO;

import com.alejandro.dominio.Empresa;

import java.util.List;
import javax.persistence.Query;

public class EmpresaDao extends DAOAbstract<Empresa> {

    public EmpresaDao(Empresa empresa) {
        super(empresa);
    }

    @Override
    public List<Empresa> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select e from Empresa e");
        return query.getResultList();
    }

    public List<Empresa> buscarPorCriterio(String escribir) {
        Query query = this.getEntityManager().createQuery("Select e from Empresa e where e.type = 'EMPRESA' AND  e.nombreEmpresa like '%" + escribir + "%'");
        return query.getResultList();
    }

    public Empresa getEmpresaActiva() {
        Query query = this.getEntityManager().createQuery("Select e from Empresa e where e.activo = true");
        return (Empresa) query.getSingleResult();
    }
}
