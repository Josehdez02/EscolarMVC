package vista;

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelCentro;
    public JLabel lblTitle;
    public JButton btnAceptar;
    public JComboBox cbxAltas;
    public JLabel lblOpcion;
    public VentanaPrincipal() {
        setTitle("Ventana Principal");
        setContentPane(panelPrincipal);
        setSize(500, 140);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //panelPrincipal.add();
    }
}
