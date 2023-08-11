package lab4p2_equipo12;

import java.util.Random;

public class AtaqueEstado extends Movimiento {
    private String problemaEstado;

    public AtaqueEstado(String problemaEstado, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.problemaEstado = problemaEstado;
    }

    public String getProblemaEstado() {
        return problemaEstado;
    }

    public void setProblemaEstado(String problemaEstado) {
        this.problemaEstado = problemaEstado;
    }

    @Override
    public int ataque(Pokemon atacante, Pokemon rival) {
        
        int randomEstado = new Random().nextInt(100) + 1;

        if (randomEstado <= 75) {
            aplicarEfectoEstado(rival);
        }

        return 0;
    }

    private void aplicarEfectoEstado(Pokemon pokemon) {
        pokemon.setEstado(problemaEstado);
    }
 
    @Override
    public String toString() {
        return "Ataque Estado\n" +
                "Puntos de poder: " + problemaEstado;
    } 
}
