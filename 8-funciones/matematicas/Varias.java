/**
 * Varias funciones de matemáticas. Del ejercicio 1 al 14
 * del tema 8 Funciones
 */
 
 

package ej16;
public class Varias{
  
      //// EJERCICIO 1 - CAPICUA ////
  
/**
* Función para saber si un numero es capicua.
* Devuelve verdadero si el número que se pasa como parámetro
* es capicúa y falso en caso contrario. 
*
* @param numero es el numero introducido por teclado
* @return <code>true</code> si el número es capicua y <code>false</code> en caso contrario
*/
public static boolean esCapicua (int numero){
  return numero == voltea(numero);
}
  
  
          //// EJERCICIO 2 - PRIMO ////
  
/**
* Función para saber si un numero es primo.
* Devuelve verdadero si el número que se pasa como parámetro
* es primo y falso en caso contrario.
*
* @param numero es el numero introducido por teclado
* @return <code>true</code> si el número es primo y <code>false</code> en caso contrario
*/
public static boolean esPrimo (int numero){
  boolean NumeroPrimo = true;
  for (int i = 2; i < numero; i++) {
    if (numero % i == 0) {
      return false;
    } 
  }
  return true;
}
/**
* Evalúa si un número <code>n</code> es primo o no.
* Un número primo es un número natural mayor que 1 y divisible únicamente
* entre el mismo y entre 1.
*
* @param numero número a evaluar.
* @return <code>true</code> si el número es primo o <code>false</code> en
* caso contrario.
*/
  public static boolean esPrimoNum(int numero) {
  return esPrimo((int) numero);
  }
  
  
        //// EJERCICIO 3 - Siguiente de Primo ////
  
/**
* Función que devuelve el menor primo que es mayor al número que se pasa como parámetro.
*
* @param numero es el numero entero introducido por teclado
* @return devuelve el menor primo que es mayor al número que se pasa
*/
public static int siguientePrimo(int numero) {
  numero++;
  while (!esPrimo(numero)){
    numero++;
    }
  return numero;
}
  
        //// EJERCICIO 4 - POTENCIA ////
  
/**
* Función para sacar potencia.
* Dada una base y un exponente devuelve la potencia.
*
* @param base es el numero introducido por teclado
* @param exponente es el exponente introducido por teclado
* @return calculoPotencia es la potencia
*/
public static double potencia (int base, int exponente){
  double calculoPotencia= Math.pow(base, exponente);
  return calculoPotencia;
}
  
  
        //// EJERCICIO 5 -DIGITOS ////
  
/**
* Función para sacar cuantos digitos tiene un 
* número introducido por teclado
*
* @param numero es el número introducido por teclado
* @return digito es el conjunto de digitos que tiene el número
*/
public static int sacarDigito(int numero){
  int digito=0;
  for (int i=1; i<=numero;i*=10){
    digito++;
  }
  return digito;
}
public static int sacarDigito(long numero){
  int digito=1;
  while(numero>9){
    numero=numero/10;
    digito++;
  }
  return digito;
  
  /**
   * Forma simplificada
   * int digito=Integer.toString(numero).length();
   * return digito;**/
   
   
} // temina el public static de sacarDigito
  
  
  
     //// EJERCICIO 6 - VOLTEA ////
     
/**
* Función para darle la vuelta a un número 
*
* @param numero es el número introducido por teclado
* @return volteado es el numero al que se le da la vuelta
*/
public static int voltea(int numero){
  int volteado=0;
  do{
    volteado = (volteado*10)+ (numero%10);
    numero /= 10; 
    } while (numero >0); 
  return volteado;
}  
  
public static int voltea(long numero){
  long volteado=0;
  do{
    volteado = (volteado*10)+ (numero%10);
    numero /= 10; 
    } while (numero >0); 
  return (int)volteado;
  }  
  
  
      //// EJERCICIO 7 - DIGITO N ////
 
/**
* Devuelve el dígito que está en la posición n de un número
* entero. Se empieza contando por el 0 y de izquierda a derecha. 
*
* @param numero es el número introducido por teclado
* @param n es el número introducido por teclado, que sirve para mirar
* posición
* @return es el número que se encuentra en el lugar dado por teclado
*/
public static int digitoNum(int numero, int n){
  int aux= voltea(numero);
  if (n==1){
    return aux%10;
  } else{
      for (int i=0; i<n; i++){
        aux=aux/10;
      }
    return aux%10;
    }
}

public static int digitoNum(long numero, int n){
  long aux= voltea(numero);
  if (n==1){
    return (int)aux%10;
  } else{
      for (int i=0; i<n; i++){
        aux=aux/10;
      }
    return (int)aux%10;
    }
}


        //// EJERCICIO 8 - POSICIÓN DE DIGITO Y DEVUELVE DIGITO O -1 ////

/**
* Da la posición de la primera ocurrencia de un dígito
* dentro de un número entero. Si no se encuentra, devuelve -1. 
*
* @param numero es el número introducido por teclado
* @param digito es el número introducido por teclado, que sirve para mirar
* posición
* @return es el numero que devuelve la posición de un digito y si no se encuentra un -1.
*/
public static int posicionDigito(int numero, int digito){
  int volteado = voltea(numero);
  int i=0;
  while (volteado>=1){
    if (digito== volteado%10){
      return i;
    }
    volteado= volteado/10;
    i++;
  }
  return -1;
  } 
  
  
        ///// EJERCICIO 9- Quita dígitos por detrás /////
  
  /**
* Le quita a un número n dígitos por detrás (por la derecha) 
*
* @param numero es el número introducido por teclado
* @param digito es el número introducido por teclado, que sirve para quitar el numero que se escriba por detrás
* @return es el numero que devuelve sin los digitos que se le quitan por la izquierda.
*/
public static int quitaPorDetras(int numero, int digito){
  for (int i=0; i<digito; i++){
    numero= numero/10;
  }
  return numero;
}

  
          ///// EJERCICIO 10- Quita dígitos por delante /////
  
  /**
* Le quita a un número n dígitos por delante (por la derecha) 
*
* @param numero es el número introducido por teclado
* @param digito es el número introducido por teclado, que sirve para quitar el numero que se escriba por delante
* @return es el numero que devuelve sin los digitos que se le quitan por la derecha.
*/
public static int quitaPorDelante(int numero, int digito){
  numero = voltea(numero);
    for (int i=0; i<digito; i++){
      numero/=10;
    }
  return voltea(numero);
  
}


          ///// EJERCICIO 11- Añadir dígitos por detrás /////
  
  /**
* Añade un dígito a un número por detrás. 
*
* @param numero es el número introducido por teclado
* @param digito es el número introducido por teclado, que sirve para añadirlo por detras
* @return es el numero que devuelve el número con los digitos al final unidos
*/
public static int pegaPorDetras(int numero, int digito){
  String unirNum =String.valueOf(numero)+String.valueOf(digito);
  int numUnido =Integer.valueOf(unirNum);
  return numUnido;
}
  
  
      ///// EJERCICIO 12- Añadir dígitos por delante /////
  
  /**
* Añade un dígito a un número por delante. 
*
* @param numero es el número introducido por teclado
* @param digito es el número introducido por teclado, que sirve para añadir el digito delante del numero
* @return es el numero que devuelve con el digito añadido.
*/
public static int pegaPorDelante(int numero, int digito){
  String unirNum =String.valueOf(digito)+ String.valueOf(numero);
  int numUnido =Integer.valueOf(unirNum);
  return numUnido;
} 
  
  
  ///// EJERCICIO 13- Trozo de número /////
  
  /**
* Toma como parámetros las posiciones inicial y final
* dentro de un número y devuelve el trozo correspondiente.
*
* @param numero es el número introducido por teclado
* @param inicio es el número introducido por teclado, que sirve para coger parte del inicio del número
* @param fin es el número introducido por teclado, que sirve para coger parte del final del número
* @return es el numero que devuelve con los dos trozos de inicio y fin.
*/
public static int trozoDeNumero(int numero, int inicio, int fin){
  
  return numero;
} 
  
  
  ///// EJERCICIO 14- Junta números /////
  
  /**
* Pega dos números para formar uno.
*
* @param numero1 es el primer número introducido por teclado
* @param numero2 es el segundo número introducido por teclado
* @return es el numero que devuelve con los dos números unidos en uno.
*/
public static int juntaNumeros(int numero1, int numero2){
  String numerosJuntos =String.valueOf(numero1)+String.valueOf(numero2);
  int unionNum =Integer.valueOf(numerosJuntos);
  return unionNum;
} 
  
  
} // cierre de la llave public class
