/*
 * Clase caballo
 */
package tema9tanda2ej01;

/**
 *
 * @author Beatriz Parejo Ramos
 */
public class Caballo {

  String nombre;
  double peso; // peso en kg
  int altura; // altura en cm
  String color;
  int velocidad = 0;
  String raza;
  Persona jinete;

  /* SillaDeMontar silla; 
  SillaDeMontar seria una clase, así, tendriamos una clase dentro de otra clase
    La clase SillaDeMontar seria con el nombre silla una clase del caballo */

 /* En este caso la persona jinete es otra clase */
  public Caballo(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPeso() {
    return peso;
  }

  public int getAltura() {
    return altura;
  }

  public String getColor() {
    return color;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public String getRaza() {
    return raza;
  }

  public Persona getJinete() {
    return jinete;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }

  @Override
  public String toString() {
    return "Caballo{" + "nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", color=" + color + ", velocidad=" + velocidad + ", raza=" + raza + ", jinete=" + jinete + '}';
  }

}
