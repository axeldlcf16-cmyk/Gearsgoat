import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import com.toedter.calendar.JCalendar;

public class Practica2 extends JFrame {

    public Practica2() {
        setTitle("Registro");
        setSize(950, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 🎨 Cambiar color de fondo
        getContentPane().setBackground(new Color(240, 248, 255));

        // 🟢 Barra de menú con color
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(100, 149, 237)); // azul bonito
        menuBar.setForeground(Color.WHITE);

        JMenu menu = new JMenu("Menú");
        menu.setForeground(Color.WHITE);

        JMenuItem menuDatos = new JMenuItem("Datos");
        JMenuItem menuProveedor = new JMenuItem("Proveedor");
        JMenuItem menuInformacion = new JMenuItem("Información");
        menu.add(menuDatos);
        menu.add(menuProveedor);
        menu.add(menuInformacion);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245, 245, 245));

        JPanel panelIzquierda = new JPanel();
        panelIzquierda.setLayout(new BoxLayout(panelIzquierda, BoxLayout.Y_AXIS));
        panelIzquierda.setBackground(new Color(255, 250, 240));

        // 🟡 Panel Datos
        JPanel panelDatos = new JPanel(new GridLayout(5, 2, 5, 5));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos del Producto"));
        panelDatos.setBackground(new Color(255, 255, 224)); // amarillo claro

        panelDatos.add(new JLabel("Producto:"));
        JComboBox<String> comboProducto = new JComboBox<>(new String[]{"Producto A", "Producto B", "Producto C"});
        panelDatos.add(comboProducto);

        panelDatos.add(new JLabel("Cantidad:"));
        JComboBox<String> comboCantidad = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});
        panelDatos.add(comboCantidad);

        panelDatos.add(new JLabel("Precio:"));
        JTextField txtPrecio = new JTextField();
        panelDatos.add(txtPrecio);

        panelDatos.add(new JLabel("Existencia:"));
        JTextField txtExistencia = new JTextField();
        panelDatos.add(txtExistencia);

        panelDatos.add(new JLabel("Descripción:"));
        JTextField txtDescripcion = new JTextField();
        panelDatos.add(txtDescripcion);

        // 🔵 Panel Proveedor
        JPanel panelProveedor = new JPanel(new GridLayout(3, 2, 5, 5));
        panelProveedor.setBorder(BorderFactory.createTitledBorder("Proveedor"));
        panelProveedor.setBackground(new Color(224, 255, 255)); // azul clarito

        panelProveedor.add(new JLabel("Clave:"));
        JTextField txtClave = new JTextField();
        panelProveedor.add(txtClave);

        panelProveedor.add(new JLabel("Fecha Pedido:"));
        JCalendar calendar = new JCalendar();
        panelProveedor.add(calendar);

        panelProveedor.add(new JLabel("Producto:"));
        JComboBox<String> comboProveedorProd = new JComboBox<>(new String[]{"Producto X", "Producto Y", "Producto Z"});
        panelProveedor.add(comboProveedorProd);

        panelIzquierda.add(panelDatos);
        panelIzquierda.add(panelProveedor);

        // 🟣 Panel Información
        JPanel panelInfo = new JPanel(new BorderLayout());
        panelInfo.setBorder(BorderFactory.createTitledBorder("Información"));
        panelInfo.setBackground(new Color(248, 248, 255));

        JPanel panelClave = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelClave.setBackground(new Color(248, 248, 255));
        panelClave.add(new JLabel("Clave:"));
        JTextField txtClaveInfo = new JTextField(15);
        panelClave.add(txtClaveInfo);
        panelInfo.add(panelClave, BorderLayout.NORTH);

        String[] columnas = {"Clave", "Producto", "Cantidad", "Precio", "Estado"};
        Object[][] datosEjemplo = {
                {"001", "Producto A", "2", "50.00", "Disponible"},
                {"002", "Producto B", "5", "120.00", "Agotado"},
                {"003", "Producto C", "1", "30.00", "Disponible"},
                {"004", "Producto D", "10", "200.00", "Pedido"},
                {"005", "Producto E", "3", "75.00", "Disponible"},
        };

        DefaultTableModel model = new DefaultTableModel(datosEjemplo, columnas);
        JTable tabla = new JTable(model);
        tabla.setBackground(new Color(255, 248, 220));
        tabla.setGridColor(Color.GRAY);
        tabla.setSelectionBackground(new Color(173, 216, 230));

        JScrollPane scrollPane = new JScrollPane(tabla,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(400, 150));
        panelInfo.add(scrollPane, BorderLayout.CENTER);

        // 🔘 Botones con color
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBotones.setBackground(new Color(245, 245, 245));

        JButton btnNuevo = new JButton("➕ Nuevo");
        btnNuevo.setBackground(new Color(152, 251, 152)); // verde claro

        JButton btnGuardar = new JButton("💾 Guardar");
        btnGuardar.setBackground(new Color(135, 206, 250)); // azul cielo

        JButton btnBuscar = new JButton("🔍 Buscar");
        btnBuscar.setBackground(new Color(255, 182, 193)); // rosa claro

        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnBuscar);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierda, panelInfo);
        splitPane.setDividerLocation(350);

        mainPanel.add(splitPane, BorderLayout.CENTER);
        mainPanel.add(panelBotones, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Practica2().setVisible(true);
        });
    }
}

