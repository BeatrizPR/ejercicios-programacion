/*
 * Ejercicio 19
   Escribe un programa que pase de decimal a binario.
 */

package ejercicios;

/**
 *
 * @author Beatriz Parejo Ramos
 */
import java.util.Scanner;
import matematicas.Varias;
public class Ej19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String resultado = "";
    long numeroIntroducido = 666;
    
    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opciÃ³n: ");
    int opcion = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el nÃºmero que quiere convertir: ");
    String numeroIntroducidoString = s.nextLine();
    
    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }
    
    switch (opcion) {
      case 1:
        resultado = Long.toString(Varias.binarioOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(Varias.binarioDecimal(numeroIntroducido));
        break;
      case 3:
        resultado = Varias.binarioHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(Varias.octalBinario(numeroIntroducido));
        break;
      case  5:
        resultado = Long.toString(Varias.binarioDecimal(Varias.octalBinario(numeroIntroducido)));
        break;
      case  6:
        resultado = Varias.binarioHexadecimal(Varias.octalBinario(numeroIntroducido));
        break;
      case  7:
        resultado = Long.toString(Varias.decimalBinario(numeroIntroducido));
        break;
      case  8:
        resultado = Long.toString(Varias.binarioOctal(Varias.decimalBinario(numeroIntroducido)));
        break;
      case  9:
        resultado = Varias.binarioHexadecimal(Varias.decimalBinario(numeroIntroducido));
        break;
      case 10:
        resultado = Long.toString(Varias.hexadecimalBinario(numeroIntroducidoString));
        break;
      case 11:
        resultado = Long.toString(Varias.binarioOctal(Varias.hexadecimalBinario(numeroIntroducidoString)));
        break;
      case 12:
        resultado = Long.toString(Varias.binarioDecimal(Varias.hexadecimalBinario(numeroIntroducidoString)));
        break;
    }
    
    System.out.println(resultado);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Ejemplos

        System.out.println("Imprimir por pantalla");
        
        System.out.println("Introduce un número");
        int n= Integer.parseInt(s.next());

        System.out.print("Ejemplo variable con decimales ");
        double nConDecimal = Double.parseDouble(s.nextLine());

        System.out.print("Variable string con mayuscula o minuscula, lo pasa a minuscula ");
        String iva = s.nextLine().toLowerCase();
    }

}
