
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author 50488
 */
public class Entrar_un_perfil extends javax.swing.JFrame {

    /**
     * Creates new form Entrar_un_perfil
     */
    public Entrar_un_perfil() {
        initComponents();

    }
    Gestion_Cuenta gestionCuentas = new Gestion_Cuenta();
   public void actualizarInterfaz() {
    UsuarioInfo usuarioLogueado = user_actual.getUsuarioActual();
    String perfil = buscarPerfil.getText();
    UsuarioInfo cuentaInfo = gestionCuentas.obtenerInformacion(perfil);
    
    if (usuarioLogueado != null && cuentaInfo != null) {
        seguidos.setText("Seguidos: " + usuarioLogueado.getSeguidos().cantidadSeguidos());
        seguidores.setText("Seguidores: " + cuentaInfo.getSeguidores());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarPerfil = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        seguir = new javax.swing.JButton();
        dejar_de_seguir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        seguidores = new javax.swing.JLabel();
        seguidos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setText("Entrar a un perfil");

        jLabel2.setText("INGRESE EL PERFIL:");

        buscar.setText("BUSCAR");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\50488\\Downloads\\que loco.png")); // NOI18N

        nombre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        nombre.setText("nombre");

        user.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        user.setText("usuario");

        genero.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        genero.setText("genero");

        edad.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        edad.setText("edad");

        fecha.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        fecha.setText("fecha");

        seguir.setText("seguir");
        seguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seguirMouseClicked(evt);
            }
        });

        dejar_de_seguir.setText("dejar de seguir");
        dejar_de_seguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dejar_de_seguirMouseClicked(evt);
            }
        });

        jButton1.setText("volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        seguidores.setText("seguidores:");

        seguidos.setText("seguidos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)))
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(562, 562, 562)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(583, 583, 583)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(dejar_de_seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(seguidores, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(seguidos, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seguidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seguidores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dejar_de_seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked


    }//GEN-LAST:event_buscarMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String perfil = buscarPerfil.getText();
        UsuarioInfo usuarioActual = user_actual.getUsuarioActual();
        if (perfil.equals(usuarioActual.getusuario())) {
            JOptionPane.showMessageDialog(null, "No puedes ver tu propio perfil aquí.");
            return;
        }
        if (gestionCuentas.verificar(perfil)) {
            UsuarioInfo info = gestionCuentas.obtenerInformacion(perfil);
            if (info != null) {
                user.setText(info.getusuario());
                nombre.setText(info.getnombre());
                edad.setText(info.getedad());
                fecha.setText(info.getfecha());
                genero.setText(info.getgenero());

                seguidores.setText("Seguidores: " + info.getSeguidores());
                seguidos.setText("Seguidos: " + info.getSeguidos().cantidadSeguidos());
            } else {
                user.setText("No encontrado");
                nombre.setText("No encontrado");
                edad.setText("No encontrado");
                fecha.setText("No encontrado");
                genero.setText("No encontrado");

                seguidores.setText("Seguidores: ");
                seguidos.setText("Seguidos: ");
            }
        } else {
            user.setText("Usuario no existe");
            nombre.setText("");
            edad.setText("");
            fecha.setText("");
            genero.setText("");

            // Limpiar la información de seguidores y seguidos
            seguidores.setText("Seguidores: ");
            seguidos.setText("Seguidos: ");
        }


    }//GEN-LAST:event_buscarActionPerformed

    private void dejar_de_seguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dejar_de_seguirMouseClicked
    String perfil = buscarPerfil.getText();
UsuarioInfo usuarioLogueado = user_actual.getUsuarioActual();
UsuarioInfo cuentaADejarDeSeguir = gestionCuentas.obtenerInformacion(perfil);

if (cuentaADejarDeSeguir != null && !perfil.equals(usuarioLogueado.getusuario())) {
    int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas dejar de seguir a " + cuentaADejarDeSeguir.getusuario() + "?", "Confirmar", JOptionPane.YES_NO_OPTION);

    if (opcion == JOptionPane.YES_OPTION) {
        usuarioLogueado.dejarDeSeguir(cuentaADejarDeSeguir);
        JOptionPane.showMessageDialog(null, "Has dejado de seguir a " + cuentaADejarDeSeguir.getusuario());
        // Llamar al método que actualiza la interfaz gráfica
        actualizarInterfaz(); // Llama a un método para actualizar la UI
    }
} else if (perfil.equals(usuarioLogueado.getusuario())) {
    JOptionPane.showMessageDialog(null, "No puedes dejar de seguirte a ti mismo.");
} else {
    JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
}
    }//GEN-LAST:event_dejar_de_seguirMouseClicked

    private void seguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguirMouseClicked
     String perfil = buscarPerfil.getText();
UsuarioInfo usuarioLogueado = user_actual.getUsuarioActual();
UsuarioInfo cuentaASeguir = gestionCuentas.obtenerInformacion(perfil);

if (cuentaASeguir != null && !perfil.equals(usuarioLogueado.getusuario())) {
    int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas seguir a " + cuentaASeguir.getusuario() + "?", "Confirmar", JOptionPane.YES_NO_OPTION);

    if (opcion == JOptionPane.YES_OPTION) {
        usuarioLogueado.seguirUsuario(cuentaASeguir);
        JOptionPane.showMessageDialog(null, "Ahora sigues a " + cuentaASeguir.getusuario());
        // Llamar al método que actualiza la interfaz gráfica
        actualizarInterfaz(); // Llama a un método para actualizar la UI
    }
} else if (perfil.equals(usuarioLogueado.getusuario())) {
    JOptionPane.showMessageDialog(null, "No puedes seguirte a ti mismo.");
} else {
    JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
}

    }//GEN-LAST:event_seguirMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        menu_principal xdd = new menu_principal();
        xdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField buscarPerfil;
    private javax.swing.JButton dejar_de_seguir;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel seguidores;
    private javax.swing.JLabel seguidos;
    private javax.swing.JButton seguir;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
