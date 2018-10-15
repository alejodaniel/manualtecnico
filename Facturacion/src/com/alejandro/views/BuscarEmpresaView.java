package com.alejandro.views;

import com.alejandro.DAO.EmpresaDao;
import com.alejandro.dominio.Empresa;
import com.alejandro.table.EmpresaTable;
import com.alejandro.ucc.Empresaucc;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

public class BuscarEmpresaView extends javax.swing.JDialog {
    

    public BuscarEmpresaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
//        setIconImage(new ImageIcon(getClass().getResource("/imagenes/buscar.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarempresa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempresas = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevoemp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR EMPRESA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbuscarempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarempresaActionPerformed(evt);
            }
        });
        txtbuscarempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarempresaKeyReleased(evt);
            }
        });

        tablaempresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaempresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaempresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaempresas);

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

        btnnuevoemp.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevoemp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnuevoemp.setText("NUEVO EMPLEADO");
        btnnuevoemp.setFocusable(false);
        btnnuevoemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtbuscarempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btneditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btncerrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnnuevoemp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnuevoemp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar))
                .addGap(5, 5, 5)
                .addComponent(btncerrar)
                .addContainerGap(85, Short.MAX_VALUE))
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
            EmpresaTable empresaTable = (EmpresaTable) getTablaempresas().getModel();
            Empresa empresa = empresaTable.getFilas().get(getTablaempresas().getSelectedRow());
            EmpresaView ev = new EmpresaView((Frame) this.getParent(), true, empresa);
            ev.setVisible(true);
            txtbuscarempresaKeyReleased(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Esciba en la opcion buscar y seleccione");

        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbuscarempresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarempresaKeyReleased
        EmpresaDao ed = new EmpresaDao(null);
        List<Empresa> empresas = ed.buscarPorCriterio(getTxtbuscarempresa().getText());
        EmpresaTable empresaTable = new EmpresaTable(empresas);
        getTablaempresas().setModel(empresaTable);
    }//GEN-LAST:event_txtbuscarempresaKeyReleased

    private void tablaempresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempresasMouseClicked

    }//GEN-LAST:event_tablaempresasMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            EmpresaTable empresaTable = (EmpresaTable) getTablaempresas().getModel();
            Empresa empresa = empresaTable.getFilas().get(getTablaempresas().getSelectedRow());
            Empresaucc empresaucc = new Empresaucc();
            boolean eliminar = empresaucc.deleteEmpresa(empresa);
            int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(this, "Se elimino el registro correctamente");
                    txtbuscarempresaKeyReleased(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoempActionPerformed
        try {
            EmpresaTable empresaTable = (EmpresaTable) getTablaempresas().getModel();
            //elegir cual esta seleccionado en la tabla
            Empresa empresa = empresaTable.getFilas().get(getTablaempresas().getSelectedRow());
            EmpleadoView ev = new EmpleadoView((Frame) this.getParent(), true, empresa, null);
            ev.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione a la empresa que va a agregar a un nuevo empleado");
        }
    }//GEN-LAST:event_btnnuevoempActionPerformed

    private void txtbuscarempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarempresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevoemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaempresas;
    private javax.swing.JTextField txtbuscarempresa;
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
     * @return the btnnuevoemp
     */
    public javax.swing.JButton getBtnnuevoemp() {
        return btnnuevoemp;
    }

    /**
     * @param btnnuevoemp the btnnuevoemp to set
     */
    public void setBtnnuevoemp(javax.swing.JButton btnnuevoemp) {
        this.btnnuevoemp = btnnuevoemp;
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
     * @return the tablaempresas
     */
    public javax.swing.JTable getTablaempresas() {
        return tablaempresas;
    }

    /**
     * @param tablaempresas the tablaempresas to set
     */
    public void setTablaempresas(javax.swing.JTable tablaempresas) {
        this.tablaempresas = tablaempresas;
    }

    /**
     * @return the txtbuscarempresa
     */
    public javax.swing.JTextField getTxtbuscarempresa() {
        return txtbuscarempresa;
    }

    /**
     * @param txtbuscarempresa the txtbuscarempresa to set
     */
    public void setTxtbuscarempresa(javax.swing.JTextField txtbuscarempresa) {
        this.txtbuscarempresa = txtbuscarempresa;
    }
}
