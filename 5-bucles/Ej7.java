/**Ejercicio 7
    Realiza el control de acceso a una caja fuerte. La combinación será un
    número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
    acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
    y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
    Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
public class Ej7 {
  public static void main(String[] args) {
        
    System.out.println("Escribe un número de 4 cifras");
    int n = Integer.parseInt(System.console().readLine());
    
    if (n== 2345){
      System.out.println("La caja fuerte se ha abierto satisfactoriamente");
    } else {
      System.out.println("Lo siento, esa no es la combinación");
    
    for (int n; !n=2345; n+=4) {

      System.out.println("vuelve a intentarlo");
      }
    
    /**int n=320;
    while ((n<=320) && (n>160)){
      n-=20;
      System.out.println(n);
    }*/
      }
  }
}
