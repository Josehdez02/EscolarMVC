package modelo;

public class ModeloEspecialidad{
    private int ID;
    private String nombre;

    public ModeloEspecialidad(){}

    public ModeloEspecialidad(int ID, String Nombre){
        this.ID=ID;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID ) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "ModeloEspecialidad{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public void imprmir(){
        System.out.println(toString());
    }
}

