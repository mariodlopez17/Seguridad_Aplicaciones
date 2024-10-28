import javax.swing.*;

public class LoginF extends JFrame {
//hola esto es una prueba
    public LoginF() {
        // Configura el título de la ventana
        setTitle("Login");

        // Configura el tamaño de la ventana
        setSize(350, 200);

        // Cierra la aplicación al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centra la ventana en la pantalla
        setLocationRelativeTo(null);

        // Crea el panel para el contenido
        JPanel panel = new JPanel();
        add(panel);

        // Llama al método para agregar componentes
        placeComponents(panel);

        // Haz visible la ventana
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Etiqueta de "Usuario"
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(50, 30, 80, 25);
        panel.add(userLabel);

        // Campo de texto para el nombre de usuario
        JTextField userText = new JTextField(20);
        userText.setBounds(140, 30, 150, 25);
        panel.add(userText);

        // Etiqueta de "Contraseña"
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 70, 80, 25);
        panel.add(passwordLabel);

        // Campo de texto para la contraseña
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(140, 70, 150, 25);
        panel.add(passwordText);

        // Botón de "Iniciar Sesión"
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(110, 120, 120, 25);
        panel.add(loginButton);
    }

    public static void main(String[] args) {
        // Ejecuta el programa en el hilo de la interfaz de usuario
        SwingUtilities.invokeLater(() -> new LoginF());
    }
}
