package examen;

// Importación de librerías utilizadas
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

/*  Clase Lineas
    En esta clase se define el dibujo de las líneas.
*/
public class Lineas extends JPanel {

    /*
        Método paintComponent(Graphics g)
        En este método se crean los gráficos del dibujo.
    */    
    @Override // Se edita el método heredado.
    public void paintComponent(Graphics g){
        super.paintComponent(g); // Se llama al método de la superclase.
        
        // Se crea una línea roja.
        g.setColor(Color.RED);
        g.drawLine(0, 0, 340, 30);
        
        // Se crea una línea azul.
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 300, 70);
        
        // Se crea una línea roja.
        g.setColor(Color.RED);
        g.drawLine(0, 0, 260, 110);
        
        // Se crea una línea azul.
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 220, 150);
        
        // Se crea una línea roja.
        g.setColor(Color.RED);
        g.drawLine(0, 0, 180, 190);
        
        // Se crea una línea azul.
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 140, 230);
        
        // Se crea una línea roja.
        g.setColor(Color.RED);
        g.drawLine(0, 0, 100, 270);
        
        // Se crea una línea azul.
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 60, 310);
        
        // Se crea una línea roja.
        g.setColor(Color.RED);
        g.drawLine(0, 0, 20, 350);
        
    }
    
}
