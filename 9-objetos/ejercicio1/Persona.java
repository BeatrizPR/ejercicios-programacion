/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9tanda2ej01;

/**
 *
 * @author Bea
 */
public class Persona {

  String nombre;
  String apellidos;
  double peso;

  public Persona() {

  }

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  public Persona(String nombre, String apellidos, double peso) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.peso = peso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return "Persona\n --------\n" + "Nombre:" + nombre + ", Apellidos:" + apellidos + ", Peso(Kg):" + peso;
  }

  public void espolea(String actitud) {
    switch ("actitud") {
      case "agrasiva":
        System.out.println("Ghia!!!!");
        break;
      case "cariñosa":
        System.out.println("Corre caballito");
        break;
      default:
        System.out.println("Arre arre");
    } // cierre del switch

  }

}
