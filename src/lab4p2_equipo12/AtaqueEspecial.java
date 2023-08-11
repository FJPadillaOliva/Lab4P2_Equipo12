package lab4p2_equipo12;

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
    public String toString() {
        return "AtaqueEspecial{" + 
                "puntosPoder=" + puntosPoder + 
                ", puntosPrecision=" + puntosPrecision;
    }   
}
