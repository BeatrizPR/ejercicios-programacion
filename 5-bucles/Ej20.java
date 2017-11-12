/**Ejercicio 20
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 * 
 * */
import java.util.Scanner;

public class Ej20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      System.out.print("Por favor introduzca una altura: ");
        int alturaIntroducida=Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el caracter con el que quiera dibujar: " );
        String c =s.nextLine();
        
        int altura=1; 
        int espacios = alturaIntroducida-1;
        /** espacios externos antes de los asteriscos*/
        int caracteres=1;
        int espaciosInternos=1; // cantidad de caracteres a dibujar
        
        for (int i=1; i<=espacios; i++){
          System.out.print (" ");
        }
        
        System.out.print(c); // dibuja el caracter
        altura++;
        System.out.println(); //salto de línea
        caracteres+=2;
        espacios--;
        
        while (altura<alturaIntroducida){
          for (int i=1; i<=espacios; i++){
          System.out.print (" ");
          }
          System.out.print(c);
          
          for (int i=1; i<=espaciosInternos; i++){
          System.out.print (" "); //espacios internos
          }
          System.out.print(c); //asterisco de la derecha
          altura++;
          espacios--;
          caracteres+=2;
          espaciosInternos+=2;
          
          System.out.println();
        }
        
        for (int i=1; i<=caracteres; i++){ //imprime la base de la piramide
          System.out.print (c);
        }
  }
}
