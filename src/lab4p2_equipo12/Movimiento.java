package lab4p2_equipo12;

public abstract class Movimiento {
    private String nombre;
    private String descripcion;

    public Movimiento() {
    }

    public Movimiento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract int ataque(Pokemon atacante, Pokemon rival);
    
    @Override
    public String toString() {
        return "Movimiento\n" +
                "Nombre: " + nombre + "\n" +
                "Descripción: " + descripcion;
    } 
}
