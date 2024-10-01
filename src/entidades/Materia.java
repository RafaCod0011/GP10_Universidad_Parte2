package entidades;

public class Materia {
    // ATRIBUTOS
    private int idMatiera;
    private String nombre;
    private int anioMateria;
    private boolean activo;

// CONSTRUCTOR VACIO
    public Materia(){
    }
// CONSTRUCTOR LLENO
    public Materia(int idMatiera, String nombre, int anioMateria, boolean activo) {
        this.idMatiera = idMatiera;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    // CONSTRUCTOR SIN ID
    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }
    
    // GETTER AND SETTERS

    public int getIdMatiera() {
        return idMatiera;
    }

    public void setIdMatiera(int idMatiera) {
        this.idMatiera = idMatiera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Materia{" + "idMatiera=" + idMatiera + ", nombre=" + nombre + ", anioMateria=" + anioMateria + ", activo=" + activo + '}';
    }
}
