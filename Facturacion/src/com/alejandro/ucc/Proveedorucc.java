/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.ucc;

import com.alejandro.DAO.ProveedorDao;
import com.alejandro.dominio.Proveedor;




public class Proveedorucc {
       public boolean editarProveedor(Proveedor proveedor) {
       ProveedorDao pd = new ProveedorDao(proveedor);
        try {
            pd.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean guardarProveedor(Proveedor proveedor) {
        ProveedorDao pd = new ProveedorDao(proveedor);
        try {
            pd.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteProveedor(Proveedor proveedor) {
        ProveedorDao pd = new ProveedorDao(proveedor);
        try {
            pd.remove();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
    

