
package com.alejandro.ucc;

import com.alejandro.DAO.ProductoDao;
import com.alejandro.dominio.Producto;

public class Productoucc {

    public boolean editarProducto(Producto producto) {
        ProductoDao pd = new ProductoDao(producto);
        try {
            pd.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean guardarProducto(Producto producto) {
        ProductoDao pd = new ProductoDao(producto);
        try {
            pd.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteProducto(Producto producto) {
        ProductoDao pd = new ProductoDao(producto);
        try {
            pd.remove();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


