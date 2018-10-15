package com.alejandro.DAO;

import com.alejandro.dominio.Empleado;
import com.alejandro.dominio.Persona;
import java.util.List;
import javax.persistence.Query;

public class EmpleadoDao extends DAOAbstract<Empleado> {

    public EmpleadoDao(Empleado empleado) {
        super(empleado);
    }

    public List<Empleado> buscarPorCriterio(String agregar) {
        Query query = this.getEntityManager().createQuery("Select e from Empleado e where e.nombre like '%" + agregar + "%'");
        return query.getResultList();
    }

    @Override
    public List<Empleado> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select e from Empleado e");
        return query.getResultList();

    }
}
