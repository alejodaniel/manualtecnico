/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.table;

import com.alejandro.dominio.Cliente;
import com.alejandro.dominio.ItemFactura;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ItemFacturaTable extends AbstractTableModel {

    String titulo[] = {"Cant.", "Descripción", "V.U.", "V.T."};

    private List<ItemFactura> filas;
    private ItemFactura itemFactura;

    public ItemFacturaTable(List<ItemFactura> filas) {
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
        setItemFactura(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getItemFactura().getCantidad();
            case 1:
                return getItemFactura().getNombre();
            case 2:
                return getItemFactura().getValorUnitario();

            case 3:
                return getItemFactura().getValorFinal();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<ItemFactura> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<ItemFactura> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public ItemFactura getItemFactura() {
        return itemFactura;
    }

    /**
     * @param persona the persona to set
     */
    public void setItemFactura(ItemFactura itemFactura) {
        this.itemFactura = itemFactura;
    }

}
