import javax.swing.*;
import java.awt.*;

public class VentanaRegistro extends JFrame {

    public VentanaRegistro() {
        setTitle("Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new FlowLayout());

        JLabel lblDescripcion = new JLabel("Descripción:");
        JTextField txtDescripcion = new JTextField(15);
        JButton btnNuevo = new JButton("Nuevo");
        JButton btnAgregar = new JButton("Agregar");

        panelSuperior.add(lblDescripcion);
        panelSuperior.add(txtDescripcion);
        panelSuperior.add(btnNuevo);
        panelSuperior.add(btnAgregar);

        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(panelSuperior, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaRegistro::new);
    }
}
