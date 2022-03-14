
package ejercicios;


public class horas_extras {
    public static void main(String[] args) {
        double horas_extras, salario_diario, total_horas, salario_total, renta, salario;
        
        salario_diario = 10;
        horas_extras = salario_diario * 0.10;
        
        
        total_horas = horas_extras * 50;
        salario = (salario_diario * 30) + total_horas;
        renta = salario * 0.10;
        salario_total = salario - renta;
        
        
        
        System.out.println("El trabajador ganara al final del mes : $ " + salario);
        System.out.println("El salario total es : $ " + salario_total);
        
    }
    
}
