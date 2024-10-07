
package Vistas;

import accesoADatos.AlumnoData;
import entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import javax.swing.JOptionPane;

public class FormAlumno extends javax.swing.JInternalFrame {
    
    public FormAlumno() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLAlumno = new javax.swing.JLabel();
        JLDNI = new javax.swing.JLabel();
        JLApellido = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        JLEstado = new javax.swing.JLabel();
        JLFecha = new javax.swing.JLabel();
        tbDNI = new javax.swing.JTextField();
        tbApellido = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        JDate = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tbID = new javax.swing.JTextField();

        JLAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(51, 51, 255));
        JLAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLAlumno.setText("ALUMNOS");

        JLDNI.setForeground(new java.awt.Color(51, 51, 255));
        JLDNI.setText("Documento:");

        JLApellido.setForeground(new java.awt.Color(51, 51, 255));
        JLApellido.setText("Apellido:");

        JLNombre.setForeground(new java.awt.Color(51, 51, 255));
        JLNombre.setText("Nombres:");

        JLEstado.setForeground(new java.awt.Color(51, 51, 255));
        JLEstado.setText("Activo:");

        JLFecha.setForeground(new java.awt.Color(51, 51, 255));
        JLFecha.setText("Fecha de Nacimiento:");

        tbDNI.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        tbApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        tbNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jbBuscar.setText("Buscar ID");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        JDate.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("ID:");

        tbID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbID.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JLEstado)
                                            .addComponent(JLNombre)
                                            .addComponent(JLApellido)
                                            .addComponent(JLDNI)
                                            .addComponent(jLabel1))
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(JLFecha)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrEstado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(JDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                            .addComponent(tbApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tbID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir)))
                        .addGap(11, 11, 11))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JLAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbEliminar, jbGuardar, jbNuevo, jbSalir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbID)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLDNI)
                            .addComponent(tbDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLApellido)
                    .addComponent(tbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(JDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(17, 17, 17))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbBuscar, jbEliminar, jbGuardar, jbNuevo, jbSalir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (tbDNI.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Busque el alumno que desea eliminar",
            "No se ha encontrado alumno seleccionado", JOptionPane.ERROR_MESSAGE);
        
        }else{
        
                AlumnoData movimiento = new AlumnoData();   
                int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar el alumno seleccionado?"
                    ,"Eliminar Alumno"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int AlumnoEliminar= Integer.parseInt(tbID.getText());
                    movimiento.eliminarAlumno(AlumnoEliminar);
                    Nuevo();
                }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        AlumnoData movimiento = new AlumnoData();
        
        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar una nuevo alumno. ¿Esta Seguro/a?"
            ,"Nuevo Alumno"
            ,JOptionPane.YES_NO_OPTION);
        
        if(respuesta == JOptionPane.YES_OPTION){  
            try{
                if(tbNombre.getText().isEmpty()||tbApellido.getText().isEmpty()||tbDNI.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete los datos del Alumno/a","Atención", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(jrEstado.isSelected() == false){
                        int alumnoActivo = JOptionPane.showConfirmDialog(null
                                ,"Estas seguro/a de iniciar un nuevo alumno como INACTIVO/A"
                                ,"Alumno INACTIVO/A"
                                ,JOptionPane.YES_NO_OPTION);
                        
                        if(alumnoActivo == JOptionPane.NO_OPTION){
                            jrEstado.isSelected();
                            jrEstado.requestFocus();
                            return;
                        }
                    }
                    java.util.Date Nfecha=JDate.getDate();
                    LocalDate fechanac = Nfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    
                    int documento= Integer.parseInt(tbDNI.getText());
                    Alumno AlumnoNuevo = new Alumno(documento, tbNombre.getText(),tbApellido.getText(),fechanac,jrEstado.isSelected()); 

                    movimiento.guardarAlumno(AlumnoNuevo);
                    
                    //Agregar ID del DNI
                    tbID.setText(String.valueOf(AlumnoNuevo.getIdAlumno()));
                    
                    
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        AlumnoData movimientos = new AlumnoData();
                
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese el ID del Alumno a buscar:", "Buscar Alumno", JOptionPane.PLAIN_MESSAGE);
        
        try {
            if (respuesta==null){
                return;
            }
            int codigoBuscar= Integer.parseInt(respuesta);
            Alumno encontrada = movimientos.buscarAlumno(codigoBuscar);
            if (encontrada==null){
                JOptionPane.showMessageDialog(null, "No se ha encontrado un alumno con el codigo ingresado",
                "Corrobore la información", JOptionPane.ERROR_MESSAGE);
            }else{
                tbID.setText(String.valueOf(encontrada.getIdAlumno()));
                tbDNI.setText(String.valueOf(encontrada.getDni()));
                tbNombre.setText(encontrada.getNombre());
                tbApellido.setText(String.valueOf(encontrada.getApellido()));              
                jrEstado.setSelected(encontrada.isActivo());
                java.util.Date fechaNacDate = java.util.Date.from(encontrada.getFechaNacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant());
                JDate.setDate(fechaNacDate);
            }
           
            
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void Nuevo(){

        tbID.setText("");
        tbDNI.setText("");
        tbNombre.setText("");
        tbApellido.setText("");
        jrEstado.setSelected(false);
        JDate.setDate(null);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDate;
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JLabel JLApellido;
    private javax.swing.JLabel JLDNI;
    private javax.swing.JLabel JLEstado;
    private javax.swing.JLabel JLFecha;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField tbApellido;
    private javax.swing.JTextField tbDNI;
    private javax.swing.JTextField tbID;
    private javax.swing.JTextField tbNombre;
    // End of variables declaration//GEN-END:variables
}
