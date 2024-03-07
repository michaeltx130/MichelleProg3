package dibujo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Casita extends JFrame{
	
	public Casita() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 650);
		this.setLocationRelativeTo(null);
		this.setTitle("Dibujo Casita");
		this.setResizable(false);
		this.setLayout(null);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		//Cielo
		g2d.setColor(Color.decode("#87CEEB"));
        g2d.fillRect(0, 0, 700, 650);
		
		//Capas de tierra
		g2d.setColor(Color.decode("#3a4c12"));
		g2d.fillRect(0, 460, 700, 20);
		
		g2d.setColor(Color.decode("#72952d"));
		g2d.fillRect(0, 478, 700, 45);
		
		g2d.setColor(Color.decode("#d1b868"));
		g2d.fillRect(0, 523, 700, 40);
		
		g2d.setColor(Color.decode("#634c16"));
		g2d.fillRect(0, 563, 700, 80);
		
		//Cerca
		
		g2d.setColor(Color.decode("#d3963b"));
		g2d.fillRect(0, 320, 700, 80);
		
		int numCercas = 15;
	    int anchoCerca = 65; 
	    int separacion = 13; 
	     
	    g2d.setColor(Color.decode("#ffb951"));
	     
	    for (int i = 0; i < numCercas; i++) {
	        int pos = i * anchoCerca + separacion; 
	        g2d.fillRect(pos, 280, anchoCerca - separacion, 180);
	    
	    int[] xS = {pos, pos + (anchoCerca - separacion) / 2, pos + (anchoCerca - separacion)};
        int[] yS = {280, 240, 280};
        
        g2d.setColor(Color.decode("#ffb951"));
        g2d.fillPolygon(xS, yS, 3);
	    
	    }
	    
		//Casa
		g2d.setColor(Color.decode("#684a0a"));
		g2d.fillRect(175, 210, 330, 220);
		
		int numRectangulos = 5; 
        int alturaRectangulo = 40; 
        int separacionRectangulo = 7; 
        
        for (int i = 0; i < numRectangulos; i++) {
            int posicion = 210 + i * (alturaRectangulo + separacionRectangulo); 
            g2d.setColor(Color.decode("#ffd775")); 
            g2d.fillRect(175, posicion, 330, alturaRectangulo); 
        }
        
        //Piso casa
        g2d.setColor(Color.decode("#666666"));
        g2d.fillRect(140, 430, 400, 30);
		
        //Chimenea
        g2d.setColor(Color.decode("#808080"));
        g2d.fillRect(400, 90, 75, 80);
        
        g2d.setColor(Color.decode("#808080"));
        g2d.fillRect(390, 65, 95, 30);
        
		//techo
		int[] xS = {110, 280, 570};  
        int[] yS = {210, 40, 210};
		 
        g.setColor(Color.decode("#a22425"));
	    g.fillPolygon(xS, yS, 3);
	       
	    //Puerta
	    g2d.setColor(Color.decode("#624509"));
        g2d.fillRect(200, 240, 100, 190);
        
        g2d.setColor(Color.decode("#97710e"));
        g2d.fillRect(205, 245, 90, 180);
        
        g2d.setColor(Color.WHITE);
        g2d.fillOval(275, 330, 13, 13);
        
        //Ventana
        g2d.setColor(Color.decode("#a62328"));
        g2d.fillRect(380, 240, 95, 95);
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(387, 248, 80, 80);
        
        g2d.setColor(Color.decode("#a62328"));
        g2d.drawLine(427, 240, 427, 333);
        g2d.drawLine(380, 287, 474, 287);
        
        g2d.setColor(Color.decode("#47504f"));
        g2d.fillRect(375, 335, 105, 15);
      
	}	
}
