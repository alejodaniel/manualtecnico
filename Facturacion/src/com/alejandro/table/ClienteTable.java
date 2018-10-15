/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.table;

import com.alejandro.dominio.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTable extends AbstractTableModel {

    String titulo[] = {"Nombre", "Cedula", "Direccion", "Telefono", "Celular", "F.Nacimiento"};

    private List<Cliente> filas;
    private Cliente cliente;

    public ClienteTable(List<Cliente> filas) {
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
        setCliente(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getCliente().getNombre();
            case 1:
                return getCliente().getCedula();
            case 2:
                return getCliente().getDireccion();
            case 3:
                return getCliente().getTelefono();
            case 4:
                return getCliente().getCelular();
            case 5:
                return getCliente().getFechaNacimiento();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Cliente> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Cliente> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param persona the persona to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
