package modelo;

public class ModeloAlumno {
    private int numControl;
    private String nombre;

    public ModeloAlumno(){}

    public ModeloAlumno(int numControl, String nombre){
        this.numControl=numControl;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    @Override
    public String toString() {
        return "ModeloAlumno{" +
                "numControl=" + numControl +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public void imprmir(){
        System.out.println(toString());
    }
}
