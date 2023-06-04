package com.mx.opin.sadimiapp.main;
 
import com.mx.opin.sadimiapp.dao.AlumnoDAO;
import com.mx.opin.sadimiapp.dao.impl.AlumnoDAOImpl;
import com.mx.opin.sadimiapp.dao.impl.EscuelaProcedenciaDAOImpl;
import com.mx.opin.sadimiapp.dao.impl.LoginDAOImpl;
import com.mx.opin.sadimiapp.dao.impl.TutorDAOImpl;
import com.mx.opin.sadimiapp.model.Alumno;
import com.mx.opin.sadimiapp.model.EscuelaProcedencia;
import com.mx.opin.sadimiapp.model.PersonalSeguridad;
import com.mx.opin.sadimiapp.model.Tutor;
import java.util.Date;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Opciones extends javax.swing.JFrame {
   
    File archivo;
    private BufferedWriter bw;
    Thread cronometro;
    
    public Opciones() {
        //HILO CRONOMETRO
        this.cronometro = new Thread() {
            @Override
            public void run() {
                int hor = 0, min = 0, seg = 0;
                for (;;) {
                    try {
                        seg++;
                        if (seg > 59) {
                            seg = 0;
                            min++;
                        }
                        if (min > 59) {
                            seg = 0;
                            min = 0;
                            hor++;
                        }
                        int cont = 0;
                        if (seg == 10) {
                            dispose();
                            seg = 0;
                            cont = cont + 1;
                        }
                        Thread.sleep(999);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        
        initComponents();
        int totalisimo = 0;
        nuevoAlumno.setLocationRelativeTo(null);
//        Cocina.setLocationRelativeTo(null);
        Bajas.setLocationRelativeTo(null);

        //PRODUCTOS
        ptr1 = new Nodo();
        ptr2 = null;
        
    }
    
    class Nodo {
        
        Nodo link;
        int numero;
    }
    
    class Nodo2 {
        
        Nodo2 link;
        int total;
        int mesa;
    }
    
    Nodo ptr1, ptr2;
    Nodo2 ptr3;
    
    Nodo agregarCola(Nodo ptr) {
        Nodo p = new Nodo();
        if (ptr == null) {
            ptr = p;
        } else {
            Nodo q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }
    
    Nodo agregarCola1(Nodo ptr, int num) {
        Nodo p = new Nodo();
        p.numero = num;
        if (ptr == null) {
            ptr = p;
        } else {
            Nodo q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }
    
    class NodoMesero {

        String nombre;
        int id;
        int mesero;
        String mesa;
        NodoMesero link;
        
    }
    NodoMesero ptr;
    
    private void GuardarInfoMesero(NodoMesero ptr) throws IOException {
        
    }
    
    NodoMesero agregarInfoMesero(NodoMesero ptr, String nom, int id, int mesero, String mesa) {
        NodoMesero p = new NodoMesero();
        p.nombre = nom;
        p.id = id;
        p.mesero = mesero;
        p.mesa = mesa;
        
        if (ptr == null) {
            ptr = p;
        } else {
            NodoMesero q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }
    
    File archivo2;
    
    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }
    
    void guardarArchivo() throws IOException {
        // Crear un nuevo escritor
       /* try (BufferedWriter bwr = new BufferedWriter(
         new FileWriter(archivo))) {
       
        
         */
    }
    
    void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        password = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        nameMesero = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        guardarInfo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        nuevoAlumno = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtNia = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        cmbEntidad = new javax.swing.JComboBox();
        cmbDialecto = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cmbSemestre = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        txtSocial = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtInterior = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtExterior = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        cmbGrupo = new javax.swing.JComboBox();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Bajas = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtNiaBaja = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        fac = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        txtGuardarBaja = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        Estadisticas = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        label15 = new javax.swing.JLabel();
        cmbSemestreAsistencia = new javax.swing.JComboBox();
        nameMesero34 = new javax.swing.JLabel();
        cmbGrupoAsistencia = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtNiaReporte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNiaReporTrEGISTRO = new javax.swing.JTextField();
        SolicitudPreinscripcion = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel58 = new javax.swing.JLabel();
        txtNombreSolicitante = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtNombreSolicitudEcpecial = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        cmbSexo1 = new javax.swing.JComboBox();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtFecNacSolicitudPreins = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtEdadActual = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        txtCurpSolicitudEspecial = new javax.swing.JTextField();
        txtGuardarSolicitud = new javax.swing.JButton();
        txtFechaHoy = new javax.swing.JLabel();
        txtIdSOlicitudPreinscripcion = new javax.swing.JTextField();
        inscripcion = new javax.swing.JFrame();
        jPanel16 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        txtNombreInsc = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        nameMesero5 = new javax.swing.JLabel();
        nameMesero6 = new javax.swing.JLabel();
        txtCicloEscolarInsc = new javax.swing.JTextField();
        txtGuardaInscripcion = new javax.swing.JButton();
        txtSiguiente1 = new javax.swing.JButton();
        cmbSemestreInscr = new javax.swing.JComboBox();
        cmbGrupoInscr = new javax.swing.JComboBox();
        nameMesero7 = new javax.swing.JLabel();
        txtNiaInsc = new javax.swing.JTextField();
        txtCurpInsc = new javax.swing.JTextField();
        nameMesero8labelCurp = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        txtIdInscripcion = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        preinscripcion = new javax.swing.JFrame();
        jPanel15 = new javax.swing.JPanel();
        nameMesero1 = new javax.swing.JLabel();
        txtApellidoPaternoP = new javax.swing.JTextField();
        entidadtxt = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        nameMesero2 = new javax.swing.JLabel();
        txtnombreP = new javax.swing.JTextField();
        nameMesero3 = new javax.swing.JLabel();
        txtcurpP = new javax.swing.JTextField();
        txtGuardaPreinscripcion = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        cmbSexo3 = new javax.swing.JComboBox();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        txtFecNacSolicitudPreins2 = new javax.swing.JTextField();
        FOLIO = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        txtApellidoMaternoP1 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        edadSep = new javax.swing.JTextField();
        nameMesero4 = new javax.swing.JLabel();
        txtDiscap = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        nameMesero10 = new javax.swing.JLabel();
        cronicadegenera = new javax.swing.JTextField();
        nameMesero9 = new javax.swing.JLabel();
        txtEduccionEsp = new javax.swing.JTextField();
        nameMesero11 = new javax.swing.JLabel();
        txtnombreEscu = new javax.swing.JTextField();
        txtCct = new javax.swing.JTextField();
        nameMesero12 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        nameMesero13 = new javax.swing.JLabel();
        txtColoniaEsc = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        nameMesero14 = new javax.swing.JLabel();
        txtEntidadEsc = new javax.swing.JTextField();
        nameMesero16 = new javax.swing.JLabel();
        nameMesero15 = new javax.swing.JLabel();
        Municipio = new javax.swing.JTextField();
        txtCalleNumero = new javax.swing.JTextField();
        nameMesero17 = new javax.swing.JLabel();
        nameMesero19 = new javax.swing.JLabel();
        txtnombretutor = new javax.swing.JTextField();
        nameMesero20 = new javax.swing.JLabel();
        txtApellidoPaternotutor = new javax.swing.JTextField();
        txtApellidoMaternotutor = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtParentesco = new javax.swing.JTextField();
        nameMesero21 = new javax.swing.JLabel();
        txtColoniatutor = new javax.swing.JTextField();
        nameMesero22 = new javax.swing.JLabel();
        nameMesero23 = new javax.swing.JLabel();
        localidadTutor = new javax.swing.JTextField();
        txtMunicipioTutor = new javax.swing.JTextField();
        nameMesero24 = new javax.swing.JLabel();
        txtEntidadtu = new javax.swing.JTextField();
        nameMesero25 = new javax.swing.JLabel();
        nameMesero26 = new javax.swing.JLabel();
        cpTutor = new javax.swing.JTextField();
        nameMesero18 = new javax.swing.JLabel();
        txtCalleNumero1 = new javax.swing.JTextField();
        nameMesero27 = new javax.swing.JLabel();
        nameMesero28 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nameMesero29 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        CedulaRegistro = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        txtCicloEscolar = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtNombreSolicitudEcpecial1 = new javax.swing.JTextField();
        txtPrimerApellido1 = new javax.swing.JTextField();
        txtSegundoApellido1 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        cmbSexo2 = new javax.swing.JComboBox();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtFecNacSolicitudPreins1 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txtEntidadNacimiento = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtTipoSangre = new javax.swing.JTextField();
        txtGuardarCedula = new javax.swing.JButton();
        txtIdCedulaRegistro = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtFechaHoy2 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtNiaInscripcion = new javax.swing.JTextField();
        txtCurpSolicitudEspecial2 = new javax.swing.JTextField();
        txtCurpSolicitudEspecial3 = new javax.swing.JTextField();
        txtLenguaMaterna = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        buscaAlumnos = new javax.swing.JFrame();
        jPanel17 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        label6 = new javax.swing.JLabel();
        nameMesero8 = new javax.swing.JLabel();
        txtGuardaInscripcion1 = new javax.swing.JButton();
        cmbSemestreInscrBusca = new javax.swing.JComboBox();
        cmbGrupoInscrBusca = new javax.swing.JComboBox();
        label7 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel93 = new javax.swing.JLabel();
        reinscripcion = new javax.swing.JFrame();
        jPanel21 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        niatxtt = new javax.swing.JTextField();
        label10 = new javax.swing.JLabel();
        nameMesero31 = new javax.swing.JLabel();
        txtGuardaInscripcion3 = new javax.swing.JButton();
        txtGuardaInscripcion4 = new javax.swing.JButton();
        cmbSemestreInscrBusca1 = new javax.swing.JComboBox();
        cmbGrupoInscrBusca1 = new javax.swing.JComboBox();
        label11 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        label13 = new javax.swing.JLabel();
        cmbSemestreInscrBusca3 = new javax.swing.JComboBox();
        nameMesero33 = new javax.swing.JLabel();
        cmbGrupoInscrBusca3 = new javax.swing.JComboBox();
        jLabel97 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        cmbSemestreInscrBusca2 = new javax.swing.JComboBox();
        cmbGrupoInscrBusca2 = new javax.swing.JComboBox();
        jLabel98 = new javax.swing.JLabel();
        nameMesero32 = new javax.swing.JLabel();
        AsignaCalificacion = new javax.swing.JFrame();
        jPanel20 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        label9 = new javax.swing.JLabel();
        txtGuardaInscripcion2 = new javax.swing.JButton();
        label14 = new javax.swing.JLabel();
        txtNiaAlumno = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtCalificacion = new javax.swing.JTextField();
        txtGuardaCalificacion = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        txtIdAlumnoCa = new javax.swing.JTextField();
        MATERIATXT = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        verMenu = new javax.swing.JButton();
        doPedido = new javax.swing.JButton();
        verCocina = new javax.swing.JButton();
        verEstadisticas = new javax.swing.JButton();
        infoMeseros = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        pagos1 = new javax.swing.JButton();
        btnPassword = new javax.swing.JButton();
        txtPreinscripcion = new javax.swing.JButton();
        txtPreinscripcion1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        password.setTitle("INFO.MESERO");
        password.setMinimumSize(new java.awt.Dimension(544, 481));
        password.setResizable(false);

        jPanel8.setLayout(null);

        nameMesero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero.setText("Usuario:");
        jPanel8.add(nameMesero);
        nameMesero.setBounds(40, 100, 70, 20);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel8.add(txtUsuario);
        txtUsuario.setBounds(150, 100, 160, 24);

        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });
        jPanel8.add(txtContrasena);
        txtContrasena.setBounds(150, 140, 160, 24);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton16.setText("jButton16");
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton16);
        jButton16.setBounds(20, 410, 60, 48);

        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Contraseña:");
        jPanel8.add(label1);
        label1.setBounds(40, 140, 160, 20);

        guardarInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        guardarInfo.setText("Guardar");
        guardarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarInfoActionPerformed(evt);
            }
        });
        jPanel8.add(guardarInfo);
        guardarInfo.setBounds(120, 380, 120, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel8.add(jLabel15);
        jLabel15.setBounds(0, 0, 550, 480);

        javax.swing.GroupLayout passwordLayout = new javax.swing.GroupLayout(password.getContentPane());
        password.getContentPane().setLayout(passwordLayout);
        passwordLayout.setHorizontalGroup(
            passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        passwordLayout.setVerticalGroup(
            passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        nuevoAlumno.setTitle("PEDIDOS");
        nuevoAlumno.setMinimumSize(new java.awt.Dimension(840, 580));
        nuevoAlumno.setModal(true);
        nuevoAlumno.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(105, 92, 100));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/atras.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, 70));

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 190, 30));

        jLabel12.setText("Nombre:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, -1));

        jLabel17.setText("Apellido Pat:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));
        jPanel3.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 140, -1));
        jPanel3.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 140, -1));

        jLabel23.setText("Apellido Mat:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));
        jPanel3.add(txtNia, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 70, -1));

        jLabel31.setText("Nia:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        jLabel34.setText("Lengua indigena:");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel3.add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 110, -1));

        jLabel35.setText("Entidad federativa ");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 20));

        jLabel36.setText("Sexo");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 20));

        jLabel40.setText("Curp");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, 20));
        jPanel3.add(txtCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 110, -1));

        cmbEntidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PUEBLA", "VERACRUZ" }));
        jPanel3.add(cmbEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 100, 30));

        cmbDialecto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NAHUATL", "TOTONACO" }));
        jPanel3.add(cmbDialecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, 30));

        jLabel41.setText("Fecha nacimiento:");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel42.setText("Semestre");
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jPanel3.add(cmbSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, 30));

        jLabel43.setText("No.Desarrollo social:");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, 20));
        jPanel3.add(txtSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 70, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOMBRE", "MUJER" }));
        jPanel3.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 100, 30));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Datos del alumno");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Domicilio del alumno");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel46.setText("Calle:");
        jPanel3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel3.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, -1));
        jPanel3.add(txtInterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 60, -1));

        jLabel47.setText("No. Interior");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel48.setText("No.Exterior");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        jPanel3.add(txtExterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 60, -1));
        jPanel3.add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 190, -1));

        jLabel50.setText("Municipio");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jLabel51.setText("Colinia");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel3.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, -1));

        jLabel52.setText("Codigo postal");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));
        jPanel3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 140, -1));

        jLabel49.setText("(mes/dia/año)");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUPO A", "GRUPO B" }));
        jPanel3.add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 90, 30));

        jLabel53.setText("Grupo");
        jPanel3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 780, 140));

        javax.swing.GroupLayout nuevoAlumnoLayout = new javax.swing.GroupLayout(nuevoAlumno.getContentPane());
        nuevoAlumno.getContentPane().setLayout(nuevoAlumnoLayout);
        nuevoAlumnoLayout.setHorizontalGroup(
            nuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        nuevoAlumnoLayout.setVerticalGroup(
            nuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        Bajas.setTitle("BAJAS");
        Bajas.setMinimumSize(new java.awt.Dimension(680, 694));
        Bajas.setModal(true);
        Bajas.setResizable(false);
        Bajas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.setMaximumSize(new java.awt.Dimension(620, 400));
        jPanel10.setMinimumSize(new java.awt.Dimension(620, 400));
        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jPanel11.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("Nia");
        jPanel11.add(jLabel29);
        jLabel29.setBounds(10, 14, 40, 20);

        txtNiaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNiaBajaActionPerformed(evt);
            }
        });
        jPanel11.add(txtNiaBaja);
        txtNiaBaja.setBounds(50, 10, 270, 24);

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton4);
        jButton4.setBounds(390, 10, 240, 32);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(10, 60, 650, 60);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back.png"))); // NOI18N
        jButton10.setToolTipText("Volver");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton10);
        jButton10.setBounds(50, 570, 70, 70);

        fac.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fac.setText("BAJAS DE ALUMNO");
        jPanel10.add(fac);
        fac.setBounds(230, 10, 180, 30);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Teléfono: 30011111 - 31900000");
        jPanel10.add(jLabel38);
        jLabel38.setBounds(50, 70, 200, 30);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable6);

        jPanel10.add(jScrollPane9);
        jScrollPane9.setBounds(10, 210, 660, 70);

        txtGuardarBaja.setText("Guardar");
        txtGuardarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarBajaActionPerformed(evt);
            }
        });
        jPanel10.add(txtGuardarBaja);
        txtGuardarBaja.setBounds(500, 400, 130, 50);
        jPanel10.add(txtDescripcion);
        txtDescripcion.setBounds(10, 320, 660, 50);

        Bajas.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 710));

        Estadisticas.setTitle("ESTADISTICAS");
        Estadisticas.setMinimumSize(new java.awt.Dimension(505, 428));
        Estadisticas.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/bars-chart.png"))); // NOI18N
        jButton13.setContentAreaFilled(false);
        jPanel5.add(jButton13);
        jButton13.setBounds(370, 330, 100, 80);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/line-chart.png"))); // NOI18N
        jButton18.setContentAreaFilled(false);
        jPanel5.add(jButton18);
        jButton18.setBounds(50, 330, 90, 80);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("ASISTENCIA");
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton20);
        jButton20.setBounds(20, 60, 450, 40);

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("CEDULA DE MOVIMIENTO DEL ALUMNO");
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton21);
        jButton21.setBounds(140, 140, 330, 40);

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("CEDULA DE REGISTRO DE ALUMNO");
        jButton22.setContentAreaFilled(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton22);
        jButton22.setBounds(140, 210, 330, 40);

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("MESERO DEL DIA");
        jButton23.setContentAreaFilled(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel5.add(jButton23);
        jButton23.setBounds(50, 280, 270, 40);

        label15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setText("Grado");
        jPanel5.add(label15);
        label15.setBounds(60, 30, 50, 20);

        cmbSemestreAsistencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jPanel5.add(cmbSemestreAsistencia);
        cmbSemestreAsistencia.setBounds(110, 30, 110, 26);

        nameMesero34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero34.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero34.setText("Grupo");
        jPanel5.add(nameMesero34);
        nameMesero34.setBounds(240, 30, 50, 20);

        cmbGrupoAsistencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUPO A", "GRUPO B" }));
        jPanel5.add(cmbGrupoAsistencia);
        cmbGrupoAsistencia.setBounds(290, 30, 100, 26);

        jLabel2.setText("NIA:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 150, 30, 16);
        jPanel5.add(txtNiaReporte);
        txtNiaReporte.setBounds(40, 146, 90, 24);

        jLabel3.setText("NIA:");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 220, 30, 16);
        jPanel5.add(txtNiaReporTrEGISTRO);
        txtNiaReporTrEGISTRO.setBounds(40, 216, 90, 24);

        javax.swing.GroupLayout EstadisticasLayout = new javax.swing.GroupLayout(Estadisticas.getContentPane());
        Estadisticas.getContentPane().setLayout(EstadisticasLayout);
        EstadisticasLayout.setHorizontalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        EstadisticasLayout.setVerticalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        SolicitudPreinscripcion.setTitle("SOLICITUD ESTATAL DE PREINSCRIPCION");
        SolicitudPreinscripcion.setMinimumSize(new java.awt.Dimension(928, 393));
        SolicitudPreinscripcion.setResizable(false);

        jPanel18.setBackground(new java.awt.Color(102, 102, 255));
        jPanel18.setMaximumSize(new java.awt.Dimension(781, 393));
        jPanel18.setMinimumSize(new java.awt.Dimension(781, 393));
        jPanel18.setLayout(null);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("SOLICITUD ESTATAL DE PREINSCRIPCION");
        jPanel18.add(jLabel65);
        jLabel65.setBounds(270, 0, 290, 20);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton30.setText("jButton15");
        jButton30.setContentAreaFilled(false);
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton30);
        jButton30.setBounds(10, 310, 60, 50);

        jLabel10.setText("Folio:");
        jPanel18.add(jLabel10);
        jLabel10.setBounds(670, 40, 40, 16);

        jLabel11.setText("Medio superior");
        jPanel18.add(jLabel11);
        jLabel11.setBounds(20, 60, 90, 16);

        jLabel13.setText("Nivel a que preinscribe");
        jPanel18.add(jLabel13);
        jLabel13.setBounds(20, 40, 140, 16);

        jLabel55.setText("Nombre del bachillerato");
        jPanel18.add(jLabel55);
        jLabel55.setBounds(20, 20, 150, 16);

        jLabel56.setText("Fecha de elaboración");
        jPanel18.add(jLabel56);
        jLabel56.setBounds(340, 20, 130, 16);

        jLabel57.setText("C.C.T.2EBH0926Y");
        jPanel18.add(jLabel57);
        jLabel57.setBounds(670, 20, 110, 16);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable3);

        jPanel18.add(jScrollPane6);
        jScrollPane6.setBounds(20, 80, 870, 70);

        jLabel58.setText("Nombre");
        jPanel18.add(jLabel58);
        jLabel58.setBounds(420, 180, 60, 16);
        jPanel18.add(txtNombreSolicitante);
        txtNombreSolicitante.setBounds(160, 150, 170, 20);

        jLabel59.setText("Nombre del Solicitante:");
        jPanel18.add(jLabel59);
        jLabel59.setBounds(20, 150, 140, 20);

        jLabel60.setText("Primer apellido");
        jPanel18.add(jLabel60);
        jLabel60.setBounds(20, 180, 90, 16);

        jLabel61.setText("Segundo apellido");
        jPanel18.add(jLabel61);
        jLabel61.setBounds(220, 180, 110, 16);
        jPanel18.add(txtNombreSolicitudEcpecial);
        txtNombreSolicitudEcpecial.setBounds(420, 200, 210, 24);
        jPanel18.add(txtPrimerApellido);
        txtPrimerApellido.setBounds(20, 200, 170, 24);
        jPanel18.add(txtSegundoApellido);
        txtSegundoApellido.setBounds(220, 200, 170, 24);

        jLabel62.setText("Sexo");
        jPanel18.add(jLabel62);
        jLabel62.setBounds(640, 210, 29, 16);

        cmbSexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOMBRE", "MUJER" }));
        jPanel18.add(cmbSexo1);
        cmbSexo1.setBounds(680, 200, 80, 26);

        jLabel63.setText("Fecha nacimiento:");
        jPanel18.add(jLabel63);
        jLabel63.setBounds(780, 170, 103, 16);

        jLabel64.setText("(mes/dia/año)");
        jPanel18.add(jLabel64);
        jLabel64.setBounds(790, 180, 77, 16);
        jPanel18.add(txtFecNacSolicitudPreins);
        txtFecNacSolicitudPreins.setBounds(780, 200, 100, 24);

        jLabel66.setText("Edad al 1 de septiembre de 2020");
        jPanel18.add(jLabel66);
        jLabel66.setBounds(20, 230, 184, 20);
        jPanel18.add(txtEdadActual);
        txtEdadActual.setBounds(20, 250, 120, 24);

        jLabel67.setText("Años");
        jPanel18.add(jLabel67);
        jLabel67.setBounds(150, 260, 30, 16);

        jLabel68.setText("Curp");
        jPanel18.add(jLabel68);
        jLabel68.setBounds(230, 260, 40, 16);
        jPanel18.add(txtCurpSolicitudEspecial);
        txtCurpSolicitudEspecial.setBounds(270, 250, 270, 24);

        txtGuardarSolicitud.setText("Guardar");
        txtGuardarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarSolicitudActionPerformed(evt);
            }
        });
        jPanel18.add(txtGuardarSolicitud);
        txtGuardarSolicitud.setBounds(530, 310, 210, 40);

        txtFechaHoy.setText("jLabel69");
        jPanel18.add(txtFechaHoy);
        txtFechaHoy.setBounds(360, 40, 90, 16);
        jPanel18.add(txtIdSOlicitudPreinscripcion);
        txtIdSOlicitudPreinscripcion.setBounds(340, 150, 60, 20);

        javax.swing.GroupLayout SolicitudPreinscripcionLayout = new javax.swing.GroupLayout(SolicitudPreinscripcion.getContentPane());
        SolicitudPreinscripcion.getContentPane().setLayout(SolicitudPreinscripcionLayout);
        SolicitudPreinscripcionLayout.setHorizontalGroup(
            SolicitudPreinscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        SolicitudPreinscripcionLayout.setVerticalGroup(
            SolicitudPreinscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        inscripcion.setTitle("INSCRIPCIÓN");
        inscripcion.setMinimumSize(new java.awt.Dimension(544, 481));
        inscripcion.setResizable(false);

        jPanel16.setLayout(null);

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre");
        jPanel16.add(labelNombre);
        labelNombre.setBounds(10, 150, 60, 20);
        jPanel16.add(txtNombreInsc);
        txtNombreInsc.setBounds(70, 150, 190, 24);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton26.setText("jButton16");
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton26);
        jButton26.setBounds(20, 390, 60, 48);

        label3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Grado");
        jPanel16.add(label3);
        label3.setBounds(200, 210, 50, 20);

        nameMesero5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero5.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero5.setText("Grupo");
        jPanel16.add(nameMesero5);
        nameMesero5.setBounds(380, 210, 50, 20);

        nameMesero6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero6.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero6.setText("Ciclo escolar");
        jPanel16.add(nameMesero6);
        nameMesero6.setBounds(20, 260, 90, 20);
        jPanel16.add(txtCicloEscolarInsc);
        txtCicloEscolarInsc.setBounds(110, 260, 320, 24);

        txtGuardaInscripcion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtGuardaInscripcion.setText("Guardar");
        txtGuardaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardaInscripcionActionPerformed(evt);
            }
        });
        jPanel16.add(txtGuardaInscripcion);
        txtGuardaInscripcion.setBounds(30, 350, 120, 30);

        txtSiguiente1.setText("Siguinete ");
        txtSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiguiente1ActionPerformed(evt);
            }
        });
        jPanel16.add(txtSiguiente1);
        txtSiguiente1.setBounds(350, 350, 120, 32);

        cmbSemestreInscr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jPanel16.add(cmbSemestreInscr);
        cmbSemestreInscr.setBounds(250, 210, 110, 26);

        cmbGrupoInscr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUPO A", "GRUPO B" }));
        jPanel16.add(cmbGrupoInscr);
        cmbGrupoInscr.setBounds(430, 210, 100, 26);

        nameMesero7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero7.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero7.setText("Nia");
        jPanel16.add(nameMesero7);
        nameMesero7.setBounds(20, 210, 30, 20);
        jPanel16.add(txtNiaInsc);
        txtNiaInsc.setBounds(50, 210, 120, 24);
        jPanel16.add(txtCurpInsc);
        txtCurpInsc.setBounds(350, 150, 180, 24);

        nameMesero8labelCurp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero8labelCurp.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero8labelCurp.setText("Curp");
        jPanel16.add(nameMesero8labelCurp);
        nameMesero8labelCurp.setBounds(310, 150, 34, 20);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable4);

        jPanel16.add(jScrollPane7);
        jScrollPane7.setBounds(0, 30, 540, 110);
        jPanel16.add(txtIdInscripcion);
        txtIdInscripcion.setBounds(270, 150, 30, 24);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel16.add(jLabel69);
        jLabel69.setBounds(0, 0, 550, 480);

        javax.swing.GroupLayout inscripcionLayout = new javax.swing.GroupLayout(inscripcion.getContentPane());
        inscripcion.getContentPane().setLayout(inscripcionLayout);
        inscripcionLayout.setHorizontalGroup(
            inscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        inscripcionLayout.setVerticalGroup(
            inscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        preinscripcion.setTitle("PREINSCRIPCION");
        preinscripcion.setMinimumSize(new java.awt.Dimension(1000, 600));
        preinscripcion.setResizable(false);
        preinscripcion.getContentPane().setLayout(null);

        jPanel15.setLayout(null);

        nameMesero1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero1.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero1.setText("Apellido paterno");
        jPanel15.add(nameMesero1);
        nameMesero1.setBounds(280, 50, 120, 20);
        jPanel15.add(txtApellidoPaternoP);
        txtApellidoPaternoP.setBounds(400, 50, 230, 24);
        jPanel15.add(entidadtxt);
        entidadtxt.setBounds(560, 100, 170, 24);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton25.setText("jButton16");
        jButton25.setContentAreaFilled(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton25);
        jButton25.setBounds(10, 480, 60, 48);

        label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("FOLIO");
        jPanel15.add(label2);
        label2.setBounds(610, 10, 50, 20);

        nameMesero2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero2.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero2.setText("Nombre");
        jPanel15.add(nameMesero2);
        nameMesero2.setBounds(10, 50, 60, 20);
        jPanel15.add(txtnombreP);
        txtnombreP.setBounds(70, 50, 200, 24);

        nameMesero3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero3.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero3.setText("Curp");
        jPanel15.add(nameMesero3);
        nameMesero3.setBounds(10, 100, 60, 20);
        jPanel15.add(txtcurpP);
        txtcurpP.setBounds(70, 100, 200, 24);

        txtGuardaPreinscripcion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtGuardaPreinscripcion.setText("Guardar");
        txtGuardaPreinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardaPreinscripcionActionPerformed(evt);
            }
        });
        jPanel15.add(txtGuardaPreinscripcion);
        txtGuardaPreinscripcion.setBounds(790, 460, 190, 40);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("DATOS DEL TUTOR");
        jPanel15.add(jLabel73);
        jLabel73.setBounds(440, 270, 140, 20);

        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Sexo");
        jPanel15.add(jLabel75);
        jLabel75.setBounds(290, 110, 29, 16);

        cmbSexo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOMBRE", "MUJER" }));
        jPanel15.add(cmbSexo3);
        cmbSexo3.setBounds(330, 100, 80, 26);

        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Fecha nacimiento:");
        jPanel15.add(jLabel88);
        jLabel88.setBounds(430, 70, 103, 16);

        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("(mes/dia/año)");
        jPanel15.add(jLabel89);
        jLabel89.setBounds(440, 80, 77, 16);
        jPanel15.add(txtFecNacSolicitudPreins2);
        txtFecNacSolicitudPreins2.setBounds(430, 100, 100, 24);
        jPanel15.add(FOLIO);
        FOLIO.setBounds(670, 10, 80, 24);

        label4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Entidad fed. nacimiento");
        jPanel15.add(label4);
        label4.setBounds(560, 80, 170, 20);

        label5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Apellido materno");
        jPanel15.add(label5);
        label5.setBounds(650, 50, 120, 20);
        jPanel15.add(txtApellidoMaternoP1);
        txtApellidoMaternoP1.setBounds(770, 50, 210, 24);

        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Edad al 1 de septiembre de 2020");
        jPanel15.add(jLabel91);
        jLabel91.setBounds(760, 80, 184, 20);
        jPanel15.add(edadSep);
        edadSep.setBounds(760, 100, 170, 24);

        nameMesero4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero4.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero4.setText("Discapacidad");
        jPanel15.add(nameMesero4);
        nameMesero4.setBounds(10, 140, 90, 20);
        jPanel15.add(txtDiscap);
        txtDiscap.setBounds(110, 140, 150, 24);

        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Años");
        jPanel15.add(jLabel92);
        jLabel92.setBounds(930, 110, 30, 16);

        nameMesero10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero10.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero10.setText("Enf. cronica degenerativa");
        jPanel15.add(nameMesero10);
        nameMesero10.setBounds(570, 140, 180, 20);
        jPanel15.add(cronicadegenera);
        cronicadegenera.setBounds(760, 140, 220, 24);

        nameMesero9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero9.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero9.setText("Educacion especial");
        jPanel15.add(nameMesero9);
        nameMesero9.setBounds(280, 140, 130, 20);
        jPanel15.add(txtEduccionEsp);
        txtEduccionEsp.setBounds(410, 140, 150, 24);

        nameMesero11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero11.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero11.setText("Nombre esc");
        jPanel15.add(nameMesero11);
        nameMesero11.setBounds(10, 200, 90, 20);
        jPanel15.add(txtnombreEscu);
        txtnombreEscu.setBounds(100, 200, 200, 24);
        jPanel15.add(txtCct);
        txtCct.setBounds(340, 200, 140, 24);

        nameMesero12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero12.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero12.setText("Cct");
        jPanel15.add(nameMesero12);
        nameMesero12.setBounds(310, 200, 30, 20);

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("SOLICITUD ESTATAL DE PREINSCRIPCION");
        jPanel15.add(jLabel94);
        jLabel94.setBounds(310, 10, 290, 20);

        nameMesero13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero13.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero13.setText("Colonia");
        jPanel15.add(nameMesero13);
        nameMesero13.setBounds(490, 200, 60, 20);
        jPanel15.add(txtColoniaEsc);
        txtColoniaEsc.setBounds(550, 200, 190, 24);
        jPanel15.add(txtLocalidad);
        txtLocalidad.setBounds(820, 200, 160, 24);

        nameMesero14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero14.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero14.setText("Localidad");
        jPanel15.add(nameMesero14);
        nameMesero14.setBounds(750, 200, 70, 20);
        jPanel15.add(txtEntidadEsc);
        txtEntidadEsc.setBounds(730, 240, 250, 24);

        nameMesero16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero16.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero16.setText("Entidad");
        jPanel15.add(nameMesero16);
        nameMesero16.setBounds(670, 240, 60, 20);

        nameMesero15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero15.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero15.setText("Municipio");
        jPanel15.add(nameMesero15);
        nameMesero15.setBounds(350, 240, 70, 20);
        jPanel15.add(Municipio);
        Municipio.setBounds(430, 240, 210, 24);
        jPanel15.add(txtCalleNumero);
        txtCalleNumero.setBounds(120, 240, 210, 24);

        nameMesero17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero17.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero17.setText("Calle y número ");
        jPanel15.add(nameMesero17);
        nameMesero17.setBounds(10, 240, 110, 20);

        nameMesero19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero19.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero19.setText("Nombre");
        jPanel15.add(nameMesero19);
        nameMesero19.setBounds(10, 300, 60, 20);
        jPanel15.add(txtnombretutor);
        txtnombretutor.setBounds(70, 300, 200, 24);

        nameMesero20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero20.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero20.setText("Apellido paterno");
        jPanel15.add(nameMesero20);
        nameMesero20.setBounds(280, 300, 120, 20);
        jPanel15.add(txtApellidoPaternotutor);
        txtApellidoPaternotutor.setBounds(400, 300, 230, 24);
        jPanel15.add(txtApellidoMaternotutor);
        txtApellidoMaternotutor.setBounds(770, 300, 210, 24);

        label8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Apellido materno");
        jPanel15.add(label8);
        label8.setBounds(650, 300, 120, 20);

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("DATOS DE ESCUELA DE PROCEDENCIA");
        jPanel15.add(jLabel95);
        jLabel95.setBounds(380, 170, 280, 20);
        jPanel15.add(txtParentesco);
        txtParentesco.setBounds(90, 340, 200, 24);

        nameMesero21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero21.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero21.setText("Parentesco");
        jPanel15.add(nameMesero21);
        nameMesero21.setBounds(10, 340, 80, 20);
        jPanel15.add(txtColoniatutor);
        txtColoniatutor.setBounds(740, 340, 240, 24);

        nameMesero22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero22.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero22.setText("Colonia");
        jPanel15.add(nameMesero22);
        nameMesero22.setBounds(680, 340, 60, 20);

        nameMesero23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero23.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero23.setText("Localidad");
        jPanel15.add(nameMesero23);
        nameMesero23.setBounds(10, 380, 70, 20);
        jPanel15.add(localidadTutor);
        localidadTutor.setBounds(90, 380, 220, 24);
        jPanel15.add(txtMunicipioTutor);
        txtMunicipioTutor.setBounds(410, 380, 260, 24);

        nameMesero24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero24.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero24.setText("Municipio");
        jPanel15.add(nameMesero24);
        nameMesero24.setBounds(340, 380, 70, 20);
        jPanel15.add(txtEntidadtu);
        txtEntidadtu.setBounds(760, 380, 220, 24);

        nameMesero25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero25.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero25.setText("Entidad");
        jPanel15.add(nameMesero25);
        nameMesero25.setBounds(700, 380, 60, 20);

        nameMesero26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero26.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero26.setText("C.p");
        jPanel15.add(nameMesero26);
        nameMesero26.setBounds(10, 420, 30, 20);
        jPanel15.add(cpTutor);
        cpTutor.setBounds(50, 420, 110, 24);

        nameMesero18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero18.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero18.setText("Calle y número ");
        jPanel15.add(nameMesero18);
        nameMesero18.setBounds(300, 340, 110, 20);
        jPanel15.add(txtCalleNumero1);
        txtCalleNumero1.setBounds(410, 340, 250, 24);

        nameMesero27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero27.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero27.setText("Telefono");
        jPanel15.add(nameMesero27);
        nameMesero27.setBounds(170, 420, 70, 20);

        nameMesero28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero28.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero28.setText("Celular");
        jPanel15.add(nameMesero28);
        nameMesero28.setBounds(430, 420, 50, 20);
        jPanel15.add(txtcelular);
        txtcelular.setBounds(480, 420, 210, 24);
        jPanel15.add(email);
        email.setBounds(760, 420, 220, 24);

        nameMesero29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero29.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero29.setText("Email");
        jPanel15.add(nameMesero29);
        nameMesero29.setBounds(720, 420, 50, 20);
        jPanel15.add(txtTelefono);
        txtTelefono.setBounds(240, 420, 180, 24);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel15.add(jLabel54);
        jLabel54.setBounds(70, -10, 940, 570);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel15.add(jLabel90);
        jLabel90.setBounds(0, 0, 1010, 570);

        preinscripcion.getContentPane().add(jPanel15);
        jPanel15.setBounds(0, 0, 1010, 570);

        CedulaRegistro.setTitle("COCINA");
        CedulaRegistro.setMinimumSize(new java.awt.Dimension(928, 393));
        CedulaRegistro.setResizable(false);

        jPanel19.setBackground(new java.awt.Color(102, 102, 102));
        jPanel19.setMaximumSize(new java.awt.Dimension(781, 393));
        jPanel19.setMinimumSize(new java.awt.Dimension(781, 393));
        jPanel19.setLayout(null);

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("CEDULA DE REGISTRO Y ACTUALIZACION DE DATOS");
        jPanel19.add(jLabel70);
        jLabel70.setBounds(270, 0, 370, 20);

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton31.setText("jButton15");
        jButton31.setContentAreaFilled(false);
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton31);
        jButton31.setBounds(10, 310, 60, 50);

        jLabel74.setText("Nombre del bachillerato");
        jPanel19.add(jLabel74);
        jLabel74.setBounds(20, 20, 150, 16);

        jLabel76.setText("C.C.T.2EBH0926Y");
        jPanel19.add(jLabel76);
        jLabel76.setBounds(670, 20, 110, 16);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable5);

        jPanel19.add(jScrollPane8);
        jScrollPane8.setBounds(20, 50, 870, 70);

        jLabel77.setText("Nombre");
        jPanel19.add(jLabel77);
        jLabel77.setBounds(500, 170, 60, 16);
        jPanel19.add(txtCicloEscolar);
        txtCicloEscolar.setBounds(100, 130, 200, 24);

        jLabel78.setText("Ciclo escolar:");
        jPanel19.add(jLabel78);
        jLabel78.setBounds(20, 130, 90, 20);

        jLabel79.setText("Primer apellido");
        jPanel19.add(jLabel79);
        jLabel79.setBounds(20, 170, 90, 16);

        jLabel80.setText("Segundo apellido");
        jPanel19.add(jLabel80);
        jLabel80.setBounds(240, 170, 110, 16);
        jPanel19.add(txtNombreSolicitudEcpecial1);
        txtNombreSolicitudEcpecial1.setBounds(500, 190, 230, 24);
        jPanel19.add(txtPrimerApellido1);
        txtPrimerApellido1.setBounds(20, 190, 200, 24);
        jPanel19.add(txtSegundoApellido1);
        txtSegundoApellido1.setBounds(240, 190, 230, 24);

        jLabel81.setText("Sexo");
        jPanel19.add(jLabel81);
        jLabel81.setBounds(770, 140, 29, 16);

        cmbSexo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOMBRE", "MUJER" }));
        jPanel19.add(cmbSexo2);
        cmbSexo2.setBounds(810, 140, 80, 20);

        jLabel82.setText("Fecha nacimiento:");
        jPanel19.add(jLabel82);
        jLabel82.setBounds(780, 160, 103, 16);

        jLabel83.setText("(mes/dia/año)");
        jPanel19.add(jLabel83);
        jLabel83.setBounds(790, 170, 77, 16);
        jPanel19.add(txtFecNacSolicitudPreins1);
        txtFecNacSolicitudPreins1.setBounds(770, 190, 120, 24);

        jLabel84.setText("Entidad de nacimiento");
        jPanel19.add(jLabel84);
        jLabel84.setBounds(20, 230, 140, 20);
        jPanel19.add(txtEntidadNacimiento);
        txtEntidadNacimiento.setBounds(20, 250, 200, 24);

        jLabel85.setText("Tipo sangre");
        jPanel19.add(jLabel85);
        jLabel85.setBounds(500, 230, 80, 16);

        jLabel86.setText("Curp");
        jPanel19.add(jLabel86);
        jLabel86.setBounds(250, 230, 40, 16);
        jPanel19.add(txtTipoSangre);
        txtTipoSangre.setBounds(500, 250, 110, 24);

        txtGuardarCedula.setText("Guardar");
        txtGuardarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarCedulaActionPerformed(evt);
            }
        });
        jPanel19.add(txtGuardarCedula);
        txtGuardarCedula.setBounds(530, 310, 210, 40);

        txtIdCedulaRegistro.setEnabled(false);
        jPanel19.add(txtIdCedulaRegistro);
        txtIdCedulaRegistro.setBounds(310, 130, 30, 24);

        jLabel71.setText("Fecha");
        jPanel19.add(jLabel71);
        jLabel71.setBounds(380, 140, 40, 16);

        txtFechaHoy2.setText("00/00/0000");
        jPanel19.add(txtFechaHoy2);
        txtFechaHoy2.setBounds(420, 140, 90, 16);

        jLabel72.setText("Nia");
        jPanel19.add(jLabel72);
        jLabel72.setBounds(580, 140, 30, 16);
        jPanel19.add(txtNiaInscripcion);
        txtNiaInscripcion.setBounds(610, 136, 90, 24);
        jPanel19.add(txtCurpSolicitudEspecial2);
        txtCurpSolicitudEspecial2.setBounds(240, 250, 230, 24);

        txtCurpSolicitudEspecial3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpSolicitudEspecial3ActionPerformed(evt);
            }
        });
        jPanel19.add(txtCurpSolicitudEspecial3);
        txtCurpSolicitudEspecial3.setBounds(240, 250, 230, 24);
        jPanel19.add(txtLenguaMaterna);
        txtLenguaMaterna.setBounds(660, 250, 230, 24);

        jLabel87.setText("Lengua materna");
        jPanel19.add(jLabel87);
        jLabel87.setBounds(660, 230, 100, 16);

        javax.swing.GroupLayout CedulaRegistroLayout = new javax.swing.GroupLayout(CedulaRegistro.getContentPane());
        CedulaRegistro.getContentPane().setLayout(CedulaRegistroLayout);
        CedulaRegistroLayout.setHorizontalGroup(
            CedulaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        CedulaRegistroLayout.setVerticalGroup(
            CedulaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        buscaAlumnos.setTitle("INSCRIPCIÓN");
        buscaAlumnos.setMinimumSize(new java.awt.Dimension(700, 600));
        buscaAlumnos.setResizable(false);

        jPanel17.setLayout(null);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton27.setText("jButton16");
        jButton27.setContentAreaFilled(false);
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton27);
        jButton27.setBounds(10, 510, 60, 48);

        label6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("BUSCA ALUMNO POR  AÑO Y GRUPO");
        jPanel17.add(label6);
        label6.setBounds(190, 10, 270, 20);

        nameMesero8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero8.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero8.setText("Grupo");
        jPanel17.add(nameMesero8);
        nameMesero8.setBounds(310, 40, 50, 20);

        txtGuardaInscripcion1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtGuardaInscripcion1.setText("Buscar");
        txtGuardaInscripcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardaInscripcion1ActionPerformed(evt);
            }
        });
        jPanel17.add(txtGuardaInscripcion1);
        txtGuardaInscripcion1.setBounds(530, 40, 120, 30);

        cmbSemestreInscrBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jPanel17.add(cmbSemestreInscrBusca);
        cmbSemestreInscrBusca.setBounds(180, 40, 110, 26);

        cmbGrupoInscrBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUPO A", "GRUPO B" }));
        jPanel17.add(cmbGrupoInscrBusca);
        cmbGrupoInscrBusca.setBounds(360, 40, 100, 26);

        label7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Grado");
        jPanel17.add(label7);
        label7.setBounds(130, 40, 50, 20);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable7);

        jPanel17.add(jScrollPane10);
        jScrollPane10.setBounds(10, 100, 670, 380);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel17.add(jLabel93);
        jLabel93.setBounds(0, 0, 700, 590);

        javax.swing.GroupLayout buscaAlumnosLayout = new javax.swing.GroupLayout(buscaAlumnos.getContentPane());
        buscaAlumnos.getContentPane().setLayout(buscaAlumnosLayout);
        buscaAlumnosLayout.setHorizontalGroup(
            buscaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        buscaAlumnosLayout.setVerticalGroup(
            buscaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        reinscripcion.setTitle("INSCRIPCIÓN");
        reinscripcion.setMinimumSize(new java.awt.Dimension(700, 600));
        reinscripcion.setResizable(false);

        jPanel21.setLayout(null);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton29.setText("jButton16");
        jButton29.setContentAreaFilled(false);
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton29);
        jButton29.setBounds(10, 510, 60, 48);

        niatxtt.setEnabled(false);
        jPanel21.add(niatxtt);
        niatxtt.setBounds(180, 490, 40, 24);

        label10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("BUSCA ALUMNO POR  AÑO Y GRUPO");
        jPanel21.add(label10);
        label10.setBounds(190, 10, 270, 20);

        nameMesero31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero31.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero31.setText("Grupo");
        jPanel21.add(nameMesero31);
        nameMesero31.setBounds(310, 40, 50, 20);

        txtGuardaInscripcion3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtGuardaInscripcion3.setText("Buscar");
        txtGuardaInscripcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardaInscripcion3ActionPerformed(evt);
            }
        });
        jPanel21.add(txtGuardaInscripcion3);
        txtGuardaInscripcion3.setBounds(510, 40, 120, 30);

        txtGuardaInscripcion4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtGuardaInscripcion4.setText("Guardar");
        txtGuardaInscripcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardaInscripcion4ActionPerformed(evt);
            }
        });
        jPanel21.add(txtGuardaInscripcion4);
        txtGuardaInscripcion4.setBounds(500, 510, 120, 30);

        cmbSemestreInscrBusca1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jPanel21.add(cmbSemestreInscrBusca1);
        cmbSemestreInscrBusca1.setBounds(180, 40, 110, 26);

        cmbGrupoInscrBusca1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUPO A", "GRUPO B" }));
        jPanel21.add(cmbGrupoInscrBusca1);
        cmbGrupoInscrBusca1.setBounds(360, 40, 100, 26);

        label11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setText("Grado");
        jPanel21.add(label11);
        label11.setBounds(130, 40, 50, 20);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTable9);

        jPanel21.add(jScrollPane12);
        jScrollPane12.setBounds(10, 100, 670, 380);

        label13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setText("Grado");
        jPanel21.add(label13);
        label13.setBounds(120, 520, 50, 20);

        cmbSemestreInscrBusca3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jPanel21.add(cmbSemestreInscrBusca3);
        cmbSemestreInscrBusca3.setBounds(170, 520, 110, 26);

        nameMesero33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero33.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero33.setText("Grupo");
        jPanel21.add(nameMesero33);
        nameMesero33.setBounds(300, 520, 50, 20);

        cmbGrupoInscrBusca3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUPO A", "GRUPO B" }));
        jPanel21.add(cmbGrupoInscrBusca3);
        cmbGrupoInscrBusca3.setBounds(350, 520, 100, 26);

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel21.add(jLabel97);
        jLabel97.setBounds(40, -10, 690, 590);

        label12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("Grado");
        jPanel21.add(label12);
        label12.setBounds(130, 40, 50, 20);

        cmbSemestreInscrBusca2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO" }));
        jPanel21.add(cmbSemestreInscrBusca2);
        cmbSemestreInscrBusca2.setBounds(180, 40, 110, 26);

        cmbGrupoInscrBusca2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUPO A", "GRUPO B" }));
        jPanel21.add(cmbGrupoInscrBusca2);
        cmbGrupoInscrBusca2.setBounds(360, 40, 100, 26);

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel21.add(jLabel98);
        jLabel98.setBounds(0, 0, 700, 590);

        nameMesero32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameMesero32.setForeground(new java.awt.Color(255, 255, 255));
        nameMesero32.setText("Grupo");
        jPanel21.add(nameMesero32);
        nameMesero32.setBounds(310, 40, 50, 20);

        javax.swing.GroupLayout reinscripcionLayout = new javax.swing.GroupLayout(reinscripcion.getContentPane());
        reinscripcion.getContentPane().setLayout(reinscripcionLayout);
        reinscripcionLayout.setHorizontalGroup(
            reinscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        reinscripcionLayout.setVerticalGroup(
            reinscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        AsignaCalificacion.setTitle("ASIGNA CALIFICACION");
        AsignaCalificacion.setMinimumSize(new java.awt.Dimension(700, 600));
        AsignaCalificacion.setResizable(false);

        jPanel20.setLayout(null);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/back (1).png"))); // NOI18N
        jButton28.setText("jButton16");
        jButton28.setContentAreaFilled(false);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton28);
        jButton28.setBounds(10, 520, 140, 50);

        label9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("BUSCA ALUMNO PARA ASIGNAS CALIFICACION");
        jPanel20.add(label9);
        label9.setBounds(130, 10, 350, 20);

        txtGuardaInscripcion2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtGuardaInscripcion2.setText("Buscar");
        txtGuardaInscripcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardaInscripcion2ActionPerformed(evt);
            }
        });
        jPanel20.add(txtGuardaInscripcion2);
        txtGuardaInscripcion2.setBounds(530, 40, 120, 30);

        label14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setText("Nia");
        jPanel20.add(label14);
        label14.setBounds(130, 40, 30, 20);

        txtNiaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNiaAlumnoActionPerformed(evt);
            }
        });
        jPanel20.add(txtNiaAlumno);
        txtNiaAlumno.setBounds(160, 40, 270, 24);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable8);

        jPanel20.add(jScrollPane11);
        jScrollPane11.setBounds(10, 80, 670, 210);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidad Uno", "Unidad Dos", "Unidad Tres", "Unidad Cuatro", "Unidad Cinco" }));
        jPanel20.add(jComboBox1);
        jComboBox1.setBounds(30, 310, 140, 26);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calificación");
        jPanel20.add(jLabel1);
        jLabel1.setBounds(190, 320, 70, 16);
        jPanel20.add(txtCalificacion);
        txtCalificacion.setBounds(270, 310, 70, 24);

        txtGuardaCalificacion.setText("Guarda calificacion");
        txtGuardaCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardaCalificacionActionPerformed(evt);
            }
        });
        jPanel20.add(txtGuardaCalificacion);
        txtGuardaCalificacion.setBounds(420, 300, 190, 40);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable10);

        jPanel20.add(jScrollPane13);
        jScrollPane13.setBounds(10, 350, 670, 150);

        txtIdAlumnoCa.setEnabled(false);
        jPanel20.add(txtIdAlumnoCa);
        txtIdAlumnoCa.setBounds(650, 310, 30, 24);

        MATERIATXT.setEnabled(false);
        jPanel20.add(MATERIATXT);
        MATERIATXT.setBounds(620, 310, 20, 24);

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/fondoazul.jpg"))); // NOI18N
        jPanel20.add(jLabel96);
        jLabel96.setBounds(-10, 0, 700, 590);

        javax.swing.GroupLayout AsignaCalificacionLayout = new javax.swing.GroupLayout(AsignaCalificacion.getContentPane());
        AsignaCalificacion.getContentPane().setLayout(AsignaCalificacionLayout);
        AsignaCalificacionLayout.setHorizontalGroup(
            AsignaCalificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        AsignaCalificacionLayout.setVerticalGroup(
            AsignaCalificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 411));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/IMG-20200801-WA0008.jpg"))); // NOI18N
        verMenu.setContentAreaFilled(false);
        verMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verMenuMouseMoved(evt);
            }
        });
        verMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMenuActionPerformed(evt);
            }
        });
        jPanel1.add(verMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, 130));

        doPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/IMG-20200801-WA0007.jpg"))); // NOI18N
        doPedido.setContentAreaFilled(false);
        doPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doPedido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                doPedidoMouseMoved(evt);
            }
        });
        doPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(doPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 120, 130));

        verCocina.setForeground(new java.awt.Color(204, 204, 204));
        verCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/IMG-20200801-WA0009.jpg"))); // NOI18N
        verCocina.setBorderPainted(false);
        verCocina.setContentAreaFilled(false);
        verCocina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verCocina.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verCocinaMouseMoved(evt);
            }
        });
        verCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCocinaActionPerformed(evt);
            }
        });
        jPanel1.add(verCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 130));

        verEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/IMG-20200801-WA0010.jpg"))); // NOI18N
        verEstadisticas.setContentAreaFilled(false);
        verEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verEstadisticas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verEstadisticasMouseMoved(evt);
            }
        });
        verEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEstadisticasActionPerformed(evt);
            }
        });
        jPanel1.add(verEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 110));

        infoMeseros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/IMG-20200801-WA0011.jpg"))); // NOI18N
        infoMeseros.setContentAreaFilled(false);
        infoMeseros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoMeseros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                infoMeserosMouseMoved(evt);
            }
        });
        infoMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMeserosActionPerformed(evt);
            }
        });
        jPanel1.add(infoMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, 110));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/exit.png"))); // NOI18N
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 60, 50));

        pagos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/IMG-20200801-WA0006.jpg"))); // NOI18N
        pagos1.setContentAreaFilled(false);
        pagos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagos1.setName(""); // NOI18N
        pagos1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pagos1MouseMoved(evt);
            }
        });
        pagos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagos1ActionPerformed(evt);
            }
        });
        jPanel1.add(pagos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 120, 110));

        btnPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/IMG-20200801-WA0005.jpg"))); // NOI18N
        btnPassword.setContentAreaFilled(false);
        btnPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnPasswordMouseMoved(evt);
            }
        });
        btnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 120, 120));

        txtPreinscripcion.setText("Preinscripcion");
        txtPreinscripcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtPreinscripcionMouseMoved(evt);
            }
        });
        txtPreinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreinscripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtPreinscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 120, 110));

        txtPreinscripcion1.setText("Calificacion");
        txtPreinscripcion1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtPreinscripcion1MouseMoved(evt);
            }
        });
        txtPreinscripcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreinscripcion1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPreinscripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 120, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/opin/sadimiapp/Img/JE_opt (3).jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int contador = 0;
    int suma = 0;

    private void verMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMenuActionPerformed
        buscaAlumnos.setVisible(true);
        buscaAlumnos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_verMenuActionPerformed

    private void verMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMenuMouseMoved
        verMenu.setToolTipText("*BUSCA ALUMNO POR GRADO Y GRUPO");
    }//GEN-LAST:event_verMenuMouseMoved

    private void doPedidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doPedidoMouseMoved
        doPedido.setToolTipText("*ALTA DE ALUMNO");
    }//GEN-LAST:event_doPedidoMouseMoved

    private void verCocinaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCocinaMouseMoved
        verCocina.setToolTipText("*ACCEDER A COCINA/STOCK");
    }//GEN-LAST:event_verCocinaMouseMoved

    private void infoMeserosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMeserosMouseMoved
        infoMeseros.setToolTipText("*INSCRIPCIÓN");
    }//GEN-LAST:event_infoMeserosMouseMoved

    private void verEstadisticasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verEstadisticasMouseMoved
        verEstadisticas.setToolTipText("*VER ESTADISTICAS");
    }//GEN-LAST:event_verEstadisticasMouseMoved
    
 

    private void doPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doPedidoActionPerformed
        nuevoAlumno.setVisible(true);
        nuevoAlumno.setLocationRelativeTo(null);
    }//GEN-LAST:event_doPedidoActionPerformed
    
    

    private void verEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEstadisticasActionPerformed
        Estadisticas.setVisible(true);
        Estadisticas.setLocationRelativeTo(null);
    }//GEN-LAST:event_verEstadisticasActionPerformed

    private void verCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCocinaActionPerformed
        reinscripcion.setVisible(true);
        reinscripcion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_verCocinaActionPerformed

    private void infoMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoMeserosActionPerformed
        inscripcion.setVisible(true);
        listarAlumnosPreinscripcion(jTable4);
        this.dispose();
        inscripcion.setLocationRelativeTo(null);
    }//GEN-LAST:event_infoMeserosActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        nuevoAlumno.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void guardarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarInfoActionPerformed
        LoginDAOImpl loginDAO = new LoginDAOImpl(); 
        String usuario = txtUsuario.getText();
        String password = txtContrasena.getText();
        Date fecha = new Date();
        if (!usuario.isEmpty() | !password.isEmpty()) {
            PersonalSeguridad personalSeguridad = new PersonalSeguridad();
//            PersonalSeguridadDAO personalSeguridadDAO = context.getBean(PersonalSeguridadDAO.class);
            try {
                personalSeguridad.setActivo((byte) 1);
                personalSeguridad.setContrasenna(password);
                personalSeguridad.setUserName(usuario);
                personalSeguridad.setFechaCreacion(fecha);
                loginDAO.save(personalSeguridad);
                JOptionPane.showMessageDialog(null, "Datos guardos correctamente");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los datos obligatorios");
        }
    }//GEN-LAST:event_guardarInfoActionPerformed
    
//    private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       /*
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        short sexo = (short) cmbSexo.getSelectedIndex();
        Alumno alumno = new Alumno();
        String nombre = txtNombre.getText();
        String paterno = txtPaterno.getText();
        String materno = txtMaterno.getText();
        String nia = txtNia.getText();
        String fecNac = txtNacimiento.getText();
        Integer entidad = (Integer) cmbEntidad.getSelectedIndex();
        String curp = txtCurp.getText();
        short annio = (short) cmbSemestre.getSelectedIndex();
        String numSocial = txtSocial.getText();
        short grupo = (short) cmbGrupo.getSelectedIndex();
        String calle = txtCalle.getText();
        String numInterior = txtInterior.getText();
        String numExterior = txtExterior.getText();
        String municipio = txtMunicipio.getText();
        String colonia = txtColonia.getText();
        String codigo = txtCodigo.getText();
        
        String sex = null;
        String ent = null;
        String grup = null;
        System.out.println("sexo " + sexo);
        
        if (sexo == 0) {
            sex = "H";
        }
        if (sexo == 1) {
            sex = "M";
        }
        if (entidad == 0) {
            ent = "PUEBLA";
        }
        if (grupo == 0) {
            grup = "A";
        }
        if (grupo == 2) {
            grup = "B";
        }
        if (!nombre.isEmpty() | !paterno.isEmpty() | !materno.isEmpty() | !nia.isEmpty() | !fecNac.isEmpty()
                | !curp.isEmpty() | !numSocial.isEmpty() | !calle.isEmpty() | !numInterior.isEmpty() | !numExterior.isEmpty()
                | !municipio.isEmpty() | !colonia.isEmpty() | !codigo.isEmpty()) {
            
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                LocalDate dateTime = LocalDate.parse(fecNac, formatter);
                Date date = Date.from(dateTime.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                alumno.setNombre(nombre);
                alumno.setApellidoPat(paterno);
                alumno.setApellidoMat(materno);
                alumno.setNia(nia);
                alumno.setFecNac(date);
                alumno.setIdSexo(sex);
                alumno.setCurp(curp);
                alumno.setDireccion(ent);
                alumno.setIdGrado(annio);
                alumno.setNumDesarrolloSoc(numSocial);
                alumno.setCalle(calle);
                alumno.setNumInterior(numInterior);
                alumno.setIdGrupo(grup);
                alumno.setNumExterior(numExterior);
                alumno.setColonia(colonia);
                alumno.setCodigoPostal(codigo);
                alumnoDAO.save(alumno);
                listarAlumnos(jTable2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Datos obligatorios");
        } */
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void listarAlumnos(JTable tabla) {
       /* AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        DefaultTableModel model;
        String[] titulo = {"NIA", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "FECHA NACIMIENTO", "CURP", "EDITAR"};
        model = new DefaultTableModel(null, titulo);
        List<Alumno> datos = alumnoDAO.finAll();
        System.out.println("qeu entra ");
        String[] datosAlumno = new String[7];
        for (Alumno alum : datos) {
            datosAlumno[0] = alum.getNia() + "";
            datosAlumno[1] = alum.getNombre() + "";
            datosAlumno[2] = alum.getApellidoPat() + "";
            datosAlumno[3] = alum.getApellidoMat() + "";
            datosAlumno[4] = alum.getFecNac() + "";
            datosAlumno[5] = alum.getCurp() + "";
            datosAlumno[6] = "EDITAR" + "";
            model.addRow(datosAlumno);
        }
        tabla.setModel(model);
        */
    }
    

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        

    }//GEN-LAST:event_formWindowActivated
    

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Bajas.setVisible(false);
        Opciones op = new Opciones();
        op.setVisible(true);
        this.setVisible(true);        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txtNiaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNiaBajaActionPerformed
        JOptionPane.showMessageDialog(null, "El pago se ha realizado satisfactoriamente.");
        txtNiaBaja.setText("");
    }//GEN-LAST:event_txtNiaBajaActionPerformed
    

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        password.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && ((c < 'A') | c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        //Bloqueo de letras en textField
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtContrasenaKeyTyped
    
    
    

    private void pagos1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagos1MouseMoved
        pagos1.setToolTipText("*BAJAS");
    }//GEN-LAST:event_pagos1MouseMoved

    private void pagos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagos1ActionPerformed
        Bajas.setVisible(true);
        this.dispose();
        Bajas.setLocationRelativeTo(null);
    }//GEN-LAST:event_pagos1ActionPerformed

    private void btnPasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasswordMouseMoved
        btnPassword.setToolTipText("*PASSWORD");
    }//GEN-LAST:event_btnPasswordMouseMoved

    private void btnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasswordActionPerformed
        password.setVisible(true);
        this.dispose();
        password.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPasswordActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
      /*  Integer selec = jTable2.rowAtPoint(evt.getPoint());
        
        String Id = (String) jTable2.getValueAt(selec, 0);
        Integer intValue = Integer.parseInt(Id);
        System.out.println("id " + Id);
        
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        
        Alumno alumno = alumnoDAO.getById(intValue);
        System.out.println("alumno " + alumno.getApellidoMat() + " " + alumno.getNombre());
*/
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        preinscripcion.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void txtPreinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreinscripcionActionPerformed
        preinscripcion.setVisible(true);
        this.dispose();
        preinscripcion.setLocationRelativeTo(null);
    }//GEN-LAST:event_txtPreinscripcionActionPerformed

    private void txtGuardaPreinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardaPreinscripcionActionPerformed
        AlumnoDAOImpl alumnoDAO = new  AlumnoDAOImpl();
        EscuelaProcedenciaDAOImpl proce = new EscuelaProcedenciaDAOImpl();
        TutorDAOImpl tutorDAO = new TutorDAOImpl();
        Alumno alumno = new Alumno();
        Tutor tutor = new Tutor();
        EscuelaProcedencia ep = new EscuelaProcedencia();
        String nombre = txtnombreP.getText();
        String paterno = txtApellidoPaternoP.getText();
        String materno = entidadtxt.getText();
        String curp = txtcurpP.getText();
        String entidad = entidadtxt.getText();
        short sexo = (short) cmbSexo3.getSelectedIndex();
        String edadSe = edadSep.getText();
        String fecNac = txtFecNacSolicitudPreins2.getText();
        String disc = txtDiscap.getText();
        String eduEsp =txtEduccionEsp.getText();
        String degenera = cronicadegenera.getText();
        String folio =FOLIO.getText();
        String escuela =txtnombreEscu.getText();
        String cct = txtCct.getText();
        String colonia =txtColoniaEsc.getText();
        String localiad =txtLocalidad.getText();
        String muni = Municipio.getText();
        String entidades = txtEntidadEsc.getText();
        String calleNum = txtCalleNumero.getText();
        String nomTutor = txtnombretutor.getText();
        String apPaterTutor = txtApellidoPaternotutor.getText();        
        String apMaterTutor = txtApellidoMaternotutor.getText();
        String pariente = txtParentesco.getText();
        String coloniat = txtColoniatutor.getText();
        String localidadt = localidadTutor.getText();
        String munitutor = txtMunicipioTutor.getText();
        String  Entidadtu = txtEntidadtu.getText();
        String cp = cpTutor.getText();
        String telefono = txtTelefono.getText();
        String celular = txtcelular.getText();
        String correo = email.getText();
        
        String sex=null;
        if (sexo == 0) {
            sex = "H";
        }
        if (sexo == 1) {
            sex = "M";
        }
        if (!nombre.isEmpty() | !paterno.isEmpty() | !materno.isEmpty() | !curp.isEmpty()|!entidad.isEmpty()|
                !edadSe.isEmpty()|!fecNac.isEmpty()|!disc.isEmpty()|!eduEsp.isEmpty()|!degenera.isEmpty()|
                !folio.isEmpty()|!escuela.isEmpty()|!cct.isEmpty()|!colonia.isEmpty()|!localiad.isEmpty()|
                !muni.isEmpty()|entidades.isEmpty()|!calleNum.isEmpty()|!nomTutor.isEmpty()|!apPaterTutor.isEmpty()
                |!apMaterTutor.isEmpty()|!pariente.isEmpty()|!coloniat.isEmpty()|!localidadt.isEmpty()|!munitutor.isEmpty()
                |!Entidadtu.isEmpty()|!cp.isEmpty()|!telefono.isEmpty()|!celular.isEmpty()|!correo.isEmpty()) {
            try {                
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                LocalDate dateTime = LocalDate.parse(fecNac, formatter);
//                Date fecNacimiento = Date.from(dateTime.atStartOfDay(ZoneId.systemDefault()).toInstant());                
                alumno.setNombre(nombre);
                alumno.setApellidoPat(paterno);
                alumno.setApellidoMat(materno);
                alumno.setCurp(curp);
                alumno.setIdSexo(sex);
                alumno.setEntidadNacimiento(entidad);
                alumno.setEstatus("PREINSCRIPCION");
                alumno.setEdadPreinscripcion(edadSe);
//                alumno.setFecNac(fecNacimiento);
                alumno.setFecNac(null);
                alumno.setDiscapacidad(disc);
                alumno.setEducacionEspecial(eduEsp);
                alumno.setEnferCronicaDegenera(degenera);
                alumno.setFolio(folio);
                alumnoDAO.save(alumno);
                if (alumno.getIdAlumno()!= 0) {
                    ep.setNombre(escuela);
                    ep.setCct(cct);
                    ep.setIdAlumno(alumno.getIdAlumno());
                    ep.setColonia(colonia);
                    ep.setLocalidad(localiad);
                    ep.setMunicipio(muni);
                    ep.setEntidad(entidades);
                    ep.setCalleNumero(calleNum);
                    if (proce.save(ep)) {
                        tutor.setNombre(nomTutor);
                        tutor.setIdAlumno(alumno.getIdAlumno());
                        tutor.setApellidoPat(apPaterTutor);
                        tutor.setApellidoMat(apMaterTutor);
                        tutor.setParentesco(pariente);
                        tutor.setColonia(coloniat);
                        tutor.setLocalidad(localidadt);
                        tutor.setMunicipio(munitutor);
                        tutor.setEntidad(Entidadtu);
                        tutor.setCp(cp);
                        tutor.setTelefono(telefono);
                        tutor.setMovil(celular);
                        tutor.setEmail(correo);
                        if (tutorDAO.guarda(tutor)) {
                           JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al gurdar registro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos obligatorios");
        }
    }//GEN-LAST:event_txtGuardaPreinscripcionActionPerformed
    
    public void listarAlumnosPreinscripcion(JTable tabla) {
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        DefaultTableModel model;
        String[] titulo = {"ID", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "CURP"};
        model = new DefaultTableModel(null, titulo);
        List<Alumno> datos = alumnoDAO.listPreinscripcion();
        System.out.println("qeu entra ");
        String[] datosAlumno = new String[7];
        for (Alumno alum : datos) {
            datosAlumno[0] = alum.getIdAlumno() + "";
            datosAlumno[1] = alum.getNombre() + "";
            datosAlumno[2] = alum.getApellidoPat() + "";
            datosAlumno[3] = alum.getApellidoMat() + "";
            datosAlumno[4] = alum.getCurp() + "";
            model.addRow(datosAlumno);
        }
        tabla.setModel(model); 
    }

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        SolicitudPreinscripcion.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
       /* Integer selec = jTable3.rowAtPoint(evt.getPoint());
        String Id = (String) jTable3.getValueAt(selec, 0);
        Integer intValue = Integer.parseInt(Id);
        System.out.println("id  intValue " + intValue);
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        Alumno alumno = alumnoDAO.getById(intValue);
        if (alumno != null) {
            txtIdSOlicitudPreinscripcion.setText(String.valueOf(alumno.getIdAlumno()));
            txtPrimerApellido.setText(alumno.getApellidoPat());
            txtSegundoApellido.setText(alumno.getApellidoMat());
            txtNombreSolicitudEcpecial.setText(alumno.getNombre());
            txtCurpSolicitudEspecial.setText(alumno.getCurp());
        } else {
            JOptionPane.showMessageDialog(null, "Error consulte con su administrador");
        }*/

    }//GEN-LAST:event_jTable3MouseClicked

    private void txtGuardarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarSolicitudActionPerformed
       /* Alumno alumno = new Alumno();
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        
        String edad = txtEdadActual.getText();
        String fecNac = txtFecNacSolicitudPreins.getText();
        String nombreSOlicitante = txtNombreSolicitante.getText();
        short sexo = (short) cmbSexo.getSelectedIndex();
        Integer id = Integer.parseInt(txtIdSOlicitudPreinscripcion.getText());
        String sex = null;
        if (sexo == 0) {
            sex = "H";
        }
        if (sexo == 1) {
            sex = "M";
        }
        if (!edad.isEmpty() | !fecNac.isEmpty() | !nombreSOlicitante.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate dateTime = LocalDate.parse(fecNac, formatter);
            Date date = Date.from(dateTime.atStartOfDay(ZoneId.systemDefault()).toInstant());
            alumno.setEdadPreinscripcion(edad);
            alumno.setIdSexo(sex);
            alumno.setFecNac(date);
            alumno.setNombreSolicitante(nombreSOlicitante);
            alumno.setEstatus("PREINSCRIPCIONFINAL");
            alumno.setIdAlumno(id);
            alumnoDAO.editarAlumno(alumno);
            JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Todos los datos son requeridos");
        } */
    }//GEN-LAST:event_txtGuardarSolicitudActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        inscripcion.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void txtGuardaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardaInscripcionActionPerformed
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        Alumno alumno = new Alumno();
        String nia = txtNiaInsc.getText();
        String ciclo = txtCicloEscolarInsc.getText();
        short grupo = (short) cmbGrupoInscr.getSelectedIndex();
        short grado = (short) cmbSemestreInscr.getSelectedIndex();
        Integer id = Integer.parseInt(txtIdInscripcion.getText());
        String grup = null;
        if (grupo == 0) {
            grup = "A";
        }
        if (grupo == 2) {
            grup = "B";
        }
        
        if (!nia.isEmpty() | !ciclo.isEmpty()) {
            try {
                alumno.setNia(nia);
                alumno.setCicloEscolar(ciclo);
                alumno.setIdGrupo(grup);
                alumno.setIdGrado(grado + 1);
                alumno.setEstatus("INSCRIPCION");
                alumno.setIdAlumno(id);
                if (alumnoDAO.editarAlumnoInscrip(alumno)) {
                    JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Consulta su administrador");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al gurdar registro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos obligatorios");
        }
    }//GEN-LAST:event_txtGuardaInscripcionActionPerformed

    private void txtSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiguiente1ActionPerformed
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd");//dd/MM/yyyy
        listarAlumnosPreinscripcion(jTable3);
        Date hoy = new Date();
        txtFechaHoy2.setText(formateador.format(hoy).toString());
        listarAlumnosInscripcion(jTable5);
        CedulaRegistro.setVisible(true);
        CedulaRegistro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_txtSiguiente1ActionPerformed

    private void txtPreinscripcionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPreinscripcionMouseMoved
        txtPreinscripcion.setToolTipText("*PREINSCRIPCIÓN");
    }//GEN-LAST:event_txtPreinscripcionMouseMoved

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        Integer selec = jTable4.rowAtPoint(evt.getPoint());
        String Id = (String) jTable4.getValueAt(selec, 0);
        Integer intValue = Integer.parseInt(Id);
        System.out.println("id  intValue " + intValue);
        
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        Alumno alumno = alumnoDAO.getById(intValue);
        
        if (alumno != null) {
            txtNombreInsc.setText(alumno.getNombre());
            txtCurpInsc.setText(alumno.getCurp());
            txtIdInscripcion.setText(String.valueOf(alumno.getIdAlumno()));
        } else {
            JOptionPane.showMessageDialog(null, "Error consulte con su administrador");
        }

    }//GEN-LAST:event_jTable4MouseClicked
    
    public void listarAlumnosInscripcion(JTable tabla) {
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        DefaultTableModel model;
        String[] titulo = {"ID", "NIA", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO"};
        model = new DefaultTableModel(null, titulo);
        List<Alumno> datos = alumnoDAO.cedulaRegistroList();
        System.out.println("qeu entra ");
        String[] datosAlumno = new String[7];
        for (Alumno alum : datos) {
            datosAlumno[0] = alum.getIdAlumno() + "";
            datosAlumno[1] = alum.getNia() + "";
            datosAlumno[2] = alum.getNombre() + "";
            datosAlumno[3] = alum.getApellidoPat() + "";
            datosAlumno[4] = alum.getApellidoMat() + "";
            model.addRow(datosAlumno);
        }
        tabla.setModel(model);
        
    }
    

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        CedulaRegistro.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        Integer selec = jTable5.rowAtPoint(evt.getPoint());
        String Id = (String) jTable5.getValueAt(selec, 0);
        Integer intValue = Integer.parseInt(Id);
        System.out.println("id  intValue " + intValue);
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        Alumno alumno = alumnoDAO.getById(intValue);
        Integer idSex;
        if (alumno != null) {
            txtIdCedulaRegistro.setText(String.valueOf(alumno.getIdAlumno()));
            txtCicloEscolar.setText(alumno.getCicloEscolar());
            txtNiaInscripcion.setText(alumno.getNia());
            txtNombreSolicitudEcpecial1.setText(alumno.getNombre());
            txtPrimerApellido1.setText(alumno.getApellidoPat());
            txtSegundoApellido1.setText(alumno.getApellidoMat());
            txtCurpSolicitudEspecial2.setText(alumno.getCurp());
            String idsexo = alumno.getIdSexo();
            if (idsexo.equals("H")) {
                idSex = 0;
            } else {
                idSex = 1;
            }            
            cmbSexo2.setSelectedIndex(idSex);
            txtFecNacSolicitudPreins1.setText(String.valueOf(alumno.getFecNac()));
        } else {
            JOptionPane.showMessageDialog(null, "Error consulte con su administrador");
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void txtGuardarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarCedulaActionPerformed
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        Alumno alumno = new Alumno();
        String entidad = txtEntidadNacimiento.getText();
        String tipoSangre = txtTipoSangre.getText();
        String lenguaMaterna = txtLenguaMaterna.getText();
        Integer id = Integer.parseInt(txtIdCedulaRegistro.getText());
        
        if (!entidad.isEmpty() | !tipoSangre.isEmpty() | !lenguaMaterna.isEmpty()) {
            try {
                alumno.setEntidadNacimiento(entidad);
                alumno.setComunidadIndigena(lenguaMaterna);
                alumno.setEstatus("INSCRIPCIONCOMPLETA");
                alumno.setTipoSangre(tipoSangre);
                alumno.setIdAlumno(id);
                if (alumnoDAO.cedulaRegistro(alumno)) {
                    JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Consulta su administrador");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al gurdar registro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos obligatorios");
        } 
    }//GEN-LAST:event_txtGuardarCedulaActionPerformed

    private void txtCurpSolicitudEspecial3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpSolicitudEspecial3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpSolicitudEspecial3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String nia = txtNiaBaja.getText();
        if (!nia.isEmpty()) {
            try {
                buscaBaja(jTable6, nia);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al gurdar registro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos obligatorios");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed
    
    Integer idBaja = 0;    Integer idGlobal;
    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        Integer selec = jTable6.rowAtPoint(evt.getPoint());
        String Id = (String) jTable6.getValueAt(selec, 0);
        Integer intValue = Integer.parseInt(Id);
        System.out.println("id  intValue " + intValue);
        
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        Alumno alumno = alumnoDAO.getById(intValue);
        
        if (alumno != null) {
            idGlobal = alumno.getIdAlumno();
        } else {
            JOptionPane.showMessageDialog(null, "Error consulte con su administrador");
        }
        
    }//GEN-LAST:event_jTable6MouseClicked

    private void txtGuardarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarBajaActionPerformed
        if (rootPaneCheckingEnabled) {
            String descripcion = txtDescripcion.getText();
             if (!descripcion.isEmpty()) {
                 AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
                 if (alumnoDAO.bajaAlumno(idGlobal)) {
                      JOptionPane.showMessageDialog(null, "Baja correctamente");
                 }else{
                  JOptionPane.showMessageDialog(null, "Error consulte con su administrador");
                 }             
             }else{
                 JOptionPane.showMessageDialog(null, "Anotar una descripción");
             }            
        }else{
         JOptionPane.showMessageDialog(null, "Seleccionar alumno en la tabla ");
        }                             
    }//GEN-LAST:event_txtGuardarBajaActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        buscaAlumnos.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void txtGuardaInscripcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardaInscripcion1ActionPerformed
        short grupo = (short) cmbGrupoInscrBusca.getSelectedIndex();
        short grado = (short) cmbSemestreInscrBusca.getSelectedIndex();
        String grup = null;
        if (grupo == 0) {
            grup = "A";
        }
        if (grupo == 2) {
            grup = "B";
        }
        buscalumnoGrado(jTable7,grup,grado+1);
        
    }//GEN-LAST:event_txtGuardaInscripcion1ActionPerformed
    
     public void buscalumnoGrado(JTable tabla, String idGrupo,Integer idGrado) {
        
         AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        
        DefaultTableModel model;
        String[] titulo = {"ID", "NIA", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO"};
        model = new DefaultTableModel(null, titulo);
        List<Alumno> datos = alumnoDAO.getByGradGrup(idGrupo, idGrado);
        System.out.println("qeu entra ");
        String[] datosAlumno = new String[7];
        for (Alumno alum : datos) {
            datosAlumno[0] = alum.getIdAlumno() + "";
            datosAlumno[1] = alum.getNia() + "";
            datosAlumno[2] = alum.getNombre() + "";
            datosAlumno[3] = alum.getApellidoPat() + "";
            datosAlumno[4] = alum.getApellidoMat() + "";
            model.addRow(datosAlumno);
        }
        tabla.setModel(model);
        
    }

    
    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable7MouseClicked

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        reinscripcion.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void txtGuardaInscripcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardaInscripcion3ActionPerformed
         short grupo = (short) cmbGrupoInscrBusca1.getSelectedIndex();
        short grado = (short) cmbSemestreInscrBusca1.getSelectedIndex();
        String grup = null;
        if (grupo == 0) {
            grup = "A";
        }
        if (grupo == 2) {
            grup = "B";
        }
        buscalumnoGrado(jTable9,grup,grado+1);
    }//GEN-LAST:event_txtGuardaInscripcion3ActionPerformed

    private void txtGuardaInscripcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardaInscripcion4ActionPerformed
        /*AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        short grupo = (short) cmbGrupoInscrBusca3.getSelectedIndex();
        short grado = (short) cmbSemestreInscrBusca3.getSelectedIndex();
        Integer id = Integer.parseInt(niatxtt.getText());
        String grup = null;
        if (grupo == 0) {
            grup = "A";
        }
        if (grupo == 2) {
            grup = "B";
        }
        
        if (idGlobalCambioannio!=null) {
            alumnoDAO.cambiarAnnio(id, grup, grado+1);
            JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
        }else{
        JOptionPane.showMessageDialog(null, "Seleccionar alumno");
        }
        */
    }//GEN-LAST:event_txtGuardaInscripcion4ActionPerformed
    
    
    Integer idGlobalCambioannio;
    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        /*
        Integer selec = jTable9.rowAtPoint(evt.getPoint());
        String Id = (String) jTable9.getValueAt(selec, 0);
        Integer intValue = Integer.parseInt(Id);
        System.out.println("id  intValue " + intValue);
        
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        Alumno alumno = alumnoDAO.getById(intValue);
        
        if (alumno != null) {
            niatxtt.setText(String.valueOf(alumno.getIdAlumno()));       
            idGlobalCambioannio = alumno.getIdAlumno();
        } else {
            JOptionPane.showMessageDialog(null, "Error consulte con su administrador");
        } */
    }//GEN-LAST:event_jTable9MouseClicked

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void txtGuardaInscripcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardaInscripcion2ActionPerformed
       /*
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        String nia = txtNiaAlumno.getText();
        if (!nia.isEmpty()) {
            System.out.println("materias " + nia);
            Integer nia2=Integer.parseInt(nia);
            buscaMaterias(jTable8, nia2);
        }else{
            JOptionPane.showMessageDialog(null, "Ingersar nia");
        }
    }//GEN-LAST:event_txtGuardaInscripcion2ActionPerformed

       public void buscaMaterias(JTable tabla, Integer nia) {
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        DefaultTableModel model;
        String[] titulo = {"ID ALUMNO","ID MATERIA","ID MATERIA SEMESTRE", "MATERIA", };
        model = new DefaultTableModel(null, titulo);
         List<AlumnoMaterias> datos = alumnoDAO.getmaterias(nia);
        System.out.println("qeu entra ");
        String[] datosAlumno = new String[4];
        for (AlumnoMaterias alum : datos) {
            datosAlumno[0] = alum.getIdAlumno() + "";
            datosAlumno[1] = alum.getIdMateria() + "";
            datosAlumno[2] = alum.getIdMateriaSemestre() + "";
            datosAlumno[3] = alum.getNombreMateria() + "";
            model.addRow(datosAlumno);
        }
        tabla.setModel(model);
        */
    }
    
    Integer idMateriaSemGlobalCalif;
    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        Integer selec = jTable8.rowAtPoint(evt.getPoint());
        String alumno = (String) jTable8.getValueAt(selec, 0);
        String materia = (String) jTable8.getValueAt(selec, 1);
        String materiaSem = (String) jTable8.getValueAt(selec, 2);
        Integer idAlumno = Integer.parseInt(alumno);
        Integer idMateria = Integer.parseInt(materia);
        Integer idMateriaSem = Integer.parseInt(materiaSem);
        System.out.println("idAlumno " + idAlumno+" idMateria "+idMateria+ "idMateriaSem "+idMateriaSem);
        idMateriaSemGlobalCalif=idMateriaSem;
        buscaCalificacionMateria(jTable10, idMateria,idAlumno);
        txtIdAlumnoCa.setText(idAlumno.toString());
        MATERIATXT.setText(materia);
        
    }//GEN-LAST:event_jTable8MouseClicked

     public void buscaCalificacionMateria(JTable tabla, Integer idMateria,Integer IdAlumno) {
        /*
        AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);
        DefaultTableModel model;
        String[] titulo = {"UNIDAD", "CALIFICACION"};
        model = new DefaultTableModel(null, titulo);
        List<CalificacionesAlumno> datos = alumnoDAO.getmaterias(IdAlumno,idMateria);
        System.out.println("qeu entra ");
        String[] datosAlumno = new String[2];
        for (CalificacionesAlumno alum : datos) {
            datosAlumno[0] = alum.getUnidad() + "";
            datosAlumno[1] = alum.getCalificacion() + "";
            model.addRow(datosAlumno);
        }
        tabla.setModel(model);
        */
    }
     
    private void txtPreinscripcion1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPreinscripcion1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreinscripcion1MouseMoved

    private void txtPreinscripcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreinscripcion1ActionPerformed
        AsignaCalificacion.setVisible(true);
        this.dispose();
        AsignaCalificacion.setLocationRelativeTo(null);
    }//GEN-LAST:event_txtPreinscripcion1ActionPerformed

    private void txtNiaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNiaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNiaAlumnoActionPerformed

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable10MouseClicked

    private void txtGuardaCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardaCalificacionActionPerformed
       /*
        String calif = txtCalificacion.getText(); 
        String alumnoId = txtIdAlumnoCa.getText();
        Integer grado = (Integer) jComboBox1.getSelectedIndex();
        String materi = MATERIATXT.getText();
        
        if (!calif.isEmpty()) {
           AlumnoDAO alumnoDAO = context.getBean(AlumnoDAO.class);  
            Calificaciones calificacion = new Calificaciones();
            calificacion.setIdAlumno(Integer.parseInt(alumnoId));
            calificacion.setIdMateriaSemestreCali(idMateriaSemGlobalCalif);
            calificacion.setCalificacion(Integer.parseInt(calif));
            calificacion.setIdUnidad(grado+1);
            if (alumnoDAO.guardaCalificacion(calificacion)) {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                buscaCalificacionMateria(jTable10, Integer.parseInt(materi),Integer.parseInt(alumnoId));
            }else{
            JOptionPane.showMessageDialog(null, "Error consulte con su administrador");
            }                  
        }else{
         JOptionPane.showMessageDialog(null, "Calificación requerida");
        }
        
        */
        
    }//GEN-LAST:event_txtGuardaCalificacionActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
/*       
        Conexion hc;
        try {
            hc = new Conexion();
            short grupo = (short) cmbGrupoAsistencia.getSelectedIndex();
            short grado = (short) cmbSemestreAsistencia.getSelectedIndex();
            String grup = null;
            if (grupo == 0) {
                grup = "A";
            }
            if (grupo == 2) {
                grup = "B";
            }
            Asistencia asistencia = new Asistencia();
            asistencia.ReportesCedulaMovimiento("REPORTE", grup, grado+1);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error al iniciar");
        }
*/
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
          /*  String nia = txtNiaReporte.getText();
        if (!nia.isEmpty()) {
            CedulaMovimiento cedulaMovimiento = new CedulaMovimiento();
            cedulaMovimiento.ReportesCedulaMovimiento(nia);
        } else {
            JOptionPane.showMessageDialog(null, "Ingersar nia"); 
        }*/
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        /*
        String nia = txtNiaReporTrEGISTRO.getText();
        if (!nia.isEmpty()) {
            CedulaRegistroAlumno cedulaMovimiento = new CedulaRegistroAlumno();
            cedulaMovimiento.ReportesCedulaMovimiento(nia); 
        } else {
            JOptionPane.showMessageDialog(null, "Ingersar nia"); 
        }
        */
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        venPrinc vp = new venPrinc();
        vp.setVisible(true);
        vp.idUser.setText("");
        vp.passwordUser.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed
    
    public void buscaBaja(JTable tabla, String nia) {
        
        AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl();
        DefaultTableModel model;
        String[] titulo = {"ID", "NIA", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO"};
        model = new DefaultTableModel(null, titulo);
        List<Alumno> datos = alumnoDAO.buscarBaja(nia);
        System.out.println("qeu entra ");
        String[] datosAlumno = new String[7];
        for (Alumno alum : datos) {
            datosAlumno[0] = alum.getIdAlumno() + "";
            datosAlumno[1] = alum.getNia() + "";
            datosAlumno[2] = alum.getNombre() + "";
            datosAlumno[3] = alum.getApellidoPat() + "";
            datosAlumno[4] = alum.getApellidoMat() + "";
            model.addRow(datosAlumno);
        }
        tabla.setModel(model);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
                
            }
        }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Opciones.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Opciones().setVisible(true);
               
            }
        });
    }
    
    public synchronized boolean isContinuar(boolean continuar) {
        return continuar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AsignaCalificacion;
    private javax.swing.JDialog Bajas;
    private javax.swing.JDialog CedulaRegistro;
    private javax.swing.JFrame Estadisticas;
    private javax.swing.JTextField FOLIO;
    private javax.swing.JTextField MATERIATXT;
    private javax.swing.JTextField Municipio;
    private javax.swing.JDialog SolicitudPreinscripcion;
    private javax.swing.JButton btnPassword;
    private javax.swing.JFrame buscaAlumnos;
    private javax.swing.JComboBox cmbDialecto;
    private javax.swing.JComboBox cmbEntidad;
    private javax.swing.JComboBox cmbGrupo;
    private javax.swing.JComboBox cmbGrupoAsistencia;
    private javax.swing.JComboBox cmbGrupoInscr;
    private javax.swing.JComboBox cmbGrupoInscrBusca;
    private javax.swing.JComboBox cmbGrupoInscrBusca1;
    private javax.swing.JComboBox cmbGrupoInscrBusca2;
    private javax.swing.JComboBox cmbGrupoInscrBusca3;
    private javax.swing.JComboBox cmbSemestre;
    private javax.swing.JComboBox cmbSemestreAsistencia;
    private javax.swing.JComboBox cmbSemestreInscr;
    private javax.swing.JComboBox cmbSemestreInscrBusca;
    private javax.swing.JComboBox cmbSemestreInscrBusca1;
    private javax.swing.JComboBox cmbSemestreInscrBusca2;
    private javax.swing.JComboBox cmbSemestreInscrBusca3;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JComboBox cmbSexo1;
    private javax.swing.JComboBox cmbSexo2;
    private javax.swing.JComboBox cmbSexo3;
    private javax.swing.JTextField cpTutor;
    private javax.swing.JTextField cronicadegenera;
    private javax.swing.JButton doPedido;
    private javax.swing.JTextField edadSep;
    private javax.swing.JTextField email;
    private javax.swing.JTextField entidadtxt;
    private javax.swing.JLabel fac;
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton guardarInfo;
    private javax.swing.JButton infoMeseros;
    private javax.swing.JFrame inscripcion;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTextField localidadTutor;
    private javax.swing.JLabel nameMesero;
    private javax.swing.JLabel nameMesero1;
    private javax.swing.JLabel nameMesero10;
    private javax.swing.JLabel nameMesero11;
    private javax.swing.JLabel nameMesero12;
    private javax.swing.JLabel nameMesero13;
    private javax.swing.JLabel nameMesero14;
    private javax.swing.JLabel nameMesero15;
    private javax.swing.JLabel nameMesero16;
    private javax.swing.JLabel nameMesero17;
    private javax.swing.JLabel nameMesero18;
    private javax.swing.JLabel nameMesero19;
    private javax.swing.JLabel nameMesero2;
    private javax.swing.JLabel nameMesero20;
    private javax.swing.JLabel nameMesero21;
    private javax.swing.JLabel nameMesero22;
    private javax.swing.JLabel nameMesero23;
    private javax.swing.JLabel nameMesero24;
    private javax.swing.JLabel nameMesero25;
    private javax.swing.JLabel nameMesero26;
    private javax.swing.JLabel nameMesero27;
    private javax.swing.JLabel nameMesero28;
    private javax.swing.JLabel nameMesero29;
    private javax.swing.JLabel nameMesero3;
    private javax.swing.JLabel nameMesero31;
    private javax.swing.JLabel nameMesero32;
    private javax.swing.JLabel nameMesero33;
    private javax.swing.JLabel nameMesero34;
    private javax.swing.JLabel nameMesero4;
    private javax.swing.JLabel nameMesero5;
    private javax.swing.JLabel nameMesero6;
    private javax.swing.JLabel nameMesero7;
    private javax.swing.JLabel nameMesero8;
    private javax.swing.JLabel nameMesero8labelCurp;
    private javax.swing.JLabel nameMesero9;
    private javax.swing.JTextField niatxtt;
    private javax.swing.JDialog nuevoAlumno;
    private javax.swing.JButton pagos1;
    private javax.swing.JFrame password;
    private javax.swing.JFrame preinscripcion;
    private javax.swing.JFrame reinscripcion;
    private javax.swing.JTextField txtApellidoMaternoP1;
    private javax.swing.JTextField txtApellidoMaternotutor;
    private javax.swing.JTextField txtApellidoPaternoP;
    private javax.swing.JTextField txtApellidoPaternotutor;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCalleNumero;
    private javax.swing.JTextField txtCalleNumero1;
    private javax.swing.JTextField txtCct;
    private javax.swing.JTextField txtCicloEscolar;
    private javax.swing.JTextField txtCicloEscolarInsc;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtColoniaEsc;
    private javax.swing.JTextField txtColoniatutor;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtCurpInsc;
    private javax.swing.JTextField txtCurpSolicitudEspecial;
    private javax.swing.JTextField txtCurpSolicitudEspecial2;
    private javax.swing.JTextField txtCurpSolicitudEspecial3;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDiscap;
    private javax.swing.JTextField txtEdadActual;
    private javax.swing.JTextField txtEduccionEsp;
    private javax.swing.JTextField txtEntidadEsc;
    private javax.swing.JTextField txtEntidadNacimiento;
    private javax.swing.JTextField txtEntidadtu;
    private javax.swing.JTextField txtExterior;
    private javax.swing.JTextField txtFecNacSolicitudPreins;
    private javax.swing.JTextField txtFecNacSolicitudPreins1;
    private javax.swing.JTextField txtFecNacSolicitudPreins2;
    private javax.swing.JLabel txtFechaHoy;
    private javax.swing.JLabel txtFechaHoy2;
    private javax.swing.JButton txtGuardaCalificacion;
    private javax.swing.JButton txtGuardaInscripcion;
    private javax.swing.JButton txtGuardaInscripcion1;
    private javax.swing.JButton txtGuardaInscripcion2;
    private javax.swing.JButton txtGuardaInscripcion3;
    private javax.swing.JButton txtGuardaInscripcion4;
    private javax.swing.JButton txtGuardaPreinscripcion;
    private javax.swing.JButton txtGuardarBaja;
    private javax.swing.JButton txtGuardarCedula;
    private javax.swing.JButton txtGuardarSolicitud;
    private javax.swing.JTextField txtIdAlumnoCa;
    private javax.swing.JTextField txtIdCedulaRegistro;
    private javax.swing.JTextField txtIdInscripcion;
    private javax.swing.JTextField txtIdSOlicitudPreinscripcion;
    private javax.swing.JTextField txtInterior;
    private javax.swing.JTextField txtLenguaMaterna;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtMunicipioTutor;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNia;
    private javax.swing.JTextField txtNiaAlumno;
    private javax.swing.JTextField txtNiaBaja;
    private javax.swing.JTextField txtNiaInsc;
    private javax.swing.JTextField txtNiaInscripcion;
    private javax.swing.JTextField txtNiaReporTrEGISTRO;
    private javax.swing.JTextField txtNiaReporte;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreInsc;
    private javax.swing.JTextField txtNombreSolicitante;
    private javax.swing.JTextField txtNombreSolicitudEcpecial;
    private javax.swing.JTextField txtNombreSolicitudEcpecial1;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JButton txtPreinscripcion;
    private javax.swing.JButton txtPreinscripcion1;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerApellido1;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoApellido1;
    private javax.swing.JButton txtSiguiente1;
    private javax.swing.JTextField txtSocial;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoSangre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcurpP;
    private javax.swing.JTextField txtnombreEscu;
    private javax.swing.JTextField txtnombreP;
    private javax.swing.JTextField txtnombretutor;
    public javax.swing.JButton verCocina;
    public javax.swing.JButton verEstadisticas;
    private javax.swing.JButton verMenu;
    // End of variables declaration//GEN-END:variables
}
