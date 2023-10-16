import dominio.Localidad;
import dominio.Municipio;

public class Main {

    public static void main(String[] args) {
        //Inicializar objeto Localidad
        Localidad localidad = new Localidad();
        Municipio municipio = new Municipio();

        //Poner los valores
        localidad.setNombre("Madrid");
        localidad.setNumeroDeHabitantes(1);

        //Imprimimos
        //System.out.print(localidad.getNombre()+" tiene " + localidad.getNumeroDeHabitantes()+" habitantes");

        //Creamos otra localidad
        Localidad localidad2 = new Localidad("Leganes",1);

        //Añadimos las localidades al objeto municipio
        municipio.setNombre("Comunidad de Madrid");
        municipio.addLocalidad(localidad);
        municipio.addLocalidad(localidad2);
        municipio.calcularNumeroTotalHabitantesMunicipio();

        System.out.println(municipio);



       // System.out.print(municipio.getNumeroTotalHabitantesMunicipio());







    }
}