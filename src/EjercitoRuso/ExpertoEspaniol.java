package EjercitoRuso;

import Exoesqueleto.ITecnicoEspaniol;

public class ExpertoEspaniol extends Humano {
    public ExpertoEspaniol(Integer id, String nombre) {
        super(id, nombre);
    }

    public void enseniar(ITecnicoEspaniol espaniolExobot){
        System.out.println("Enseñar ITecnicoEspaniol espaniol.");
    }
}



