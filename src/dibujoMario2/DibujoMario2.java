package dibujoMario2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class DibujoMario2 extends JFrame{

	public DibujoMario2() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Dibujo Mario 2");
		this.setResizable(false);
		this.setLayout(null);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		//Cielo
		g2d.setColor(Color.decode("#0665c0"));
		g2d.fillRect(0, 0, 800, 600);
		///////////////////////////////////////
		
		//Suelo
		g2d.setColor(Color.decode("#04cc0d"));
		g2d.fillRect(0, 495, 800, 100);
		g2d.setColor(Color.decode("#ce9c64"));
		g2d.fillRect(0, 515, 800, 80);
		g2d.setColor(Color.black);
		g2d.drawRect(0, 495, 800, 100);
		///////////////////////////////////////
		
		//Montañas Azul claro
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillOval(450, 90, 140, 120);
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillRect(450, 145, 140, 350);
	
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillOval(310, 190, 140, 120);
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillRect(310, 245, 140, 250);

		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillOval(30, 190, 140, 120);
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillRect(30, 245, 140, 250);
		
		//Montañas Azules
		g2d.setColor(Color.decode("#4381a8"));
		g2d.fillOval(480, 265, 170, 130);
		g2d.setColor(Color.decode("#4381a8"));
		g2d.fillRect(480, 325, 170, 170);
		
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillOval(480, 265, 160, 130);
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillRect(480, 325, 160, 170);
		
		g2d.setColor(Color.decode("#4381a8"));
		g2d.fillOval(310, 335, 170, 85);
		g2d.setColor(Color.decode("#4381a8"));
		g2d.fillRect(310, 375, 170, 120);
	
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillOval(310, 335, 160, 85);
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillRect(310, 375, 160, 120);
		
		
		g2d.setColor(Color.decode("#4381a8"));
		g2d.fillOval(0, 335, 130, 85);
		g2d.setColor(Color.decode("#4381a8"));
		g2d.fillRect(0, 375, 130, 120);
		
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillOval(0, 335, 120, 85);
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillRect(0, 375, 120, 120);
		
		//Tubo #1
		g2d.setColor(Color.decode("#4c4c90"));
		g2d.fillRect(355, 365, 80, 130);
		g2d.setColor(Color.decode("#706ab5"));
		g2d.fillRect(355, 365, 60, 130);
		g2d.setColor(Color.black);
		g2d.drawRect(355, 365, 80, 130);
				
		g2d.setColor(Color.decode("#4c4c90"));
		g2d.fillRect(350, 335, 90, 30);
		g2d.setColor(Color.decode("#706ab5"));
		g2d.fillRect(350, 335, 70, 30);
		g2d.setColor(Color.black);
		g2d.drawRect(350, 335, 90, 30);
		
		//#Nubes
		g2d.setColor(Color.white);
		g2d.fillRoundRect(0, 250, 150, 35, 60, 60);
		g2d.fillRoundRect(220, 260, 150, 35, 60, 60);
		g2d.fillRoundRect(220, 420, 120, 35, 60, 60);
		g2d.fillRoundRect(180, 350, 120, 35, 60, 60);
		g2d.fillRoundRect(550, 160, 150, 35, 60, 60);
		g2d.fillRoundRect(600, 220, 150, 35, 60, 60);
		
		//Bloques grises y tubo
		int y = 335;
		for (int i = 53; i < 250;) {
		    g2d.setColor(Color.decode("#c9c4c8"));
		    g2d.fillRect(610, y, 40, 40);
		    g2d.setColor(Color.black); 
			 g2d.drawRect(610, y, 40, 40);

		    y += 40;
		    i += 60;
		}
		
		int x = 650; 
		 for (int i = 50; i < 250;) {
			 g2d.setColor(Color.decode("#F0C038")); 
			 g2d.fillRect(x, 335, 40, 40);
			 g2d.setColor(Color.black); 
			 g2d.drawRect(x, 335, 40, 40);
			 x += 40; 
			 i += 60; 
			 
		 }
		
		g2d.setColor(Color.decode("#4c4c90"));
		g2d.fillRect(680, 425, 80, 70);
		g2d.setColor(Color.decode("#706ab5"));
		g2d.fillRect(680, 425, 60, 70);
		g2d.setColor(Color.black);
		g2d.drawRect(680, 425, 80, 70);
				
		g2d.setColor(Color.decode("#4c4c90"));
		g2d.fillRect(675, 400, 90, 30);
		g2d.setColor(Color.decode("#706ab5"));
		g2d.fillRect(675, 400, 70, 30);
		g2d.setColor(Color.black);
		g2d.drawRect(675, 400, 90, 30);

		
		//Detalles extras
		try {
			BufferedImage imagen = ImageIO.read(new File("mario bros.png"));
			
			g2d.drawImage(imagen, 290, 415, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedImage imagen = ImageIO.read(new File("arbusto.png"));
			
			g2d.drawImage(imagen, 135, 435, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedImage imagen = ImageIO.read(new File("planta.png"));
			
			g2d.drawImage(imagen, 365, 270, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Detalles montañas azul claro
		
		//1
		g2d.setColor(Color.white);
		g2d.fillOval(100, 215, 15, 30);
		
		g2d.setColor(Color.white);
		g2d.fillOval(100, 290, 15, 30);
		
		g2d.setColor(Color.white);
		g2d.fillOval(45, 300, 15, 30);
		
		//2
		g2d.setColor(Color.white);
		g2d.fillOval(340, 235, 15, 30);
		
		g2d.setColor(Color.white);
		g2d.fillOval(340, 295, 15, 30);
		
		g2d.setColor(Color.white);
		g2d.fillOval(400, 215, 15, 30);
		
		//3
		g2d.setColor(Color.white);
		g2d.fillOval(530, 130, 15, 30);
		
		g2d.setColor(Color.white);
		g2d.fillOval(480, 215, 15, 30);
		
		//Detalles montaña azul
		g2d.setColor(Color.decode("#c8e3e5"));
		g2d.fillOval(530, 330, 15, 30);
		
		g2d.setColor(Color.decode("#c8e3e5"));
		g2d.fillOval(580, 400, 15, 30);
	
	}
}
