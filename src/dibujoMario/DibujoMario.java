package dibujoMario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class DibujoMario extends JFrame{
	
	public DibujoMario() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Dibujo Mario");
		this.setResizable(false);
		this.setLayout(null);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		//Cielo
		g2d.setColor(Color.decode("#a2f0ff"));
		g2d.fillRect(0, 0, 750, 500);
		///////////////////////////////////////
		
		//Suelo
		g2d.setColor(Color.decode("#fc9559"));
		g2d.fillRect(40, 395, 710, 100);
		g2d.setColor(Color.decode("#b16f3b"));
		g2d.fillRect(40, 415, 710, 80);
		g2d.setColor(Color.black);
		g2d.drawRect(40, 395, 710, 100);
		///////////////////////////////////////
		
		//Bloques
		g2d.setColor(Color.decode("#00dd5b"));
		g2d.fillRoundRect(610, 245, 150, 150, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawRoundRect(610, 245, 150, 150, 15, 15);
		
		g2d.setColor(Color.decode("#ff8954"));
		g2d.fillRect(610, 130, 50, 50);
		g2d.setColor(Color.black);
		g2d.drawRect(610, 130, 50, 50);
		
		g2d.setColor(Color.decode("#008fe2"));
		g2d.fillRoundRect(250, 175, 150, 220, 15, 15);
		g2d.setColor(Color.decode("#71c2ff"));
		g2d.fillRoundRect(250, 175, 145, 220, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawRoundRect(250, 175, 150, 220, 15, 15);

		g2d.setColor(Color.decode("#e48868"));
		g2d.fillRoundRect(150, 245, 150, 150, 15, 15);
		g2d.setColor(Color.decode("#ffc0b5"));
		g2d.fillRoundRect(150, 245, 145, 150, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawRoundRect(150, 245, 150, 150, 15, 15);	
		
		g2d.setColor(Color.decode("#ff8954"));
		g2d.fillRect(40, 170, 50, 50);
		g2d.setColor(Color.black);
		g2d.drawRect(40, 170, 50, 50);
		
		g2d.setColor(Color.decode("#ff8954"));
		g2d.fillRect(130, 50, 50, 50);
		g2d.setColor(Color.black);
		g2d.drawRect(130, 50, 50, 50);
		g2d.setColor(Color.decode("#ff8954"));
		g2d.fillRect(180, 50, 50, 50);
		g2d.setColor(Color.black);
		g2d.drawRect(180, 50, 50, 50);
		
		//Tubo
		g2d.setColor(Color.decode("#006100"));
		g2d.fillRect(450, 295, 80, 100);
		g2d.setColor(Color.decode("#006e00"));
		g2d.fillRect(450, 295, 60, 100);
		g2d.setColor(Color.black);
		g2d.drawRect(450, 295, 80, 100);
		
		g2d.setColor(Color.decode("#006100"));
		g2d.fillRect(445, 265, 90, 30);
		g2d.setColor(Color.decode("#006e00"));
		g2d.fillRect(445, 265, 70, 30);
		g2d.setColor(Color.black);
		g2d.drawRect(445, 265, 90, 30);
		
		//Detalles Bloque Verde
		g2d.setColor(Color.lightGray);
		g2d.fillOval(615, 250, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(615, 250, 15, 15);
		
		g2d.setColor(Color.lightGray);
		g2d.fillOval(615, 375, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(615, 375, 15, 15);
		
		//Detalles Bloque Azul
		g2d.setColor(Color.lightGray);
		g2d.fillOval(255, 180, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(255, 180, 15, 15);
		
		g2d.setColor(Color.lightGray);
		g2d.fillOval(380, 180, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(380, 180, 15, 15);
		
		//Detalles Bloque Rosa
		g2d.setColor(Color.lightGray);
		g2d.fillOval(155, 250, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(155, 250, 15, 15);
		
		g2d.setColor(Color.lightGray);
		g2d.fillOval(280, 250, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(280, 250, 15, 15);
		
		g2d.setColor(Color.lightGray);
		g2d.fillOval(155, 375, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(155, 375, 15, 15);
		
		g2d.setColor(Color.lightGray);
		g2d.fillOval(280, 375, 15, 15);
		g2d.setColor(Color.black);
		g2d.drawOval(280, 375, 15, 15);
		
		//Detalles Bloques Naranjas
		
		//#1
		g2d.setColor(Color.black);
		g2d.fillOval(45, 175, 5, 5);
		g2d.setColor(Color.black);
		g2d.fillOval(80, 175, 5, 5);
		
		g2d.setColor(Color.black);
		g2d.fillOval(45, 210, 5, 5);
		g2d.setColor(Color.black);
		g2d.fillOval(80, 210, 5, 5);
		
		//Bloques pegados
		g2d.setColor(Color.black);
		g2d.fillOval(135, 55, 5, 5);
		g2d.setColor(Color.black);
		g2d.fillOval(135, 90, 5, 5);
		
		g2d.setColor(Color.black);
		g2d.fillOval(223, 55, 5, 5);
		g2d.setColor(Color.black);
		g2d.fillOval(223, 90, 5, 5);
		
		//#3
		g2d.setColor(Color.black);
		g2d.fillOval(615, 135, 5, 5);
		g2d.setColor(Color.black);
		g2d.fillOval(650, 135, 5, 5);
		
		g2d.setColor(Color.black);
		g2d.fillOval(615, 170, 5, 5);
		g2d.setColor(Color.black);
		g2d.fillOval(650, 170, 5, 5);
		
		//Detalles extras
		try {
			BufferedImage imagen = ImageIO.read(new File("mario bros.png"));
			
			g2d.drawImage(imagen, 350, 315, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedImage imagen = ImageIO.read(new File("arbusto.png"));
			
			g2d.drawImage(imagen, 45, 335, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
