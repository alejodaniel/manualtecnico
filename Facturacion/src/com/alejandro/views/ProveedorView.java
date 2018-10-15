package com.alejandro.views;

import com.alejandro.dominio.Proveedor;
import com.alejandro.ucc.Proveedorucc;
import com.alejandro.ucc.ValidarNumeros;
import javax.swing.JOptionPane;

public class ProveedorView extends javax.swing.JDialog {
    
    Proveedor proveedor;
    
    public ProveedorView(java.awt.Frame parent, boolean modal, Proveedor p) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        if (p != null) {
            proveedor = p;
            cargarProveedor();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombreproveedor = new javax.swing.JTextField();
        txtdireccionproveedor = new javax.swing.JTextField();
        txttelefonoproveedor = new javax.swing.JTextField();
        txtemailproveedor = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROVEEDOR");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Direccion:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Telefono:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("E-mail:");

        txtdireccionproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionproveedorActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(255, 255, 255));
        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.setFocusable(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("CERRAR");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnombreproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(txtdireccionproveedor)
                                .addComponent(txttelefonoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtemailproveedor))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnguardar)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdireccionproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefonoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemailproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(jButton2))
                .addContainerGap(65, Short.MAX_VALUE))
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
public boolean validarEntradas() {
        ValidarNumeros validarNumeros = new ValidarNumeros();
        if (txtnombreproveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene el nombre del proveedor");
            return false;
        } else if (txtdireccionproveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene la direccion del proveedor");
            return false;
        } else if (txttelefonoproveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene el telefono del proveedor");
            return false;
        } else if (!validarNumeros.validacion(txttelefonoproveedor.getText())) {
            JOptionPane.showMessageDialog(null, "Solo se permite numeros");
            return false;
        } else if (txtemailproveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llena el email del Proveedor");
            return false;
        }
        return true;
    }
    
    public void cargarProveedor() {
        txtnombreproveedor.setText(proveedor.getNombreEmpresa());
        txtdireccionproveedor.setText(proveedor.getDireccion());
        txttelefonoproveedor.setText(proveedor.getEmail());
        txtemailproveedor.setText(proveedor.getTelefono());
    }
    private void txtdireccionproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionproveedorActionPerformed

    }//GEN-LAST:event_txtdireccionproveedorActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (validarEntradas()) {
            Proveedorucc pucc = new Proveedorucc();
            if (proveedor != null) {
                proveedor.setNombreEmpresa(txtnombreproveedor.getText());
                proveedor.setDireccion(txtdireccionproveedor.getText());
                proveedor.setEmail(txtemailproveedor.getText());
                proveedor.setTelefono(txttelefonoproveedor.getText());
                
                boolean estado = pucc.editarProveedor(proveedor);
                int editar = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios ?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (editar == JOptionPane.YES_OPTION) {
                    if (estado == true) {
                        JOptionPane.showMessageDialog(this, "Se edito correctamente ?");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al editar");
                    }
                }
                
            } else {
                Proveedor p = new Proveedor();
                p.setNombreEmpresa(txtnombreproveedor.getText());
                p.setDireccion(txtdireccionproveedor.getText());
                p.setEmail(txtemailproveedor.getText());
                p.setTelefono(txttelefonoproveedor.getText());
                p.setType("PROVEEDOR");
                
                boolean estado = pucc.guardarProveedor(p);
                int guardar = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios ?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (guardar == JOptionPane.YES_OPTION) {
                    if (estado == true) {
                        JOptionPane.showMessageDialog(this, "Se guardo correctamente ¡¡");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al guardar ");
                    }
                }
                
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtdireccionproveedor;
    private javax.swing.JTextField txtemailproveedor;
    private javax.swing.JTextField txtnombreproveedor;
    private javax.swing.JTextField txttelefonoproveedor;
    // End of variables declaration//GEN-END:variables
}
