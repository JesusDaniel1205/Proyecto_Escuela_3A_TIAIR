
import java.sql.Connection;
import java.sql.SQLException;

import models.Conexion;
import screens.VentanaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {

        Connection conn = null;

        try{
             conn = Conexion.conectar();{
                System.out.println("Conexion exitosa a la base de datos");
            }
        } catch (SQLException e){
            System.out.println("Error al conectar l abase de datos" + e.getMessage());
        }


        //solo para asergurar que la apariencia sea consistente en windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal("Proyecto Escuela", conn);
        ventanaPrincipal.setSize(500,500);
        ventanaPrincipal.setVisible(true);
    }
}