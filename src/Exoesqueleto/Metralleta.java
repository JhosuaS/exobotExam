package Exoesqueleto;

public class Metralleta {
    private Integer nroBala;

    

    public Metralleta() { 
        setNroBala(1000);
    }

    public Boolean disparar(int tiempo) {
        if (tiempo > 0 && nroBala > 0) {
            return true;
        }
        return false;
    }

    public Integer getNroBala() {
        return nroBala;
    }

    public void setNroBala(Integer nroBala) {
        this.nroBala = nroBala;
    }   

}
  