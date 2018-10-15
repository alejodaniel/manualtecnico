package com.alejandro.views;

import com.alejandro.DAO.ProveedorDao;
import com.alejandro.dominio.Proveedor;
import com.alejandro.table.ProveedorTable;
import com.alejandro.ucc.Proveedorucc;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

public class BuscarProveedorView extends javax.swing.JDialog {

    private FacturaCompraView fcv;

    public BuscarProveedorView(java.awt.Frame parent, boolean modal, FacturaCompraView fbv) {
        super(parent, modal);
        initComponents();
        if (fbv != null) {
            this.fcv = fbv;
        }
//        setIconImage(new ImageIcon(getClass().getResource("/imagenes/buscar.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarproveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproveedor = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnselecc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR PROVEEDOR");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbuscarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarproveedorActionPerformed(evt);
            }
        });
        txtbuscarproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarproveedorKeyReleased(evt);
            }
        });

        tablaproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproveedor);

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

        btnselecc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnselecc.setText("SELECCIONAR");
        btnselecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnselecc)
                                .addGap(29, 29, 29)
                                .addComponent(btncerrar)))
                        .addGap(43, 43, 43))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btneditar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar)
                    .addComponent(btncerrar)
                    .addComponent(btnselecc))
                .addGap(32, 32, 32)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
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
            ProveedorTable proveedorTable = (ProveedorTable) getTablaproveedor().getModel();
            Proveedor proveedor = proveedorTable.getFilas().get(getTablaproveedor().getSelectedRow());
            ProveedorView pv = new ProveedorView((Frame) this.getParent(), true, proveedor);
            pv.setVisible(true);
            txtbuscarproveedorKeyReleased(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbuscarproveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarproveedorKeyReleased
        ProveedorDao pd = new ProveedorDao(null);
        List<Proveedor> proveedores = pd.buscarPorCriterio(getTxtbuscarproveedor().getText());
        ProveedorTable proveedorTable = new ProveedorTable(proveedores);
        getTablaproveedor().setModel(proveedorTable);
    }//GEN-LAST:event_txtbuscarproveedorKeyReleased

    private void tablaproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproveedorMouseClicked

    }//GEN-LAST:event_tablaproveedorMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            ProveedorTable proveedorTable = (ProveedorTable) getTablaproveedor().getModel();
            Proveedor proveedor = proveedorTable.getFilas().get(getTablaproveedor().getSelectedRow());
            Proveedorucc proveedorucc = new Proveedorucc();
            boolean eliminar = proveedorucc.deleteProveedor(proveedor);
            int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar este registrio", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(this, "Se elimino correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion y seleccione el registro a eliminar");
        }


    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtbuscarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarproveedorActionPerformed

    private void btnseleccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccActionPerformed
        try {
            ProveedorTable proveedorTable = (ProveedorTable) getTablaproveedor().getModel();
            getFcv().setProveedor(proveedorTable.getFilas().get(getTablaproveedor().getSelectedRow()));
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion y marque");
        }
    }//GEN-LAST:event_btnseleccActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnselecc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaproveedor;
    private javax.swing.JTextField txtbuscarproveedor;
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
     * @return the tablaproveedor
     */
    public javax.swing.JTable getTablaproveedor() {
        return tablaproveedor;
    }

    /**
     * @param tablaproveedor the tablaproveedor to set
     */
    public void setTablaproveedor(javax.swing.JTable tablaproveedor) {
        this.tablaproveedor = tablaproveedor;
    }

    /**
     * @return the txtbuscarproveedor
     */
    public javax.swing.JTextField getTxtbuscarproveedor() {
        return txtbuscarproveedor;
    }

    /**
     * @param txtbuscarproveedor the txtbuscarproveedor to set
     */
    public void setTxtbuscarproveedor(javax.swing.JTextField txtbuscarproveedor) {
        this.txtbuscarproveedor = txtbuscarproveedor;
    }

    /**
     * @return the txtseleccnionar
     */
  

    /**
     * @return the txtseleccnionar1
     */
    public javax.swing.JButton getTxtseleccnionar1() {
        return getBtnselecc();
    }

    /**
     * @param txtseleccnionar1 the txtseleccnionar1 to set
     */
    public void setTxtseleccnionar1(javax.swing.JButton txtseleccnionar1) {
        this.setBtnselecc(txtseleccnionar1);
    }

    /**
     * @return the btnselecc
     */
    public javax.swing.JButton getBtnselecc() {
        return btnselecc;
    }

    /**
     * @param btnselecc the btnselecc to set
     */
    public void setBtnselecc(javax.swing.JButton btnselecc) {
        this.btnselecc = btnselecc;
    }
}
