package com.alejandro.views;

import com.alejandro.DAO.EmpresaDao;
import com.alejandro.dominio.Empresa;
import com.alejandro.dominio.Persona;
import com.alejandro.dominio.Usuario;
import com.alejandro.reportes.Reportes;
import com.alejandro.table.ClienteTable;
import com.alejandro.ucc.Empresaucc;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
//import net.sf.jasperreports.web.servlets.ReportActionServlet;

/**
 *
 * @author Alejandro
 */
public class PrincipalView extends javax.swing.JFrame implements Runnable {
    
    public Image imagenFondo;
    public URL fondo;
    Usuario usuario;
    Empresa empresa;
    Empresa empresaPrueba;

    //extiende el JFRAME y el implements Runnable
    String hora, segundos, minutos, ampm;
    Calendar calendario;
    Thread h1;
    boolean activo = true;
    int cont = 0;
    
    public PrincipalView(Usuario user, Empresa e) {
        
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/menu.png")).getImage());
        h1 = new Thread(this);
        this.setLocationRelativeTo(null);
        
        h1.start();
        
        if (user != null) {
            usuario = user;
        }
        if (e != null) {
            empresa = e;
        }

        //System.out.println(usuario.getEmpleado().getNombre());
        cargarUsuario();
        cargarEmpresa();
        cerrar();
    }
    
    public void cargarUsuario() {
        if (usuario != null) {
            txtobtenernombre.setText(usuario.getEmpleado().getNombre());
        }
    }
    
    public void cargarEmpresa() {
        if (empresa != null) {
            txtempresaActual.setText(empresa.getNombreEmpresa());
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtobtenernombre = new javax.swing.JTextField();
        empresaLabel = new javax.swing.JLabel();
        txtempresaActual = new javax.swing.JTextField();
        btnrefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Empresa = new javax.swing.JMenu();
        nuevaempresa = new javax.swing.JMenuItem();
        editarempresa = new javax.swing.JMenuItem();
        empleado = new javax.swing.JMenu();
        nuevoempleado = new javax.swing.JMenuItem();
        editarempleado = new javax.swing.JMenuItem();
        User = new javax.swing.JMenu();
        editarusuario = new javax.swing.JMenuItem();
        cliente = new javax.swing.JMenu();
        nuevocliente = new javax.swing.JMenuItem();
        editarcliente = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        item1 = new javax.swing.JMenuItem();
        item2 = new javax.swing.JMenuItem();
        item3 = new javax.swing.JMenuItem();
        item4 = new javax.swing.JMenuItem();
        item5 = new javax.swing.JMenuItem();
        item7 = new javax.swing.JMenuItem();
        item8 = new javax.swing.JMenuItem();
        item9 = new javax.swing.JMenuItem();
        item10 = new javax.swing.JMenuItem();
        item11 = new javax.swing.JMenuItem();
        item12 = new javax.swing.JMenuItem();
        item13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        reloj = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO:");

        txtobtenernombre.setEditable(false);
        txtobtenernombre.setBackground(new java.awt.Color(255, 255, 255));
        txtobtenernombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtobtenernombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtobtenernombreActionPerformed(evt);
            }
        });

        empresaLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        empresaLabel.setText("EMPRESA ACTUAL");

        txtempresaActual.setEditable(false);
        txtempresaActual.setBackground(new java.awt.Color(255, 255, 255));
        txtempresaActual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtempresaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempresaActualActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrefresh.setText("REFRESCAR");
        btnrefresh.setFocusable(false);
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empresaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtobtenernombre, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtempresaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnrefresh)))
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empresaLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtempresaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtobtenernombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivos.png"))); // NOI18N
        jMenu3.setText("REGISTROS");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa2.png"))); // NOI18N
        Empresa.setText("EMPRESA");
        Empresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        nuevaempresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nuevaempresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevaempresa.png"))); // NOI18N
        nuevaempresa.setText("NUEVA EMPRESA");
        nuevaempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaempresaActionPerformed(evt);
            }
        });
        Empresa.add(nuevaempresa);

        editarempresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarempresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar empresa.png"))); // NOI18N
        editarempresa.setText("BUSCAR EMPRESA");
        editarempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarempresaActionPerformed(evt);
            }
        });
        Empresa.add(editarempresa);

        jMenu3.add(Empresa);

        empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        empleado.setText("EMPLEADO");
        empleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        nuevoempleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        nuevoempleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nuevoempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarpersona.png"))); // NOI18N
        nuevoempleado.setText("NUEVA EMPLEADO");
        nuevoempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoempleadoActionPerformed(evt);
            }
        });
        empleado.add(nuevoempleado);

        editarempleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editarempleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        editarempleado.setText("EDITAR EMPLEADO");
        editarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarempleadoActionPerformed(evt);
            }
        });
        empleado.add(editarempleado);

        jMenu3.add(empleado);

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        User.setText("USUARIO");
        User.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        editarusuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editarusuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarusuario.png"))); // NOI18N
        editarusuario.setText("EDITAR USUARIO");
        editarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarusuarioActionPerformed(evt);
            }
        });
        User.add(editarusuario);

        jMenu3.add(User);

        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        cliente.setText("CLIENTE");
        cliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        nuevocliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        nuevocliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nuevocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevocliente.png"))); // NOI18N
        nuevocliente.setText("NUEVO CLIENTE");
        nuevocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoclienteActionPerformed(evt);
            }
        });
        cliente.add(nuevocliente);

        editarcliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editarcliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarcliente.png"))); // NOI18N
        editarcliente.setText("EDITAR CLIENTE");
        editarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarclienteActionPerformed(evt);
            }
        });
        cliente.add(editarcliente);

        jMenu3.add(cliente);

        jMenu10.setText("PROVEEDOR");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem6.setText("NUEVO PROVEEDOR");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem7.setText("EDITAR PROVEEDOR");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);

        jMenu3.add(jMenu10);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        jMenu1.setText("PRODUCTOS");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addproducto.png"))); // NOI18N
        jMenuItem1.setText("NUEVO PRODUCTO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aditarproducto.png"))); // NOI18N
        jMenuItem2.setText("EDITAR PRODUCTO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu3.add(jMenu1);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu3.add(salir);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("FACTURAS");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu5.setText("NUEVA FACTURA");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setText("FACTURA VENTA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setText("FACTURA COMPRA");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("REPORTES");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu9.setText("VER REPORTES");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem5.setText("FACTURAS VENTAS ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenu7.add(jMenu9);

        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/temas.png"))); // NOI18N
        jMenu6.setText("TEMAS");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        item1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        item1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item1.setText("BLACK EYE");
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });
        jMenu6.add(item1);

        item2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        item2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item2.setText("BLACK MOON");
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });
        jMenu6.add(item2);

        item3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        item3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item3.setText("BLUE ICE");
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });
        jMenu6.add(item3);

        item4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        item4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item4.setText("BLUE MOON");
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });
        jMenu6.add(item4);

        item5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
        item5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item5.setText("BLUE STEEL");
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ActionPerformed(evt);
            }
        });
        jMenu6.add(item5);

        item7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.ALT_MASK));
        item7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item7.setText("GREEN DREAM");
        item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ActionPerformed(evt);
            }
        });
        jMenu6.add(item7);

        item8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.ALT_MASK));
        item8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item8.setText("MAUVE METALLIC");
        item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8ActionPerformed(evt);
            }
        });
        jMenu6.add(item8);

        item9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.ALT_MASK));
        item9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item9.setText("ORANGE METALLIC");
        item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9ActionPerformed(evt);
            }
        });
        jMenu6.add(item9);

        item10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.ALT_MASK));
        item10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item10.setText("SILVER MOON");
        item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10ActionPerformed(evt);
            }
        });
        jMenu6.add(item10);

        item11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_MASK));
        item11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item11.setText("SIMPLE 2D");
        item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11ActionPerformed(evt);
            }
        });
        jMenu6.add(item11);

        item12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.ALT_MASK));
        item12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item12.setText("SKY METALLIC");
        item12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item12ActionPerformed(evt);
            }
        });
        jMenu6.add(item12);

        item13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, java.awt.event.InputEvent.ALT_MASK));
        item13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tema.png"))); // NOI18N
        item13.setText("WHITE VISION");
        item13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item13ActionPerformed(evt);
            }
        });
        jMenu6.add(item13);

        jMenuBar1.add(jMenu6);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acercade.png"))); // NOI18N
        jMenu2.setText("ACERCA DE:");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu8.setText("ELABORADO POR:");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem4.setText("AUTOR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenu2.add(jMenu8);

        jMenuBar1.add(jMenu2);

        reloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reloj.png"))); // NOI18N
        reloj.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBar1.add(reloj);

        setJMenuBar(jMenuBar1);

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
 public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    
    public void confirmarSalida() {
        int dato = JOptionPane.showConfirmDialog(this, "Esta seguro de cerrar la aplicacion?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (dato == JOptionPane.YES_OPTION) {
            System.exit(0);
            
        } else {
            
        }
        
    }
    

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
        

    }//GEN-LAST:event_item1ActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }//GEN-LAST:event_item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }//GEN-LAST:event_item3ActionPerformed

    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item4ActionPerformed

    private void item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item5ActionPerformed

    private void item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item7ActionPerformed

    private void item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaMauveMetallicLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item8ActionPerformed

    private void item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item9ActionPerformed

    private void item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item10ActionPerformed

    private void item11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item11ActionPerformed

    private void item12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item12ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item12ActionPerformed

    private void item13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item13ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
            this.setVisible(false);
            PrincipalView p = new PrincipalView(usuario, empresa);
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }

    }//GEN-LAST:event_item13ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int salir = JOptionPane.showConfirmDialog(this, "Desea salir de la aplicacion", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (salir == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            
        }
    }//GEN-LAST:event_salirActionPerformed

    private void editarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarusuarioActionPerformed
        BuscarUsuarioView buv = new BuscarUsuarioView(null, true);
        buv.setVisible(true);
    }//GEN-LAST:event_editarusuarioActionPerformed

    private void editarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarempleadoActionPerformed
        BuscarEmpleadoView bev = new BuscarEmpleadoView(null, true);
        bev.setVisible(true);
    }//GEN-LAST:event_editarempleadoActionPerformed

    private void nuevoempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoempleadoActionPerformed
//        EmpleadoView ev = new EmpleadoView(null, true, null, null);
//        ev.setVisible(true);
        JOptionPane.showMessageDialog(this, "Seleccione la empresa ¡¡");
        BuscarEmpresaView bev = new BuscarEmpresaView(null, true);
        bev.getBtneliminar().setVisible(false);
        bev.getBtneditar().setVisible(false);
        bev.setVisible(true);
        

    }//GEN-LAST:event_nuevoempleadoActionPerformed

    private void nuevoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoclienteActionPerformed
        ClienteView cv = new ClienteView(null, true, null);
        cv.setVisible(true);
    }//GEN-LAST:event_nuevoclienteActionPerformed

    private void txtobtenernombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtobtenernombreActionPerformed

    }//GEN-LAST:event_txtobtenernombreActionPerformed

    private void editarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarclienteActionPerformed
        BuscarClienteView bcv = new BuscarClienteView(null, true, null);
        bcv.getBtnselec().setVisible(false);
        bcv.setVisible(true);
    }//GEN-LAST:event_editarclienteActionPerformed

    private void nuevaempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaempresaActionPerformed
        EmpresaView ev = new EmpresaView(null, true, null);
        ev.setVisible(true);

    }//GEN-LAST:event_nuevaempresaActionPerformed

    private void editarempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarempresaActionPerformed
        BuscarEmpresaView bev = new BuscarEmpresaView(null, true);
        bev.getBtnnuevoemp().setVisible(false);
        bev.setVisible(true);
        

    }//GEN-LAST:event_editarempresaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        JOptionPane.showMessageDialog(this, "Seleccione la empresa ¡¡");
//        BuscarEmpresaView bev = new BuscarEmpresaView(null, true);
//        bev.getBtneliminar().setVisible(false);
//        bev.getBtneditar().setVisible(false);
//        bev.setVisible(true);
//        
        ProductosView productosView = new ProductosView(null, true, null, empresa);
        productosView.setVisible(true);
        

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BuscarProductoView bpv = new BuscarProductoView(null, true, null, null);
        bpv.getBtnnuevoprod().setVisible(false);
        bpv.getBtnselecprodd().setVisible(false);
        bpv.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FacturaVentaView fv = new FacturaVentaView(null, true);
        fv.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(this, "NOMBRE: Alejandro"
                + "\nCARRERA: Desarrollo de Software");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        BuscarFacturaView bfv = new BuscarFacturaView(null, true, null);
        bfv.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ProveedorView proveedorView = new ProveedorView(null, true, null);
        proveedorView.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        BuscarProveedorView pbv = new BuscarProveedorView(null, true, null);
        pbv.getBtnselecc().setVisible(false);
        pbv.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FacturaCompraView fcv = new FacturaCompraView(null, true);
        fcv.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void txtempresaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempresaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempresaActualActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        EmpresaDao ed = new EmpresaDao(null);
        Empresa prueba = ed.getEmpresaActiva();
        txtempresaActual.setText(prueba.getNombreEmpresa());
        txtobtenernombre.setText(usuario.getEmpleado().getNombre());
        

    }//GEN-LAST:event_btnrefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Empresa;
    private javax.swing.JMenu User;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JMenu cliente;
    private javax.swing.JMenuItem editarcliente;
    private javax.swing.JMenuItem editarempleado;
    private javax.swing.JMenuItem editarempresa;
    private javax.swing.JMenuItem editarusuario;
    private javax.swing.JMenu empleado;
    private javax.swing.JLabel empresaLabel;
    private javax.swing.JMenuItem item1;
    private javax.swing.JMenuItem item10;
    private javax.swing.JMenuItem item11;
    private javax.swing.JMenuItem item12;
    private javax.swing.JMenuItem item13;
    private javax.swing.JMenuItem item2;
    private javax.swing.JMenuItem item3;
    private javax.swing.JMenuItem item4;
    private javax.swing.JMenuItem item5;
    private javax.swing.JMenuItem item7;
    private javax.swing.JMenuItem item8;
    private javax.swing.JMenuItem item9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem nuevaempresa;
    private javax.swing.JMenuItem nuevocliente;
    private javax.swing.JMenuItem nuevoempleado;
    private javax.swing.JMenu reloj;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTextField txtempresaActual;
    private javax.swing.JTextField txtobtenernombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (activo == true) {
            calcula();
            reloj.setText(hora + ":" + minutos + ":" + segundos + ":" + ampm);
            try {
                h1.sleep(1000);
            } catch (InterruptedException e) {
//                }
            }
        }
    }
    
    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY);
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
}
