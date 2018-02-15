/*
 * Clase Fracción para poder operar con fracciones
 */
package tema9tanda2ej04;

/**
 * @author Beatriz Parejo Ramos
 */
public class Fraccion {

  //atributos
  private int numerador;
  private int denominador;
  private int signo;

  //constructor
  public Fraccion(int numerador, int denominador) {
    if (denominador == 0) {
      System.out.println("Una fracción no puede tener un 0 en el denominador");
    } else {
      if (numerador * denominador < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(numerador);
      this.denominador = Math.abs(denominador);
    }
  }
  

  
//getter y setter
  
  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  public int getSigno() {
    return signo;
  }

  public void setSigno(int signo) {
    this.signo = signo;
  }

  //para poder imprimir por pantalla
  @Override
  public String toString() {
    if (signo == -1) {
      return "-" + this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }
  }

  //métodos
  
  //invertimos el numerador y el denominador
  public Fraccion invierte(int num, int den){
    return new Fraccion(this.signo * this.denominador, this.numerador);
  }
 
// Multiplicamos una fracción por otra
  /**@param frac fracción por la que se multiplica la fracción original
   * 
   * @return  resultado de multiplicar las dos fracciones 
   *
   **/
  public Fraccion multiplica(Fraccion frac) {
    return new Fraccion(this.signo * this.numerador * frac.getNumerador(), this.denominador * frac.getDenominador());
  }
//Dividimos una fracción entre otra
  /**@param frac fracción entre la que se divide la fracción original
   * 
   * @return  resultado de dividir la fracción original entre la
   *          fracción que se pasa como parámetro
   *
   **/
  public Fraccion divide(Fraccion frac) {
    return new Fraccion(this.signo * this.numerador * frac.getDenominador(), denominador * frac.getNumerador());
  }
  
  // Simplifico una fracion
  /**
   * @return  devuelve la fracción simplificada si se puede
   */
  public Fraccion simplifica() {
    
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;
      
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }

    return new Fraccion(s * n, d);
  }
  
  
 
} 