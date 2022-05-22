/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author L E D E S M A
 */
public class Vista extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    public Vista() {
        initComponents();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cboletos = new javax.swing.JMenuItem();
        Cpeliculas = new javax.swing.JMenuItem();
        CUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Eboletos = new javax.swing.JMenuItem();
        Epeliculas = new javax.swing.JMenuItem();
        Eusuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Constantia", 3, 48)); // NOI18N
        jLabel1.setText("Cine Juco");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/archivo-nuevo.png"))); // NOI18N
        jMenu1.setText("Crear");

        Cboletos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cboletos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/boleto.png"))); // NOI18N
        Cboletos.setText("Boletos");
        Cboletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboletosActionPerformed(evt);
            }
        });
        jMenu1.add(Cboletos);

        Cpeliculas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cpeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pelicula.png"))); // NOI18N
        Cpeliculas.setText("Peliculas");
        Cpeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpeliculasActionPerformed(evt);
            }
        });
        jMenu1.add(Cpeliculas);

        CUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/usuario.png"))); // NOI18N
        CUsuarios.setText("Usuarios");
        CUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(CUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/editar.png"))); // NOI18N
        jMenu2.setText("Editar / Buscar / Eliminar");

        Eboletos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Eboletos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/boleto.png"))); // NOI18N
        Eboletos.setText("Boletos");
        Eboletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EboletosActionPerformed(evt);
            }
        });
        jMenu2.add(Eboletos);

        Epeliculas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Epeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pelicula.png"))); // NOI18N
        Epeliculas.setText("Peliculas");
        Epeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpeliculasActionPerformed(evt);
            }
        });
        jMenu2.add(Epeliculas);

        Eusuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Eusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/usuario.png"))); // NOI18N
        Eusuarios.setText("Usuarios");
        Eusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EusuariosActionPerformed(evt);
            }
        });
        jMenu2.add(Eusuarios);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CboletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboletosActionPerformed
        // TODO add your handling code here:
        Crear_boleto ver_ventana = new Crear_boleto();
        escritorio.add(ver_ventana);
        ver_ventana.show();
    }//GEN-LAST:event_CboletosActionPerformed

    private void EboletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EboletosActionPerformed
        // TODO add your handling code here:
        Informacion_boleto ver_ventana = new Informacion_boleto();
        escritorio.add(ver_ventana);
        ver_ventana.show();
    }//GEN-LAST:event_EboletosActionPerformed

    private void EusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EusuariosActionPerformed
        // TODO add your handling code here:
        informacion_usuario ver_ventana = new informacion_usuario();
        escritorio.add(ver_ventana);
        ver_ventana.show();
    }//GEN-LAST:event_EusuariosActionPerformed

    private void CUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUsuariosActionPerformed
        // TODO add your handling code here:
        Crear_usuario ver_ventana = new Crear_usuario();
        escritorio.add(ver_ventana);
        ver_ventana.show();
    }//GEN-LAST:event_CUsuariosActionPerformed

    private void CpeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpeliculasActionPerformed
        // TODO add your handling code here:
        Crear_pelicula ver_ventana = new Crear_pelicula();
        escritorio.add(ver_ventana);
        ver_ventana.show();
    }//GEN-LAST:event_CpeliculasActionPerformed

    private void EpeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EpeliculasActionPerformed
        // TODO add your handling code here:
        informacion_pelicula ver_ventana = new informacion_pelicula();
        escritorio.add(ver_ventana);
        ver_ventana.show();
    }//GEN-LAST:event_EpeliculasActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CUsuarios;
    private javax.swing.JMenuItem Cboletos;
    private javax.swing.JMenuItem Cpeliculas;
    private javax.swing.JMenuItem Eboletos;
    private javax.swing.JMenuItem Epeliculas;
    private javax.swing.JMenuItem Eusuarios;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
