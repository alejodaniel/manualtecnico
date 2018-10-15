package com.alejandro.views;

import com.alejandro.DAO.FacturaDao;
import com.alejandro.dominio.Cliente;
import com.alejandro.dominio.Factura;
import com.alejandro.dominio.ItemFactura;
import com.alejandro.dominio.Producto;
import com.alejandro.reportes.Reportes;
import com.alejandro.table.ItemFacturaTable;
import com.alejandro.ucc.Facturaucc;
import com.alejandro.ucc.ValidarNumeros;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import javax.swing.JOptionPane;

public class FacturaVentaView extends javax.swing.JDialog {

    private Cliente cliente;
//    private ItemFactura itemFactura;
    private Producto producto;
    private List<ItemFactura> items;
    private List<Producto> productos;

    public FacturaVentaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getBtnagregar().setEnabled(false);
        getBtndelete().setEnabled(false);
        getBtnguardar().setEnabled(false);

        items = new ArrayList<>();
        productos = new ArrayList<>();
        nextNumFactura();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btnbuscarprod = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtnameprod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        fechaFacturaChooser = new com.toedter.calendar.JDateChooser();
        txtnumfac = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTE");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("DATOS DEL CLIENTE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Numero de Factura");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Fecha:");

        btnagregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setText("ELIMINAR");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("BUSCAR PRODUCTO");

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaFactura);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Cedula:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Telefono:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("BUSCAR CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txtdireccion)
                            .addComponent(txtcedula)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("PRODUCTO");

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setText("EFECTUAR VENTA");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("SUBTOTAL");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("I.V.A");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL");

        txtsubtotal.setEditable(false);
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        txtiva.setEditable(false);

        txttotal.setEditable(false);

        btnbuscarprod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnbuscarprod.setText("BUSCAR");
        btnbuscarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarprodActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Producto Seleccionado");

        txtnameprod.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Stock");

        txtstock.setEditable(false);
        txtstock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Precio");

        txtprecio.setEditable(false);
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Cantidad");

        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("CERRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fechaFacturaChooser.setDate(new java.util.Date()
        );
        fechaFacturaChooser.setEnabled(false);

        txtnumfac.setEditable(false);
        txtnumfac.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaFacturaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumfac, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscarprod))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnameprod, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndelete)
                                    .addComponent(btnagregar))))
                        .addGap(0, 66, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtnumfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFacturaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(btnbuscarprod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnameprod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cargarCliente() {
        getTxtnombre().setText(getCliente().getNombre());
        getTxtcedula().setText(getCliente().getCedula());
        getTxtdireccion().setText(getCliente().getDireccion());
        getTxttelefono().setText(getCliente().getTelefono());
    }

    public void cargarProducto() {
        getTxtnameprod().setText(getProducto().getNombre());
        getTxtprecio().setText(getProducto().getPrecio());
        getTxtstock().setText(getProducto().getStock());
        getTxtcantidad().setText("1");

    }

    public void nextNumFactura() {
        FacturaDao fd = new FacturaDao(null);
        int numerof = fd.nextNumeroFactura();

        Formatter frm = new Formatter();
        String ceros = String.valueOf(frm.format("%09d", numerof));

        getTxtnumfac().setText(ceros);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            BuscarClienteView bpv = new BuscarClienteView(null, true, this);
            bpv.getBtneditar().setVisible(false);
            bpv.getBtneliminar().setVisible(false);

            bpv.setVisible(true);

            if (getCliente() != null) {
                cargarCliente();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el cliente");
        }

//        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private double subtotal;
    private double iva;
    private double total;

    public boolean validarEntradas() {
        ValidarNumeros validarNumeros = new ValidarNumeros();
        if (getTxtnameprod().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta los datos de nombre");
            return false;
        } else if (getTxtnombre().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta los datos de nombre");
            return false;
        } else if (getTxtcedula().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta cedula");
        } else if (getTxtiva().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta Direccion");
        } else if (getTxttelefono().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta Telefono");
        } else if (!validarNumeros.validacion(getTxtcantidad().getText())) {
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros para agregar la cantidad ");
            return false;
        } else if (!validarNumeros.validacion(getTxtprecio().getText())) {
            JOptionPane.showMessageDialog(this, "El precio solo acepta numeros");

        }
        return true;
    }
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        if (Integer.parseInt(getTxtstock().getText()) < Integer.parseInt(getTxtcantidad().getText())) {
            JOptionPane.showMessageDialog(this, "El stock es menor que la cantidad ingresada");
        } else {

            try {

                ItemFactura itemFactura = new ItemFactura();

                itemFactura.setCantidad(Integer.parseInt(getTxtcantidad().getText()));
                itemFactura.setNombre(getProducto().getNombre());
                itemFactura.setValorUnitario(getTxtprecio().getText());

                //Multiplica el valor unitario con la cantidad
                double valorTotal = itemFactura.getCantidad() * Double.parseDouble(itemFactura.getValorUnitario());
                itemFactura.setValorFinal(valorTotal + "");

                getItems().add(itemFactura);

                getProductos().add(getProducto());

                getTablaFactura().setModel(new ItemFacturaTable(getItems()));

                setTotal(getTotal() + valorTotal);
                int x = Integer.parseInt(getTxtstock().getText()) - Integer.parseInt(getTxtcantidad().getText());
                getTxtstock().setText(x + "");
                calcularProductos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No hay productos en el panel ");

            }
        }

    }//GEN-LAST:event_btnagregarActionPerformed

    public void calcularProductos() {

        setSubtotal(getTotal() / 1.12);
        setIva(getTotal() - getSubtotal());
        setTotal(getSubtotal() + getIva());
        setSubtotal(Math.round(getSubtotal() * 100.0) / 100.0);
        setIva(Math.round(getIva() * 100.0) / 100.0);
        setTotal(Math.round(getTotal() * 100.0) / 100.0);

        getTxtsubtotal().setText(getSubtotal() + "");
        getTxtiva().setText(getIva() + "");
        getTxttotal().setText(getTotal() + "");

    }
    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed

    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
//        JOptionPane.showMessageDialog(this, getTxtnameprod().getText());

        if (getTxtnameprod().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el campo producto");

        } else {
            try {
                Factura factura = new Factura();

                for (int i = 0; i < getItems().size(); i++) {
                    getItems().get(i).setProducto(getProductos().get(i));
                    getProductos().get(i).getItemFacturas().add(getItems().get(i));
                    getProductos().get(i).setStock((Integer.parseInt(getProductos().get(i).getStock()) - getItems().get(i).getCantidad()) + "");

                    getItems().get(i).setFactura(factura);
                }

                factura.setFechaFactura(getFechaFacturaChooser().getDate());
                factura.setNumeroFactura(getTxtnumfac().getText());
                factura.setSubtotal(getSubtotal());
                factura.setIva(getIva());

                factura.setValor(getTotal());
                factura.setType("VENTA");
                factura.setItemsFactura(getItems());

                factura.setCliente(getCliente());
                getCliente().getFacturas().add(factura);

                Facturaucc fuc = new Facturaucc();

                int guardar = JOptionPane.showConfirmDialog(this, "Desea efectuar la venta ?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (guardar == JOptionPane.YES_OPTION) {
                    if (fuc.guardarFactura(factura) == true) {
                        Reportes reportes = new Reportes();
                        reportes.imprimir(factura);
                        JOptionPane.showMessageDialog(this, "Se registro la venta con éxito");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al efectuar la venta");

                    }

                } else {

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error para efectuar la venta "
                        + "\n Verifique ");
            }


    }//GEN-LAST:event_btnguardarActionPerformed
    }
    private void btnbuscarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarprodActionPerformed
        try {
            BuscarProductoView bpv = new BuscarProductoView(null, true, this, null);
            bpv.getBtneliminar().setVisible(false);
            bpv.getBtnnuevoprod().setVisible(false);
            bpv.getBtneditar().setVisible(false);
            bpv.setVisible(true);
            if (getProducto() != null) {
                cargarProducto();
                getBtnagregar().setEnabled(true);
                getBtndelete().setEnabled(true);
                getBtnguardar().setEnabled(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el producto");
        }


    }//GEN-LAST:event_btnbuscarprodActionPerformed

    private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed

    }//GEN-LAST:event_txtstockActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            ItemFacturaTable clienteTable = (ItemFacturaTable) getTablaFactura().getModel();
            ItemFactura item = clienteTable.getFilas().get(getTablaFactura().getSelectedRow());
            setTotal(getTotal() - Double.parseDouble(item.getValorFinal()));
            int x = Integer.parseInt(getTxtstock().getText()) + Integer.parseInt(getTxtcantidad().getText());
            getTxtstock().setText(x + "");
            getItems().remove(item);
            getProductos().remove(getTablaFactura().getSelectedRow());
            getTablaFactura().setModel(new ItemFacturaTable(getItems()));

            calcularProductos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay productos asignados en la factura");
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscarprod;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnguardar;
    private com.toedter.calendar.JDateChooser fechaFacturaChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtnameprod;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumfac;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    /**
     * @param jButton1 the jButton1 to set
     */
    public void setjButton1(javax.swing.JButton jButton1) {
        this.jButton1 = jButton1;
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return getBtnagregar();
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.setBtnagregar(jButton2);
    }

    /**
     * @return the jButton4
     */
    public javax.swing.JButton getjButton4() {
        return getBtndelete();
    }

    /**
     * @param jButton4 the jButton4 to set
     */
    public void setjButton4(javax.swing.JButton jButton4) {
        this.setBtndelete(jButton4);
    }

    /**
     * @return the jButton5
     */
    public javax.swing.JButton getjButton5() {
        return getBtnguardar();
    }

    /**
     * @param jButton5 the jButton5 to set
     */
    public void setjButton5(javax.swing.JButton jButton5) {
        this.setBtnguardar(jButton5);
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel10
     */
    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    /**
     * @param jLabel10 the jLabel10 to set
     */
    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    /**
     * @return the jLabel11
     */
    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    /**
     * @param jLabel11 the jLabel11 to set
     */
    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    /**
     * @return the jLabel12
     */
    public javax.swing.JLabel getjLabel12() {
        return jLabel12;
    }

    /**
     * @param jLabel12 the jLabel12 to set
     */
    public void setjLabel12(javax.swing.JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    /**
     * @return the jLabel14
     */
    public javax.swing.JLabel getjLabel14() {
        return jLabel14;
    }

    /**
     * @param jLabel14 the jLabel14 to set
     */
    public void setjLabel14(javax.swing.JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    /**
     * @return the jLabel9
     */
    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    /**
     * @param jLabel9 the jLabel9 to set
     */
    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the tablaItemFactura
     */
    public javax.swing.JTable getTablaItemFactura() {
        return getTablaFactura();
    }

    /**
     * @param tablaItemFactura the tablaItemFactura to set
     */
    public void setTablaItemFactura(javax.swing.JTable tablaItemFactura) {
        this.setTablaFactura(tablaItemFactura);
    }

    /**
     * @return the txtbuscarprod
     *
     *
     * /
     **
     * @return the txtcedula
     */
    public javax.swing.JTextField getTxtcedula() {
        return txtcedula;
    }

    /**
     * @param txtcedula the txtcedula to set
     */
    public void setTxtcedula(javax.swing.JTextField txtcedula) {
        this.txtcedula = txtcedula;
    }

    /**
     * @return the txtdireccion
     */
    public javax.swing.JTextField getTxtdireccion() {
        return txtdireccion;
    }

    /**
     * @param txtdireccion the txtdireccion to set
     */
    public void setTxtdireccion(javax.swing.JTextField txtdireccion) {
        this.txtdireccion = txtdireccion;
    }

    /**
     * @return the txtiva
     */
    public javax.swing.JTextField getTxtiva() {
        return txtiva;
    }

    /**
     * @param txtiva the txtiva to set
     */
    public void setTxtiva(javax.swing.JTextField txtiva) {
        this.txtiva = txtiva;
    }

    /**
     * @return the txtnombre
     */
    public javax.swing.JTextField getTxtnombre() {
        return txtnombre;
    }

    /**
     * @param txtnombre the txtnombre to set
     */
    public void setTxtnombre(javax.swing.JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    /**
     * @return the txtsubtotal
     */
    public javax.swing.JTextField getTxtsubtotal() {
        return txtsubtotal;
    }

    /**
     * @param txtsubtotal the txtsubtotal to set
     */
    public void setTxtsubtotal(javax.swing.JTextField txtsubtotal) {
        this.txtsubtotal = txtsubtotal;
    }

    /**
     * @return the txttelefono
     */
    public javax.swing.JTextField getTxttelefono() {
        return txttelefono;
    }

    /**
     * @param txttelefono the txttelefono to set
     */
    public void setTxttelefono(javax.swing.JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }

    /**
     * @return the txttotal
     */
    public javax.swing.JTextField getTxttotal() {
        return txttotal;
    }

    /**
     * @param txttotal the txttotal to set
     */
    public void setTxttotal(javax.swing.JTextField txttotal) {
        this.txttotal = txttotal;
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
     * @return the btnbuscarprod
     */
    public javax.swing.JButton getBtnbuscarprod() {
        return btnbuscarprod;
    }

    /**
     * @param btnbuscarprod the btnbuscarprod to set
     */
    public void setBtnbuscarprod(javax.swing.JButton btnbuscarprod) {
        this.btnbuscarprod = btnbuscarprod;
    }

    /**
     * @return the jDateChooser1
     */
    public com.toedter.calendar.JDateChooser getjDateChooser1() {
        return getFechaFacturaChooser();
    }

    /**
     * @param jDateChooser1 the jDateChooser1 to set
     */
    public void setjDateChooser1(com.toedter.calendar.JDateChooser jDateChooser1) {
        this.setFechaFacturaChooser(jDateChooser1);
    }

    /**
     * @return the jLabel13
     */
    public javax.swing.JLabel getjLabel13() {
        return jLabel13;
    }

    /**
     * @param jLabel13 the jLabel13 to set
     */
    public void setjLabel13(javax.swing.JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    /**
     * @return the jLabel15
     */
    public javax.swing.JLabel getjLabel15() {
        return jLabel15;
    }

    /**
     * @param jLabel15 the jLabel15 to set
     */
    public void setjLabel15(javax.swing.JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    /**
     * @return the jLabel16
     */
    public javax.swing.JLabel getjLabel16() {
        return jLabel16;
    }

    /**
     * @param jLabel16 the jLabel16 to set
     */
    public void setjLabel16(javax.swing.JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    /**
     * @return the jLabel17
     */
    public javax.swing.JLabel getjLabel17() {
        return jLabel17;
    }

    /**
     * @param jLabel17 the jLabel17 to set
     */
    public void setjLabel17(javax.swing.JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    /**
     * @return the txtcantidad
     */
    public javax.swing.JTextField getTxtcantidad() {
        return txtcantidad;
    }

    /**
     * @param txtcantidad the txtcantidad to set
     */
    public void setTxtcantidad(javax.swing.JTextField txtcantidad) {
        this.txtcantidad = txtcantidad;
    }

    /**
     * @return the txtnameprod
     */
    public javax.swing.JTextField getTxtnameprod() {
        return txtnameprod;
    }

    /**
     * @param txtnameprod the txtnameprod to set
     */
    public void setTxtnameprod(javax.swing.JTextField txtnameprod) {
        this.txtnameprod = txtnameprod;
    }

    /**
     * @return the txtprecio
     */
    public javax.swing.JTextField getTxtprecio() {
        return txtprecio;
    }

    /**
     * @param txtprecio the txtprecio to set
     */
    public void setTxtprecio(javax.swing.JTextField txtprecio) {
        this.txtprecio = txtprecio;
    }

    /**
     * @return the txtstock
     */
    public javax.swing.JTextField getTxtstock() {
        return txtstock;
    }

    /**
     * @param txtstock the txtstock to set
     */
    public void setTxtstock(javax.swing.JTextField txtstock) {
        this.txtstock = txtstock;
    }

    /**
     * @return the items
     */
    public List<ItemFactura> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    /**
     * @return the tablaFactura
     */
    public javax.swing.JTable getTablaFactura() {
        return tablaFactura;
    }

    /**
     * @param tablaFactura the tablaFactura to set
     */
    public void setTablaFactura(javax.swing.JTable tablaFactura) {
        this.tablaFactura = tablaFactura;
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
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the btnagregar
     */
    public javax.swing.JButton getBtnagregar() {
        return btnagregar;
    }

    /**
     * @param btnagregar the btnagregar to set
     */
    public void setBtnagregar(javax.swing.JButton btnagregar) {
        this.btnagregar = btnagregar;
    }

    /**
     * @return the btnguardar
     */
    public javax.swing.JButton getBtnguardar() {
        return btnguardar;
    }

    /**
     * @param btnguardar the btnguardar to set
     */
    public void setBtnguardar(javax.swing.JButton btnguardar) {
        this.btnguardar = btnguardar;
    }

    /**
     * @return the fechaFacturaChooser
     */
    public com.toedter.calendar.JDateChooser getFechaFacturaChooser() {
        return fechaFacturaChooser;
    }

    /**
     * @param fechaFacturaChooser the fechaFacturaChooser to set
     */
    public void setFechaFacturaChooser(com.toedter.calendar.JDateChooser fechaFacturaChooser) {
        this.fechaFacturaChooser = fechaFacturaChooser;
    }

    /**
     * @return the jButton3
     */
    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    /**
     * @param jButton3 the jButton3 to set
     */
    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    /**
     * @return the txtnumfac
     */
    public javax.swing.JTextField getTxtnumfac() {
        return txtnumfac;
    }

    /**
     * @param txtnumfac the txtnumfac to set
     */
    public void setTxtnumfac(javax.swing.JTextField txtnumfac) {
        this.txtnumfac = txtnumfac;
    }

    /**
     * @return the btndelete
     */
    public javax.swing.JButton getBtndelete() {
        return btndelete;
    }

    /**
     * @param btndelete the btndelete to set
     */
    public void setBtndelete(javax.swing.JButton btndelete) {
        this.btndelete = btndelete;
    }
}
