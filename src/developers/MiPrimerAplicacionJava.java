
package developers;


public class MiPrimerAplicacionJava {
    public static void main(String[] args) {
        //Declarar variables (ejemplos de algunos tipos de datos)
        String nombreCompleto, direccion, estadoCivil; 
        int edad;
        double gastosDiarios;
        char genero;
        boolean poseeVehiculo;
        
        //Inicializacion de variables
        nombreCompleto = "Camila Esperanza Rosales";
        direccion= "Calle de la armagura desvio de la tristeza";
        estadoCivil = "Soltera";
        edad = 30;
        gastosDiarios = 34.45;
        genero = 'F';
        poseeVehiculo = false;
        
        //Uso de variables(mostrar en pantalla las variables)
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Direccion      : " + direccion);
        System.out.println("Estado Civil   : " + estadoCivil);
        System.out.println("Edad           : " + edad);
        System.out.println("Gastos diarios : " + gastosDiarios);
        System.out.println("Genero         : " + genero);
        System.out.println("Posee Vehiculo : " + poseeVehiculo);
    }
    
}
