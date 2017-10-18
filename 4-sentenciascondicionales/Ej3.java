/**
 * Ejercicio 3
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana.
 *
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */

public class Ej3 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca el día de la semana en número: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String nombreSemana;
    
    switch (dia) {
      case 1:
        nombreSemana = "Lunes";
        break;
      case 2:
        nombreSemana = "Martes";
        break;
      case 3:
        nombreSemana = "Miércoles";
        break;
      case 4:
        nombreSemana = "Jueves";
        break;
      case 5:
        nombreSemana = "viernes";
        break;
      case 6:
        nombreSemana = "Sábado";
        break;
      case 7:
        nombreSemana = "Domingo";
        break;
      default:
        nombreSemana = "No existe ese día de la semana";
    }

    System.out.println("El día " + dia + " es: " + nombreSemana);
  }
}
