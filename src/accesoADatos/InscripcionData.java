package accesoADatos;

import entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {
    private Connection con;
    private AlumnoData aluData;
    private MateriaData matData;

    public InscripcionData() {
        this.con = (Connection) Conexion.getConexion();
    }
    
//
//   
//    public InscripcionData(Conexion conexion, AlumnoData aluData, MateriaData matData) {
//        this.con = conexion.getConexion();
//        this.aluData = aluData;
//        this.matData = matData;
//    }
    
    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Inscripción Registrada" + rs.getInt(1));
            }

            
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "La inscripción en la materia ya se encuentra registrada.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = matData.buscarMateria(rs.getInt("idMateria"));
                Inscripcion inscripcion = new Inscripcion(rs.getInt("idInscripcion"), alumno, materia, rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        return inscripciones;
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas=ps.executeUpdate();
            if (filas>0){
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarInscripcion(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas=ps.executeUpdate();
            if (filas>0){
                JOptionPane.showMessageDialog(null, "Inscripcion Eliminada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
          
	
	try{
	
	    PreparedStatement ps = con.prepareStatement(sql);
		 ps.setInt(1, idAlumno);
                 ResultSet rs = ps.executeQuery(); //devuelve los resultados en un ResultSet
		
		while (rs.next()) {
		
		    Inscripcion inscripcion = new Inscripcion();
			
			inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
			
			Materia materia = new Materia();
			materia.setIdMateria(rs.getInt("IdMateria"));
                        
			
			Alumno alumno = new Alumno();
			alumno.setIdAlumno(idAlumno);
			
			inscripcion.setMateria(materia);
			inscripcion.setAlumno(alumno);
			
			inscripcion.setNota(rs.getDouble("nota"));
			
			inscripciones.add(inscripcion);
	    }
                
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT m.idMateria, m.nombre, m.anio "
               + "FROM inscripcion i "
               + "JOIN materia m ON i.idMateria = m.idMateria "
               + "WHERE i.idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                
                
                materias.add(materia);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT m.idMateria, m.nombre, m.anio "
               + "FROM materia m "
               + "LEFT JOIN inscripcion i ON m.idMateria = i.idMateria AND i.idAlumno = ? "
               + "WHERE i.idMateria IS NULL";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                
                materias.add(materia);
            }
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return materias;
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT a.idAlumno, a.dni, a.apellido, a.nombre, a.fechaNacimiento, a.estado "
               + "FROM inscripcion i "
               + "JOIN alumno a ON i.idAlumno = a.idAlumno "
               + "WHERE i.idMateria = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Alumno alumno = new Alumno();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                
                alumnos.add(alumno);
            }
            
        }catch (SQLException e) {
            e.printStackTrace();
    }
        return alumnos;
    }
}