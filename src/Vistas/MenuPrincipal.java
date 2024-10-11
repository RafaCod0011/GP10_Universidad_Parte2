package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MenuPrincipal extends javax.swing.JFrame {


    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Universidad - ULP");
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Media/universidad.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        formAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        formMateria = new javax.swing.JMenuItem();
        MenuAdminstracion = new javax.swing.JMenu();
        FormInscripciones = new javax.swing.JMenuItem();
        FormNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        FormConsultas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setMaximumSize(null);
        escritorio.setRequestFocusEnabled(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 660));

        jMenu1.setText("Alumnos");

        formAlumno.setText("Fichas de Alumnos");
        formAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(formAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        formMateria.setText("Fichas de Materias");
        formMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(formMateria);

        jMenuBar1.add(jMenu2);

        MenuAdminstracion.setText("Administración");

        FormInscripciones.setText("Manejo de Inscripciones");
        FormInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormInscripcionesActionPerformed(evt);
            }
        });
        MenuAdminstracion.add(FormInscripciones);

        FormNotas.setText("Manipulación de Notas");
        FormNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormNotasActionPerformed(evt);
            }
        });
        MenuAdminstracion.add(FormNotas);

        jMenuBar1.add(MenuAdminstracion);

        jMenu4.setText("Consultas");

        FormConsultas.setText("Alumnos por Materia");
        jMenu4.add(FormConsultas);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormAlumno alumno= new FormAlumno();
        alumno.setVisible(true);
        escritorio.add(alumno);
        escritorio.moveToFront(alumno);
    }//GEN-LAST:event_formAlumnoActionPerformed

    private void formMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormMateria materia= new FormMateria();
        materia.setVisible(true);
        escritorio.add(materia);
        escritorio.moveToFront(materia);
    }//GEN-LAST:event_formMateriaActionPerformed

    private void FormInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormInscripciones inscripciones = new FormInscripciones();
        inscripciones.setVisible(true);
        escritorio.add(inscripciones);
        escritorio.moveToFront(inscripciones);
    }//GEN-LAST:event_FormInscripcionesActionPerformed

    private void FormNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormCargaNotas notas = new FormCargaNotas();
        notas.setVisible(true);
        escritorio.add(notas);
        escritorio.moveToFront(notas);
    }//GEN-LAST:event_FormNotasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FormConsultas;
    private javax.swing.JMenuItem FormInscripciones;
    private javax.swing.JMenuItem FormNotas;
    private javax.swing.JMenu MenuAdminstracion;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem formAlumno;
    private javax.swing.JMenuItem formMateria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
