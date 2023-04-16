package vista;

import javax.swing.*;

public class VentanaAlumno extends JFrame{
    private JPanel panel1;
    private JPanel panelCentro;
    private JPanel panelSur;
    private JPanel panelNorte;
    public JTextField jtxNumControl;
    public JLabel lblNumControl;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JTextField jtxNombre;
    public JLabel lblNombre;
    public JTextField jtxEspecialidad;
    public JLabel lblEspecialidad;

    public VentanaAlumno(){
        setTitle("Alta Alumno");
        setContentPane(panel1);
        setSize(500,140);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
