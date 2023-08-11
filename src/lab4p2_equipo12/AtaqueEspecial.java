package lab4p2_equipo12;

import java.util.Random;

public class AtaqueEspecial extends Movimiento {
    private int puntosPoder;
    private int puntosPrecision;

    public AtaqueEspecial(int puntosPoder, int puntosPrecision, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.puntosPoder = puntosPoder;
        this.puntosPrecision = puntosPrecision;
    }

    public int getPuntosPoder() {
        return puntosPoder;
    }

    public void setPuntosPoder(int puntosPoder) {
        this.puntosPoder = puntosPoder;
    }

    public int getPuntosPrecision() {
        return puntosPrecision;
    }

    public void setPuntosPrecision(int puntosPrecision) {
        this.puntosPrecision = puntosPrecision;
    }
    
    @Override
    public int ataque(Pokemon atacante, Pokemon rival) {
        Random rand = new Random();
        int random1 = rand.nextInt(50) + 1; 
        int random2 = rand.nextInt(401) + 100;

        int sumaEspeciales = atacante.getSp() + rival.getSp(); // Suma de los atributos especiales

        if (sumaEspeciales == random2) {
            random1 *= 2; // Multiplicar random1 por el 2
        }

        int damage = random1; // Damage
        rival.setHp(rival.getHp() - damage); // Restar el damage a los puntos de vida del rival
        
        return damage; // Devolver el damage
    }

    @Override
    public String toString() {
        return "Ataque Especial\n" +
                "Puntos de poder: " + puntosPoder + "\n" +
                "Puntos de precisión: " + puntosPrecision;
    }  
}
