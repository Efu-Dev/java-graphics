package examen;

// Importación de librerías utilizadas.
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.geom.*;

/*
    Clase Cara
    Esta clase es un JPanel que mostrará
    una cara hecha con gráficos.
*/

public class Cara extends JPanel {

    /*  Método paintComponent(Graphics g)
        En este método se crean los gráficos que conforman el dibujo.
    */
    @Override // Se modifica el método heredado de JPanel.
    public void paintComponent(Graphics g){

        // Se llama al método de la superclase y se crea un objeto Graphics2D a partir de este.
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Creación de las líneas rojas
        g.setColor(Color.RED);
        g.drawLine(0, 0,385, 362); // Diagonal superior
        g.drawLine(385, 0, 0, 362); //Diagonal inferior
        g.drawLine(193, 0, 193, 362); // Vertical Central
        g.drawLine(0, 181, 385, 181); // Horizontal Central

        // Se toman las coordenadas del centro como constantes
        final int xCentro = 193;
        final int yCentro = 181;

        // En estas líneas se crea el círculo de la cara
        Ellipse2D circulo = new Ellipse2D.Double(xCentro - 100, yCentro - 100,200,200);
        g2d.setPaint(Color.YELLOW);
        g2d.fill(circulo);

        // En estas líneas se crea el ojo izquierdo
        circulo = new Ellipse2D.Double(xCentro-50,yCentro-50,20,30);
        g2d.setPaint(Color.BLUE);
        g2d.fill(circulo);

        // Aquí el derecho
        circulo = new Ellipse2D.Double(xCentro+30,yCentro-50,20,30);
        g2d.fill(circulo);

        // Se dibuja la nariz
        circulo = new Ellipse2D.Double(xCentro-10, yCentro, 20, 20);
        g2d.setPaint(Color.BLACK);
        g2d.fill(circulo);

        // Se dibuja la boca
        circulo = new Ellipse2D.Double(xCentro - 50, yCentro + 50, 100, 25);
        g2d.fill(circulo);

        // Se dibuja la lengua
        g2d.setPaint(Color.RED);
        circulo = new Ellipse2D.Double(xCentro - 12, yCentro + 50, 25, 25);
        g2d.fill(circulo);
    }
}
