/**Ejercicio 24
    Escribe un programa que genere la nómina (bien desglosada) de un empleado
    según las siguientes condiciones:
    • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3
    - Jefe de proyecto), los días que ha estado de viaje visitando clientes
    durante el mes y su estado civil (1 - Soltero, 2 - Casado).
    • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
    si se trata de un prog. junior, un prog. senior o un jefe de proyecto
    respectivamente.
    • Por cada día de viaje visitando clientes se pagan 30 euros extra en
    concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será
    de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * 
 * Sigo el estandar de Google
 * 
 * @author Beatriz
 */
import java.util.Scanner;
 public class Ej24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println(" Por favor, introduce el tipo de Cargo con un número (1-3)");
    System.out.println(" 1- Prog. Junior");
    System.out.println(" 2- Prog. Senior");
    System.out.println(" 3- Jefe de Proyecto");
    System.out.println("------------------------");
    int cargo = Integer.parseInt( s.nextLine());
    
    int base=0;
    
    switch (cargo) {
      case 1:
      base=950;
      break;
      case 2:
      base=1200;
      break;
      case 3:
      base=1600;
      break;
      default:
    }
    
    System.out.println(" Introduce el estado civil (1 o 2):");
    System.out.println(" 1- Soltero");
    System.out.println(" 2- Casado");
    System.out.println("---------------------------------------");
    int estadoCivil = Integer.parseInt( s.nextLine());
    
    int irpf=0;
    
    switch (estadoCivil) {
      case 1:
      irpf=25;
      break;
      case 2:
      irpf=20;
      break;
    }
    
    System.out.println("Por favor, introduce los días que has estado de viaje");
    int diaViaje = Integer.parseInt( s.nextLine());
    int dieta = diaViaje *30;
    int bruto=base+dieta;
    int retencion = (bruto *irpf)/100;
    int neto=bruto - retencion;
    
    System.out.println("Sueldo base:"+ base +"€");
    System.out.println("Dietas:"+ dieta +"€");
    System.out.println("Sueldo bruto:"+  bruto +"€");
    System.out.println("Retención IRPF:"+ retencion +"€");
    System.out.println("Sueldo neto:"+ neto +"€");
  }
}
