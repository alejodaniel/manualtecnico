package com.alejandro.table;

import com.alejandro.dominio.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProductoTable extends AbstractTableModel {

    String titulo[] = {"Codigo", "Codigo de Barras", "Nombre", "Precio", "Costo", "Stock"};

    private List<Producto> filas;
    private Producto producto;

    public ProductoTable(List<Producto> filas) {
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
        setProducto(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getProducto().getCodigo();
            case 1:
                return getProducto().getCodigoBarras();
            case 2:
                return getProducto().getNombre();
            case 3:
                return getProducto().getPrecio();
            case 4:
                return getProducto().getCosto();
            case 5:
                return getProducto().getStock();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Producto> getFilas() {
        return filas;
    }

    public void setFilas(List<Producto> filas) {
        this.filas = filas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
