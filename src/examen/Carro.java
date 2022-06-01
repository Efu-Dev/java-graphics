package examen;

// Importación de librerías utilizadas.
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;


/*  Clase Carro
    En esta clase se define el dibujo de un carro,
    que dice "Carro".
*/
public class Carro extends JPanel {
    
    /* Método paintComponent
       - Graphics g

       En este método se dibuja al carro propiamente dicho.
    */
    @Override
    public void paintComponent(Graphics g){

        // Se llama al método paintComponent de la superclase
    	super.paintComponent(g);

        // Fondo blanco
        setBackground(Color.white);
    	
    	// Dibujo de las ruedas y sus detalles.
        g.setColor(Color.black);
        g.fillOval(20, 170, 100, 100);
        
        g.setColor(Color.white);
        g.fillOval (30, 180, 80, 80);

        g.setColor(Color.black);
        g.drawOval(40, 190, 60, 60);
        g.fillOval(270, 170, 100, 100);

        g.setColor( Color.white);
        g.fillOval(280, 180, 80, 80) ;

        g.setColor(Color.black) ;
        g.drawOval(290, 190, 60, 60);
        g.fillRect(10, 113, 122, 12);

        // Cuadrado principal del carro
        g.setColor(Color.red);
        g.fillRect(10, 123, 122, 82);

        // Placa del carro
        g.setColor(Color.yellow);	
        g.fillOval(10, 105, 10, 10);

        // Ventana del carro
        g.setColor(Color.blue);
        g.fillRect(130, 15, 130, 100); 

        // Se termina de dibujar el carro propiamente.
        g.setColor(Color.red);
        g.fillRect(130, 113, 130, 92);
        g.fillRect(258, 15, 122, 190);
        g.fillRect(378, 80, 57, 125);
        g.fillRect(118, 205, 154, 10);

        // Marcos de las ventanas.
	    g.setColor(Color.black);
	    g.drawLine(131, 15, 110, 30);
	    g.drawLine(131, 16, 110, 31);
	   	g.drawLine(131, 17, 110, 32);
	    g.drawLine(145, 125, 170, 125);
	    g.drawLine(145, 124, 170, 124);
	    g.drawLine(145, 123, 170, 123);
	    
	    //Escritura de "Carro" sobre el dibujo
	    Font mi = new Font("Arial", Font.BOLD,26);
		g.setFont(mi);
		g.setColor(Color.black);
		g.drawString("Carro", 190, 180);
	    
 }
	

}
