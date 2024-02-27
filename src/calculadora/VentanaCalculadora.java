//Michelle Jesus Obeso Sánchez IDS T.V

package calculadora;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaCalculadora extends JFrame{

	public VentanaCalculadora() {
		//Características de la ventana
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 700);
		this.setLocationRelativeTo(null);
		this.setTitle("Calculadora");
		this.setResizable(false);
		this.setLayout(null);
		
		this.componentes();
	}
	
	public void componentes() {
		//Características del panel
		JPanel panel = new JPanel();
				
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#122642"));
		
		JLabel resultado = new JLabel("Syntax Error", SwingConstants.CENTER);;
		resultado.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		resultado.setForeground(Color.decode("#00bea0"));
		resultado.setLocation(80, 100);
		resultado.setSize(300, 50);
		panel.add(resultado);
		
		JPanel panelCalculadora = new JPanel();
		panelCalculadora.setSize(400, 500);
		panelCalculadora.setLocation(0, 200);
		panelCalculadora.setLayout(null);
		panelCalculadora.setBackground(Color.decode("#213553"));
		this.add(panelCalculadora);
		

		//Botones de operación
		JButton igual = new JButton("=");
		igual.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		igual.setForeground(Color.decode("#122641"));
		igual.setBackground(Color.decode("#00bea0"));
		igual.setLocation(210, 380);
		igual.setSize(150, 60);
		panelCalculadora.add(igual);
		
		JButton suma = new JButton("+");
		suma.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		suma.setForeground(Color.decode("#00bea0"));
		suma.setBackground(Color.decode("#122641"));
		suma.setLocation(300, 290);
		suma.setSize(60, 60);
		panelCalculadora.add(suma);
		
		JButton resta = new JButton("-");
		resta.setFont(new Font("Segoe UI Black", Font.BOLD, 60));
		resta.setForeground(Color.decode("#00bea0"));
		resta.setBackground(Color.decode("#122641"));
		resta.setLocation(300, 200);
		resta.setSize(60, 60);
		panelCalculadora.add(resta);
		
		JButton mult = new JButton("x");
		mult.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		mult.setForeground(Color.decode("#00bea0"));
		mult.setBackground(Color.decode("#122641"));
		mult.setLocation(300, 110);
		mult.setSize(60, 60);
		panelCalculadora.add(mult);
		
		JButton division = new JButton("÷");
		division.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		division.setForeground(Color.decode("#00bea0"));
		division.setBackground(Color.decode("#122641"));
		division.setLocation(300, 20);
		division.setSize(60, 60);
		panelCalculadora.add(division);
		
		JButton porcentaje = new JButton("%");
		porcentaje.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		porcentaje.setForeground(Color.decode("#00bea0"));
		porcentaje.setBackground(Color.decode("#122641"));
		porcentaje.setLocation(210, 20);
		porcentaje.setSize(60, 60);
		panelCalculadora.add(porcentaje);
		
		JButton parentesis = new JButton("()");
		parentesis.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		parentesis.setForeground(Color.decode("#00bea0"));
		parentesis.setBackground(Color.decode("#122641"));
		parentesis.setLocation(120, 20);
		parentesis.setSize(60, 60);
		panelCalculadora.add(parentesis);
		
		JButton borrar = new JButton("C");
		borrar.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		borrar.setForeground(Color.decode("#00bea0"));
		borrar.setBackground(Color.decode("#122641"));
		borrar.setLocation(30, 20);
		borrar.setSize(60, 60);
		panelCalculadora.add(borrar);
		
		
		//Botones de números
		JButton siete = new JButton("7");
		siete.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		siete.setForeground(Color.decode("#ffffff"));
		siete.setBackground(Color.decode("#213553"));
		siete.setLocation(30, 110);
		siete.setSize(60, 60);
		panelCalculadora.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		ocho.setForeground(Color.decode("#ffffff"));
		ocho.setBackground(Color.decode("#213553"));
		ocho.setLocation(120, 110);
		ocho.setSize(60, 60);
		panelCalculadora.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		nueve.setForeground(Color.decode("#ffffff"));
		nueve.setBackground(Color.decode("#213553"));
		nueve.setLocation(210, 110);
		nueve.setSize(60, 60);
		panelCalculadora.add(nueve);
		
		JButton cuatro = new JButton("4");
		cuatro.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		cuatro.setForeground(Color.decode("#ffffff"));
		cuatro.setBackground(Color.decode("#213553"));
		cuatro.setLocation(30, 200);
		cuatro.setSize(60, 60);
		panelCalculadora.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		cinco.setForeground(Color.decode("#ffffff"));
		cinco.setBackground(Color.decode("#213553"));
		cinco.setLocation(120, 200);
		cinco.setSize(60, 60);
		panelCalculadora.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		seis.setForeground(Color.decode("#ffffff"));
		seis.setBackground(Color.decode("#213553"));
		seis.setLocation(210, 200);
		seis.setSize(60, 60);
		panelCalculadora.add(seis);
		
		JButton uno = new JButton("1");
		uno.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		uno.setForeground(Color.decode("#ffffff"));
		uno.setBackground(Color.decode("#213553"));
		uno.setLocation(30, 290);
		uno.setSize(60, 60);
		panelCalculadora.add(uno);
		
		JButton dos = new JButton("2");
		dos.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		dos.setForeground(Color.decode("#ffffff"));
		dos.setBackground(Color.decode("#213553"));
		dos.setLocation(120, 290);
		dos.setSize(60, 60);
		panelCalculadora.add(dos);
		
		JButton tres = new JButton("3");
		tres.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		tres.setForeground(Color.decode("#ffffff"));
		tres.setBackground(Color.decode("#213553"));
		tres.setLocation(210, 290);
		tres.setSize(60, 60);
		panelCalculadora.add(tres);
		
		JButton cero = new JButton("0");
		cero.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		cero.setForeground(Color.decode("#ffffff"));
		cero.setBackground(Color.decode("#213553"));
		cero.setLocation(30, 380);
		cero.setSize(60, 60);
		panelCalculadora.add(cero);
		
		JButton punto = new JButton(".");
		punto.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		punto.setForeground(Color.decode("#ffffff"));
		punto.setBackground(Color.decode("#213553"));
		punto.setLocation(120, 380);
		punto.setSize(60, 60);
		panelCalculadora.add(punto);
		
		this.add(panel);
		this.repaint();
	}
}
