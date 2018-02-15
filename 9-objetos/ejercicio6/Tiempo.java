/*
 * Clase tiempo
 */
package tema9tanda2ej6;

/**
 *
 * @author Beatriz Parejo Ramos
 */
public class Tiempo {

  //atributos
  private int segundos;

  //constructores 
  public Tiempo(int horas, int minutos, int segundos) {
    this.segundos = (horas * 3600) + (minutos * 60) + segundos;
  }

  public Tiempo(int s) {
    this.segundos = s;
  }

  @Override
  public String toString() {
    int segundos = this.segundos;
    int horas = segundos / 3600;
    segundos -= horas * 3600;
    int minutos = segundos / 60;
    segundos -= minutos * 60;

    if (this.segundos < 0) {
      return "- " + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s ";
    } else {
      return horas + "h " + minutos + "m " + segundos + "s";
    }
  }

  //getter 
  private int getSegundos() {
    return this.segundos;
  }

  public Tiempo suma(Tiempo tiemp) {
    return new Tiempo(this.segundos + tiemp.getSegundos());
  }

  public Tiempo resta(Tiempo tiemp) {
    return new Tiempo(this.segundos - tiemp.getSegundos());
  }

}
