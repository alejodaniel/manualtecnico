package com.alejandro.table;

import com.alejandro.dominio.Empresa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EmpresaTable extends AbstractTableModel {

    String titulo[] = {"Nombre", "Direccion", "Telefono", "E-mail"};

    private List<Empresa> filas;
    private Empresa empresa;

    public EmpresaTable(List<Empresa> filas) {
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
        setEmpresa(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getEmpresa().getNombreEmpresa();
            case 1:
                return getEmpresa().getDireccion();
            case 2:
                return getEmpresa().getTelefono();
            case 3:
                return getEmpresa().getEmail();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Empresa> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Empresa> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param persona the persona to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
