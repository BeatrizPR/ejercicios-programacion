/** Ejercicio 15.
 *Escribe un programa que pinte una pirámide rellena con un carácter introducido
  por teclado que podrá ser una letra, un número o un símbolo como *, +,
  -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
  el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
  izquierda o hacia la derecha.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */

public class Ej15 {
  public static void main(String[] args) {
    
    System.out.println("¿Cómo quieres que dibuje la piramide?");
    System.out.print("Introduzca un carácter de relleno: ");
    String p = System.console().readLine();
    
    System.out.println(" ----------------------");
    System.out.println(" 1. Una pirámide con el vértice hacia arriba.");
    System.out.println(" 2. Una pirámide con el vértice hacia abajo.");
    System.out.println(" 3. Una pirámide con el vértice hacia la derecha.");
    System.out.println(" 4. Una pirámide con el vértice hacia la izquierda.");
    System.out.print("\n Elija una opción (1 - 4): ");
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        
    System.out.printf("%20s\n",  p );
    System.out.printf("%21s\n",  p+p+p );
    System.out.printf("%22s\n",  p+p+p+p+p );
    System.out.printf("%23s\n",  p+p+p+p+p+p+p );
    System.out.printf("%24s\n",  p+p+p+p+p+p+p+p+p );
        
        break;
    
      case 2:
    System.out.printf("%24s\n",  p+p+p+p+p+p+p+p+p );
    System.out.printf("%23s\n",  p+p+p+p+p+p+p );
    System.out.printf("%22s\n",  p+p+p+p+p );
    System.out.printf("%21s\n",  p+p+p );
    System.out.printf("%20s\n",  p );
      break;
    
    case 3:
    
    System.out.printf("%21s\n",  p );
    System.out.printf("%21s\n",  p+p );
    System.out.printf("%21s\n",  p+p+p );
    System.out.printf("%21s\n",  p+p+p+p );
    System.out.printf("%21s\n",  p+p+p+p+p );
    System.out.printf("%21s\n",  p+p+p+p );
    System.out.printf("%21s\n",  p+p+p );
    System.out.printf("%21s\n",  p+p );
    System.out.printf("%21s\n",  p );
      break;
    case 4:
        
    System.out.printf("%21s\n",      p );
    System.out.printf("%21s\n",     p+p );
    System.out.printf("%21s\n",    p+p+p );
    System.out.printf("%21s\n",   p+p+p+p );
    System.out.printf("%21s\n",  p+p+p+p+p );
    System.out.printf("%21s\n",   p+p+p+p );
    System.out.printf("%21s\n",    p+p+p );
    System.out.printf("%21s\n",     p+p );
    System.out.printf("%21s\n",      p );

      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
   
  }
}
