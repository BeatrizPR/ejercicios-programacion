/**Ejercicio 6.
 * 
 *  Escribe un programa que piense un número al azar entre 0 y 100. El usuario
    debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
    fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
    es menor o mayor que el número secreto.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej6 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Adivina que número estoy pensando, tienes 5 oportunidades");
      int numero =(int)(Math.random()* 100);
      System.out.println(numero);
      System.out.print("Introduce un número: ");
      int numIntroducido=Integer.parseInt(s.nextLine());
      int totalIntentos=4;
     
      
      
      if (numero==numIntroducido){ //sacamos el numero minimo
          System.out.println("¡Enhorabuena, has adivinado el número!");
        } else if (numero !=numIntroducido){ //sacamos el numero maximo
            System.out.print("Te quedan 4 intentos. ");
            for (int i=0; i<4; i++){

                if (numIntroducido < numero){
                  System.out.println("Lo siento, ese no es el número.");
                  System.out.println(" ");
                  System.out.println("El número que estoy pensando es más grande");
                  System.out.println("Introduce otro número: ");
                  numIntroducido=Integer.parseInt(s.nextLine());
                  if (numero==numIntroducido){ //sacamos el numero minimo
                    System.out.println("¡Enhorabuena, has adivinado el número!");
                  } else {
                      totalIntentos-=1;
                      System.out.print("Te quedan " + totalIntentos + " intentos");
                    }
                } else if (numIntroducido> numero){
                  System.out.println("Lo siento, ese no es el número.");
                  System.out.println(" ");
                  System.out.println("El número que estoy pensando es más pequeño");
                  System.out.println("Introduce otro número: ");
                  numIntroducido=Integer.parseInt(s.nextLine());
                  if (numero==numIntroducido){ //sacamos el numero minimo
                    System.out.println("¡Enhorabuena, has adivinado el número!");
                  } else {
                      totalIntentos-=1;
                      System.out.print("Te quedan " + totalIntentos + " intentos");
                    }
                } 
                    
              
               
            }
            
          }
  }
}
