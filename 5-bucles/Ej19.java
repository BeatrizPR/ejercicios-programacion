/** Ejercicio 19.
 *Realiza un programa que pinte una pirámide por pantalla. La altura se debe
  pedir por teclado. El carácter con el que se pinta la pirámide también se debe
  pedir por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;
public class Ej19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pinta una pirámide");
    System.out.print("Introduzca un carácter de relleno: ");
    String c = System.console().readLine();
    
    System.out.print("¿Qué altura quieres que tenga la pirámide? ");
    int altura= Integer.parseInt(s.next());
    
    int h=0;
    int i=0; 
    /**int espacioBlanco=altura-1; */
    while (h<=altura){
      for(i=1;i<altura; i++ ) {
        int caracter = i%2;
        if (caracter==0){
        System.out.print(c); 
      } else {
        System.out.print(" ");}
    }
    
  
    

          
              
    /**System.out.printf("%20s\n",  p );
    System.out.printf("%21s\n",  p+p+p );
    System.out.printf("%22s\n",  p+p+p+p+p );
    System.out.printf("%23s\n",  p+p+p+p+p+p+p );
    System.out.printf("%24s\n",  p+p+p+p+p+p+p+p+p ); */
        
    }
   
  }
}
