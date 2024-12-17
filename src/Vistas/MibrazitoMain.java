/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.event.ActionListener;

/**
 *
 * @author ild_37
 */
public class MibrazitoMain extends javax.swing.JFrame {

    /**
     * Creates new form MibrazitoMain
     */
    public MibrazitoMain() {
        initComponents();
        Acciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAjustes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        BtnAjustes.setText("Ajustes");
        getContentPane().add(BtnAjustes, java.awt.BorderLayout.LINE_END);

        jMenu1.setText("Añadir");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Eliminar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Nuevo");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAjustes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
  /**
     * Asocia un `ActionListener` al botón de ajustes.
     * 
     * @param l el `ActionListener` que manejará los eventos del botón.
     */
    public void ClickBtnAjustes(ActionListener l) {
        BtnAjustes.addActionListener(l);
    }

    /**
     * Configura el comando de acción para el botón de ajustes.
     */
    public void Acciones() {
        BtnAjustes.setActionCommand("Ajustes");
    }

}


