//Michelle Jesús Obeso Sánchez IDS TV
//Cambios corregidos en la actividad

package pacman;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class PacMan implements KeyListener{

    private JFrame frame;
    private JPanel panelCenter = new JPanel();
    
    private JLabel timer = new JLabel();
    private Timer tiempo;
	private int segundos = 0;
	
	 JLabel lblNewLabel_1 = new JLabel();
	 private JLabel puntaje;
	 int score = 0;

    Player jugador = new Player(335, 275, 30, 30, " ");
    Obstaculo[] obstaculos = {
    	    new Obstaculo(10, 10, 10, 245, " "),
    	    new Obstaculo(10, 320, 10, 245, " "),
    	    new Obstaculo(20, 10, 645, 10, " "),
    	    new Obstaculo(20, 555, 645, 10, " "),
    	    new Obstaculo(665, 10, 10, 245, " "),
    	    new Obstaculo(665, 320, 10, 245, " "),
    	    
    	    new Obstaculo(80, 70, 100, 10, " "),
    	    new Obstaculo(80, 70, 10, 100, " "),
    	    new Obstaculo(80, 500, 100, 10, " "),
    	    new Obstaculo(80, 400, 10, 100, " "),
    	    new Obstaculo(500, 500, 100, 10, " "),
    	    new Obstaculo(590, 400, 10, 100, " "),
    	    new Obstaculo(500, 70, 100, 10, " "),
    	    new Obstaculo(590, 70, 10, 100, " "),
    	    
    	    new Obstaculo(250, 340, 200, 10, " "),
    	    new Obstaculo(250, 240, 10, 100, " "),
    	    new Obstaculo(440, 240, 10, 100, " "),
    	    new Obstaculo(250, 240, 60, 10, " "),
    	    new Obstaculo(390, 240, 60, 10, " "),
    	    
    	    new Obstaculo(270, 130, 150, 10, " "),
    	    new Obstaculo(140, 190, 60, 10, " "),
    	    new Obstaculo(140, 400, 60, 10, " "),
    	    new Obstaculo(490, 190, 60, 10, " "),
    	    new Obstaculo(490, 400, 60, 10, " "),
    	    new Obstaculo(240, 20, 10, 50, " "),
    	    new Obstaculo(440, 20, 10, 50, " "),
    	    new Obstaculo(240, 510, 10, 50, " "),
    	    new Obstaculo(440, 510, 10, 50, " "),
    	    new Obstaculo(270, 450, 150, 10, " "), 
    	};
    
    Pastilla[] pastillas = {
            new Pastilla(40, 40, 20),
            new Pastilla(100, 40, 10),
            new Pastilla(150, 40, 10),
            new Pastilla(205, 40, 20),
            
            new Pastilla(45, 100, 10),
            new Pastilla(45, 150, 10),
            new Pastilla(45, 200, 10),
            new Pastilla(45, 250, 10),
            new Pastilla(45, 300, 10),
            new Pastilla(45, 350, 10),
            new Pastilla(45, 400, 10),
            new Pastilla(45, 450, 10),
            new Pastilla(45, 500, 10),
            new Pastilla(40, 530, 20),
            
            new Pastilla(100, 530, 10),
            new Pastilla(150, 530, 10),
            new Pastilla(205, 530, 20),
            
            new Pastilla(210, 100, 10),
            new Pastilla(210, 150, 10),
            new Pastilla(210, 200, 10),
            new Pastilla(210, 250, 10),
            new Pastilla(210, 300, 10),
            new Pastilla(210, 350, 10),
            new Pastilla(210, 400, 10),
            new Pastilla(210, 450, 10),
            new Pastilla(210, 500, 10),
            
            new Pastilla(110, 100, 10),
            new Pastilla(160, 100, 10),
            new Pastilla(110, 150, 10),
            new Pastilla(160, 150, 10),
            new Pastilla(110, 150, 10),
            new Pastilla(110, 200, 10),
            new Pastilla(110, 250, 10),
            new Pastilla(110, 300, 10),
            new Pastilla(110, 350, 10),
            new Pastilla(110, 400, 10),
            new Pastilla(110, 450, 10),
            
            new Pastilla(160, 250, 10),
            new Pastilla(160, 300, 10),
            new Pastilla(160, 350, 10),
            new Pastilla(160, 450, 10),
            
            new Pastilla(280, 40, 10),
            new Pastilla(340, 40, 10),
            new Pastilla(400, 40, 10),
            
            new Pastilla(280, 100, 10),
            new Pastilla(340, 100, 10),
            new Pastilla(400, 100, 10),
            
            new Pastilla(465, 100, 10),
            new Pastilla(520, 100, 10),
            new Pastilla(570, 100, 10),
            
            new Pastilla(465, 150, 10),
            new Pastilla(520, 150, 10),
            new Pastilla(570, 150, 10),
            
            new Pastilla(465, 250, 10),
            new Pastilla(520, 250, 10),
            new Pastilla(570, 250, 10),
            
            new Pastilla(465, 300, 10),
            new Pastilla(520, 300, 10),
            new Pastilla(570, 300, 10),
            
            new Pastilla(465, 350, 10),
            new Pastilla(520, 350, 10),
            new Pastilla(570, 350, 10),
            
            new Pastilla(465, 400, 10),
            new Pastilla(570, 400, 10),
            
            new Pastilla(465, 450, 10),
            new Pastilla(520, 450, 10),
            new Pastilla(570, 450, 10),
            
            new Pastilla(280, 180, 10),
            new Pastilla(340, 180, 10),
            new Pastilla(400, 180, 10),
            
            new Pastilla(280, 530, 10),
            new Pastilla(340, 530, 10),
            new Pastilla(400, 530, 10),
            new Pastilla(280, 480, 10),
            new Pastilla(340, 480, 10),
            new Pastilla(400, 480, 10),
            new Pastilla(280, 400, 10),
            new Pastilla(340, 400, 10),
            new Pastilla(400, 400, 10),
            
            new Pastilla(465, 40, 20),
            new Pastilla(520, 40, 10),
            new Pastilla(580, 40, 10),
            new Pastilla(625, 40, 20),
            new Pastilla(465, 530, 20),
            new Pastilla(520, 530, 10),
            new Pastilla(580, 530, 10),
            new Pastilla(625, 530, 20),

            new Pastilla(630, 100, 10),
            new Pastilla(630, 150, 10),
            new Pastilla(630, 200, 10),
            new Pastilla(630, 250, 10),
            new Pastilla(630, 300, 10),
            new Pastilla(630, 350, 10),
            new Pastilla(630, 400, 10),
            new Pastilla(630, 450, 10),
            new Pastilla(630, 500, 10),                      
    };
  
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PacMan window = new PacMan();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PacMan() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("PAC-MAN :v");
        frame.setResizable(false);
        frame.setBounds(100, 100, 700, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(new Color(0, 0, 255));
        frame.getContentPane().add(panelSouth, BorderLayout.SOUTH);
        panelSouth.setLayout(new GridLayout(0, 3, 0, 0));
        
        puntaje = new JLabel("Score: 0");
        puntaje.setFont(new Font("CrackMan", Font.PLAIN, 25));
        puntaje.setHorizontalAlignment(SwingConstants.CENTER);
        puntaje.setForeground(new Color(0, 0, 0));
        panelSouth.add(puntaje);
        
        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.setBorder(new LineBorder(new Color(230, 0, 0), 4));
        btnNewButton.setBackground(new Color(255, 128, 0));
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ReiniciarJuego();
        	}
        });
        btnNewButton.setForeground(new Color(0, 0, 145));
        btnNewButton.setFont(new Font("CrackMan", Font.PLAIN, 25));
        panelSouth.add(btnNewButton);
        
        timer = new JLabel("Tiempo: 0:0");
        timer.setForeground(new Color(0, 0, 0));
        timer.setFont(new Font("CrackMan", Font.PLAIN, 25));
        timer.setHorizontalAlignment(SwingConstants.CENTER);
        Cronometro();
        panelSouth.add(timer);

        panelCenter = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g.setColor(Color.YELLOW);
                g2d.fillOval(jugador.x, jugador.y, jugador.w, jugador.h);
                
                for (Obstaculo obstaculo : obstaculos) {
                    g.setColor(Color.WHITE);
                    g2d.fillRect(obstaculo.x, obstaculo.y, obstaculo.w, obstaculo.h);
                }
                
                for (Pastilla pastilla : pastillas) {
                	g2d.setColor(Color.WHITE);
                    g2d.fillOval(pastilla.x, pastilla.y, pastilla.diametro, pastilla.diametro);
                }
            }
        };
        panelCenter.addKeyListener(new KeyAdapter() {
        	   	
        	@Override
        	public void keyTyped(KeyEvent e) {
        		  	    
        	    if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x + 5, jugador.y, jugador.w, jugador.h);       
        	        //Verifica la colisión entre el jugador y el obstáculo
        	        if(!HayColision(posicionJugador)) {
        	            jugador.x += 5;   
        	     
                        for (int i = 0; i < pastillas.length; i++) {                      	
                            if (posicionJugador.intersects(pastillas[i].getBounds())) {                           	
                                EliminarPastilla(i);
                                break;
                            }
                        }    
        	        }
        	        if(jugador.x == 685) {
        	        	jugador.x = 0;
        	        	jugador.y = 275;
        	        }
        	    } else if (e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x, jugador.y - 5, jugador.w, jugador.h);
        	        if(!HayColision(posicionJugador)) {
        	            jugador.y -= 5;
        	           
                        for (int i = 0; i < pastillas.length; i++) {
                            if (posicionJugador.intersects(pastillas[i].getBounds())) {
                                EliminarPastilla(i);
                                break;
                            }
                        }                       
        	        }
        	    } else if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x - 5, jugador.y, jugador.w, jugador.h);
        	        if(!HayColision(posicionJugador)) {
        	            jugador.x -= 5;
        	            
                        for (int i = 0; i < pastillas.length; i++) {
                            if (posicionJugador.intersects(pastillas[i].getBounds())) {
                                EliminarPastilla(i);
                                break;
                            }
                        }                      
        	        }
        	        if(jugador.x <= 0) {
        	        	jugador.x = 655;
        	        	jugador.y = 275;
        	        }
        	    } else if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x, jugador.y + 5, jugador.w, jugador.h);
        	        if(!HayColision(posicionJugador)) {
        	            jugador.y += 5;
        	            
                        for (int i = 0; i < pastillas.length; i++) {
                            if (posicionJugador.intersects(pastillas[i].getBounds())) {
                                EliminarPastilla(i);
                                break;
                            }
                        }                     
        	        }
        	    }
        	    panelCenter.repaint();
        	}
        });
        panelCenter.setBackground(new Color(0, 0, 0));
        panelCenter.setFocusable(true); 
        frame.getContentPane().add(panelCenter, BorderLayout.CENTER);
    }
    

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {	
	}

	@Override
	public void keyReleased(KeyEvent e) {	
	}
	
	private boolean HayColision(Rectangle posicionJugador) {
        for (Obstaculo obstaculo : obstaculos) {
            if (posicionJugador.intersects(obstaculo.getBounds())) {
                return true;
            }
        }
        return false;
    }
	
	private void EliminarPastilla(int i) {
        Pastilla[] nuevasPastillas = new Pastilla[pastillas.length - 1];
        int contadorPastillas = 0;
        for (int j = 0; j < pastillas.length; j++) {
            if (j != i) {
            	nuevasPastillas[contadorPastillas] = pastillas[j];
            	contadorPastillas++;	
            }
        }
        pastillas = nuevasPastillas;
        
        score++; 
        puntaje.setText("Score: " + score);
        
        if (pastillas.length == 0) {
        	tiempo.stop();
            JOptionPane.showMessageDialog(null, "¡Ganaste! Lograste completar el juego en " + timer.getText());
            ReiniciarJuego();
            panelCenter.repaint();
        }
    }
	
	private void Cronometro() {
		 tiempo = new Timer(1000, (ActionEvent e) -> {
			 segundos++;
			 ActualizarTimer();
			
		 }); 
		 tiempo.start();
	 }

	private void ActualizarTimer() {
		 int minutos = segundos / 60;
		 int segundosRestantes = segundos % 60;
		 timer.setText("Tiempo: " + minutos + ":" + segundosRestantes);
	 }
	
	 private void ReiniciarCronometro() {
		 if(tiempo.isRunning()) {
			 tiempo.stop();
		 }
		 
		 segundos = 0;
		 ActualizarTimer();
	 }
	
	private void ReiniciarJuego() {
		score = 0;
		puntaje.setText("Score: " + score);
		ReiniciarCronometro();
		pastillas = new Pastilla[] {
		            new Pastilla(40, 40, 20),
		            new Pastilla(100, 40, 10),
		            new Pastilla(150, 40, 10),
		            new Pastilla(205, 40, 20),
		            
		            new Pastilla(45, 100, 10),
		            new Pastilla(45, 150, 10),
		            new Pastilla(45, 200, 10),
		            new Pastilla(45, 250, 10),
		            new Pastilla(45, 300, 10),
		            new Pastilla(45, 350, 10),
		            new Pastilla(45, 400, 10),
		            new Pastilla(45, 450, 10),
		            new Pastilla(45, 500, 10),
		            new Pastilla(40, 530, 20),
		            
		            new Pastilla(100, 530, 10),
		            new Pastilla(150, 530, 10),
		            new Pastilla(205, 530, 20),
		            
		            new Pastilla(210, 100, 10),
		            new Pastilla(210, 150, 10),
		            new Pastilla(210, 200, 10),
		            new Pastilla(210, 250, 10),
		            new Pastilla(210, 300, 10),
		            new Pastilla(210, 350, 10),
		            new Pastilla(210, 400, 10),
		            new Pastilla(210, 450, 10),
		            new Pastilla(210, 500, 10),
		            
		            new Pastilla(110, 100, 10),
		            new Pastilla(160, 100, 10),
		            new Pastilla(110, 150, 10),
		            new Pastilla(160, 150, 10),
		            new Pastilla(110, 150, 10),
		            new Pastilla(110, 200, 10),
		            new Pastilla(110, 250, 10),
		            new Pastilla(110, 300, 10),
		            new Pastilla(110, 350, 10),
		            new Pastilla(110, 400, 10),
		            new Pastilla(110, 450, 10),
		            
		            new Pastilla(160, 250, 10),
		            new Pastilla(160, 300, 10),
		            new Pastilla(160, 350, 10),
		            new Pastilla(160, 450, 10),
		            
		            new Pastilla(280, 40, 10),
		            new Pastilla(340, 40, 10),
		            new Pastilla(400, 40, 10),
		            
		            new Pastilla(280, 100, 10),
		            new Pastilla(340, 100, 10),
		            new Pastilla(400, 100, 10),
		            
		            new Pastilla(465, 100, 10),
		            new Pastilla(520, 100, 10),
		            new Pastilla(570, 100, 10),
		            
		            new Pastilla(465, 150, 10),
		            new Pastilla(520, 150, 10),
		            new Pastilla(570, 150, 10),
		            
		            new Pastilla(465, 250, 10),
		            new Pastilla(520, 250, 10),
		            new Pastilla(570, 250, 10),
		            
		            new Pastilla(465, 300, 10),
		            new Pastilla(520, 300, 10),
		            new Pastilla(570, 300, 10),
		            
		            new Pastilla(465, 350, 10),
		            new Pastilla(520, 350, 10),
		            new Pastilla(570, 350, 10),
		            
		            new Pastilla(465, 400, 10),
		            new Pastilla(570, 400, 10),
		            
		            new Pastilla(465, 450, 10),
		            new Pastilla(520, 450, 10),
		            new Pastilla(570, 450, 10),
		            
		            new Pastilla(280, 180, 10),
		            new Pastilla(340, 180, 10),
		            new Pastilla(400, 180, 10),
		            
		            new Pastilla(280, 530, 10),
		            new Pastilla(340, 530, 10),
		            new Pastilla(400, 530, 10),
		            new Pastilla(280, 480, 10),
		            new Pastilla(340, 480, 10),
		            new Pastilla(400, 480, 10),
		            new Pastilla(280, 400, 10),
		            new Pastilla(340, 400, 10),
		            new Pastilla(400, 400, 10),
		            
		            new Pastilla(465, 40, 20),
		            new Pastilla(520, 40, 10),
		            new Pastilla(580, 40, 10),
		            new Pastilla(625, 40, 20),
		            new Pastilla(465, 530, 20),
		            new Pastilla(520, 530, 10),
		            new Pastilla(580, 530, 10),
		            new Pastilla(625, 530, 20),

		            new Pastilla(630, 100, 10),
		            new Pastilla(630, 150, 10),
		            new Pastilla(630, 200, 10),
		            new Pastilla(630, 250, 10),
		            new Pastilla(630, 300, 10),
		            new Pastilla(630, 350, 10),
		            new Pastilla(630, 400, 10),
		            new Pastilla(630, 450, 10),
		            new Pastilla(630, 500, 10),                      
		    };
		
		jugador = new Player(335, 275, 30, 30, " ");
		panelCenter.repaint();
		tiempo.start();
		panelCenter.requestFocus();
	}
}
