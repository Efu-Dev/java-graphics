package com.urbe.examen;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Lineas extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // Se llama al método de la superclase antes de ser sobreescrito.

        crearLineasRojasAzules(g); // Se llama al método para crear las líneas rojas y azules.
        crearLineasVerdesAzules(g); // Se llama al métiodo para crear las líneas verdes y azules.
    }

    private void crearLineasVerdesAzules(Graphics g){
        for(int i = 0; i < 9; i++){ // 9 pares de líneas a dibujar

            int x = 29 + i*41, y = 29 + i*38; // Se calcula el punto final de las líneas.

            // Se determina el color de acuerdo a si la iteración es par.
            if(i%2 == 0) //Si es par, será una línea verde.
                g.setColor(Color.GREEN);
            else //Si es impar, es azul.
                g.setColor(Color.BLUE);

            // Se dibuja una línea desde la esquina superior derecha a (x,y).
            g.drawLine(385, 0, x, y);
            // Se dibuja una línea desde la esquina inferior izquierda a (x,y).
            g.drawLine(0, 365, x, y);
        }
    }

    private void crearLineasRojasAzules(Graphics g){ 
        for(int i = 0; i < 9; i++){ // 9 pares de líneas a dibujar, pero uno se omitirá.

            if(i == 4) // Si es la iteración 5, no hacer nada.
                continue;

            // Se calcula el punto final de los pares de líneas.
            int x = 354 - i*40, y = 30 + i*38;                  
            
            // De acuerdo a si es par la iteración se determina su color.
            if(i%2 == 0) // Si es par, será roja.
                g.setColor(Color.RED);
            else // Si es impar, será azul.
                g.setColor(Color.BLUE);

            // Se dibuja una línea de la esquina superior izquierda a (x,y).
            g.drawLine(0, 0, x, y);
            // Se dibuja una línea de la esquina inferior derecha a (x,y).
            g.drawLine(385, 363, x, y);
        }
    }

}