package tets;

import javax.swing.ImageIcon;
import view.Login;

public class main {
    public static void main(String[] args) {
        ImageIcon icono = new ImageIcon("src/img/logo.png");
        
        Login login = new Login();
        login.setIconImage(icono.getImage());
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
