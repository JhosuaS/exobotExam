package Exoesqueleto;

public class BrazoDerecho {
    private Integer nroDisparo;
    public Laser l;

    public BrazoDerecho() {
        l = new Laser();
    }    

    public Integer getNroDisparo() {
        return nroDisparo;
    }

    public void setNroDisparo(Integer nroDisparo) {
        this.nroDisparo = nroDisparo;
    }

    public boolean fuego(int tiempo, int nivelEnergia) {
        if (tiempo > 1 && nivelEnergia > 0) {
            setNroDisparo(nroDisparo++ );
            l.disparar(tiempo);
            return true;
        }
        return false;
    }
}
