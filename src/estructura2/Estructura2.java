
package estructura2;

public class Estructura2 {

   
   public static void main(String[] args) {
   
       
    //Punto 1
    /*
    int N =10;
    double A=9;
    char C ='9';
    
    
    System.out.print ("El valor de N es : " +N);
    System.out.print ("\nEl valor de A es: " +A);
    System.out.print ("\nEl valor de C es: +C");
    System.out.print("\nLa suma de N+ A es: " +(N+A));
    System.out.print ("\nLa diferencia de N-A es: " +(N-A));
    System.out.print ("\nEl valor numérico correspondiente al carácter que contiene la variable C es " +C);
    
    
    */
    
   //Punto 5
        
    
        int C=9;
        
        String resultado; //No se qué es ese string 
        
        resultado = (C>=0) ? "El numero es positivo "  : "El numero es negativo ";      
        System.out.println (resultado);
        
        resultado =(C%2==0) ? "El numero es par " : "El numero es impar ";        
        System.out.println (resultado);
        
        resultado = (C%5==0) ? "El numero es multiplo de 5" : "El numero no es multiplo de 5";
        System.out.println(resultado);
        
        resultado = (C%10==0) ? "El numero es multiplo de 10" : "El numero no es multiplo de 10";
        System.out.println(resultado);
        
        resultado = (C>100) ? "El numero es mayor que 100 " : "El numero es menor que 100";
        System.out.println(resultado);
        
    
    }
    
}
