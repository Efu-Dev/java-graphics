package examen;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco extends JFrame {
    public Marco(JPanel panel){
        setSize(400,400);
        setLocationRelativeTo(null); // Centra el frame.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        add(panel);
    }    
}
