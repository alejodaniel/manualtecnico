/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.DAO;

import com.alejandro.dominio.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Alejandro
 */
public class UsuarioDao extends DAOAbstract<Usuario> {

    public UsuarioDao(Usuario usuario) {
        super(usuario);
    }

    @Override
    public List<Usuario> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select u from Usuario u");
        return query.getResultList();
    }

    public Usuario obtenerUsuario(String user, String pass) {
        Query query = this.getEntityManager().createQuery("Select u from Usuario u where u.nombreUsuario= '" + user + "' AND u.password= '" + pass + "'");
        return (Usuario) query.getSingleResult();
    }

    public List<Usuario> buscarPorCriterio(String escribir) {
        Query query = this.getEntityManager().createQuery("Select u from Usuario u where u.nombreUsuario like '%" + escribir + "%'");
        return query.getResultList();
    }

    public boolean verificacionLogin(String user, String pass) {
        Query query = this.getEntityManager().createQuery("Select u from Usuario u where u.nombreUsuario= '" + user + "' AND u.password= '" + pass + "'");

        if (query.getResultList().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean insertarAdmin() {
        Query query = this.getEntityManager().createQuery("Select u from Usuario u");
        if (query.getResultList().isEmpty()) {
            return false;
        } else {
            return true;
        }

    }
}
