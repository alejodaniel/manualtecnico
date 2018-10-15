package com.alejandro.table;

import com.alejandro.dominio.Empresa;
import com.alejandro.dominio.Proveedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProveedorTable extends AbstractTableModel {

    String titulo[] = {"Nombre", "Direccion", "Telefono", "E-mail"};

    private List<Proveedor> filas;
    private Proveedor proveedor;

    public ProveedorTable(List<Proveedor> filas) {
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
        setProveedor(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getProveedor().getNombreEmpresa();
            case 1:
                return getProveedor().getDireccion();
            case 2:
                return getProveedor().getTelefono();
            case 3:
                return getProveedor().getEmail();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Proveedor> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Proveedor> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param persona the persona to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

}
