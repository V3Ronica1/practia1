
package ejercicios;


public class salario_docente {
    public static void main(String[] args) {
        double salario, renta, salario_total;
        
        salario = (8.00*36);
        renta= (0.10 * salario);
        salario_total= salario - renta;
        
        System.out.println("El salario total es: " + salario_total);
    }
}
