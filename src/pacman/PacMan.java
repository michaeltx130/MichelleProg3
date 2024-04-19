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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PacMan implements KeyListener{

    private JFrame frame;
    private JPanel panelCenter = new JPanel();

    Player jugador = new Player(260, 160, 30, 30, " ");
    Obstaculo obstaculo = new Obstaculo(400, 60, 20, 250, " ");

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PacMan window = new PacMan();
                    window.frame.setVisible(true);
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
        frame.setLocationRelativeTo(null);
        frame.setTitle("PAC-MAN :v");
        frame.setResizable(false);
        frame.setBounds(100, 100, 550, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSoth = new JPanel();
        panelSoth.setBackground(new Color(0, 0, 255));
        frame.getContentPane().add(panelSoth, BorderLayout.SOUTH);
        
        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 15));
        panelSoth.add(btnNewButton);

        panelCenter = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g.setColor(Color.YELLOW);
                g2d.fillOval(jugador.x, jugador.y, jugador.w, jugador.h);
                
                g.setColor(Color.WHITE);
                g2d.fillRect(obstaculo.x, obstaculo.y, obstaculo.w, obstaculo.h);
            }
        };
        panelCenter.addKeyListener(new KeyAdapter() {
        	   	
        	@Override
        	public void keyTyped(KeyEvent e) {
        		  	    
        	    if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x + 5, jugador.y, jugador.w, jugador.h);
        	        //Verifica la colisión entre el jugador y el obstáculo
        	        if (!posicionJugador.intersects(obstaculo.getBounds())) {
        	            jugador.x += 5;
        	        }
        	    } else if (e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x, jugador.y - 5, jugador.w, jugador.h);
        	        if (!posicionJugador.intersects(obstaculo.getBounds())) {
        	            jugador.y -= 5;
        	        }
        	    } else if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x - 5, jugador.y, jugador.w, jugador.h);
        	        if (!posicionJugador.intersects(obstaculo.getBounds())) {
        	            jugador.x -= 5;
        	        }
        	    } else if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
        	        Rectangle posicionJugador = new Rectangle(jugador.x, jugador.y + 5, jugador.w, jugador.h);
        	        if (!posicionJugador.intersects(obstaculo.getBounds())) {
        	            jugador.y += 5;
        	        }
        	    }

        	    panelCenter.update(panelCenter.getGraphics());
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
}
