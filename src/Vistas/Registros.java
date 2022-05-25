/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Controladores.controlador_boleto;
import Controladores.controlador_pelicula;
import Controladores.controlador_usuario;
import Modelos.Boleto;
import Modelos.Pelicula;
import Modelos.Usuario;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jero7
 */
public class Registros extends javax.swing.JInternalFrame {
    controlador_boleto miControlador_boleto;
    controlador_pelicula miControlador_pelicula;
    controlador_usuario miControlador_usuario;
    /**
     * Creates new form Registros
     */
    public Registros() {
        initComponents();
        String urlServidor = "http://127.0.0.1:8080";
        this.miControlador_boleto = new controlador_boleto(urlServidor, "/boletos");
        this.miControlador_pelicula = new controlador_pelicula(urlServidor, "/peliculas");
        this.miControlador_usuario = new controlador_usuario(urlServidor, "/usuarios");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Boletos", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("Peliculas", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane1.addTab("Usuarios", jScrollPane3);

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registros");

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ActualizarTablaBoletos() {
        String TitulosColumnas[] = {"Valor","Tipo","Cedula usuario","Fecha de funcion","Letra y numero de silla"};
        DefaultTableModel miModelo = new DefaultTableModel(null, TitulosColumnas);
        this.jTable1.setModel(miModelo);
        LinkedList<Boleto> lista = this.miControlador_boleto.listar();
        if(lista != null){
            for (Boleto actual:lista) {
                String fila[] = new String[TitulosColumnas.length];
                fila[0] = ""+actual.getValor();
                fila[1] = actual.getTipo();
                fila[2] = actual.getMiUsuario().getCedula();
                fila[3] = actual.getMiFuncion().getDia()+" / "+actual.getMiFuncion().getMes()+" / "+actual.getMiFuncion().getAno();
                fila[4] = actual.getMiSilla().getLetra() + " # " + actual.getMiSilla().getNumero();
                miModelo.addRow(fila);
        }
        }else{
            JOptionPane.showMessageDialog(null,"Aún no hay registrados boletos");
        }
        
    }
public void ActualizarTablaPeliculas() {
        String TitulosColumnas[] = {"Nombre", "Año", "Tipo"};
        DefaultTableModel miModelo = new DefaultTableModel(null, TitulosColumnas);
        this.jTable2.setModel(miModelo);
        LinkedList<Pelicula> lista = miControlador_pelicula.listar();
        if(lista != null){
            for (Pelicula actual:lista) {
            String fila[] = new String[TitulosColumnas.length];
            fila[0] = actual.getNombre();
            fila[1] = ""+actual.getAno();
            fila[2] = actual.getTipo();
            miModelo.addRow(fila);
        }
        }else{
            JOptionPane.showMessageDialog(null,"Aún no hay registradas peliculas");
        }
    }
public void ActualizarTablaUsuarios() {
        String TitulosColumnas[] = {"Nombre", "Cédula", "E-mail","Año de nacimiento"};
        DefaultTableModel miModelo = new DefaultTableModel(null, TitulosColumnas);
        this.jTable3.setModel(miModelo);
        LinkedList<Usuario> lista = miControlador_usuario.listar();
        if(lista != null){
            for (Usuario actual:lista) {
            String fila[] = new String[TitulosColumnas.length];
            fila[0] = actual.getNombre();
            fila[1] = actual.getCedula();
            fila[2] = actual.getEmail();
            fila[3] = ""+actual.getAnoNacimiento();
            miModelo.addRow(fila);
        }
        }else{
            JOptionPane.showMessageDialog(null,"Aún no hay registrados usuarios");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        ActualizarTablaPeliculas();
        ActualizarTablaUsuarios();
        ActualizarTablaBoletos();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
