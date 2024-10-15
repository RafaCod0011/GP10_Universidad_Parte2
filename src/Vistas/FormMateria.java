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

        jlMaterias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlMaterias.setForeground(new java.awt.Color(0, 51, 255));
        jlMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMaterias.setText("MATERIAS");

        jlCodigo.setForeground(new java.awt.Color(51, 51, 255));
        jlCodigo.setText("Código:");

        jlNombre.setForeground(new java.awt.Color(51, 51, 255));
        jlNombre.setText("Nombre:");

        jlAño.setForeground(new java.awt.Color(51, 51, 255));
        jlAño.setText("Año:");

        jlEstado.setForeground(new java.awt.Color(51, 51, 255));
        jlEstado.setText("Activa:");

        tbCodigo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbCodigo.setEnabled(false);

        tbNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        tbAnio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jbBuscar.setText("Buscar Código");
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
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCodigo)
                    .addComponent(jlNombre)
                    .addComponent(jlAño)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addGap(357, 357, 357))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jlMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbBuscar, jbEliminar, jbGuardar, jbNuevo, jbSalir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbCodigo)
                            .addComponent(jlCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAño))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEstado)
                    .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbBuscar, jbEliminar, jbGuardar, jbNuevo, jbSalir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
         MateriaData movimientos = new MateriaData();

        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar los datos ingresados de la materia. ¿Está seguro/a?"
            ,"Grabar Materia"
            ,JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                if (tbNombre.getText().isEmpty() || tbAnio.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete los datos de la Materia", "Atención", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!jrEstado.isSelected()) {
                        int materiaActiva = JOptionPane.showConfirmDialog(null
                                ,"¿Está seguro/a de iniciar la nueva materia como INACTIVA?"
                                ,"Materia Inactiva"
                                ,JOptionPane.YES_NO_OPTION);

                        if (materiaActiva == JOptionPane.NO_OPTION) {
                            jrEstado.setSelected(true);
                            jrEstado.requestFocus();
                            return;
                        }
                    }


                    int anio = Integer.parseInt(tbAnio.getText());


                    int codigoBuscar= Integer.parseInt(tbCodigo.getText());
                    Materia encontrada = movimientos.buscarMateria(codigoBuscar);
                    
                    if (encontrada == null) {
                        // Materia nueva
                        Materia materiaNueva = new Materia(tbNombre.getText().toUpperCase(), anio, jrEstado.isSelected());
                        movimientos.guardarMateria(materiaNueva);
                        tbCodigo.setText(String.valueOf(materiaNueva.getIdMateria()));
                    } else {
                        // Materia existente, se modifica
                        encontrada.setNombre(tbNombre.getText().toUpperCase());
                        encontrada.setAnio(anio);
                        encontrada.setEstado(jrEstado.isSelected());
                        movimientos.modificarMateria(encontrada);
                        tbCodigo.setText(String.valueOf(encontrada.getIdMateria()));
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada", "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
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
