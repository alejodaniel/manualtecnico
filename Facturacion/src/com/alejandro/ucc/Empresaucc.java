package com.alejandro.ucc;

import com.alejandro.DAO.EmpresaDao;
import com.alejandro.dominio.Empresa;

public class Empresaucc {

    public boolean editarEmpresa(Empresa empresa) {
        EmpresaDao ed = new EmpresaDao(empresa);
        try {
            ed.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean guardarEmpresa(Empresa empresa) {
        EmpresaDao ed = new EmpresaDao(empresa);
        try {
            ed.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteEmpresa(Empresa empresa) {
        EmpresaDao ed = new EmpresaDao(empresa);
        try {
            ed.remove();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}