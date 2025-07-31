package EjercitoRuso;

import Exoesqueleto.Exobot;
import Exoesqueleto.FuentePoder;

public class Whiterun {
    IABot       ia; 
    FuentePoder fp; 
    Exobot      e ; 
    Soldado     s ; 

    public void iniciar() {
        ia = IABot.getInstance();
        fp = new FuentePoder();
        e  = new Exobot("Serie JUGG3RN0G", fp);
        s  = new Soldado(1, "Pepe");

        s.poner(e);

    }
}
  