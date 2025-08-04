package BusinessLogic.Entities;
import BusinessLogic.BLFactory;
import DataAccess.DAO.DAOIABOT;
public class IABot {


    private static BLFactory<DAOIABOT> blf = new BLFactory<>(DAOIABOT::new);
    private static IABot instancia;
    private static String version;

    private IABot() { }// Constructor privado para evitar instanciación directa
    protected IABot(IABot iaBot) {
        if (iaBot != null) {
            instancia = iaBot;
        }
    }
    public static IABot getInstancia() {
        if (instancia == null) {
            instancia = new IABot();
            IABot.setVersion("tmp 0.0"); // Establecer una versión por defecto
        }
        return instancia;
    }
    public static IABot getInstancia(int idIABot) throws Exception{
        String ver = blf.getBy(idIABot).getVersion();
        if (ver != null){
        IABot.setVersion(ver);
    }
        return instancia;
    }

    public static String getVersion() {
        return version;
    }
    public static void setVersion(String version) {
        IABot.version = version.toUpperCase();
    }
}
