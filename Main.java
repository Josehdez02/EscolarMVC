import controlador.ControladorAlumno;
import controlador.ControladorCatedratico;
import controlador.ControladorVentanaPrincipal;
import modelo.ModeloAlumno;
import vista.*;
public class Main {
    public static void main(String[] args) {
        //ImprimirCatedratico ic= new ImprimirCatedratico();
        VentanaPrincipal v1=new VentanaPrincipal();
        ControladorVentanaPrincipal c1=new ControladorVentanaPrincipal(v1);
       // ImprimirCatedratico v2 =new ImprimirCatedratico();
        //ControladorCatedratico c2 =new ControladorCatedratico(v2);
        //VentanaAlumno v2=new VentanaAlumno();
        //ModeloAlumno m1=new ModeloAlumno();
        //ControladorAlumno c2=new ControladorAlumno(m1,v2);
    }
}