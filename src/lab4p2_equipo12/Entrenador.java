package lab4p2_equipo12;

import java.util.ArrayList;

public class Entrenador {   
    private String nombre;
    private int edad;
    private int dinero;
    private ArrayList<Pokemon> equipo = new ArrayList();
    private ArrayList<Pokemon> caja = new ArrayList();
    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, int dinero, ArrayList<Pokemon> equipo, ArrayList<Pokemon> caja) {
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

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
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
