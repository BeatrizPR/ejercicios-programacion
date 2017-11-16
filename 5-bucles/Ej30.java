/**Ejercicio 30
 * 
    Realiza una programa que calcule las horas transcurridas entre dos horas de
    dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
    El día de la semana se puede pedir como un número (del 1 al 7) o como una
    cadena (de "lunes" a "domingo"). Se debe comprobar que el usuario introduce
    los datos correctamente y que el segundo día es posterior al primero.
      Ejemplo:
      Por favor, introduzca la primera hora.
      Día: lunes
      Hora: 18
      Por favor, introduzca la segunda hora.
      Día: martes
      Hora: 20
      Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz Parejo Ramos
 * 
 * */
import java.util.Scanner;

public class Ej30 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      
      System.out.println("Con este programa calculamos las horas transcurridas entre dos horas de dos días de la semana. ");
      System.out.println(" " );
      System.out.print("Por favor introduzca un día de la semana: ");
      String dia1=s.nextLine().toLowerCase();
      System.out.print("Introduzca una hora en formato 24h: " );
      int horaS1 =Integer.parseInt(s.nextLine());
      System.out.println(" " );
      System.out.println(" " );
      System.out.print("Por favor introduzca un día de la semana: ");
      String dia2=s.nextLine().toLowerCase();
      System.out.print("Introduzca una hora en formato 24h: " );
      int horaS2 =Integer.parseInt(s.nextLine());
      
      boolean todoEsCorrecto = true;
      
      int diaSemanaN1; //Para poner el 1º día de la semana con número
      String diaSemanaLetra1=" "; // Para poner el 1º día de la semana con letra
      
      int diaSemanaN2=0; //Para poner el 2º día de la semana con número
      String diaSemanaLetra2=" "; // Para poner el 2º día de la semana con letra
      
      do {
        switch(dia1) {
          case "lunes":
          case "1":
            diaSemanaN1 = 1;
            diaSemanaLetra1= "Lunes";
            break;
          case "martes":
          case "2":
            diaSemanaN1 = 2;
            diaSemanaLetra1= "Martes";
            break;
          case "miércoles":
          case "miercoles":
          case "3":
            diaSemanaN1 = 3;
            diaSemanaLetra1= "Miércoles";
            break;
          case "jueves":
          case "4":
            diaSemanaN1 = 4;
            diaSemanaLetra1= "Jueves";
            break;
          case "viernes":
          case "5":
            diaSemanaN1 = 5;
            diaSemanaLetra1= "Viernes";
            break;
          case "sabado":
          case "sábado":
          case "6":
            diaSemanaN1 = 6;
            diaSemanaLetra1= "Sábado";
            break;
          case "domingo":
          case "7":
            diaSemanaN1 = 7;
            diaSemanaLetra1= "Domingo";
            break;
          default:
            diaSemanaN1 = 0;
        }
      
      
      
      
      switch(dia2) {
      case "lunes":
      case "1":
        diaSemanaN2 = 1;
        diaSemanaLetra2= "Lunes";
        break;
      case "martes":
      case "2":
        diaSemanaN2 = 2;
        diaSemanaLetra2= "Martes";
        break;
      case "miércoles":
      case "miercoles":
      case "3":
        diaSemanaN2 = 3;
        diaSemanaLetra2= "Miércoles";
        break;
      case "jueves":
      case "4":
        diaSemanaN2 = 4;
        diaSemanaLetra2= "Jueves";
        break;
      case "viernes":
      case "5":
        diaSemanaN2 = 5;
        diaSemanaLetra2= "Viernes";
        break;
      case "sabado":
      case "sábado":
      case "6":
        diaSemanaN2 = 6;
        diaSemanaLetra2= "Sábado";
        break;
      case "domingo":
      case "7":
      diaSemanaN2 = 7;
        diaSemanaLetra2= "Domingo";
        break;
        default:
          diaSemanaN2 = 0;
      }
        
        
        if ((diaSemanaN1==0) || (diaSemanaN2==0)){
          System.out.print("El día de la semana introducido es incorrecto ");
        }
        if (diaSemanaN2<diaSemanaN1) {
          System.out.print("El segundo día tiene que ser mayor que el primero ");
        }
        if ((horaS1 <0)|| (horaS2<0) || (horaS1>=24) || (horaS2 >=24) ){
          System.out.print("La hora no es correcta ");
        }
      
      todoEsCorrecto = false;
      
    } while (todoEsCorrecto);
    
    int horaDia1 = (diaSemanaN1 * 24) + horaS1; //Calcular el total de horas del primer día
    int horaDia2 = (diaSemanaN2 * 24)+ horaS2;  // Calcular el total de horas del segundo día
    int totalHoras = horaDia2 - horaDia1;  // Calcular el total de las horas
    todoEsCorrecto = false;
    while (!todoEsCorrecto){
       System.out.println(" "); //Es por estética, que no salga todo pegado
       System.out.println(" ");
      System.out.println("Entre el" + diaSemanaLetra1 + " a las "+ horaS1 +  " hasta " + diaSemanaLetra2 + " a las "+ horaS2+ " faltan " + totalHoras + " horas." );
      todoEsCorrecto=true;
    }
      
      
  }
}
