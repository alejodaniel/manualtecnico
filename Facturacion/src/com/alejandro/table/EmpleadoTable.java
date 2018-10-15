/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.table;

import com.alejandro.dominio.Empleado;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EmpleadoTable extends AbstractTableModel {

    String titulo[] = {"Cargo", "Nombre", "Cedula", "Direccion", "Telefono", "Celular", "F.Nacimiento"};

    private List<Empleado> filas;
    private Empleado empleado;

    public EmpleadoTable(List<Empleado> filas) {
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
        setEmpleado(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getEmpleado().getCargo();
            case 1:
                return getEmpleado().getNombre();
            case 2:
                return getEmpleado().getCedula();
            case 3:
                return getEmpleado().getDireccion();
            case 4:
                return getEmpleado().getTelefono();
            case 5:
                return getEmpleado().getCelular();
            case 6:
                return getEmpleado().getFechaNacimiento();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Empleado> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Empleado> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param persona the persona to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
