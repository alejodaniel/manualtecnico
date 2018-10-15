package com.alejandro.views;

import com.alejandro.DAO.EmpleadoDao;
import com.alejandro.dominio.Empleado;
import com.alejandro.dominio.Persona;

import com.alejandro.table.EmpleadoTable;
import com.alejandro.ucc.Empleadoucc;

import java.awt.Frame;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BuscarEmpleadoView extends javax.swing.JDialog {

    public BuscarEmpleadoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/buscar.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarempleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        nuevoususario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR PERSONA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR:");

        txtbuscarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarempleadoActionPerformed(evt);
            }
        });
        txtbuscarempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarempleadoKeyReleased(evt);
            }
        });

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

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

        nuevoususario.setBackground(new java.awt.Color(255, 255, 255));
        nuevoususario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nuevoususario.setText("NUEVO USUARIO");
        nuevoususario.setFocusable(false);
        nuevoususario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoususarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("ELIMINAR");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nuevoususario)
                        .addGap(36, 36, 36)
                        .addComponent(btneditar)
                        .addGap(42, 42, 42)
                        .addComponent(btncerrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtbuscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncerrar)
                        .addComponent(btneditar)
                        .addComponent(nuevoususario))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

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

    private void txtbuscarempleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarempleadoKeyReleased

        EmpleadoDao ed = new EmpleadoDao(null);
        List<Empleado> empleado = ed.buscarPorCriterio(txtbuscarempleado.getText());

        EmpleadoTable et = new EmpleadoTable(empleado);
        tablaEmpleados.setModel(et);


    }//GEN-LAST:event_txtbuscarempleadoKeyReleased

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        try {
            EmpleadoTable empleadoTable = (EmpleadoTable) tablaEmpleados.getModel();
            //elegir cual esta seleccionado en la tabla
            Empleado empleado = empleadoTable.getFilas().get(tablaEmpleados.getSelectedRow());
            EmpleadoView pv = new EmpleadoView((Frame) this.getParent(), true, null, empleado);
            pv.setVisible(true);
            txtbuscarempleadoKeyReleased(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Escriba en la opcion buscar y seleccione a la persona que desee editar");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void nuevoususarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoususarioActionPerformed
        try {
            EmpleadoTable empleadoTable = (EmpleadoTable) tablaEmpleados.getModel();
            Empleado empleado = empleadoTable.getFilas().get(tablaEmpleados.getSelectedRow());
            UsuarioView uv = new UsuarioView((Frame) this.getParent(), true, null, empleado);
            uv.setVisible(true);
            txtbuscarempleadoKeyReleased(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione a la persona que desee agregar ");
        }

    }//GEN-LAST:event_nuevoususarioActionPerformed

    private void txtbuscarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarempleadoActionPerformed

    }//GEN-LAST:event_txtbuscarempleadoActionPerformed

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        if (evt.getClickCount() == 2) {
            EmpleadoTable empleadoTable = (EmpleadoTable) tablaEmpleados.getModel();
            //elegir cual esta seleccionado en la tabla
            Empleado empleado = empleadoTable.getFilas().get(tablaEmpleados.getSelectedRow());
            EmpleadoView ev = new EmpleadoView((Frame) this.getParent(), true, null, empleado);
            ev.setVisible(true);
            txtbuscarempleadoKeyReleased(null);
        }
    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            EmpleadoTable empleadoTable = (EmpleadoTable) tablaEmpleados.getModel();
            Empleado empleado = empleadoTable.getFilas().get(tablaEmpleados.getSelectedRow());
            Empleadoucc empleadoucc = new Empleadoucc();
            boolean estado = empleadoucc.deleteEmpleado(empleado);
            int eliminar = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (eliminar == JOptionPane.YES_OPTION) {
                if (estado == true) {
                    JOptionPane.showMessageDialog(this, "El registro se elimino correctamente");
                    txtbuscarempleadoKeyReleased(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar este registro");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevoususario;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtbuscarempleado;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
