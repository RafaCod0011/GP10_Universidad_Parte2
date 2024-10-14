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
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        jPGeneral.setPreferredSize(new java.awt.Dimension(500, 500));

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(51, 51, 255));
        jLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitle.setText("Carga de notas");

        jLBarraTitle.setForeground(new java.awt.Color(44, 61, 91));
        jLBarraTitle.setText("_________________________________________________________________________________________________________________________________");

        jLSeleccionarAlumno.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLSeleccionarAlumno.setForeground(new java.awt.Color(51, 51, 255));
        jLSeleccionarAlumno.setText("Seleccione un Alumno :");

        cbAlumno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnoActionPerformed(evt);
            }
        });

        tNotas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPGeneralLayout = new javax.swing.GroupLayout(jPGeneral);
        jPGeneral.setLayout(jPGeneralLayout);
        jPGeneralLayout.setHorizontalGroup(
            jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGeneralLayout.createSequentialGroup()
                .addGroup(jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPGeneralLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLBarraTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGeneralLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLSeleccionarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGeneralLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPGeneralLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btGuardar, btSalir});

        jPGeneralLayout.setVerticalGroup(
            jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLBarraTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSeleccionarAlumno))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
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
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JLabel jLBarraTitle;
    private javax.swing.JLabel jLSeleccionarAlumno;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPGeneral;
    private javax.swing.JScrollPane jScrollPane1;
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
