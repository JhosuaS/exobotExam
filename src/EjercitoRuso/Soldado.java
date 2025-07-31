package EjercitoRuso;

import Exoesqueleto.Exobot;

public class Soldado extends Humano {
    // private Boolean hablilidadBrazoIzquierdo;
    // private Boolean habilidadBrazoDerecho;

    Exobot eb;

    public Soldado(Integer id, String nombre) {
        super(id, nombre);
        System.out.println("Soldado preparado...");
    }

    public Boolean poner(Exobot eb) {
        this.eb = eb;
        System.out.println("Soldado " + getNombre() + " se ha puesto un " + eb.getNroSerie());
        return true;
    }
}
