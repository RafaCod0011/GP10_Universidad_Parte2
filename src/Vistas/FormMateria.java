package Vistas;

import accesoADatos.MateriaData;
import entidades.Materia;
import javax.swing.JOptionPane;

public class FormMateria extends javax.swing.JInternalFrame {

    public FormMateria() {
        initComponents();
        
        
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlMaterias = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlAño = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        tbCodigo = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        tbAnio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jlMaterias.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlMaterias.setText("MATERIAS");

        jlCodigo.setText("Codigo");

        jlNombre.setText("Nombre");

        jlAño.setText("Año");

        jlEstado.setText("Estado");

        tbCodigo.setEnabled(false);

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
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jbNuevo)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jbEliminar)
                                .addGap(36, 36, 36)
                                .addComponent(jbGuardar)
                                .addGap(29, 29, 29)
                                .addComponent(jbSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlCodigo)
                                    .addComponent(jlNombre)
                                    .addComponent(jlAño)
                                    .addComponent(jlEstado))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jbBuscar))
                                    .addComponent(tbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrEstado)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jlMaterias)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jbBuscar)
                    .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAño)
                    .addComponent(tbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jrEstado))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(42, 42, 42))
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

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        MateriaData movimientos = new MateriaData();
        
        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar una nueva materia ¿Está seguro/a?"
            ,"Nueva Materia"
            ,JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
    
            try {

                    if (tbNombre.getText().isEmpty() || tbAnio.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Complete los datos de la Materia","Atención", JOptionPane.ERROR_MESSAGE);
                    }else{
                        if (jrEstado.isSelected()==false){

                            int materiaActiva = JOptionPane.showConfirmDialog(null
                                ,"¿Está seguro/a de iniciar la nueva materia como INACTIVA?"
                                ,"Materia Inactiva"
                                ,JOptionPane.YES_NO_OPTION);

                            if (materiaActiva == JOptionPane.NO_OPTION) {
                                jrEstado.isSelected();
                                jrEstado.requestFocus();
                                return;

                            }

                        }
                        int anio= Integer.parseInt(tbAnio.getText());
                        Materia materiaNueva = new Materia(tbNombre.getText().toUpperCase(), anio, jrEstado.isSelected());
                        movimientos.guardarMateria(materiaNueva);

                        //Asignamos el ID al CODIGO
                        tbCodigo.setText(String.valueOf(materiaNueva.getIdMateria()));

        //                for (Materia materia : movimientos.listarMaterias()) {
        //                    System.out.println(materia.getNombre()+ " - " + materia.getAnio());
        //                    
        //                }

                    }



                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
                }

            }

           
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        MateriaData movimientos = new MateriaData();
                
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese el código de la materia a buscar:", "Buscar Materia", JOptionPane.PLAIN_MESSAGE);
        
        try {
            if (respuesta==null){
                return;
            }
            int codigoBuscar= Integer.parseInt(respuesta);
            Materia encontrada = movimientos.buscarMateria(codigoBuscar);
            if (encontrada==null){
                JOptionPane.showMessageDialog(null, "No se ha encontrado una materia con el codigo ingresado",
                "Corrobore la información", JOptionPane.ERROR_MESSAGE);
            }else{
                tbCodigo.setText(String.valueOf(encontrada.getIdMateria()));
                tbNombre.setText(encontrada.getNombre());
                tbAnio.setText(String.valueOf(encontrada.getAnio()));              
                jrEstado.setSelected(encontrada.isEstado());

            }
           
            
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }

    

        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
  
        if (tbCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Busque la materia que desea eliminar",
            "No se ha encontrado materia seleccionada", JOptionPane.ERROR_MESSAGE);
        
        }else{
        
                MateriaData movimientos = new MateriaData();   
                int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar la Materia seleccionada?"
                    ,"Eliminar Materia"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int materiaEliminar= Integer.parseInt(tbCodigo.getText());
                    movimientos.eliminarMateria(materiaEliminar);
                    Nuevo();
                }
        }
        
      

        
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        Nuevo();

        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void Nuevo(){

        tbCodigo.setText("");
        tbNombre.setText("");
        tbAnio.setText("");              
        jrEstado.setSelected(false);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAño;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlMaterias;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField tbAnio;
    private javax.swing.JTextField tbCodigo;
    private javax.swing.JTextField tbNombre;
    // End of variables declaration//GEN-END:variables
}
