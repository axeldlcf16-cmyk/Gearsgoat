import javax.swing.*;

public class VentanaOpciones extends JFrame {

    public VentanaOpciones() {
        setTitle("Opciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menu1");
        JMenu menu2 = new JMenu("Menu2");
        JMenu menuSalir = new JMenu("Salir");

        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        JMenuItem opcion3 = new JMenuItem("Opción 3");

        menu1.add(opcion1);
        menu1.add(opcion2);
        menu1.add(opcion3);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menuSalir);

        setJMenuBar(menuBar);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaOpciones::new);
    }
}