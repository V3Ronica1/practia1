
package ejercicios;


public class Resistencia_Equivalente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r1, r2, r3, r4 , req;
        
        r1= 5.1;
        r2= 68;
        r3= 75;
        r4= 82;
        
        req= 1/(1/r1)+(1/r2)+(1/r3)+(1/r4);
        
        System.out.println("La resistencia equivalente es: " + req);
        
        
       
    }
    
}
