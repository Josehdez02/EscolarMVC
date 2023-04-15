package vista;
import arreglos.Arreglos;
import controlador.ControladorCatedratico;
import vista.VentanaCatedratico;
import modelo.ModeloCatedratico;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ImprimirCatedratico extends JFrame {
    private JPanel panel1;
    private JTable TablaAlum;

    public ImprimirCatedratico() {
        super();
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        Arreglos.catedratico.add(new ModeloCatedratico( "8548",  "Senen"));

        DefaultTableModel dtm = new DefaultTableModel(
                Arreglos.catedratico.stream()
                        .map(catedratico -> new Object[]{
                                ModeloCatedratico.getRFC(),
                                ModeloCatedratico.getNombre()
                        }).toArray(Object[][]::new),
                new Object[]{"RFC", "Nombre"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }
}
