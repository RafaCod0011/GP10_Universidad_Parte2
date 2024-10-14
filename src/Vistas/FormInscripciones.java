
package Vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormInscripciones extends javax.swing.JInternalFrame {
private DefaultTableModel materiaModel= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};

private ArrayList<Materia> listaM;
private ArrayList<Alumno> listaA;

private AlumnoData aData;
private MateriaData mData;
private InscripcionData insData;

    public FormInscripciones() {
        
        initComponents();
        
        aData = new AlumnoData();
        mData =  new MateriaData();
        insData = new InscripcionData();

        armarCabecera();
        cargarComboAlumnos();

        //Agregamos los radio buttons a un grupo de Radio Buttons vistaTabla
        vistaTabla.add(rbInscriptas);
        vistaTabla.add(rbNoInscriptas);
        rbInscriptas.isSelected();
        
        
        cargarInscriptas();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vistaTabla = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cbAlumno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btInscribir = new javax.swing.JButton();
        btAnular = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administración de Inscripciones en Materias");

        cbAlumno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FORMULARIO DE INSCRIPCIÓN");

        tMaterias.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tMaterias);

        rbInscriptas.setForeground(new java.awt.Color(51, 51, 255));
        rbInscriptas.setSelected(true);
        rbInscriptas.setText("Inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });

        rbNoInscriptas.setForeground(new java.awt.Color(51, 51, 255));
        rbNoInscriptas.setText("No inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbInscriptas)
                .addGap(87, 87, 87)
                .addComponent(rbNoInscriptas)
                .addGap(207, 207, 207))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNoInscriptas)
                    .addComponent(rbInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Visualizar listado de materias del alumno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(367, 367, 367))
        );

        btInscribir.setText("Inscribir");
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });

        btAnular.setText("Anular Inscripcion");
        btAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAnular, btInscribir, btSalir});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(btAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarComboAlumnos(){
    
        for (Alumno alumno : aData.listarAlumnos()) {
            cbAlumno.addItem(alumno); 
        }
    }

    
    private void cargarNoInscriptas(){
    
        
        borrarFilaTabla();    
        Alumno selec = (Alumno) cbAlumno.getSelectedItem();
        listaM = (ArrayList) insData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia m: listaM) {
                materiaModel.addRow(new Object[] {m.getIdMateria(), m.getNombre(),m.getAnio()});
        }
        
        
        btAnular.setEnabled(false);
        btInscribir.setEnabled(true);
        
    }
    private void cargarInscriptas(){
    
        borrarFilaTabla();    
        Alumno selec = (Alumno) cbAlumno.getSelectedItem();
        listaM = (ArrayList) insData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m: listaM) {
                materiaModel.addRow(new Object[] {m.getIdMateria(), m.getNombre(),m.getAnio()});
        }
        btAnular.setEnabled(true);
        btInscribir.setEnabled(false);
    }
    
    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
        
        cargarNoInscriptas();
        

    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void cbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnoActionPerformed
       
        //Alumno alumnoSeleccionado = (Alumno) cbAlumno.getSelectedItem();
        if (cbAlumno.getSelectedIndex()!= -1){
            if (rbInscriptas.isSelected()){
                cargarInscriptas();
            }else if (rbNoInscriptas.isSelected()){
                cargarNoInscriptas();
            }
        }
        
    }//GEN-LAST:event_cbAlumnoActionPerformed

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
            
        cargarInscriptas();
        
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularActionPerformed

        Alumno selec = (Alumno) cbAlumno.getSelectedItem();
        int filaSeleccionada = tMaterias.getSelectedRow();
         
        
        if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada

             String nombreM = (String) materiaModel.getValueAt(filaSeleccionada, 1);
              int respuesta = JOptionPane.showConfirmDialog(null
                ,"Va a anular la inscripción del alumno " + selec.getApellido() + " " + selec.getNombre() + ", en la materia " + nombreM
                ,"Confirme inscripción"
                ,JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
            
                int idMateria = (int )materiaModel.getValueAt(filaSeleccionada, 0);

                int anioM = (int )materiaModel.getValueAt(filaSeleccionada, 2);

                //Materia m = new Materia(idMateria, nombreM, anioM, true); // Asigna el idMateria
                //Inscripcion in = new Inscripcion(selec, m, 0);

                insData.eliminarInscripcion(selec.getIdAlumno(), idMateria);
                cargarInscriptas();
            }    
        }
        

        
    }//GEN-LAST:event_btAnularActionPerformed

    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
       
        
        Alumno selec = (Alumno) cbAlumno.getSelectedItem();
        int filaSeleccionada = tMaterias.getSelectedRow();
         
        
        if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada

             String nombreM = (String) materiaModel.getValueAt(filaSeleccionada, 1);
              int respuesta = JOptionPane.showConfirmDialog(null
                ,"Va a inscribir al alumno " + selec.getApellido() + " " + selec.getNombre() + ", en la materia " + nombreM
                ,"Confirme inscripción"
                ,JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
            
                int idMateria = (int )materiaModel.getValueAt(filaSeleccionada, 0);

                int anioM = (int )materiaModel.getValueAt(filaSeleccionada, 2);

                Materia m = new Materia(idMateria, nombreM, anioM, true); // Asigna el idMateria

                Inscripcion in = new Inscripcion(selec, m, 0);
                insData.guardarInscripcion(in);
                cargarInscriptas();
                rbInscriptas.setSelected(true);
            }    
        }
        
        
    }//GEN-LAST:event_btInscribirActionPerformed
    private void armarCabecera(){

            materiaModel.addColumn("ID");
            materiaModel.addColumn("Nombre");
            materiaModel.addColumn("Año");
            tMaterias.setModel(materiaModel);
            // Obtener el modelo de columnas de la tabla
            TableColumnModel columnModel = tMaterias.getColumnModel();

            //Ancho de las columnas
            columnModel.getColumn(0).setPreferredWidth(50);   // "ID"
            columnModel.getColumn(1).setPreferredWidth(180);  // "Nombre"
            columnModel.getColumn(2).setPreferredWidth(100);  // "Año"

        }
    private void borrarFilaTabla(){
        
        int indice= materiaModel.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
            materiaModel.removeRow(i);
        }
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnular;
    private javax.swing.JButton btInscribir;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    private javax.swing.JTable tMaterias;
    private javax.swing.ButtonGroup vistaTabla;
    // End of variables declaration//GEN-END:variables
}
