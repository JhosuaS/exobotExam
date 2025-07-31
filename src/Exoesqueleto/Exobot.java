package Exoesqueleto;

import EjercitoRuso.IABot;
import EjercitoRuso.IHumanoExtremidad;

public class Exobot extends IABot implements IHumanoExtremidad{
    private Boolean         inicializado;
    private FuentePoder     fuentepoder;
    private TurboReactor    turboreactor;
    private BrazoDerecho    brazoDerecho;
    private BrazoIzquierdo  brazoIzquierdo;
    private Pierna          piernaDerecha;
    private Pierna          piernaIzquierda;
    private String          nroSerie;

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public Exobot(String nroSerie, FuentePoder fp) {
        setNroSerie(nroSerie);
        inicializado    = false;
        fuentepoder     = new FuentePoder();
        turboreactor    = new TurboReactor();
        brazoDerecho    = new BrazoDerecho();
        brazoIzquierdo  = new BrazoIzquierdo();
        piernaDerecha   = new Pierna();
        piernaIzquierda = new Pierna();
        System.out.println("Exobot armado...");
    }

    public Boolean inicializar() {
        if (!inicializado) {
            System.out.println("Iniciando Exobot...");
        }
        return inicializado;
    }

    public void dispararMetralleta() {
        if (!inicializado) {
            brazoIzquierdo.fuego(1);
        }
    }

    public void dispararLaser() {
        if (!inicializado) {
            brazoDerecho.fuego(1,fuentepoder.getNivelEnergia());
        }
    }


    public void volar() {
        this.turboreactor.volar(10);
    }
}


