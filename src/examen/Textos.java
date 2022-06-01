package examen;

//Importacion de las librerías utilizadas.
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/*  Clase Textos
	En esta clase está el dibujo de los textos.
*/
public class Textos extends JPanel {

	/*
		Método paintComponent(Graphics g)
		Se dibujan los gráficos que conforman al dibujo propuesto.		
	*/
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g); // Se llama al método heredado de la superclase.
		setBackground(Color.CYAN); // Fondo celeste.
		 
		//Escritura de Strings
		//Normal
		Font mi = new Font("DIALOG", Font.PLAIN ,15);
		g.setFont(mi);
		g.setColor(Color.black);
		g.drawString("Dialog NORMAL", 20, 40);
		 
		Font mi2 = new Font("SANS_SERIF", Font.PLAIN ,15);
		g.setFont(mi2);
		g.setColor(Color.black);
		g.drawString("SansSenif NORMAL", 40, 55);
		 
		Font mi3 = new Font("SERIF", Font.PLAIN ,15);
		g.setFont(mi3);
		g.setColor(Color.black);
		g.drawString("Serif NORMAL", 60, 70);
		
		Font mi4= new Font("MONOSPACED", Font.PLAIN ,15); 
		g.setFont(mi4);
		g.setColor(Color.black);
		g.drawString("Monospaced NORMAL", 80, 85);
		
		Font mi5= new Font("DIALOG_INPUT", Font.PLAIN ,15);  
		g.setFont(mi5);
		g.setColor(Color.black);
		g.drawString("DialogInput NORMAL", 100, 100);

		// Negrita
		Font mi6 = new Font("DIALOG", Font.BOLD ,15);
		g.setFont(mi6);
		g.setColor(Color.black);
		g.drawString("Dialog NORMAL", 120, 115);
		
		Font mi7 = new Font("SANS_SERIF", Font.BOLD ,15);
		g.setFont(mi7);
		g.setColor(Color.black);
		g.drawString("Dialog NORMAL", 140, 130);
		
		Font mi8 = new Font("SERIF", Font.BOLD ,15);
		g.setFont(mi8);
		g.setColor(Color.black);
		g.drawString("Serif NORMAL", 160, 145);
		
		Font mi9= new Font("MONOSPACED", Font.BOLD ,15); 
		g.setFont(mi9);
		g.setColor(Color.black);
		g.drawString("Monospaced NORMAL", 180, 160);
		
		Font mi10= new Font("DIALOG_INPUT", Font.BOLD,15); 
		g.setFont(mi10);
		g.setColor(Color.black);
		g.drawString("DialogInput NORMAL", 195, 175);
		
		// Cursiva
		Font mi11 = new Font("DIALOG", Font.ITALIC ,15);
		g.setFont(mi11);
		g.setColor(Color.blue);
		g.drawString("Dialog NORMAL", 210, 190);
		
		Font mi12 = new Font("SANS_SERIF", Font.ITALIC ,15);
		g.setFont(mi12);
		g.setColor(Color.blue);
		g.drawString("Dialog NORMAL", 225, 205);
		
		Font mi13 = new Font("SERIF", Font.ITALIC ,15);
		g.setFont(mi13);
		g.setColor(Color.blue);
		g.drawString("Serif NORMAL", 240, 220);
		
		Font mi14= new Font("MONOSPACED", Font.ITALIC ,15); 
		g.setFont(mi14);
		g.setColor(Color.BLUE);
		g.drawString("Monospaced NORMAL", 255, 235);
		 
		Font mi15= new Font("DIALOG_INPUT", Font.BOLD,15); 
		g.setFont(mi15);
		g.setColor(Color.blue);
		g.drawString("DialogInput NORMAL", 270, 250);
	 }	 
}
