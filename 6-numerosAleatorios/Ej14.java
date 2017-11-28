/**Ejercicio 14.
 * 
 *  Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
    El programa intentará adivinar el número que estás pensando - un número
    entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
    programa debe preguntar si el número que estás pensando es mayor o menor
    que el que te acaba de decir.
* 
*   Sigo el estandar de Google
*
*  @author Beatriz Parejo Ramos
*/
import java.util.Scanner;

public class Ej14 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Voy a adivinar el número que estás pensando. Tienes que pensar un número entre el 0 y el 100");
      int numero =(int)(Math.random()* 100);
     
      System.out.print("Introduce un número: ");
      int numIntroducido=Integer.parseInt(s.nextLine());
      int totalIntentos=4;
     
    System.out.print("¿El número que estás pensando es mayor ? s/n");
    //String comprobar=s.nextLine().toLowerCase();
    
    
     
      
      /**
      if (numero==numIntroducido){ //sacamos el numero minimo
          System.out.println("¡Bien! ¡Lo he adivinado!");
        } else if (numero !=numIntroducido){ //sacamos el numero maximo
            System.out.print("Te quedan 4 intentos. ");
            for (int i=0; i<4; i++){

                if (numIntroducido < numero){
                  System.out.println("Lo siento, ese no es el número.");
                  System.out.println(" ");
                  System.out.println("El número que estás pensando es más grande");
                  System.out.println("Introduce otro número: ");
                  numIntroducido=Integer.parseInt(s.nextLine());
                  if (numero==numIntroducido){ //sacamos el numero minimo
                    System.out.println("¡Enhorabuena, has adivinado el número!");
                  } else {
                      totalIntentos-=1;
                      System.out.print("Te quedan " + totalIntentos + " intentos");
                      System.out.println(" ");
                    }
                } else if (numIntroducido> numero){
                  System.out.println("Lo siento, ese no es el número.");
                  System.out.println(" ");
                  System.out.println("El número que estás pensando es más pequeño");
                  System.out.println(" ");
                  System.out.println("Introduce otro número: ");
                  numIntroducido=Integer.parseInt(s.nextLine());
                  if (numero==numIntroducido){ //sacamos el numero minimo
                    System.out.println("¡Enhorabuena, has adivinado el número!");
                  } else {
                      totalIntentos-=1;
                      System.out.print("Te quedan " + totalIntentos + " intentos. ");
                      System.out.println(" ");
                    }
                } 

            }
            System.out.print("El número que estaba pensando es " + numero);
          }
          * 
          * */
  }
}
