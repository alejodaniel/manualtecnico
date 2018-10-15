package com.alejandro.ucc;

import com.alejandro.DAO.ClienteDao;
import com.alejandro.dominio.Cliente;

public class Clienteucc {

    public boolean editarCliente(Cliente cliente) {
        ClienteDao cd = new ClienteDao(cliente);
        try {
            cd.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean guardarCliente(Cliente cliente) {
        ClienteDao cd = new ClienteDao(cliente);
        try {
            cd.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteCliente(Cliente cliente) {
        ClienteDao cd = new ClienteDao(cliente);
        try {
            cd.remove();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
