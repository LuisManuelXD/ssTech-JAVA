package tets;

import javax.swing.ImageIcon;
import view.Menu;

public class main {
    public static void main(String[] args) {
        ImageIcon icono = new ImageIcon("src/img/logo.png");
        
        Menu menu = new Menu();
        menu.setIconImage(icono.getImage());
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
