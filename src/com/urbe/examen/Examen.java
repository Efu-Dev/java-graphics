/*
  Examen
  En este paquete están todos los dibujos propuestos en el examen.
  
  Autores
  @author Diego Faria
  @author Winderson Villarreal
*/

package com.urbe.examen;

/* Clase Examen
  Esta es la clase principal del programa.
  En esta está el único método Main.
*/
public class Examen {

  /*
    Método main.
    Es el que se ejecuta al iniciar el programa.
    Se crean las ventanas y se les dan atributos y visibilidad.
  */
  public static void main(String[] args) {

    // Se crea el marco del primer dibujo (lineas).
    Marco marco1 = new Marco(new Lineas()); // Se crea la instancia del marco con el dibujo.
    marco1.setTitle("Lineas de colores"); // Se le da titulo.
    marco1.setVisible(true); // Se pone visible.

    // Se crea el marco del segundo dibujo (cuadrado).
    Marco marco2 = new Marco(new Cuadrado());  // Se crea la instancia del marco con el dibujo.
    marco2.setTitle("Cuadrado"); // Se le da titulo.
    marco2.setSize(600,600);
    marco2.setVisible(true); // Se pone visible.
    
  }

}