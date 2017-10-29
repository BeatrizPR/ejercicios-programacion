/**Ejercicio 21
  Calcula la nota de un trimestre de la asignatura Programación. El programa
  pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
  Si la media de los dos controles da un número mayor o igual a 5, el alumno
  está aprobado y se mostrará la media. En caso de que la media sea un número
  menor que 5, el alumno habrá tenido que hacer el examen de recuperación
  que se califica como apto o no apto, por tanto se debe preguntar al usuario
  ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
  resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
  mantiene la nota media anterior.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;
 
 public class Ej21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduce la nota de tu primer examen: ");
    int primerExamen = Integer.parseInt(s.nextLine());
    System.out.println("Por favor, introduce la nota de tu segundo examen: ");
    int segundoExamen = Integer.parseInt(s.nextLine());
    
    int media = (primerExamen + segundoExamen) /2;
    
    if (media >= 5){
      System.out.println("Enhorabuena estás aprobado. Tu media es de " + media);
    } else if (media<5) {
      System.out.println("Por favor, escribe si en la recuperación estás apto o no apto ");
      String recuperacion = s.nextLine();
        if (recuperacion.equals("apto")){
        System.out.print("Tu media es de 5");
        } else { 
          System.out.print("Tu media es de " + media);
          } 
      } 
    
    
    
    

  }
}
