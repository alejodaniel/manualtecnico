package com.alejandro.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpresa;

    @Column(nullable = false, columnDefinition = "varchar(50)")
    private String nombreEmpresa;

    @Column(nullable = false, columnDefinition = "varchar(50)")
    private String direccion;

    @Column(nullable = false, columnDefinition = "varchar(10)")
    private String telefono;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String email;

    private boolean activo;
    
    @Column(nullable = false, columnDefinition = "varchar(15)")
    private String type;
    

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;
    
//    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Proveedor> proveedores ;
//    
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Factura> facturas;

    public Empresa() {
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
//        proveedores = new ArrayList<>();
        facturas = new ArrayList<>();
        
    }

    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the empleados
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * @return the clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the empresas
     */
  

    /**
     * @return the proveedores
     */
//    public List<Proveedor> getProveedores() {
//        return proveedores;
//    }
//
//    /**
//     * @param proveedores the proveedores to set
//     */
//    public void setProveedores(List<Proveedor> proveedores) {
//        this.proveedores = proveedores;
//    }

    /**
     * @return the facturas
     */
    public List<Factura> getFacturas() {
        return facturas;
    }

    /**
     * @param facturas the facturas to set
     */
    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the nombreEmpresa1
     */
//    public String getNombreEmpresa1() {
//        return nombreEmpresa1;
//    }
//
//    /**
//     * @param nombreEmpresa1 the nombreEmpresa1 to set
//     */
//    public void setNombreEmpresa1(String nombreEmpresa1) {
//        this.nombreEmpresa1 = nombreEmpresa1;
//    }
}
