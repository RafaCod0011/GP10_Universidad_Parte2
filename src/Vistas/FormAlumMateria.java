package Vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormAlumMateria extends javax.swing.JInternalFrame {


public FormAlumMateria() {
    initComponents();
    this.setTitle("Listado Alumnos por Materia");
    this.setResizable(false);
    cargarCombo();
    armarCabecera();
    if (jcbMaterias.getSelectedIndex()!= -1){

            cargarDatos();

    }
}

    private MateriaData matData=new MateriaData();
    private AlumnoData alumData = new AlumnoData();
    private InscripcionData inscData = new InscripcionData();


     private DefaultTableModel modeloTabla = new DefaultTableModel(){
         
          @Override
          public boolean isCellEditable(int fila, int columna) {
              
              return false;
          }
     };
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrinicpal = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jlSeparador = new javax.swing.JLabel();
        jlSeleccionMateria = new javax.swing.JLabel();
        jcbMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        btSalir = new javax.swing.JButton();

        jlTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(51, 51, 255));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Listado de Alumno por Materia");

        jlSeparador.setForeground(new java.awt.Color(44, 61, 91));
        jlSeparador.setText("_________________________________________________________________________________________________________________");

        jlSeleccionMateria.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlSeleccionMateria.setForeground(new java.awt.Color(51, 51, 225));
        jlSeleccionMateria.setText("Seleccione una Materia :");

        jcbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriasActionPerformed(evt);
            }
        });

        jtListado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtListado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListado);

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPrinicpalLayout = new javax.swing.GroupLayout(jpPrinicpal);
        jpPrinicpal.setLayout(jpPrinicpalLayout);
        jpPrinicpalLayout.setHorizontalGroup(
            jpPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrinicpalLayout.createSequentialGroup()
                .addGroup(jpPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPrinicpalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrinicpalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrinicpalLayout.createSequentialGroup()
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrinicpalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrinicpalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jlSeleccionMateria)
                .addGap(18, 18, 18)
                .addComponent(jcbMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        jpPrinicpalLayout.setVerticalGroup(
            jpPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrinicpalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSeparador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrinicpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSeleccionMateria))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrinicpal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrinicpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btMateriasActionPerformed(java.awt.event.ActionEvent evt){

        borrarFilaTabla();
        cargarDatos();
    }
    
    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
     //TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void jcbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriasActionPerformed


        if (jcbMaterias.getSelectedIndex()!= -1){

                cargarDatos();
   
        }

         
        
    }//GEN-LAST:event_jcbMateriasActionPerformed
    
    public void cargarDatos(){

        borrarFilaTabla();

        Materia materiaSeleccionada = (Materia)jcbMaterias.getSelectedItem();
        int id = materiaSeleccionada.getIdMateria();
        List<Alumno>alumnos = inscData.obtenerAlumnosXMateria(id);
        for(Alumno a:alumnos){
            modeloTabla.addRow(new Object[]{a.getIdAlumno(),a.getDni(),a.getApellido(),a.getNombre()});
        }    
    }

    private void borrarFilaTabla(){
        int indice=modeloTabla.getRowCount()-1;
        for(int i=indice;i>=0;i--){
            modeloTabla.removeRow(i);
        }

    } 
    
    public void cargarCombo(){
     List<Materia>materias=matData.listarMaterias();
     
     for(Materia m:materias){
         
       jcbMaterias.addItem( m);
     }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    private javax.swing.JLabel jlSeleccionMateria;
    private javax.swing.JLabel jlSeparador;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpPrinicpal;
    private javax.swing.JTable jtListado;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){

        this.modeloTabla.addColumn("ID");
        this.modeloTabla.addColumn("DNI");
        this.modeloTabla.addColumn("Apellido");
        this.modeloTabla.addColumn("Nombre");
        jtListado.setModel(modeloTabla);
        
        // Obtener el modelo de columnas de la tabla
        TableColumnModel columnModel = jtListado.getColumnModel();

        //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(10);   // "ID"
        columnModel.getColumn(1).setPreferredWidth(40);  // "DNI"
        columnModel.getColumn(2).setPreferredWidth(150);  // "Apellido"
        columnModel.getColumn(3).setPreferredWidth(150);  // "Nombre"
        

        
    }


}