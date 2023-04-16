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



    public ModeloAlumno(int numControl, String nombre, ModeloEspecialidad modeloEspecialidad){
        this.numControl=numControl;
        this.nombre=nombre;
        this.modeloEspecialidad=modeloEspecialidad;
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

    public ModeloEspecialidad getModeloEspecialidad() {
        return modeloEspecialidad;
    }

    public void setModeloEspecialidad(ModeloEspecialidad modeloEspecialidad) {
        this.modeloEspecialidad = modeloEspecialidad;
    }

    @Override
    public String toString() {

        return "ModeloAlumno{" +
                "numControl=" + numControl +
                ", nombre='" + nombre + '\'' +
                ", Especialidad=" + modeloEspecialidad +
                '}';
    }


    public void imprimir(){

        System.out.println(toString());
    }
}

//correccion
