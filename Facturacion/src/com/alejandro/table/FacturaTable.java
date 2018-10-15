/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.table;

import com.alejandro.dominio.Factura;
import com.alejandro.dominio.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alejandro
 */
public class FacturaTable extends AbstractTableModel {

    String titulo[] = {"Cliente","N.Factura","Fecha","Subtotal","I.V.A","Total"};

    private List<Factura> filas;
    private Factura factura;

    public FacturaTable(List<Factura> filas) {
        this.filas = filas;
    }
//Herencia

    @Override
    public int getRowCount() {
        return getFilas() != null ? getFilas().size() : 0;//retorna el numero de filas
    }

    @Override
    public int getColumnCount() {
        return titulo.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulo[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        setFactura(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getFactura().getCliente().getNombre();
            case 1:
                return getFactura().getNumeroFactura();
            case 2:
                
                return getFactura().getFechaFactura();
            case 3:
                return getFactura().getSubtotal();
            case 4:
                return getFactura().getIva();
            case 5:
                return getFactura().getValor();
                
                

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Factura> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFactura(List<Factura> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param usuario the persona to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

}
