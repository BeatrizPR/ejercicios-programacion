/**Ejercicio 10
  Escribe un programa que calcule la media de un conjunto de números positivos
  introducidos por teclado. A priori, el programa no sabe cuántos números se
  introducirán. El usuario indicará que ha terminado de introducir los datos
  cuando meta un número negativo.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
 public class Ej10 {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número negativo para cerrar el programa");
    System.out.println("Por favor, introduce una nota: ");
    int nota1 = Integer.parseInt( System.console().readLine() );
    System.out.println("Por favor, introduce una nota: ");
    int nota2 = Integer.parseInt( System.console().readLine() );
    int media = (nota1+nota2) /2;
    int otraNota;
      System.out.println("Tu media es " + media);
    do {
      System.out.println("Si quieres cerrar el programa escribe un numero negativo, sino introduce otra nota: ");
      otraNota= Integer.parseInt( System.console().readLine() );
      int notaTotal = (media + otraNota) /2;
      if (notaTotal <=0){ 
        
        } else {
          System.out.println("Tu media es " + notaTotal);
          }
    } while ((nota1 > 0) && (nota2 >0)&& (otraNota >0) );
      
    
    
  }
}
