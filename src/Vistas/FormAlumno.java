
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
        jSeparator1 = new javax.swing.JSeparator();
        JDate = new com.toedter.calendar.JDateChooser();

        JLAlumno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLAlumno.setText("ALUMNO");

        JLDNI.setText("DNI");

        JLApellido.setText("APELLIDO");

        JLNombre.setText("NOMBRE");

        JLEstado.setText("ESTADO");

        JLFecha.setText("FECHA DE NACIMIENTO");

        jbBuscar.setText("Buscar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLEstado)
                            .addComponent(JLNombre)
                            .addComponent(JLApellido)
                            .addComponent(JLDNI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tbDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(JLFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrEstado)
                            .addComponent(JDate, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLAlumno)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLDNI)
                    .addComponent(jbBuscar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLApellido)
                    .addComponent(tbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNombre)
                    .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLEstado)
                        .addGap(40, 40, 40)
                        .addComponent(JLFecha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(49, 49, 49))
        );

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
                    ,"¿Está seguro/a de Eliminar el Alumno seleccionada?"
                    ,"Eliminar Alumno"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int AlumnoEliminar= Integer.parseInt(tbDNI.getText());
                    movimiento.eliminarAlumno(AlumnoEliminar);
                    Nuevo();
                }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        AlumnoData movimiento = new AlumnoData();
        
        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar una nueva materia ¿Esta Seguro/a?"
            ,"Nuevo Alumno"
            ,JOptionPane.YES_NO_OPTION);
        
        if(respuesta = JOptionPane.YES_OPTION){  //Aca me salta error no se el porque.
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
                    
                    Alumno AlumnoNuevo = new Alumno(tbDNI.getText(), tbNombre.getText(),tbApellido.getText(),fechanac,jrEstado.isSelected()); 
                                                  //aca tambien sale error, no se porque.
                    movimiento.guardarAlumno(AlumnoNuevo);
                    
                    //Agregar ID del DNI
                    tbDNI.setText(String.valueOf(AlumnoNuevo.getIdAlumno()));
                    
                    
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        AlumnoData movimientos = new AlumnoData();
                
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese el DNI del Alumno a buscar:", "Buscar Alumno", JOptionPane.PLAIN_MESSAGE);
        
        try {
            if (respuesta==null){
                return;
            }
            int codigoBuscar= Integer.parseInt(respuesta);
            Alumno encontrada = movimientos.buscarAlumno(codigoBuscar);
            if (encontrada==null){
                JOptionPane.showMessageDialog(null, "No se ha encontrado una materia con el codigo ingresado",
                "Corrobore la información", JOptionPane.ERROR_MESSAGE);
            }else{
                tbDNI.setText(String.valueOf(encontrada.getApellido()));
                tbNombre.setText(encontrada.getNombre());
                tbApellido.setText(String.valueOf(encontrada.getApellido()));              
                jrEstado.setSelected(encontrada.isActivo());

            }
           
            
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void Nuevo(){

        tbDNI.setText("");
        tbNombre.setText("");
        tbApellido.setText("");
        jrEstado.setSelected(false);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDate;
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JLabel JLApellido;
    private javax.swing.JLabel JLDNI;
    private javax.swing.JLabel JLEstado;
    private javax.swing.JLabel JLFecha;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField tbApellido;
    private javax.swing.JTextField tbDNI;
    private javax.swing.JTextField tbNombre;
    // End of variables declaration//GEN-END:variables
}
