/**Ejercicio 8
    Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
public class Ej8 {
  public static void main(String[] args) {
        
    System.out.println("Escribe un número para multiplicarlo");
    int n = Integer.parseInt(System.console().readLine());
    
    int tabla ;
    int multiplicacion = 0;
    System.out.println("Tabla de multiplicar");
    do {
      tabla= n * multiplicacion;
      System.out.println(" " + n + "*"+ multiplicacion + "= " + tabla + " ");
      
      multiplicacion++;
    } while (multiplicacion <=10);
  }
}
