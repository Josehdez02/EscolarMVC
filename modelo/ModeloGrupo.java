package modelo;


public class ModeloGrupo {
    private String hora;
    private int clave, salon;
    public ModeloGrupo() {
    }

    public ModeloGrupo(int clave, String hora, int salon) {
        this.clave = clave;
        this.hora = hora;
        this.salon = salon;
    }

    public static int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }


    @Override
    public String toString() {
        return "ModeloGrupo{" +
                "clave='" + clave + '\'' +
                ", hora=" + hora +
                ", salon=" + salon +
                '}';
    }

    public void imprimir(){
        System.out.println(toString());
    }

}
