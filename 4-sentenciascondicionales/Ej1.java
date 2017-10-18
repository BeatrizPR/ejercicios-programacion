/**
 * Sentencia múltiple (switch) 
 *
 * @author Beatriz 
 */

public class Ej1 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca el día de la semana: ");
    String dia = System.console().readLine().toLowerCase();
    
    String primeraClase;
   
    switch (dia) {
      case "lunes":
        primeraClase = "Sistemas";
        break;
      case "martes":
        primeraClase = "Programación";
        break;
      case "miércoles":
        primeraClase = "Sistemas";
        break;
        case "miercoles":
        primeraClase = "Sistemas";
        break;
      case "jueves":
        primeraClase = "Programación";
        break;
      case "viernes":
        primeraClase = "Programación";
        break;
      default:
        primeraClase = "Ese día no hay clase";
    }

    System.out.println("A primera hora del " + dia + " hay : " + primeraClase);
  }
}
