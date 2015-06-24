package Veterinaria;

/**
 * @author reydi
 */
public class frmVeterinaria extends javax.swing.JFrame {
    

    public frmVeterinaria() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        btnConsultarCliente1 = new javax.swing.JButton();
        btnEliminarCliente1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarCliente1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnConsultarPersona = new javax.swing.JButton();
        btnEliminarPersona = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarPersona = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ConsultarMascota = new javax.swing.JButton();
        btnEliminarMascota = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarMascota = new javax.swing.JButton();
        btnRegistroCitas = new javax.swing.JButton();
        btnFechaVacunaciones = new javax.swing.JButton();
        btnHistorialMedico = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        persona = new javax.swing.JMenuItem();
        mascota = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnConsultarCliente1.setText("Consultar");

        btnEliminarCliente1.setText("Eliminar");

        jLabel2.setText("Cliente");

        btnAgregarCliente1.setText("Agregar");
        btnAgregarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(btnAgregarCliente1)
                .addGap(41, 41, 41)
                .addComponent(btnConsultarCliente1)
                .addGap(53, 53, 53)
                .addComponent(btnEliminarCliente1)
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnAgregarCliente1)
                    .addComponent(btnConsultarCliente1)
                    .addComponent(btnEliminarCliente1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel4);
        jPanel4.setBounds(210, 140, 550, 73);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnConsultarPersona.setText("Consultar");

        btnEliminarPersona.setText("Eliminar");

        jLabel4.setText("Persona");

        btnAgregarPersona.setText("Agregar");
        btnAgregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(btnAgregarPersona)
                .addGap(41, 41, 41)
                .addComponent(btnConsultarPersona)
                .addGap(53, 53, 53)
                .addComponent(btnEliminarPersona)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnAgregarPersona)
                    .addComponent(btnConsultarPersona)
                    .addComponent(btnEliminarPersona))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel2);
        jPanel2.setBounds(210, 240, 551, 73);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ConsultarMascota.setText("Consultar");

        btnEliminarMascota.setText("Eliminar");

        jLabel5.setText("Mascota");

        btnAgregarMascota.setText("Agregar");
        btnAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(btnAgregarMascota)
                .addGap(41, 41, 41)
                .addComponent(ConsultarMascota)
                .addGap(53, 53, 53)
                .addComponent(btnEliminarMascota)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnAgregarMascota)
                    .addComponent(ConsultarMascota)
                    .addComponent(btnEliminarMascota))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel3);
        jPanel3.setBounds(210, 350, 552, 73);

        btnRegistroCitas.setText("Registro de Citas");
        desktopPane.add(btnRegistroCitas);
        btnRegistroCitas.setBounds(840, 160, 180, 25);

        btnFechaVacunaciones.setText("Fecha de Vacunaciones");
        desktopPane.add(btnFechaVacunaciones);
        btnFechaVacunaciones.setBounds(840, 270, 180, 25);

        btnHistorialMedico.setText("Historial medico");
        desktopPane.add(btnHistorialMedico);
        btnHistorialMedico.setBounds(840, 380, 180, 25);

        jMenu2.setText("Inicio");

        jMenuItem4.setText("Registro General");
        jMenu2.add(jMenuItem4);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(exitMenuItem);

        menuBar.add(jMenu2);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Nuevo");

        cliente.setMnemonic('o');
        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        fileMenu.add(cliente);

        persona.setMnemonic('s');
        persona.setText("Persona");
        persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaActionPerformed(evt);
            }
        });
        fileMenu.add(persona);

        mascota.setMnemonic('a');
        mascota.setText("Mascota");
        mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotaActionPerformed(evt);
            }
        });
        fileMenu.add(mascota);

        menuBar.add(fileMenu);

        jMenu1.setText("Citas");

        jMenuItem1.setText("Registro de citas");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Vacunacion");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Historial Medico");
        jMenu1.add(jMenuItem3);

        menuBar.add(jMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        frmInsertarCliente insert = new frmInsertarCliente();
        insert.setVisible(true);
        desktopPane.add(insert);
    }//GEN-LAST:event_clienteActionPerformed

    private void mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotaActionPerformed
        frmInsertarMascota insert = new frmInsertarMascota();
        insert.setVisible(true);
        desktopPane.add(insert);
        
    }//GEN-LAST:event_mascotaActionPerformed

    private void personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaActionPerformed
        frmInsertarPersona insert = new frmInsertarPersona();
        insert.setVisible(true);
        desktopPane.add(insert);
    }//GEN-LAST:event_personaActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        frmInsertarCliente insert = new frmInsertarCliente();
        insert.setVisible(true);
        desktopPane.add(insert);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAgregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPersonaActionPerformed
        frmInsertarPersona insert = new frmInsertarPersona();
        insert.setVisible(true);
        desktopPane.add(insert);
    }//GEN-LAST:event_btnAgregarPersonaActionPerformed

    private void btnAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMascotaActionPerformed
        frmInsertarMascota insert = new frmInsertarMascota();
        insert.setVisible(true);
        desktopPane.add(insert);
    }//GEN-LAST:event_btnAgregarMascotaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarMascota;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCliente1;
    private javax.swing.JButton btnAgregarMascota;
    private javax.swing.JButton btnAgregarPersona;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarCliente1;
    private javax.swing.JButton btnConsultarPersona;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarCliente1;
    private javax.swing.JButton btnEliminarMascota;
    private javax.swing.JButton btnEliminarPersona;
    private javax.swing.JButton btnFechaVacunaciones;
    private javax.swing.JButton btnHistorialMedico;
    private javax.swing.JButton btnRegistroCitas;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem mascota;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem persona;
    // End of variables declaration//GEN-END:variables

}
