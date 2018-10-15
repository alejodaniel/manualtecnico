package com.alejandro.views;

import com.alejandro.DAO.EmpresaDao;
import com.alejandro.DAO.ProductoDao;
import com.alejandro.dominio.Empresa;
import com.alejandro.dominio.Producto;
import com.alejandro.table.ProductoTable;
import com.alejandro.ucc.Productoucc;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

public class BuscarProductoView extends javax.swing.JDialog {

    private FacturaVentaView fv;
    private FacturaCompraView fcv;
    private Empresa empresa;

    public BuscarProductoView(java.awt.Frame parent, boolean modal, FacturaVentaView view, FacturaCompraView fcview) {
        super(parent, modal);
        initComponents();
        if (view != null) {
            fv = view;
        } else if (fcview != null) {

            fcv = fcview;
        }

//        setIconImage(new ImageIcon(getClass().getResource("/imagenes/buscar.png")).getImage());
        EmpresaDao ed = new EmpresaDao(null);
        empresa = ed.getEmpresaActiva();

        this.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarproducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevoprod = new javax.swing.JButton();
        btnselecprodd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR PRODUCTO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbuscarproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarproductoKeyReleased(evt);
            }
        });

        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproductos);

        btncerrar.setBackground(new java.awt.Color(255, 255, 255));
        btncerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.setFocusable(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(255, 255, 255));
        btneditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.setFocusable(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.setFocusable(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevoprod.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevoprod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnuevoprod.setText("NUEVO PRODUCTO");
        btnnuevoprod.setFocusable(false);
        btnnuevoprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoprodActionPerformed(evt);
            }
        });

        btnselecprodd.setBackground(new java.awt.Color(255, 255, 255));
        btnselecprodd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnselecprodd.setText("SELECCIONAR");
        btnselecprodd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecproddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btneditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtbuscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnselecprodd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnnuevoprod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btncerrar)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnselecprodd))
                .addGap(18, 18, 18)
                .addComponent(btnnuevoprod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncerrar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

        try {
            ProductoTable productoTable = (ProductoTable) getTablaproductos().getModel();
            Producto producto = productoTable.getFilas().get(getTablaproductos().getSelectedRow());
            ProductosView pv = new ProductosView((Frame) this.getParent(), true, producto, null);
            pv.setVisible(true);
            txtbuscarproductoKeyReleased(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione al producto a editar");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbuscarproductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarproductoKeyReleased
        ProductoDao pd = new ProductoDao(null);

//        List<Producto> productos = pd.buscarPorCriterio(getTxtbuscarproducto().getText());
        List<Producto> productos = pd.buscarPorCriterio(getTxtbuscarproducto().getText(), getEmpresa());
        ProductoTable productoTable = new ProductoTable(productos);
        getTablaproductos().setModel(productoTable);
    }//GEN-LAST:event_txtbuscarproductoKeyReleased

    private void tablaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMouseClicked

    }//GEN-LAST:event_tablaproductosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        try {
            ProductoTable productoTable = (ProductoTable) getTablaproductos().getModel();
            Producto producto = productoTable.getFilas().get(getTablaproductos().getSelectedRow());
            Productoucc productoucc = new Productoucc();
            boolean eliminar = productoucc.deleteProducto(producto);
            int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(this, "Se elimino correctamente ¡¡");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione el registro que desee eliminar");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoprodActionPerformed

        try {
            ProductoTable productoTable = (ProductoTable) getTablaproductos().getModel();
            Producto producto = productoTable.getFilas().get(getTablaproductos().getSelectedRow());
            ProductosView pv = new ProductosView((Frame) this.getParent(), true, producto, null);
            pv.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btnnuevoprodActionPerformed

    private void btnselecproddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecproddActionPerformed
        try {
            ProductoTable productoTable = (ProductoTable) getTablaproductos().getModel();
            if (getFv() != null) {
                getFv().setProducto(productoTable.getFilas().get(getTablaproductos().getSelectedRow()));

            } else if (getFcv() != null) {
                getFcv().setProducto(productoTable.getFilas().get(getTablaproductos().getSelectedRow()));

            }
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btnselecproddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevoprod;
    private javax.swing.JButton btnselecprodd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JTextField txtbuscarproducto;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btneliminar
     */
    public javax.swing.JButton getBtneliminar() {
        return btneliminar;
    }

    /**
     * @param btneliminar the btneliminar to set
     */
    public void setBtneliminar(javax.swing.JButton btneliminar) {
        this.btneliminar = btneliminar;
    }

    /**
     * @return the btneditar
     */
    public javax.swing.JButton getBtneditar() {
        return btneditar;
    }

    /**
     * @param btneditar the btneditar to set
     */
    public void setBtneditar(javax.swing.JButton btneditar) {
        this.btneditar = btneditar;
    }

    /**
     * @return the fv
     */
    public FacturaVentaView getFv() {
        return fv;
    }

    /**
     * @param fv the fv to set
     */
    public void setFv(FacturaVentaView fv) {
        this.fv = fv;
    }

    /**
     * @return the btncerrar
     */
    public javax.swing.JButton getBtncerrar() {
        return btncerrar;
    }

    /**
     * @param btncerrar the btncerrar to set
     */
    public void setBtncerrar(javax.swing.JButton btncerrar) {
        this.btncerrar = btncerrar;
    }

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return getBtnnuevoprod();
    }

    /**
     * @param jButton1 the jButton1 to set
     */
    public void setjButton1(javax.swing.JButton jButton1) {
        this.setBtnnuevoprod(jButton1);
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return getBtnselecprodd();
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.setBtnselecprodd(jButton2);
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
     * @return the tablaproductos
     */
    public javax.swing.JTable getTablaproductos() {
        return tablaproductos;
    }

    /**
     * @param tablaproductos the tablaproductos to set
     */
    public void setTablaproductos(javax.swing.JTable tablaproductos) {
        this.tablaproductos = tablaproductos;
    }

    /**
     * @return the txtbuscarproducto
     */
    public javax.swing.JTextField getTxtbuscarproducto() {
        return txtbuscarproducto;
    }

    /**
     * @param txtbuscarproducto the txtbuscarproducto to set
     */
    public void setTxtbuscarproducto(javax.swing.JTextField txtbuscarproducto) {
        this.txtbuscarproducto = txtbuscarproducto;
    }

    /**
     * @return the btnnuevoprod
     */
    public javax.swing.JButton getBtnnuevoprod() {
        return btnnuevoprod;
    }

    /**
     * @param btnnuevoprod the btnnuevoprod to set
     */
    public void setBtnnuevoprod(javax.swing.JButton btnnuevoprod) {
        this.btnnuevoprod = btnnuevoprod;
    }

    /**
     * @return the fcv
     */
    public FacturaCompraView getFcv() {
        return fcv;
    }

    /**
     * @param fcv the fcv to set
     */
    public void setFcv(FacturaCompraView fcv) {
        this.fcv = fcv;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the btnselecprodd
     */
    public javax.swing.JButton getBtnselecprodd() {
        return btnselecprodd;
    }

    /**
     * @param btnselecprodd the btnselecprodd to set
     */
    public void setBtnselecprodd(javax.swing.JButton btnselecprodd) {
        this.btnselecprodd = btnselecprodd;
    }
}
