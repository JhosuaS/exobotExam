package Exoesqueleto;

public class BrazoIzquierdo {
    private Integer nroDisparo;
    public Metralleta m;

    // public BrazoIzquierdo() {
    //     m = new Metralleta();
    // }

    public Integer getNroDisparo() {
        return nroDisparo;
    }

    public void setNroDisparo(Integer nroDisparo) {
        this.nroDisparo = nroDisparo;
    }

    public boolean fuego(int tiempo) {
        if (tiempo > 0) {
            setNroDisparo(nroDisparo++ );
            this.m.disparar(tiempo);
            return true;
        }
        return false;
    }

    public void ensamblar(Metralleta m) {
        System.out.println("Colocando metralleta...");
        this.m = m;
    }

}
