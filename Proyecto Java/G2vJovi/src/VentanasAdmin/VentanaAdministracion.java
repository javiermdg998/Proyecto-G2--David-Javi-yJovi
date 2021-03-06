/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasAdmin;

import g2vjovi.*;

/**
 *
 * @author 1gprog02
 */
public class VentanaAdministracion extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaAdministracion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mAdminCentros = new javax.swing.JMenu();
        mBuscarCentro = new javax.swing.JMenuItem();
        mNuevoCentro = new javax.swing.JMenuItem();
        mModificarCentro = new javax.swing.JMenuItem();
        mBorrarCentro = new javax.swing.JMenuItem();
        mAdministrarTrabajadores = new javax.swing.JMenu();
        mBuscarTrabajador = new javax.swing.JMenuItem();
        mNuevoTrabajador = new javax.swing.JMenuItem();
        mModificarTrabajador = new javax.swing.JMenuItem();
        mBorrarTrabajador = new javax.swing.JMenuItem();
        jmPerfil = new javax.swing.JMenu();
        mActualizarPerfil = new javax.swing.JMenuItem();
        mVehiculos = new javax.swing.JMenu();
        jmvehiculos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Himevico.png"))); // NOI18N

        mAdminCentros.setText("Administrar Centros");

        mBuscarCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/findIcon.png"))); // NOI18N
        mBuscarCentro.setText("Buscar Centro");
        mBuscarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBuscarCentroActionPerformed(evt);
            }
        });
        mAdminCentros.add(mBuscarCentro);

        mNuevoCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/newIcon.png"))); // NOI18N
        mNuevoCentro.setText("Nuevo Centro");
        mNuevoCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevoCentroActionPerformed(evt);
            }
        });
        mAdminCentros.add(mNuevoCentro);

        mModificarCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/modifyIcon.png"))); // NOI18N
        mModificarCentro.setText("Modificar Centro");
        mModificarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificarCentroActionPerformed(evt);
            }
        });
        mAdminCentros.add(mModificarCentro);

        mBorrarCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/deleteIcon.png"))); // NOI18N
        mBorrarCentro.setText("Borrar Centro");
        mBorrarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBorrarCentroActionPerformed(evt);
            }
        });
        mAdminCentros.add(mBorrarCentro);

        jMenuBar1.add(mAdminCentros);

        mAdministrarTrabajadores.setText("Administrar Trabajadores");

        mBuscarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/findIcon.png"))); // NOI18N
        mBuscarTrabajador.setText("Buscar Trabajador");
        mBuscarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBuscarTrabajadorActionPerformed(evt);
            }
        });
        mAdministrarTrabajadores.add(mBuscarTrabajador);

        mNuevoTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/newIcon.png"))); // NOI18N
        mNuevoTrabajador.setText("Nuevo Trabajador");
        mNuevoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevoTrabajadorActionPerformed(evt);
            }
        });
        mAdministrarTrabajadores.add(mNuevoTrabajador);

        mModificarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/modifyIcon.png"))); // NOI18N
        mModificarTrabajador.setText("Modificar Trabajador");
        mModificarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificarTrabajadorActionPerformed(evt);
            }
        });
        mAdministrarTrabajadores.add(mModificarTrabajador);

        mBorrarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/deleteIcon.png"))); // NOI18N
        mBorrarTrabajador.setText("Borrar Trabajador");
        mBorrarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBorrarTrabajadorActionPerformed(evt);
            }
        });
        mAdministrarTrabajadores.add(mBorrarTrabajador);

        jMenuBar1.add(mAdministrarTrabajadores);

        jmPerfil.setText("Perfil");
        jmPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPerfilActionPerformed(evt);
            }
        });

        mActualizarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/user2.png"))); // NOI18N
        mActualizarPerfil.setText("Actualizar Perfil");
        mActualizarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarPerfilActionPerformed(evt);
            }
        });
        jmPerfil.add(mActualizarPerfil);

        jMenuBar1.add(jmPerfil);

        mVehiculos.setText("Vehiculos");

        jmvehiculos.setText("Administrar Vehciulos");
        jmvehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmvehiculosActionPerformed(evt);
            }
        });
        mVehiculos.add(jmvehiculos);

        jMenuBar1.add(mVehiculos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mNuevoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevoCentroActionPerformed
        G2vJovi.abrirVentanaCrearCentro();
    }//GEN-LAST:event_mNuevoCentroActionPerformed

    private void mNuevoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevoTrabajadorActionPerformed
        G2vJovi.abrirVentanaCrearTrabajador();
    }//GEN-LAST:event_mNuevoTrabajadorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        G2vJovi.cerrarVentanaAdministracion();
    }//GEN-LAST:event_formWindowClosed

    private void mModificarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificarTrabajadorActionPerformed
        G2vJovi.abrirVentanaModificarTrabajador();
    }//GEN-LAST:event_mModificarTrabajadorActionPerformed

    private void mModificarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificarCentroActionPerformed
        G2vJovi.abrirVentanaModificarCentro();
    }//GEN-LAST:event_mModificarCentroActionPerformed

    private void mBorrarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBorrarCentroActionPerformed
        G2vJovi.abrirVentanaBorrarCentro();
    }//GEN-LAST:event_mBorrarCentroActionPerformed

    private void mBorrarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBorrarTrabajadorActionPerformed
        G2vJovi.abrirVentanaBorrarTrabajador();
    }//GEN-LAST:event_mBorrarTrabajadorActionPerformed

    private void mBuscarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBuscarTrabajadorActionPerformed
        G2vJovi.abrirVentanaBuscarTrabajador();
    }//GEN-LAST:event_mBuscarTrabajadorActionPerformed

    private void mBuscarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBuscarCentroActionPerformed
        G2vJovi.abrirVentanaBuscarCentro();
    }//GEN-LAST:event_mBuscarCentroActionPerformed

    private void jmPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPerfilActionPerformed
      
    }//GEN-LAST:event_jmPerfilActionPerformed

    private void mActualizarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarPerfilActionPerformed
         G2vJovi.abrirventanaUsuario();
    }//GEN-LAST:event_mActualizarPerfilActionPerformed

    private void jmvehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmvehiculosActionPerformed
        g2vjovi.G2vJovi.abrirVentanaVehiculos();
    }//GEN-LAST:event_jmvehiculosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu jmPerfil;
    private javax.swing.JMenuItem jmvehiculos;
    private javax.swing.JMenuItem mActualizarPerfil;
    private javax.swing.JMenu mAdminCentros;
    private javax.swing.JMenu mAdministrarTrabajadores;
    private javax.swing.JMenuItem mBorrarCentro;
    private javax.swing.JMenuItem mBorrarTrabajador;
    private javax.swing.JMenuItem mBuscarCentro;
    private javax.swing.JMenuItem mBuscarTrabajador;
    private javax.swing.JMenuItem mModificarCentro;
    private javax.swing.JMenuItem mModificarTrabajador;
    private javax.swing.JMenuItem mNuevoCentro;
    private javax.swing.JMenuItem mNuevoTrabajador;
    private javax.swing.JMenu mVehiculos;
    // End of variables declaration//GEN-END:variables
}
