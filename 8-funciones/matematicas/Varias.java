/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

/**
 *
 * @author Bea
 */
public class Varias {

  //// EJERCICIO 1 - CAPICUA ////
  /**
   * Función para saber si un numero es capicua. Devuelve verdadero si el número
   * que se pasa como parÃ¡metro es capicúa y falso en caso contrario.
   *
   * @param numero es el numero introducido por teclado
   * @return <code>true</code> si el número es capicua y <code>false</code> en
   * caso contrario
   */
  public static boolean esCapicua(int numero) {
    return numero == voltea(numero);
  }

  //// EJERCICIO 2 - PRIMO ////
  /**
   * Función para saber si un numero es primo. Devuelve verdadero si el número
   * que se pasa como parámetro es primo y falso en caso contrario.
   *
   * @param numero es el numero introducido por teclado
   * @return <code>true</code> si el número es primo y <code>false</code> en
   * caso contrario
   */
  public static boolean esPrimo(int numero) {
    boolean NumeroPrimo = true;
    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * EvalÃºa si un nÃºmero <code>n</code> es primo o no. Un nÃºmero primo es un
   * nÃºmero natural mayor que 1 y divisible Ãºnicamente entre el mismo y entre
   * 1.
   *
   * @param numero nÃºmero a evaluar.
   * @return <code>true</code> si el nÃºmero es primo o <code>false</code> en
   * caso contrario.
   */
  public static boolean esPrimoNum(int numero) {
    return esPrimo((int) numero);
  }

  //// EJERCICIO 3 - Siguiente de Primo ////
  /**
   * Función que devuelve el menor primo que es mayor al número que se pasa
   * como parámetro.
   *
   * @param numero es el numero entero introducido por teclado
   * @return devuelve el menor primo que es mayor al número que se pasa
   */
  public static int siguientePrimo(int numero) {
    numero++;
    while (!esPrimo(numero)) {
      numero++;
    }
    return numero;
  }

  //// EJERCICIO 4 - POTENCIA ////
  /**
   * Función para sacar potencia. Dada una base y un exponente devuelve la
   * potencia.
   *
   * @param base es el numero introducido por teclado
   * @param exponente es el exponente introducido por teclado
   * @return calculoPotencia es la potencia
   */
  public static double potencia(int base, int exponente) {
    double calculoPotencia = Math.pow(base, exponente);
    return calculoPotencia;
  }

  //// EJERCICIO 5 -DIGITOS ////
  /**
   * FunciÃ³n para sacar cuantos digitos tiene un nÃºmero introducido por
   * teclado
   *
   * @param numero es el nÃºmero introducido por teclado
   * @return digito es el conjunto de digitos que tiene el nÃºmero
   */
  public static int sacarDigito(int numero) {
    int digito = 0;
    for (int i = 1; i <= numero; i *= 10) {
      digito++;
    }
    return digito;
  }

  public static int sacarDigito(long numero) {
    int digito = 1;
    while (numero > 9) {
      numero = numero / 10;
      digito++;
    }
    return digito;

    /**
     * Forma simplificada int digito=Integer.toString(numero).length(); return digito;*
     */
  } // temina el public static de sacarDigito

  //// EJERCICIO 6 - VOLTEA ////
  /**
   * FunciÃ³n para darle la vuelta a un nÃºmero
   *
   * @param numero es el nÃºmero introducido por teclado
   * @return volteado es el numero al que se le da la vuelta
   */
  public static int voltea(int numero) {
    int volteado = 0;
    do {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } while (numero > 0);
    return volteado;
  }

  public static int voltea(long numero) {
    long volteado = 0;
    do {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } while (numero > 0);
    return (int) volteado;
  }

  //// EJERCICIO 7 - DIGITO N ////
  /**
   * Devuelve el dÃ­gito que estÃ¡ en la posiciÃ³n n de un nÃºmero entero. Se
   * empieza contando por el 0 y de izquierda a derecha.
   *
   * @param numero es el nÃºmero introducido por teclado
   * @param n es el nÃºmero introducido por teclado, que sirve para mirar
   * posiciÃ³n
   * @return es el nÃºmero que se encuentra en el lugar dado por teclado
   */
  public static int digitoNum(int numero, int n) {
    int aux = voltea(numero);
    if (n == 1) {
      return aux % 10;
    } else {
      for (int i = 0; i < n; i++) {
        aux = aux / 10;
      }
      return aux % 10;
    }
  }

  public static int digitoNum(long numero, int n) {
    long aux = voltea(numero);
    if (n == 1) {
      return (int) aux % 10;
    } else {
      for (int i = 0; i < n; i++) {
        aux = aux / 10;
      }
      return (int) aux % 10;
    }
  }

  //// EJERCICIO 8 - POSICIÃ“N DE DIGITO Y DEVUELVE DIGITO O -1 ////
  /**
   * Da la posiciÃ³n de la primera ocurrencia de un dÃ­gito dentro de un nÃºmero
   * entero. Si no se encuentra, devuelve -1.
   *
   * @param numero es el nÃºmero introducido por teclado
   * @param digito es el nÃºmero introducido por teclado, que sirve para mirar
   * posiciÃ³n
   * @return es el numero que devuelve la posiciÃ³n de un digito y si no se
   * encuentra un -1.
   */
  public static int posicionDigito(int numero, int digito) {
    int volteado = voltea(numero);
    int i = 0;
    while (volteado >= 1) {
      if (digito == volteado % 10) {
        return i;
      }
      volteado = volteado / 10;
      i++;
    }
    return -1;
  }

  ///// EJERCICIO 9- Quita dÃ­gitos por detrÃ¡s /////
  /**
   * Le quita a un nÃºmero n dÃ­gitos por detrÃ¡s (por la derecha)
   *
   * @param numero es el nÃºmero introducido por teclado
   * @param digito es el nÃºmero introducido por teclado, que sirve para quitar
   * el numero que se escriba por detrÃ¡s
   * @return es el numero que devuelve sin los digitos que se le quitan por la
   * izquierda.
   */
  public static int quitaPorDetras(int numero, int digito) {
    for (int i = 0; i < digito; i++) {
      numero = numero / 10;
    }
    return numero;
  }
  
  public static int quitaPorDetras(long numero, int digito) {
    for (int i = 0; i < digito; i++) {
     numero = numero / 10;
    }
    return ((int)numero);
  }

  ///// EJERCICIO 10- Quita dÃ­gitos por delante /////
  /**
   * Le quita a un nÃºmero n dÃ­gitos por delante (por la derecha)
   *
   * @param numero es el nÃºmero introducido por teclado
   * @param digito es el nÃºmero introducido por teclado, que sirve para quitar
   * el numero que se escriba por delante
   * @return es el numero que devuelve sin los digitos que se le quitan por la
   * derecha.
   */
  public static int quitaPorDelante(int numero, int digito) {
    numero = voltea(numero);
    for (int i = 0; i < digito; i++) {
      numero /= 10;
    }
    return voltea(numero);

  }

  ///// EJERCICIO 11- AÃ±adir dÃ­gitos por detrÃ¡s /////
  /**
   * AÃ±ade un dÃ­gito a un nÃºmero por detrÃ¡s.
   *
   * @param numero es el nÃºmero introducido por teclado
   * @param digito es el nÃºmero introducido por teclado, que sirve para
   * aÃ±adirlo por detras
   * @return es el numero que devuelve el nÃºmero con los digitos al final
   * unidos
   */
  public static int pegaPorDetras(int numero, int digito) {
    String unirNum = String.valueOf(numero) + String.valueOf(digito);
    int numUnido = Integer.valueOf(unirNum);
    return numUnido;
  }
  
  public static int pegaPorDetras(long numero, int digito) {
    String unirNum = String.valueOf(numero) + String.valueOf(digito);
    int numUnido = Integer.valueOf(unirNum);
    return numUnido;
  }

  ///// EJERCICIO 12- Añadir dígitos por delante /////
  /**
   * AÃ±ade un dígito a un número por delante.
   *
   * @param numero es el número introducido por teclado
   * @param digito es el número introducido por teclado, que sirve para añadir
   * el digito delante del numero
   * @return es el numero que devuelve con el digito añadido.
   */
  public static int pegaPorDelante(int numero, int digito) {
    String unirNum = String.valueOf(digito) + String.valueOf(numero);
    int numUnido = Integer.valueOf(unirNum);
    return numUnido;
  }

  ///// EJERCICIO 13- Trozo de nÃºmero /////
  /**
   * Toma como parÃ¡metros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   *
   * @param numero es el nÃºmero introducido por teclado
   * @param inicio es el nÃºmero introducido por teclado, que sirve para coger
   * parte del inicio del nÃºmero
   * @param fin es el nÃºmero introducido por teclado, que sirve para coger
   * parte del final del nÃºmero
   * @return es el numero que devuelve con los dos trozos de inicio y fin.
   */
  public static int trozoDeNumero(int numero, int inicio, int fin) {

    return numero;
  }

  ///// EJERCICIO 14- Junta números /////
  /**
   * Pega dos nÃºmeros para formar uno.
   *
   * @param numero1 es el primer nÃºmero introducido por teclado
   * @param numero2 es el segundo nÃºmero introducido por teclado
   * @return es el numero que devuelve con los dos nÃºmeros unidos en uno.
   */
  public static int juntaNumeros(int numero1, int numero2) {
    String numerosJuntos = String.valueOf(numero1) + String.valueOf(numero2);
    int unionNum = Integer.valueOf(numerosJuntos);
    return unionNum;
  }

  //// EJERCICIO - DECIMAL a BINARIO //////

  /**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param decimal número entero en base 10
   * @return        número inicial pasado a binario
   */
  public static long decimalBinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = matematicas.Varias.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = matematicas.Varias.pegaPorDetras(binario, 1);
    binario = matematicas.Varias.voltea(binario);
    binario = matematicas.Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
  
  /**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param octal nÃºmero entero en decimal
   * @return      nÃºmero inicial pasado a binario
   */
  public static long decimalBinario(long decimal) {
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = matematicas.Varias.pegaPorDetras(binario, (int)decimal % 2);
      decimal = decimal / 2;
    }
    binario = matematicas.Varias.pegaPorDetras(binario, 1);
    binario = matematicas.Varias.voltea(binario);
    binario = matematicas.Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
  
  ///// EJERCICIO - De BINARIO a OCTAL /////
  /**
   * Pasa un nÃºmero binario (en base 2) a octal (base 8).
   * 
   * @param binario nÃºmero entero en binario
   * @return        nÃºmero inicial pasado a octal
   */
  public static long binarioOctal(long binario) {
    long octal = 1;
  
    while (binario > 0) {
      octal = octal * 10 + (binarioDecimal(binario % 1000));
      binario = binario / 1000;}
  
    octal = matematicas.Varias.pegaPorDetras(octal, 1);
    octal = matematicas.Varias.voltea(octal);
    octal = matematicas.Varias.quitaPorDetras(octal, 1);
    octal = matematicas.Varias.quitaPorDelante((int)octal, 1);
    
    return octal;
  }
  ////// EJERCICIO - BINARIO a DECIMAL //////
  
  /**
   * Pasa un nÃºmero binario (en base 2) a decimal (base 10).
   * 
   * @param binario nÃºmero entero en binario
   * @return        nÃºmero inicial pasado a decimal
   */
  public static long binarioDecimal(long binario) {
    long decimal = 0;
  
    int bits = matematicas.Varias.sacarDigito(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += matematicas.Varias.digitoNum(binario, bits - i - 1) * matematicas.Varias.potencia(2, i);
    }
      
    return decimal;
  }
  
  //////// EJERCICIO  - BINARIO a HEXADECIMAL /////////
  /**
   * Pasa un nÃºmero binario (en base 2) a hexadecimal (base 16).
   * 
   * @param binario nÃºmero entero en binario
   * @return        nÃºmero inicial pasado a hexadecimal
   */
   public static String binarioHexadecimal(long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
  
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int)binarioDecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    };
      
    return hexadecimal;
  }
  //////// EJERCICIO - OCTAL a BINARIO  //////
  /**
   * Pasa un nÃºmero octal (en base 8) a binario (base 2).
   * 
   * @param octal nÃºmero entero en octal
   * @return      nÃºmero inicial pasado a binario
   */
  public static long octalBinario(long octal) {
    long binario = 0;
  
    for (int i = 0; i < matematicas.Varias.sacarDigito(octal); i++) {
      binario = binario * 1000 + decimalBinario(matematicas.Varias.digitoNum(octal, i));
    }
    
    return binario;
  }
  
  

  ///////// EJERCICIO  - HEXADECIMAL a BINARIO //////////
  /**
   * Pasa un nÃºmero hexadecimal (en base 10) a binario (base 2).
   * 
   * @param hexadecimal nÃºmero entero en hexadecimal
   * @return            nÃºmero inicial pasado a binario
   */
  public static long hexadecimalBinario(String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
  
    for (int i = 0; i < hexadecimal.length(); i++) {
      binario = binario * 10000 + decimalBinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }

    return binario;
  }
  
  
  
  
  
  
  
  
  
  
}
