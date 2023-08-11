package lab4p2_equipo12;

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
    public int ataque() {
        return 0;
    }

    @Override
    public String toString() {
        return "AtaqueFisico{" + 
                "puntosPoder=" + puntosPoder + 
                ", puntosPrecision=" + puntosPrecision;
    }
}
