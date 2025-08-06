package App.CustomerControl;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import App.Utils.*;  

public class PatLabel extends JLabel {
    public PatLabel(){
        customizeComponent(" ", IAStyle.FONT, IAStyle.COLOR_FONT.LIGHTM IAStyle.ALIGNMENT_LEFT);
    }

    public PatLabel(String text){
        customizeComponent(text, IAStyle.FONT, IAStyle.COLOR_FONT.LIGHTM IAStyle.ALIGNMENT_LEFT);
    }

    public void setCustomizeComponent(Font font, Color color, int aligment) {
        customizeComponent(getText(), font, color, aligment);
    }

    public void setCustomizeComponent(String text, Font font, Color color, int aligment) {
        customizeComponent(text, font, color, aligment);
    }

    private void customizeComponent(String text, Font font, Color color, int aligment) {
        setText(text);
        setFont(font);
        setOpaque(false);
        setBackground(null);
        setForeground(color);
        setHorizontalAlignment(aligment);
        //setIcon(new ImagenIcon(iconPath));
    }
}