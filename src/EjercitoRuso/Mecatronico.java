package EjercitoRuso;

import Exoesqueleto.Exobot;

public class Mecatronico extends Humano {

    Exobot eb;

    public Mecatronico(Integer id, String nombre) {
        super(id, nombre);
    }

    public Mecatronico(Integer id, String nombre, Exobot eb) {
        super(id, nombre);
        this.eb = eb;
    }

}
