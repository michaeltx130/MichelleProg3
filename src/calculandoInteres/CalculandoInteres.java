package calculandoInteres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculandoInteres extends JFrame{
	
	public CalculandoInteres() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Calculando el Interés");
		this.setResizable(true);
		this.setLayout(new BorderLayout());
	
		this.Componentes();
	}
	
	public void Componentes() {
		
		JPanel panel1 = new JPanel();
		
		panel1.setSize(this.getWidth(), this.getHeight());
		panel1.setLocation(0, 0);
		panel1.setLayout(new BorderLayout());
		panel1.setBackground(Color.white);
		
		JLabel tituloInteres = new JLabel("     Interés", 2);
		tituloInteres.setFont(new Font("Georgia", Font.ITALIC, 30));
		tituloInteres.setForeground(Color.decode("#ff3333"));
		panel1.add(tituloInteres, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(35, 50, 510, 300);
		panel2.setLayout(new BorderLayout());
		panel2.setBackground(Color.decode("#99ff99"));
		this.add(panel2);
		
		JLabel tituloPanel2 = new JLabel("  Calcular Interés", 2);
		tituloPanel2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tituloPanel2.setForeground(Color.black);
		panel2.add(tituloPanel2, BorderLayout.NORTH);
		
		JPanel panel3 = new JPanel();

		panel3.setLayout(new BorderLayout());
		panel3.setBackground(Color.decode("#99ff99"));
		panel2.add(panel3, BorderLayout.CENTER);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(Color.decode("#99ff99"));
		panel3.add(panel4, BorderLayout.CENTER);
		
		JLabel capital = new JLabel("Capital:");
		capital.setFont(new Font("Tahoma", Font.PLAIN, 15));
		capital.setForeground(Color.black);
		capital.setBounds(40, 30, 60, 20);
		panel4.add(capital);
		
		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tiempo.setForeground(Color.black);
		tiempo.setBounds(40, 100, 60, 20);
		panel4.add(tiempo);
		
		JLabel tasaInteres = new JLabel("Tasa Interés:");
		tasaInteres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tasaInteres.setForeground(Color.black);
		tasaInteres.setBounds(40, 170, 100, 20);
		panel4.add(tasaInteres);
		
		JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER));
		botones.setBackground(Color.decode("#99ff99"));
		
		JButton calcularBtn = new JButton("Calcular");
		calcularBtn.setBackground(Color.decode("#323232"));
		calcularBtn.setForeground(Color.decode("#ffffff"));
		botones.add(calcularBtn);
		
		JButton cancelarBtn = new JButton("Cancelar");
		cancelarBtn.setBackground(Color.decode("#323232"));
		cancelarBtn.setForeground(Color.decode("#ffffff"));
		botones.add(cancelarBtn);
		
		panel3.add(botones, BorderLayout.SOUTH);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(35, 400, 510, 120);
		panel5.setLayout(null);
		panel5.setBackground(Color.pink);
		this.add(panel5);
		
		JLabel interes = new JLabel("Interés");
		interes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		interes.setForeground(Color.black);
		interes.setBounds(40, 30, 50, 20);
		panel5.add(interes);
		
		JLabel monto = new JLabel("Monto");
		monto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		monto.setForeground(Color.black);
		monto.setBounds(40, 80, 50, 20);
		panel5.add(monto);
		
		
		
		this.add(panel1);
		this.repaint();
	}
}
