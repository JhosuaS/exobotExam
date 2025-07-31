package EjercitoRuso;

public class IABot {

    private static IABot instance;

    protected  IABot() {}

    public static IABot getInstance() { //garantizar que solo exista una instancia de IABot
        if (instance == null) {
            instance = new IABot();
        }
        return instance;
    }
}