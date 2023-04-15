package modelo;

public class ModeloAlumno {
    private int numControl;
    private String nombre;
    private ModeloEspecialidad modeloEspecialidad;

    public ModeloAlumno(int numControl, String nombre, ModeloEspecialidad modeloEspecialidad) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.modeloEspecialidad = modeloEspecialidad;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ModeloEspecialidad getModeloEspecialidad() {
        return modeloEspecialidad;
    }

    public void setEspecialidad(ModeloEspecialidad especialidad) {
        this.modeloEspecialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numControl=" + numControl + ", nombre='" + nombre + '\'' + ", especialidad=" + Modeloespecialidad + '}';
    }

    public void imprimir(){
        System.out.println(toString());
    }
}
