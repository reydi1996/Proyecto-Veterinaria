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
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mascota;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem persona;
    // End of variables declaration//GEN-END:variables

}
