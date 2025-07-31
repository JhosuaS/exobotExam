package Exoesqueleto;

import EjercitoRuso.IABot;

public class FuentePoder {
    private Integer nivelEnergia;
    FuentePoder fp;

    public FuentePoder() {        
    }

    public void recargar(IABot ia) {
        System.out.println("Recargando el poder...");
        setNivelEnergia(100);
    }

    public void reemplazar(IABot ia, FuentePoder fp) {
        System.out.println("Reemplazando la fuente de poder...");
        this.fp = fp;
    }

    public Integer getNivelEnergia() {
        return this.fp.nivelEnergia;
    }

    public void setNivelEnergia(Integer nivelEnergia) {
        this.fp.nivelEnergia = nivelEnergia;
    }
    
}
