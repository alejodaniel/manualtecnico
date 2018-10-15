package com.alejandro.views;

import com.alejandro.DAO.FacturaDao;
import com.alejandro.dominio.Factura;

import com.alejandro.reportes.Reportes;

import com.alejandro.table.FacturaTable;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class BuscarFacturaCompraView extends javax.swing.JDialog {

    private FacturaVentaView fv;

    public BuscarFacturaCompraView(java.awt.Frame parent, boolean modal, FacturaVentaView view) {
        super(parent, modal);
        initComponents();
        getTxtbufac().setEnabled(false);
        getBtnok().setEnabled(false);
        getFecha1chooser().setEnabled(false);
        getFechachooser().setEnabled(false);
        if (view != null) {
            fv = view;
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
        txtbufac = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablafacturas = new javax.swing.JTable();
        btnprint = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fechainiciochooser = new com.toedter.calendar.JDateChooser();
        jlabede = new javax.swing.JLabel();
        fechafinalchooser = new com.toedter.calendar.JDateChooser();
        jlabelhasta = new javax.swing.JLabel();
        fechaRadioButton = new javax.swing.JRadioButton();
        ButtonGroup bg = new ButtonGroup();
        clienteradioButton = new javax.swing.JRadioButton();
        btnok = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR FACTURA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbufac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbufacActionPerformed(evt);
            }
        });
        txtbufac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbufacKeyReleased(evt);
            }
        });

        tablafacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablafacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablafacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablafacturas);

        btnprint.setBackground(new java.awt.Color(255, 255, 255));
        btnprint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnprint.setText("IMPRIMIR");
        btnprint.setFocusable(false);
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("CERRAR");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fechainiciochooser.setDate(new java.util.Date());
        fechainiciochooser.setEnabled(false);

        jlabede.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabede.setText("DE:");

        fechafinalchooser.setDate(new java.util.Date());
        fechafinalchooser.setEnabled(false);

        jlabelhasta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabelhasta.setText("HASTA");

        fechaRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        fechaRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fechaRadioButton.setText("Por Fecha:");
        fechaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaRadioButtonActionPerformed(evt);
            }
        });

        clienteradioButton.setBackground(new java.awt.Color(255, 255, 255));
        clienteradioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clienteradioButton.setText("Proveedor");
        clienteradioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteradioButtonActionPerformed(evt);
            }
        });

        btnok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("VER FACTURA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(65, 65, 65)
                .addComponent(btnprint)
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtbufac, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jlabede)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechainiciochooser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clienteradioButton)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaRadioButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabelhasta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechafinalchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnok))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(fechaRadioButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clienteradioButton)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechainiciochooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlabede)
                        .addComponent(txtbufac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(fechafinalchooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelhasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprint)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        bg.add(fechaRadioButton);
        bg.add(clienteradioButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbufacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbufacKeyReleased

        FacturaDao fd = new FacturaDao(null);
        List<Factura> facturas = fd.buscarPorCriterioCompra(getTxtbufac().getText());
        FacturaTable facturaTable = new FacturaTable(facturas);
        getTablafacturas().setModel(facturaTable);


    }//GEN-LAST:event_txtbufacKeyReleased

    private void tablafacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablafacturasMouseClicked

    }//GEN-LAST:event_tablafacturasMouseClicked

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            FacturaTable facturaTable = (FacturaTable) getTablafacturas().getModel();
            List<Factura> facturas = facturaTable.getFilas();
            Reportes reportes = new Reportes();
            if (clienteradioButton.isSelected()) {
                reportes.imprimirFacCompraName(facturas, txtbufac.getText());
            } else {
                reportes.imprimirFacturas(facturas, fechainiciochooser.getDate(), fechafinalchooser.getDate());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clienteradioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteradioButtonActionPerformed
        if (getClienteradioButton().isSelected()) {
            getTxtbufac().setEnabled(true);
//            getFechaRadioButton().setEnabled(false);
            getFechachooser().setEnabled(false);
            getFecha1chooser().setEnabled(false);
            getBtnok().setEnabled(false);

        }
    }//GEN-LAST:event_clienteradioButtonActionPerformed

    private void fechaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaRadioButtonActionPerformed
        if (getFechaRadioButton().isSelected()) {
            getFecha1chooser().setEnabled(true);
            getFechachooser().setEnabled(true);
            getBtnok().setEnabled(true);
//            getClienteradioButton().setEnabled(false);
            getTxtbufac().setEnabled(false);

        }
    }//GEN-LAST:event_fechaRadioButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            FacturaTable facturaTable = (FacturaTable) getTablafacturas().getModel();
            Factura factura = facturaTable.getFilas().get(getTablafacturas().getSelectedRow());
            Reportes reportes = new Reportes();
            reportes.imprimir(factura);
//            ReportesFacturas facturas = new ReportesFacturas();
//            facturas.impresiones(factura);
//            facturas.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        try {
            FacturaDao fd = new FacturaDao(null);
            List<Factura> facturas = fd.buscarPorFecha(fechainiciochooser.getDate(), fechafinalchooser.getDate());
            FacturaTable facturaTable = new FacturaTable(facturas);
            getTablafacturas().setModel(facturaTable);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado la fecha");
        }

    }//GEN-LAST:event_btnokActionPerformed

    private void txtbufacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbufacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbufacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnprint;
    private javax.swing.JRadioButton clienteradioButton;
    private javax.swing.JRadioButton fechaRadioButton;
    private com.toedter.calendar.JDateChooser fechafinalchooser;
    private com.toedter.calendar.JDateChooser fechainiciochooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabede;
    private javax.swing.JLabel jlabelhasta;
    private javax.swing.JTable tablafacturas;
    private javax.swing.JTextField txtbufac;
    // End of variables declaration//GEN-END:variables

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
     * @return the btnok
     */
    public javax.swing.JButton getBtnok() {
        return btnok;
    }

    /**
     * @param btnok the btnok to set
     */
    public void setBtnok(javax.swing.JButton btnok) {
        this.btnok = btnok;
    }

    /**
     * @return the clienteradioButton
     */
    public javax.swing.JRadioButton getClienteradioButton() {
        return clienteradioButton;
    }

    /**
     * @param clienteradioButton the clienteradioButton to set
     */
    public void setClienteradioButton(javax.swing.JRadioButton clienteradioButton) {
        this.clienteradioButton = clienteradioButton;
    }

    /**
     * @return the fecha1chooser
     */
    public com.toedter.calendar.JDateChooser getFecha1chooser() {
        return fechafinalchooser;
    }

    /**
     * @param fecha1chooser the fecha1chooser to set
     */
    public void setFecha1chooser(com.toedter.calendar.JDateChooser fecha1chooser) {
        this.fechafinalchooser = fecha1chooser;
    }

    /**
     * @return the fechaRadioButton
     */
    public javax.swing.JRadioButton getFechaRadioButton() {
        return fechaRadioButton;
    }

    /**
     * @param fechaRadioButton the fechaRadioButton to set
     */
    public void setFechaRadioButton(javax.swing.JRadioButton fechaRadioButton) {
        this.fechaRadioButton = fechaRadioButton;
    }

    /**
     * @return the fechachooser
     */
    public com.toedter.calendar.JDateChooser getFechachooser() {
        return fechainiciochooser;
    }

    /**
     * @param fechachooser the fechachooser to set
     */
    public void setFechachooser(com.toedter.calendar.JDateChooser fechachooser) {
        this.fechainiciochooser = fechachooser;
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
        return btnprint;
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.btnprint = jButton2;
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
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jlabede;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jlabede = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jlabelhasta;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jlabelhasta = jLabel3;
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
     * @return the tablafacturas
     */
    public javax.swing.JTable getTablafacturas() {
        return tablafacturas;
    }

    /**
     * @param tablafacturas the tablafacturas to set
     */
    public void setTablafacturas(javax.swing.JTable tablafacturas) {
        this.tablafacturas = tablafacturas;
    }

    /**
     * @return the txtbufac
     */
    public javax.swing.JTextField getTxtbufac() {
        return txtbufac;
    }

    /**
     * @param txtbufac the txtbufac to set
     */
    public void setTxtbufac(javax.swing.JTextField txtbufac) {
        this.txtbufac = txtbufac;
    }
}
