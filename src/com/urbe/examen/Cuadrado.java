package com.urbe.examen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Cuadrado extends JPanel {

	public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 setBackground(Color.CYAN);
		 
		 g.setColor(Color.red);
         g.fillRect(100, 100, 400, 400);
         g.setColor(Color.YELLOW);
         g.fillRect(150, 150, 300,300);
         g.setColor(Color.red);
         g.fillRect(200, 200, 200, 200);
         g.setColor(Color.YELLOW);
         g.fillRect(250, 250, 100 ,100);
         
         g.setColor(Color.black);
         g.drawLine(100, 100,500, 500);
         g.drawLine(500, 100, 100, 500);
         
         Font mi= new Font("Arial", Font.PLAIN ,15);  
		 g.setFont(mi);
		 g.setColor(Color.blue);
		 g.drawString("Cuadrado", 260, 190);
		 g.drawString("Cuadrado", 260, 440);
		 g.setColor(Color.black);
		 
		 g.drawString("Cuadrado", 260, 90);
		 
	}
}
