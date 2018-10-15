package com.alejandro.DAO;

import com.alejandro.dominio.Persona;
import java.util.List;
import javax.persistence.Query;

public class PersonaDao extends DAOAbstract<Persona> {

    public PersonaDao(Persona persona) {
        super(persona);
    }

    @Override
    public List<Persona> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select p from Persona p");
        return query.getResultList();
    }

}
