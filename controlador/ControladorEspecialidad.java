package controlador;

import modelo.ModeloEspecialidad;
import vista.VentanaEspecialidad;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControladorEspecialidad implements ActionListener{
    private final ModeloEspecialidad modeloEspecialidad;
    private final VentanaEspecialidad visionEspecialidad;

    public ControladorEspecialidad(ModeloEspecialidad modeloEspecialidad, VentanaEspecialidad visionEspecialidad) {
        this.modeloEspecialidad = modeloEspecialidad;
        this.visionEspecialidad = visionEspecialidad;

        this.visionEspecialidad.btnGuardar.addActionListener(this);
        this.visionEspecialidad.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        if (visionEspecialidad.btnGuardar == e.getSource()) {
            System.out.println("Nombre: " + visionEspecialidad.jtxNombre.getText() + " ID:" + Integer.parseInt(visionEspecialidad.jtxID.getText()));
            JOptionPane.showMessageDialog(null, "Registro Guardado!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        } else if (visionEspecialidad.btnSalir == e.getSource()) {
            Salir();
        }
    }

//comentario//
    public void clear () {
        visionEspecialidad.jtxNombre.setText("");
        visionEspecialidad.jtxID.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}


