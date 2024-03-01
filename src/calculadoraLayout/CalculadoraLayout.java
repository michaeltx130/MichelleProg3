//Michelle Jesus Obeso Sánchez IDS T.V

package calculadoraLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculadoraLayout extends JFrame {
	
	public CalculadoraLayout(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 650);
		this.setLocationRelativeTo(null);
		this.setTitle("Calculadora");
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		this.Componentes();
	}
	
	public void Componentes() {
		this.setSize(this.getWidth(), this.getHeight());
		JPanel calculadora = new JPanel();
		
		calculadora.setSize(this.getWidth(), this.getHeight());
		calculadora.setLocation(0, 0);
		calculadora.setLayout(new BorderLayout());
		calculadora.setBackground(Color.white);
		
		JLabel input = new JLabel("20.00", 4);
		input.setBackground(Color.white);
		input.setFont(new Font("SignPainter", Font.BOLD, 40));
		calculadora.add(input, BorderLayout.NORTH);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4, 3));
		botones.setBackground(Color.red);
		calculadora.add(botones, BorderLayout.CENTER);
		
		String btn_texts[] = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "."};   
		
		for (int i = 0; i < btn_texts.length; i++) {
			botones.add(new JButton(btn_texts[i]));
		}
		
		JPanel actions = new JPanel();
		actions.setLayout(new GridLayout(6, 1));
		actions.setBackground(Color.green);
		calculadora.add(actions, BorderLayout.EAST);
		
		String actions_texts[] = {"+", "-", "*", "/", "=", "CE"};
		
		for (int i = 0; i < actions_texts.length; i++) {
			actions.add(new JButton(actions_texts[i]));
		}
		
		this.add(calculadora);
		this.repaint();
	}
}
