import App.Form.PatForm;
import EjercitoRuso.Whiterun;
import BusinessLogic.Entities.whiterun;
public class App {
    public static void main(String[] args) throws Exception {
        Whiterun w = new Whiterun();
        w.iniciar();
        // whiterun
    PatForm patForm = new PatForm();
    patForm.showForm(); // Show the PatForm window
        Whiterun whiterun = new Whiterun();
        whiterun.iniciar();
    }
}

