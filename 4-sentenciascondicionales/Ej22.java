/**Ejercicio 22
  Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
  hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
  Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
  por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
  a las 15:00h.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;
public class Ej22 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String dia = s.nextLine().toLowerCase();

    int diaSemana = 1;

    switch(dia) {
      case "lunes":
        diaSemana = 1;
        break;
      case "martes":
        diaSemana = 2;
        break;
      case "miércoles":
      case "miercoles":
        diaSemana = 3;
        break;
      case "jueves":
        diaSemana = 4;
        break;
      case "viernes":
        diaSemana = 5;
        break;
    }
    
    System.out.print("Por favor, introduce la hora  en formato 24h (sin los minutos):" );
    int horas = Integer.parseInt(s.nextLine());
    
    System.out.print("Por favor, introduce los minutos: ");
    int minutos = Integer.parseInt(s.nextLine());
    
    final int total = (5 * 24 * 60) + (15 * 60);
    int minutosAhora = (diaSemana * 24 * 60) + (horas * 60) + minutos;
    int faltan =total-minutosAhora;
    /** dia 5 *24 *60= 7200 minutos
     * el finde empieza a las 15:00 - 15*60 = 900 minutos
     * totalminutos= 7200 + 900 = 8100 minutos */
    System.out.println("Quedan "+ faltan + " minutos para que sea fin de semana"); 
    
  }
}

