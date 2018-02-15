/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9tanda2ej7;

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;

public class Tema9tanda2ej07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcion = 0;
    int opcionEntradas = 0;
    int numEntradas = 0;

    do {
      System.out.println("Menu de Expocoches Campanillas");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.println("Elige una opción: ");

      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          System.out.println("En la zona principal hay " + principal.getEntradasPorVender());
          System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
          System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
          break;
        case 2:
          System.out.println("¿En qué zona quieres las entradas? ");
          System.out.println("1. Principal");
          System.out.println("2. Compra-venta");
          System.out.println("3. Vip");

          opcionEntradas = Integer.parseInt(s.nextLine());

          System.out.print("¿Cuántas entradas quieres? ");
          numEntradas = Integer.parseInt(s.nextLine());

          switch (opcionEntradas) {
            case 1:
              principal.vender(numEntradas);
              break;
            case 2:
              compraVenta.vender(numEntradas);
              break;
            case 3:
              vip.vender(numEntradas);
              break;
            default:
          }
          break;
        default:
      }
    } while (opcion < 3);

  }

}
