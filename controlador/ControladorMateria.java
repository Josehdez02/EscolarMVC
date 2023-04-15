package controlador;


import modelo.ModeloMateria;
import vista.VentanaMateria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMateria implements ActionListener {

    private final ModeloMateria modeloMateria;
    private final VentanaMateria visionMateria;

    public ControladorMateria(ModeloMateria modeloMateria, VentanaMateria visionMateria) {
        this.modeloMateria = modeloMateria;
        this.visionMateria = visionMateria;
        this.visionMateria.btnGuardar.addActionListener(this);
        this.visionMateria.btnSalir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (visionMateria.btnGuardar == e.getSource()) {
            System.out.println("Materia: " + visionMateria.jtxMateria.getText() + " ID:" + Integer.parseInt(visionMateria.jtxID.getText()));
            JOptionPane.showMessageDialog(null, "Registro Guardado!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            clear();
        } else if (visionMateria.btnSalir == e.getSource()) {
            Salir();
        }


    }

    public void clear () {
        visionMateria.jtxID.setText("");
        visionMateria.jtxMateria.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}
// modificacion

