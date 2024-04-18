//Michelle Jesús Obeso Sánchez IDS TV
//Cambios corregidos en la actividad

package pacman;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PacMan {

    private JFrame frame;
    private int x = 260;
    private int y = 160;

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

        JPanel panelCenter = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g.setColor(Color.YELLOW);
                g2d.fillOval(x, y, 30, 30);
            }
        };
        panelCenter.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
					x+=5;
					panelCenter.repaint();
				} else if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					y-=5;
					panelCenter.repaint();
				} else if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					x-=5;
					panelCenter.repaint();
				} else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					y+=5;
					panelCenter.repaint();
				}
        	}
        });
        panelCenter.setBackground(new Color(0, 0, 0));
        panelCenter.setFocusable(true); 
        frame.getContentPane().add(panelCenter, BorderLayout.CENTER);
    }
}
