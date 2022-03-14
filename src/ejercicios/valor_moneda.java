
package ejercicios;


public class valor_moneda {
    public static void main(String[] args) {
        
        double dinero, USD, Euro,Libras_esterlina,dolar_australiano,dolar_canadiense;
        
        dinero = 100;
        USD = 1;
        Euro= 0.70;
        Libras_esterlina= 0.61;
        dolar_australiano = 0.95;
        dolar_canadiense = 0.97;
        
        USD = dinero * USD;
        Euro = dinero * Euro;
        Libras_esterlina = dinero * Libras_esterlina;
        dolar_australiano = dinero * dolar_australiano;
        dolar_canadiense = dinero * dolar_canadiense;
        
        System.out.println("En moneda estadounidense es: " + USD);
        System.out.println("En moneda Europea es : " + Euro);
        System.out.println("En moneda del Reino Unido es : "+ Libras_esterlina);
        System.out.println("En moneda de Australia : " + dolar_australiano);
        System.out.println("En moneda de Canada es: " + dolar_canadiense);
        
    }
}
