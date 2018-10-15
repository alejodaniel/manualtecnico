package com.alejandro.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemfactura")
public class ItemFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idItemFactura;

    @Column(nullable = false, columnDefinition = "int(11)")
    private int cantidad;
    
    @Column(nullable = false, columnDefinition = "varchar(50)")
    private String nombre;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String valorUnitario;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String valorFinal;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Producto producto;

    /**
     * @return the idItemFactura
     */
    public int getIdItemFactura() {
        return idItemFactura;
    }

    /**
     * @param idItemFactura the idItemFactura to set
     */
    public void setIdItemFactura(int idItemFactura) {
        this.idItemFactura = idItemFactura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valorUnitario
     */
    public String getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the valorFinal
     */
    public String getValorFinal() {
        return valorFinal;
    }

    /**
     * @param valorFinal the valorFinal to set
     */
    public void setValorFinal(String valorFinal) {
        this.valorFinal = valorFinal;
    }

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
