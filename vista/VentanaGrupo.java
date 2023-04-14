package vista;

import javax.swing.*;

public class VentanaGrupo extends JFrame {
    private JPanel panel1;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelCentro;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JLabel lblClave;
    public JTextField jtxtClave;
    public JLabel lblHora;
    public JTextField jtxtHora;
    public JLabel lblSalon;
    public JTextField jtxtSalon;

    public VentanaGrupo(){
        setTitle("Alta Grupo");
        setContentPane(panel1);
        setSize(500, 140);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
