package App.Form;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PatForm extends JFrame{
    public PatForm() {
        setTitle("IABot - PatForm");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //boton de cerrar
        setLocationRelativeTo(null); //center the window
        setResizable(false); //Disable resizing
    }
    public void initComponents() {
        // Initialize components here
        JButton btnExample = new JButton("Example Button");
        //PatButton patButton = new PatButton("Click me");
        btnExample.addActionListener(e -> {
            // Action to perform when the button is clicked
            System.out.println("Button clicked!");
        });
        add(btnExample);
        setLayout(null); // Use no layout manager
        setVisible(true); // Make the frame visible
    }

    public void showForm() {
        initComponents();
        setVisible(true);
    }
}
