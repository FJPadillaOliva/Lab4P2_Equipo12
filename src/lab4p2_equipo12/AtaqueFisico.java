package lab4p2_equipo12;

import java.util.Random;

public class AtaqueFisico extends Movimiento {
    private int puntosPoder;
    private int puntosPrecision;

    public AtaqueFisico(int puntosPoder, int puntosPrecision, String nombre, String descripcion) {
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
        int random = rand.nextInt(50) + 1;
        int damage;

        if (atacante.getAtk() > rival.getDef()) {
            damage = random * 2;
        } else if (atacante.getAtk() < rival.getDef()) {
            damage = (int) (random * 0.5);
        } else {
            damage = random;
        }

        rival.setHp(rival.getHp() - damage);

        return damage;
    }

    @Override
    public String toString() {
        return "Ataque Fisico\n" +
                "Puntos de poder: " + puntosPoder + "\n" +
                "Puntos de precisión: " + puntosPrecision;
    } 
}
