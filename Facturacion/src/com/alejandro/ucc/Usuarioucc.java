package com.alejandro.ucc;

import com.alejandro.DAO.UsuarioDao;
import com.alejandro.dominio.Usuario;
import java.util.List;
import javax.persistence.Query;

public class Usuarioucc {

    public boolean editarUsuario(Usuario usuario) {
        UsuarioDao ud = new UsuarioDao(usuario);
        try {
            ud.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean guardarUsuario(Usuario usuario) {
        UsuarioDao ud = new UsuarioDao(usuario);
        try {
            ud.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteUsuario(Usuario usuario) {
        UsuarioDao ud = new UsuarioDao(usuario);
        try {
            ud.remove();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
