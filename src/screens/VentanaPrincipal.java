package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; // Barra de menú
    private JMenu menuAlumnos; // Menú Alumnos
    private JMenuItem menuInsertarAlumnos; // Elemento Insertar
    private JMenuItem menuVerAlumnos;
    private JMenuItem menuEliminarAlumno;

    private JMenu menuBachilleratos;
    private JMenuItem menuVerBachilleratos;

    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        // Barra de menú
        menuBar = new JMenuBar();

        // menu Alumnos
        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        // menu Insertar
        menuInsertarAlumnos = new JMenuItem();
        menuInsertarAlumnos.setText("Insertar...");

        //menu verAlumnos
        menuVerAlumnos = new JMenuItem("Ver Todos los Alumnos...");

        //menu borrarAlumnos
        menuEliminarAlumno = new JMenuItem("Dar de baja alumno...");

        //menu bachilleratos
        menuBachilleratos = new JMenu();
        menuBachilleratos.setText("Bachilleratos");
        //menu Ver Bachilleratos
        menuVerBachilleratos = new JMenuItem("Ver Todos los Bachilleratos...");

        //gregando menu Alumnos
        menuAlumnos.add(menuInsertarAlumnos);
        menuAlumnos.add(menuVerAlumnos);
        menuAlumnos.add(menuEliminarAlumno);
        menuBar.add(menuAlumnos);

        //Agregra menu Bachilleratos
        menuBachilleratos.add(menuVerBachilleratos);
        menuBar.add(menuBachilleratos);

        this.setJMenuBar(menuBar);//es la unica barra del JFrame

        pack();//empaquetar los componentes del JFrame

    }

}