package accesoADatos;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AlumnoData {
   
    private Connection con = null;
    
    public AlumnoData(){
        con = (Connection) Conexion.getConexion();
    }
    
    public void guardarAlumno (Alumno alumno) {
        
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());

            if (alumno.getFechaNacimiento() != null) {
                ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            } else {
                ps.setNull(4, java.sql.Types.DATE);  
            }

            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt(1)); // Le asignamos el ID
                JOptionPane.showMessageDialog(null, "Alumno guardado correctamente");
            }
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El DNI ya existe.");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }
    
    public void modificarAlumno (Alumno alumno) {

       
        if (alumno.getIdAlumno() == 0) {
            JOptionPane.showMessageDialog(null, "ID de Alumno no válido.");
            return;
        }
       
        String sql= "UPDATE alumno SET dni= ?, apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ? "
                + "WHERE idAlumno = ?";
                
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());

            if (alumno.getFechaNacimiento() != null) {
                ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            } else {
                ps.setNull(4, java.sql.Types.DATE);  
            }
            
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6,alumno.getIdAlumno());     

            int exito = ps.executeUpdate();

            if (exito == 1){
                JOptionPane.showMessageDialog(null,"Alumno Modificado Correctamente");
            }
            
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El DNI ya existe.");
            
        } catch (SQLException ex) {
            ex.printStackTrace(); 
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno");
        }
    }
    

    public Alumno buscarAlumno(int id) {
    Alumno alumno = null;
    String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ?"; //AND estado = 1
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();


        if (rs.next()) {
            alumno = new Alumno();
            alumno.setIdAlumno(id);
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            java.sql.Date fechaNacimientoSQL = rs.getDate("fechaNacimiento");
            if (fechaNacimientoSQL != null) {
                alumno.setFechaNacimiento(fechaNacimientoSQL.toLocalDate());
            }
            alumno.setActivo(true);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
    }

    return alumno;
}

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? "; //AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                java.sql.Date fechaNacimientoSQL = rs.getDate("fechaNacimiento");
                if (fechaNacimientoSQL != null) {
                    alumno.setFechaNacimiento(fechaNacimientoSQL.toLocalDate());
                }
                alumno.setActivo(true);
            } else {
                //JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                java.sql.Date fechaNacimientoSQL = rs.getDate("fechaNacimiento");
                if (fechaNacimientoSQL != null) {
                    alumno.setFechaNacimiento(fechaNacimientoSQL.toLocalDate());
                }
                //alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }
       
    
    public void eliminarAlumno(int id){

     String sql = "DELETE FROM alumno WHERE idAlumno = ? ";
     try {

         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, id);
         ps.executeUpdate();
         //JOptionPane.showMessageDialog(null, "Se ha eliminado el alumno");
//            if(fila == 1) {
         JOptionPane.showMessageDialog(null, "Se ha eliminado el alumno N°" + id);
//            }
         ps.close();
     } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
     }
        
        
        
    }
    
    public void desactivarAlumno(int id){
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";      
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha desactivado el alumno");
            if(fila == 1) {
                JOptionPane.showMessageDialog(null, "Se ha desactivado el alumno N°" + id);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }

    
}

