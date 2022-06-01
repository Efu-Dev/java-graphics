/*
  Examen
  En este paquete están todos los dibujos propuestos en el examen.
  
  Autores
  @author Diego Faria
  @author Winderson Villarreal
*/

package examen;

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

    // Se crea el marco del segundo dibujo (cara).
    Marco marco2 = new Marco(new Cara());  // Se crea la instancia del marco con el dibujo.
    marco2.setTitle("Cara"); // Se le da titulo.
    marco2.setVisible(true); // Se pone visible.

    // Se crea el marco del tercer dibujo (carro).
    Marco marco3 = new Marco(new Carro());  // Se crea la instancia del marco con el dibujo.
    marco3.setSize(460,400); // Se le dan dimensiones distintas por el tamaño del dibujo.
    marco3.setTitle("Mi carro"); // Se le da titulo.
    marco3.setVisible(true); // Se pone visible.

    // Se crea el marco del cuarto dibujo (textos).
    Marco marco4 = new Marco(new Textos()); // Se crea la instancia del marco con el dibujo.
    marco4.setSize(500,350); // Se le dan dimensiones distintas por el tamaño del dibujo.
    marco4.setTitle("Textos"); // Se le da titulo.
    marco4.setVisible(true); // Se pone visible.
  }

}