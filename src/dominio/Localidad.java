package dominio;

public class Localidad {

    private String nombre;
    private int numeroDeHabitantes;


    //CONSTRUCTOR
    public Localidad (String nombre, int numeroDeHabitantes) {
        this.nombre = nombre;
        this.numeroDeHabitantes = numeroDeHabitantes;

    }//cierre del constructor

    //constructor vacio
    public Localidad () {
        nombre = "";
        numeroDeHabitantes = 0;

    }//cierre del constructor


    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }
    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }




    //añadimos toString
    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeHabitantes=" + numeroDeHabitantes +
                '}';
    }
}
