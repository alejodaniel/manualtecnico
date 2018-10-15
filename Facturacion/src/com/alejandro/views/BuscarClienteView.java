/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.views;

import com.alejandro.DAO.ClienteDao;
import com.alejandro.dominio.Cliente;
import com.alejandro.table.ClienteTable;
import com.alejandro.ucc.Clienteucc;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class BuscarClienteView extends javax.swing.JDialog {

    private FacturaVentaView fv;

    public BuscarClienteView(java.awt.Frame parent, boolean modal, FacturaVentaView fv) {
        super(parent, modal);
        initComponents();
        if (fv != null) {
            this.fv = fv;
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
        txtbuscarcliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnselec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR CLIENTE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarclienteActionPerformed(evt);
            }
        });
        txtbuscarcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarclienteKeyReleased(evt);
            }
        });

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

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

        btnselec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnselec.setText("SELECCIONAR");
        btnselec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btneditar)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btncerrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnselec)
                                .addGap(55, 55, 55)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar)
                    .addComponent(btnselec)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncerrar)
                .addContainerGap(93, Short.MAX_VALUE))
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
            ClienteTable clienteTable = (ClienteTable) getTablaclientes().getModel();
            Cliente cliente = clienteTable.getFilas().get(getTablaclientes().getSelectedRow());
            ClienteView cv = new ClienteView((Frame) this.getParent(), true, cliente);
            cv.setVisible(true);
            txtbuscarclienteKeyReleased(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbuscarclienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarclienteKeyReleased

        ClienteDao cd = new ClienteDao(null);
        List<Cliente> clientes = cd.buscarPorCriterio(getTxtbuscarcliente().getText());
        ClienteTable clienteTable = new ClienteTable(clientes);
        getTablaclientes().setModel(clienteTable);

    }//GEN-LAST:event_txtbuscarclienteKeyReleased

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked

    }//GEN-LAST:event_tablaclientesMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            ClienteTable clienteTable = (ClienteTable) getTablaclientes().getModel();
            Cliente cliente = clienteTable.getFilas().get(getTablaclientes().getSelectedRow());
            Clienteucc clienteucc = new Clienteucc();
            boolean eliminar = clienteucc.deleteCliente(cliente);
            int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(this, "Se Elimino correctamente");
                    txtbuscarclienteKeyReleased(null);

                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnselecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecActionPerformed

        try {
            ClienteTable clienteTable = (ClienteTable) getTablaclientes().getModel();
            getFv().setCliente(clienteTable.getFilas().get(getTablaclientes().getSelectedRow()));
            dispose();
//            FacturaVentaView fv = new FacturaVentaView((Frame) this.getParent(), true);
//            fv.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion seleccionar y marque");
        }
    }//GEN-LAST:event_btnselecActionPerformed

    private void txtbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarclienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnselec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTextField txtbuscarcliente;
    // End of variables declaration//GEN-END:variables


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
     * @return the tablaclientes
     */
    public javax.swing.JTable getTablaclientes() {
        return tablaclientes;
    }

    /**
     * @param tablaclientes the tablaclientes to set
     */
    public void setTablaclientes(javax.swing.JTable tablaclientes) {
        this.tablaclientes = tablaclientes;
    }

    /**
     * @return the txtbuscarcliente
     */
    public javax.swing.JTextField getTxtbuscarcliente() {
        return txtbuscarcliente;
    }

    /**
     * @param txtbuscarcliente the txtbuscarcliente to set
     */
    public void setTxtbuscarcliente(javax.swing.JTextField txtbuscarcliente) {
        this.txtbuscarcliente = txtbuscarcliente;
    }

    /**
     * @return the txtseleccnionar
     */
    public javax.swing.JButton getTxtseleccnionar() {
        return getBtnselec();
    }

    /**
     * @param txtseleccnionar the txtseleccnionar to set
     */
    public void setTxtseleccnionar(javax.swing.JButton txtseleccnionar) {
        this.setBtnselec(txtseleccnionar);
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
     * @return the btnselec
     */
    public javax.swing.JButton getBtnselec() {
        return btnselec;
    }

    /**
     * @param btnselec the btnselec to set
     */
    public void setBtnselec(javax.swing.JButton btnselec) {
        this.btnselec = btnselec;
    }
}
