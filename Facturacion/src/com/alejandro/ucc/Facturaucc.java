package com.alejandro.ucc;

import com.alejandro.DAO.FacturaDao;
import com.alejandro.dominio.Factura;

public class Facturaucc {

    public boolean guardarFactura(Factura factura) {
        FacturaDao fd = new FacturaDao(factura);
        try {
            fd.persist();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
