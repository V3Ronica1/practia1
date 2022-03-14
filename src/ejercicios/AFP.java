
package ejercicios;


public class AFP {
    public static void main(String[] args) {
        double afp_empleado, sueldo,afp_empleador, sueldo_total;
        
        sueldo= 500;
        
        
        afp_empleado = sueldo * 0.06;
        afp_empleador = sueldo * 0.065;
        sueldo_total= sueldo - afp_empleado;
        
        
        System.out.println("El empleado en concepto de AFP paga: " + afp_empleado );
        System.out.println("El empleador en concepto de AFP paga: " + afp_empleador);
        System.out.println("El sueldo total de empleado es: " + sueldo_total);
        
        
        
        
        
    }
    
}
