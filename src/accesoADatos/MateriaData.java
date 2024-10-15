package accesoADatos;

import entidades.Materia;
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

public class MateriaData {
    
    private Connection con = null;

  
    public MateriaData() {
        con = (Connection) Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                materia.setIdMateria(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Materia guardada correctamente - Código N°" + rs.getInt(1));
            }
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Error de integridad referencial");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Base "+ ex.getMessage());
            
        }
    }

    public void modificarMateria (Materia materia) {


    if (materia.getIdMateria() == 0) {
        JOptionPane.showMessageDialog(null, "ID de Materia no válido.");
        return;
    }

    String sql = "UPDATE materia SET nombre = ?, anio = ?, estado = ? WHERE idMateria = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, materia.getNombre());
        ps.setInt(2, materia.getAnio());
        ps.setBoolean(3, materia.isEstado());
        ps.setInt(4, materia.getIdMateria()); 

        int filas = ps.executeUpdate();
        if (filas > 0) {
            JOptionPane.showMessageDialog(null, "Materia modificada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la materia con el ID especificado");
        }

        ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Error de integridad referencial");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Base " + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia(rs.getInt("idMateria"), rs.getString("nombre"),
                rs.getInt("anio"), rs.getBoolean("estado"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return materia;
    }
    public Materia buscarMateriaPorNombreYAnio(String nombre, int anio) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE nombre = ? AND anio = ?"; 
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);  
            ps.setInt(2, anio);     
            ResultSet rs = ps.executeQuery();


            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria")); 
                materia.setNombre(rs.getString("nombre"));    
                materia.setAnio(rs.getInt("anio"));          
                materia.setEstado(rs.getBoolean("estado"));  
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la materia: " + ex.getMessage());
        }
        return materia; 
    }


    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia(rs.getInt("idMateria"), rs.getString("nombre"),
                rs.getInt("anio"), rs.getBoolean("estado"));
                materias.add(materia);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de Base "+ e.getMessage());
        }
        return materias;
    }

    public void eliminarMateria(int id) {
        String sql = "DELETE FROM materia WHERE idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado la Materia N°" + id);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con el ID proporcionado.");
            }
            ps.close();

        } catch (SQLIntegrityConstraintViolationException e) {

            JOptionPane.showMessageDialog(null, "No se puede eliminar la Materia N°" + id + " porque está asociada a inscripciones.", "Error de Integridad Referencial", JOptionPane.WARNING_MESSAGE);


        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar la Materia: " + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }


}

