import javax.swing.JFrame;

import screens.VentanaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Proyecto Escuela");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       VentanaPrincipal ventanaPrincipal = 
       new VentanaPrincipal("Proyecto Escuela");
       ventanaPrincipal.setVisible(true);
    }
}