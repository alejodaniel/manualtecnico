/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.reportes;

import com.alejandro.dominio.Factura;
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Alejandro
 */
public class Reportes {

    private Connection conn;

    public Reportes() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemafacturacion", "root", "alejodaniel12345");
        } catch (SQLException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void imprimir(Factura factura) {
        //Crear el objeto reporte
        JasperReport reportes;
        //Aqui ponemos la ubicacion del reporte

//        String path = "C:\\Users\\Alejandro\\Desktop\\jpa-facturapruebas\\FacturaJpa\\build\\classes\\com\\alejandro\\reportes\\VehiculosReport.jasper";
        String path = System.getProperty("user.dir") + "/src/com/alejandro/reportes/FacturaReport.jasper";
        try {
            Map parametros = new HashMap();
            parametros.put("idFactura", factura.getIdFactura());
            parametros.put("nombrePersona", factura.getCliente().getNombre());
            parametros.put("cedula", factura.getCliente().getCedula());
            parametros.put("direccion", factura.getCliente().getDireccion());
            parametros.put("telefono", factura.getCliente().getCelular());
            parametros.put("valorIva", factura.getIva());
            parametros.put("valorSubtotal", factura.getSubtotal());
            parametros.put("valorTotal", factura.getValor());

            //Cargo el reporte al objeto
            reportes = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Se llena el reporte con tres parametros path , null , y la variable de la conexion
            JasperPrint imprime = JasperFillManager.fillReport(reportes, parametros, conn);
            //se crea la vista del reporte 
            JasperViewer vista = new JasperViewer(imprime, false);
            // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
//            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            vista.setVisible(true);
            JDialog dialogo = new JDialog(vista, true);
            dialogo.setTitle("Reporte Facturas");
            dialogo.setContentPane(vista.getContentPane());
            dialogo.setBounds(100, 100, 900, 800);
//            dialogo.setAlwaysOnTop(true);
            dialogo.setLocationRelativeTo(null);
            dialogo.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void imprimirFacturaCompra(Factura factura) {
        JasperReport reportes;
        //Aqui ponemos la ubicacion del reporte

//        String path = "C:\\Users\\Alejandro\\Desktop\\jpa-facturapruebas\\FacturaJpa\\build\\classes\\com\\alejandro\\reportes\\VehiculosReport.jasper";
        String path = System.getProperty("user.dir") + "/src/com/alejandro/reportes/FacturaCompraReport.jasper";
        try {
            Map parametros = new HashMap();
            parametros.put("idFactura", factura.getIdFactura());
            parametros.put("nombreProveedor", factura.getProveedor().getNombreEmpresa());
            parametros.put("direccion", factura.getProveedor().getDireccion());
            parametros.put("telefono",factura.getProveedor().getTelefono());
            parametros.put("email",factura.getProveedor().getEmail());
            parametros.put("valorIva",factura.getIva());
            parametros.put("valorSubtotal",factura.getSubtotal());
            parametros.put("valorTotal",factura.getValor());

            //Cargo el reporte al objeto
            reportes = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Se llena el reporte con tres parametros path , null , y la variable de la conexion
            JasperPrint imprime = JasperFillManager.fillReport(reportes, parametros, conn);
            //se crea la vista del reporte 
            JasperViewer vista = new JasperViewer(imprime, false);
            // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
//            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            vista.setVisible(true);
            JDialog dialogo = new JDialog(vista, true);
            dialogo.setTitle("Reporte Facturas Compra");
            dialogo.setContentPane(vista.getContentPane());
            dialogo.setBounds(100, 100, 900, 800);
//            dialogo.setAlwaysOnTop(true);
            dialogo.setLocationRelativeTo(null);
            dialogo.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void imprimirFacturas(List<Factura> facturas, Date fechaInicio, Date fechaFin) {
        //Crear el objeto reporte
        JasperReport reportes;
        //Aqui ponemos la ubicacion del reporte

//        String path = "C:\\Users\\Alejandro\\Desktop\\jpa-facturapruebas\\FacturaJpa\\build\\classes\\com\\alejandro\\reportes\\VehiculosReport.jasper";
        String path = System.getProperty("user.dir") + "/src/com/alejandro/reportes/FactuaFecha.jasper";
        try {
            double subtotal = 0;
            double iva = 0;
            double valor = 0;

            for (int i = 0; i < facturas.size(); i++) {
                subtotal = subtotal + facturas.get(i).getSubtotal();
                iva = iva + facturas.get(i).getIva();
                valor = valor + facturas.get(i).getValor();

            }
            //se da el formato de String al Date
            Format formatter = new SimpleDateFormat("yyyy-MM-dd");
            Map parametros = new HashMap();
           
            parametros.put("fechaInicio", formatter.format(fechaInicio));
            parametros.put("fechaFin", formatter.format(fechaFin));
            parametros.put("valorIva", iva);
            parametros.put("valorSubtotal", subtotal);
            parametros.put("valorTotal", valor);

            //Cargo el reporte al objeto
            reportes = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Se llena el reporte con tres parametros path , null , y la variable de la conexion
            JasperPrint imprime = JasperFillManager.fillReport(reportes, parametros, conn);
            //se crea la vista del reporte 
            JasperViewer vista = new JasperViewer(imprime, false);
            // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
//            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            vista.setVisible(true);
            JDialog dialogo = new JDialog(vista, true);
            dialogo.setTitle("Reporte Facturas");
            dialogo.setContentPane(vista.getContentPane());
            dialogo.setBounds(100, 100, 900, 800);
//            dialogo.setAlwaysOnTop(true);
            dialogo.setLocationRelativeTo(null);
            dialogo.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void imprimirFacName(List<Factura> facturas, String criterio) {
        //Crear el objeto reporte
        JasperReport reportes;
        //Aqui ponemos la ubicacion del reporte

//        String path = "C:\\Users\\Alejandro\\Desktop\\jpa-facturapruebas\\FacturaJpa\\build\\classes\\com\\alejandro\\reportes\\VehiculosReport.jasper";
        String path = System.getProperty("user.dir") + "/src/com/alejandro/reportes/FacturaNombre.jasper";
        try {
            double subtotal = 0;
            double iva = 0;
            double valor = 0;

            for (int i = 0; i < facturas.size(); i++) {
                subtotal = subtotal + facturas.get(i).getSubtotal();
                iva = iva + facturas.get(i).getIva();
                valor = valor + facturas.get(i).getValor();
                

            }
            Map parametros = new HashMap();
            parametros.put("criterio", "%" + criterio + "%");
//            parametros.put("valorIva", iva);
//            parametros.put("valorSubtotal", subtotal);
//            parametros.put("valorTotal", valor);

            //Cargo el reporte al objeto
            reportes = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Se llena el reporte con tres parametros path , null , y la variable de la conexion
            JasperPrint imprime = JasperFillManager.fillReport(reportes, parametros, conn);
            //se crea la vista del reporte 
            JasperViewer vista = new JasperViewer(imprime, false);
            // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
//            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            vista.setVisible(true);
            JDialog dialogo = new JDialog(vista, true);
            dialogo.setTitle("Reporte Facturas");
            dialogo.setContentPane(vista.getContentPane());
            dialogo.setBounds(100, 100, 900, 800);
//            dialogo.setAlwaysOnTop(true);
            dialogo.setLocationRelativeTo(null);
            dialogo.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void imprimirFacCompraName(List<Factura> facturas, String criterio) {
        //Crear el objeto reporte
        JasperReport reportes;
        //Aqui ponemos la ubicacion del reporte

//        String path = "C:\\Users\\Alejandro\\Desktop\\jpa-facturapruebas\\FacturaJpa\\build\\classes\\com\\alejandro\\reportes\\VehiculosReport.jasper";
        String path = System.getProperty("user.dir") + "/src/com/alejandro/reportes/FacturaCompraReport.jasper";
        try {
            double subtotal = 0;
            double iva = 0;
            double valor = 0;

            for (int i = 0; i < facturas.size(); i++) {
                subtotal = subtotal + facturas.get(i).getSubtotal();
                iva = iva + facturas.get(i).getIva();
                valor = valor + facturas.get(i).getValor();
                

            }
            Map parametros = new HashMap();
            parametros.put("criterio", "%" + criterio + "%");
//            parametros.put("valorIva", iva);
//            parametros.put("valorSubtotal", subtotal);
//            parametros.put("valorTotal", valor);

            //Cargo el reporte al objeto
            reportes = (JasperReport) JRLoader.loadObjectFromFile(path);
            //Se llena el reporte con tres parametros path , null , y la variable de la conexion
            JasperPrint imprime = JasperFillManager.fillReport(reportes, parametros, conn);
            //se crea la vista del reporte 
            JasperViewer vista = new JasperViewer(imprime, false);
            // Le agregamos que se cierre solo el reporte cuando lo cierre el usuario
//            vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            vista.setVisible(true);
            JDialog dialogo = new JDialog(vista, true);
            dialogo.setTitle("Reporte Facturas de Compra");
            dialogo.setContentPane(vista.getContentPane());
            dialogo.setBounds(100, 100, 900, 800);
//            dialogo.setAlwaysOnTop(true);
            dialogo.setLocationRelativeTo(null);
            dialogo.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
