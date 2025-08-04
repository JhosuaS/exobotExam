package BusinessLogic.Entities;

import java.util.List;
import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import BusinessLogic.BLFactory;
import DataAccess.DAD.DAOExabot;
public class Whiterun {
    public static IABot oIABot;
    public List<DTOExabot> lstExobot;

    public Whiterun() throws Exception {
        oIABot = IABot.getInstancia(idIABot);
        lstExobot = new ArrayList<>();
    }
    public void crearExobot() throws Exception{
        if(oIABot == null) 
            throw new IllegalStateException("-IABot no Existe...!");

            lstExobot = daoExabot.readAll(idIABot);

        for (DTOExabot DTOExabot : lstExobot) {
            System.out.println(dtoExabot.toString() );
        }
    }
}
