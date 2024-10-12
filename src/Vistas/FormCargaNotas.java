/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



public class FormCargaNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel materiaModel= new DefaultTableModel(){

    
     @Override
     public boolean isCellEditable(int row, int column) {
        
        return column == 2; 
    }
};
    
    private AlumnoData aData;
    private MateriaData mData;
    private InscripcionData insData;
    
   private ArrayList<Alumno> listaA;
   private ArrayList<Materia> listaM;
   private ArrayList<Inscripcion>  listaI;
    
    public FormCargaNotas() {
        
        initComponents();
        this.setTitle("Carga de Notas");
        this.setResizable(false);
        
        armarCabecera();
        
        aData = new AlumnoData();
        mData = new MateriaData();
        insData = new InscripcionData();
        
       for (Alumno alumno : aData.listarAlumnos()) {
            cbAlumno.addItem(alumno); 
        }
        
        
    }

 
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPGeneral = new javax.swing.JPanel();
        jLTitle = new javax.swing.JLabel();
        jLBarraTitle = new javax.swing.JLabel();
        jLSeleccionarAlumno = new javax.swing.JLabel();
        cbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jPGeneral.setPreferredSize(new java.awt.Dimension(500, 500));

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(21, 37, 63));
        jLTitle.setText("Carga de notas");

        jLBarraTitle.setForeground(new java.awt.Color(44, 61, 91));
        jLBarraTitle.setText("_________________________________________________________________________________________________________________________________");

        jLSeleccionarAlumno.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLSeleccionarAlumno.setForeground(new java.awt.Color(51, 51, 255));
        jLSeleccionarAlumno.setText("Seleccione un Alumno :");

        cbAlumno.setBackground(new java.awt.Color(44, 61, 91));
        cbAlumno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnoActionPerformed(evt);
            }
        });

        tNotas.setBackground(new java.awt.Color(44, 61, 91));
        tNotas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tNotas.setForeground(new java.awt.Color(249, 249, 249));
        tNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tNotas);

        jbGuardar.setBackground(new java.awt.Color(221, 231, 244));
        jbGuardar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jbGuardar.setText("Guardar!");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(221, 231, 244));
        jbSalir.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPGeneralLayout = new javax.swing.GroupLayout(jPGeneral);
        jPGeneral.setLayout(jPGeneralLayout);
        jPGeneralLayout.setHorizontalGroup(
            jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPGeneralLayout.createSequentialGroup()
                .addGroup(jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPGeneralLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPGeneralLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLSeleccionarAlumno)
                                .addGap(18, 18, 18)
                                .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPGeneralLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLBarraTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPGeneralLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPGeneralLayout.setVerticalGroup(
            jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGeneralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLBarraTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSeleccionarAlumno)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cargarInscriptas(){
    
        borrarFilaTabla();    
        Alumno selec = (Alumno) cbAlumno.getSelectedItem();
        listaM = (ArrayList) insData.obtenerMateriasCursadas(selec.getIdAlumno());
        listaI = (ArrayList) insData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());

                
        for (Inscripcion i: listaI) {
        Materia m = mData.buscarMateria(i.getMateria().getIdMateria());
        String nombreMateria = m.getNombre();
        materiaModel.addRow(new Object[] {i.getMateria().getIdMateria(), nombreMateria, i.getNota()});
        
    }
        
    }
    private void cbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnoActionPerformed
        Alumno alumnoSeleccionado = (Alumno) cbAlumno.getSelectedItem();
        cargarInscriptas();
    }//GEN-LAST:event_cbAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
          int filaSeleccionada = tNotas.getSelectedRow();
          
        if (filaSeleccionada != -1) {
            try {
                Alumno alumnoSeleccionado = (Alumno) cbAlumno.getSelectedItem();
                int idAlumno = alumnoSeleccionado.getIdAlumno();
                
                
               // Obtener el ID de la materia desde la tabla (columna 0)
                int idMateria = Integer.parseInt(tNotas.getValueAt(filaSeleccionada, 0).toString());

                // Obtener la nueva nota desde la tabla (columna 2)
                double nuevaNota = Double.parseDouble(tNotas.getValueAt(filaSeleccionada, 2).toString());

                // Llamar al método actualizarNota desde InscripcionData
                insData.actualizarNota(idAlumno, idMateria, nuevaNota);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error al convertir los valores. Asegúrate de que las entradas sean válidas.");
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila.");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JLabel jLBarraTitle;
    private javax.swing.JLabel jLSeleccionarAlumno;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPGeneral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable tNotas;
    // End of variables declaration//GEN-END:variables

 private void armarCabecera(){

        materiaModel.addColumn("Codigo");
        materiaModel.addColumn("Nombre");
        materiaModel.addColumn("Nota");
        tNotas.setModel(materiaModel);
        TableColumnModel columnModel = tNotas.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(50);   // 
        columnModel.getColumn(1).setPreferredWidth(180);  // 
        columnModel.getColumn(2).setPreferredWidth(100);  // 
    }
 private void borrarFilaTabla(){
        
        int indice= materiaModel.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
            materiaModel.removeRow(i);
        }
    }
  
   

}
