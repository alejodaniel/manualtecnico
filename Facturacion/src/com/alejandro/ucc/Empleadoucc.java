/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.ucc;

import com.alejandro.DAO.EmpleadoDao;
import com.alejandro.dominio.Empleado;

public class Empleadoucc {

    public boolean editarEmpleado(Empleado empleado) {
        EmpleadoDao ed = new EmpleadoDao(empleado);
        try {
            ed.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean guardarEmpleado(Empleado empleado) {
        EmpleadoDao ed = new EmpleadoDao(empleado);
        try {
            ed.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteEmpleado(Empleado empleado) {
        EmpleadoDao ed = new EmpleadoDao(empleado);
        try {
            ed.remove();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
