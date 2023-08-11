package lab4p2_equipo12;

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
    public String toString() {
        return "AtaqueEstado{" + "problemaEstado=" + problemaEstado + '}';
    }  
}
