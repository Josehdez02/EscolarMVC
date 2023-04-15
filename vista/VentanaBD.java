package vista;

import modelo.ModeloAlumno;
import modelo.ModeloEspecialidad;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaBD extends JFrame{

    private VentanaAlumno visionAlumno;
    private JPanel panel1;
    private JTable table1;

    public VentanaBD() {
        super("BD");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        ArregloAlumnos.estudiantes.add(new ModeloAlumno(3,"f",new ModeloEspecialidad()));


                DefaultTableModel dtm = new DefaultTableModel(
                ArregloAlumnos.estudiantes.stream()
                        .map(ModeloAlumno -> new Object[]{
                                ModeloAlumno.getNumControl(),
                                ModeloAlumno.getNombre(),
                                ModeloAlumno.getModeloEspecialidad(),
                        }).toArray(Object[][]::new),
                new Object[]{"noControl", "Nombre", "Especialidad"}
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       // this.reporteButton.addActionListener(new ControladorReporte());
        table1.setModel(dtm);
        setVisible(true);
    }
}
