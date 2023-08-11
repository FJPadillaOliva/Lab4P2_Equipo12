package lab4p2_equipo12;

import java.util.List;

public class Entrenador {   
    private String nombre;
    private int edad;
    private int dinero;
    private List<Pokemon> equipo;
    private List<Pokemon> caja;

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, int dinero, List<Pokemon> equipo, List<Pokemon> caja) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.equipo = equipo;
        this.caja = caja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public List<Pokemon> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public List<Pokemon> getCaja() {
        return caja;
    }

    public void setCaja(List<Pokemon> caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "Entrenador{" + 
                "nombre=" + nombre + 
                ", edad=" + edad + 
                ", dinero=" + dinero + 
                ", equipo=" + equipo + 
                ", caja=" + caja;
    }
    
    
}