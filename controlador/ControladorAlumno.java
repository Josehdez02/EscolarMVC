package controlador;

import modelo.ModeloAlumno;
import vista.VentanaAlumno;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAlumno implements ActionListener{

    private final ModeloAlumno modeloAlumno;
    private final VentanaAlumno visionAlumno;

    public ControladorAlumno(ModeloAlumno modeloAlumno, VentanaAlumno visionAlumno) {
        this.modeloAlumno = modeloAlumno;
        this.visionAlumno = visionAlumno;

        this.visionAlumno.btnGuardar.addActionListener(this);
        this.visionAlumno.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        if (visionAlumno.btnGuardar == e.getSource()) {
            System.out.println("Nombre: " + visionAlumno.jtxNombre.getText() + " Número de Control:" + Integer.parseInt(visionAlumno.jtxNumControl.getText())+"Especialidad: "+visionEspecialidad.jtxEspecialidad.getText());
            JOptionPane.showMessageDialog(null, "Registro Guardado!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        } else if (visionAlumno.btnSalir == e.getSource()) {
            Salir();
        }
    }


    public void clear () {
        visionAlumno.jtxNombre.setText("");
        visionAlumno.jtxNumControl.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}