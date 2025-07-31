package EjercitoRuso;

import Exoesqueleto.ITecnicoIngles;

public class ExpertoIngles extends Humano {

    public ExpertoIngles(Integer id, String nombre) {
        super(id, nombre);
    }

    public void enseniar(ITecnicoIngles inglesExobot){
        System.out.println("Enseñar ITecnicoIngles inglés.");
    }
}
