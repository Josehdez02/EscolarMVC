package modelo;

public class ModeloCatedratico {
    public static String RFC;
    public static String nombre;

    public ModeloCatedratico(){}

    public ModeloCatedratico(String RFC, String nombre){
        this.RFC=RFC;
        this.nombre=nombre;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }


    @Override
    public String toString() {
        return "Modelo Catedratico{" +
                "RFC=" + RFC +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
    public void imprmir(){
        System.out.println(toString());
    }
}