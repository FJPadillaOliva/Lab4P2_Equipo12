package lab4p2_equipo12;

public class Pokemon {
 private String especie;
    private int nivel;
    private int expAcumulada;
    private int expToLevelUp;
    private int hp;
    private int atk;
    private int def;
    private int sp;
    private int spe;
    private Movimiento[] listaMovimientos = new Movimiento[4];
    private String estado;

    public Pokemon() {
    }

    public Pokemon(String especie, int nivel, int expAcumulada, int expToLevelUp, int hp, int atk, int def, int sp, int spe, String estado,Movimiento[] listaMovimientos) {
        this.especie = especie;
        this.nivel = nivel;
        this.expAcumulada = expAcumulada;
        this.expToLevelUp = expToLevelUp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.sp = sp;
        this.spe = spe;
        this.estado = estado;
        this.listaMovimientos = listaMovimientos;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExpAcumulada() {
        return expAcumulada;
    }

    public void setExpAcumulada(int expAcumulada) {
        this.expAcumulada = expAcumulada;
    }

    public int getExpToLevelUp() {
        return expToLevelUp;
    }

    public void setExpToLevelUp(int expToLevelUp) {
        this.expToLevelUp = expToLevelUp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getSpe() {
        return spe;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public Movimiento[] getListaMovimientos() {
        return listaMovimientos;
    }

    public void setListaMovimientos(Movimiento[] listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pokemon\n" +
                "Especie: " + especie + "\n" +
                "Nivel: " + nivel + "\n" +
                "Experiencia acumulada: " + expAcumulada + "\n" +
                "Experiencia para subir de nivel: " + expToLevelUp + "\n" +
                "Puntos de vida: " + hp + "\n" +
                "Ataque: " + atk + "\n" +
                "Defensa: " + def + "\n" +
                "Ataque especial: " + sp + "\n" +
                "Velocidad especial: " + spe + "\n" +
                "Lista de movimientos: " + listaMovimientos + "\n" +
                "Estado: " + estado;
    }  
}
