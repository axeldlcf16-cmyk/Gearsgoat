import javax.swing.*;
import java.awt.*;

public class FormAlumno extends JFrame {

    public FormAlumno() {
        setTitle("Alumno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblApellido = new JLabel("Apellidos:");
        JLabel lblTelefono = new JLabel("Teléfono:");
        JLabel lblDireccion = new JLabel("Dirección:");
        JLabel lblFechaNac = new JLabel("Fecha Nacimiento:");

        JTextField txtNombre = new JTextField(15);
        JTextField txtApellido = new JTextField(15);
        JTextField txtTelefono = new JTextField(15);
        JTextField txtDireccion = new JTextField(15);
        JTextField txtFecha = new JTextField(15); // Aquí en lugar de JCalendar

        JRadioButton rbF = new JRadioButton("F");
        JRadioButton rbM = new JRadioButton("M");
        JRadioButton rbO = new JRadioButton("O");

        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(rbF);
        grupoGenero.add(rbM);
        grupoGenero.add(rbO);

        gbc.gridx = 0; gbc.gridy = 0; add(lblNombre, gbc);
        gbc.gridx = 1; add(txtNombre, gbc);

        gbc.gridx = 0; gbc.gridy = 1; add(lblApellido, gbc);
        gbc.gridx = 1; add(txtApellido, gbc);

        gbc.gridx = 0; gbc.gridy = 2; add(lblTelefono, gbc);
        gbc.gridx = 1; add(txtTelefono, gbc);

        gbc.gridx = 0; gbc.gridy = 3; add(lblDireccion, gbc);
        gbc.gridx = 1; add(txtDireccion, gbc);

        gbc.gridx = 0; gbc.gridy = 4; add(lblFechaNac, gbc);
        gbc.gridx = 1; add(txtFecha, gbc);

        gbc.gridx = 0; gbc.gridy = 5; add(new JLabel("Género:"), gbc);
        gbc.gridx = 1;
        JPanel panelGenero = new JPanel();
        panelGenero.add(rbF);
        panelGenero.add(rbM);
        panelGenero.add(rbO);
        add(panelGenero, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FormAlumno::new);
    }
}