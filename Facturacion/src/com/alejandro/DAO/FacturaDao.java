/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.DAO;


import com.alejandro.dominio.Factura;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

public class FacturaDao extends DAOAbstract<Factura> {

    public FacturaDao(Factura factura) {
        super(factura);
    }

    @Override
    public List<Factura> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select f from Factura f");
        return query.getResultList();
    }

    public List<Factura> buscarPorCriterio(String escribir) {
        Query query = this.getEntityManager().createQuery("Select f from Factura f where f.cliente.nombre  like '%" + escribir + "%'");
        return query.getResultList();
    }
    
    public List<Factura> buscarPorCriterioCompra(String escribir) {
        Query query = this.getEntityManager().createQuery("Select f from Factura f where f.proveedor.nombreEmpresa  like '%" + escribir + "%'");
        return query.getResultList();
    }

    public int nextNumeroFactura() {
        Query query = this.getEntityManager().createQuery("Select f from Factura f where f.idFactura =(Select max(f1.idFactura) from Factura f1 where f1.type = 'VENTA')");
        if (query.getResultList().isEmpty()) {
            return 1;
        } else {
            Factura f = (Factura) query.getSingleResult();
            return Integer.parseInt(f.getNumeroFactura()) + 1;
        }
    }

    public List<Factura> buscarPorFecha(Date fechaInicial, Date fechaFinal) {
        String inicial = convertirFechaString(fechaInicial);
        String fin = convertirFechaString(fechaFinal);
        Query query = this.getEntityManager().createQuery("Select f from Factura f where f.fechaFactura >= '" + inicial + "' AND f.fechaFactura <= '" + fin + "'");
        return query.getResultList();
    }

    public String convertirFechaString(Date fecha) {

        Format formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(fecha);

    }

    
}
