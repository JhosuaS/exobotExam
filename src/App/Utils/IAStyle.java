package App.Utils;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Font;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class IAStyle {
    public static final Color COLOR_FONT = new Color(220, 0, 0); //(218, 8, 40)
    public static final Color COLOR_FONT_LIGHT = new Color(100, 100, 100); 
    public static final Color COLOR_CURSOR = Color.black;
    public static final Color COLOR_BORDER = Color.lightGray; 
    public static final Font FONT = new Font("JetBrains Mono", Font.PLAIN, 14);
    public static final Font FONT_BOLD = new Font("JetBrains Mono", Font.BOLD | Font.PLAIN, 14);
    public static final Font FONT_SMALL = new Font("JetBrains Mono", Font.PLAIN | Font.PLAIN, 10);

    public static final int ALIGNMENT_LEFT = SwingConstants.LEFT;
    public static final int ALIGNMENT_RIGHT = SwingConstants.RIGHT;
    public static final int ALIGNMENT_CENTER = SwingConstants.CENTER;

    public static final Cursor CURSOR_HAND = new Cursor(Cursor.HAND_CURSOR);
    public static final Cursor CURSOR_DEFAULT = new Cursor(Cursor.DEFAULT_CURSOR);  

    public static final URL URL_MAIN = IAStyle.class.getResource("/App/Assets/Images/IABot.png");
    public static final URL URL_LOGO = IAStyle.class.getResource("/App/Assets/Images/Logo.png");
    public static final URL URL_SPLASH = IAStyle.class.getResource("/App/Assets/Images/Splash.png");

    public static final CompoundBorder createBoderRect () {
        return BorderFactory.createCompoundBorder(  new LineBorder(Color.lightGray),
                                                    new EmptyBorder(5, 5, 5, 5));
    }

    public static final void showMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "🥺 IABot", JOptionPane.INFORMATION_MESSAGE);
    }

    public static final void showError(String msg) {
        JOptionPane.showMessageDialog(null, msg, "😢 IABot", JOptionPane.ERROR_MESSAGE);
    }

    public static final boolean showFirmYesNo(String msg) {
        return (JOptionPane.showConfirmDialog(null, msg, "😐 IABot", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
