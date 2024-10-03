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
                materia.setIdMateria(rs.getInt(1)); // Le asignamos el ID
                JOptionPane.showMessageDialog(null, "Materia guardada correctamente ID " + rs.getInt(1));
            }
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Error de integridad referencial");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Base "+ ex.getMessage());
            
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
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado la Materia N°" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

