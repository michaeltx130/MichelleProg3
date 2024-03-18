package botonesClick;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class BotonesClick extends JFrame {
    
	public BotonesClick() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Mi ventana");
        this.setResizable(false);
        this.setLayout(null);

        this.Componentes();
	}
	
	public void Componentes() {
		JPanel panel = new JPanel();

	    panel.setSize(this.getWidth(), this.getHeight());
	    panel.setLocation(0, 0);
	    panel.setLayout(null);
	    panel.setBackground(Color.decode("#52de4c"));
	    
	    panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				 // Medidas de los botones
                int width = (int) (Math.random() * 100 + 20);
                int height = (int) (Math.random() * 100 + 20);

                // Generar color aleatorio
                Color randomColor = new Color((int) (Math.random() * 0x1000000));
                
                //Obtener las coordenadas
                int x = e.getX(), y = e.getY();
                
                JButton btnAleatorio = new JButton("x: " + x + " y: " + y);
                btnAleatorio.setBounds(x, y, width, height);
                btnAleatorio.setBorder(new LineBorder(randomColor, 4));
                panel.add(btnAleatorio);
                panel.repaint();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {	
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
	    });
	    
	    this.add(panel);
        this.repaint();
	}
}
