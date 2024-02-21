package unidad2_ejercicio12;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaRegistro extends JFrame{
	
	public VentanaRegistro() {
		
		//Características de la ventana
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Ventana de registro");
		this.setResizable(false);
		this.setLayout(null);
		
		this.Componentes();
	}
	
	public void Componentes() {
		
		//Características del panel
		JPanel registro = new JPanel();
		
		registro.setSize(this.getWidth(), this.getHeight());
		registro.setLocation(0, 0);
		registro.setLayout(null);
		registro.setBackground(Color.decode("#85c1e9"));
		
		JLabel title = new JLabel("Formulario de registro", SwingConstants.CENTER);
		title.setFont(new Font("Agency FB", Font.BOLD, 40));
		title.setLocation(115, 10);
		title.setSize(350, 45);
		registro.add(title);
		
		//Datos generales
		JLabel nombres = new JLabel("Nombres/s:");
		nombres.setFont(new Font("Agency FB", Font.BOLD, 18));
		nombres.setLocation(45, 80);
		nombres.setSize(220, 40);
		registro.add(nombres);
		
		JTextField nombres_field = new JTextField();
		nombres_field.setBounds(45, 120, 180, 30);
		this.add(nombres_field);
		
		JLabel apellidos = new JLabel("Apellidos/s:");
		apellidos.setFont(new Font("Agency FB", Font.BOLD, 18));
		apellidos.setLocation(350, 80);
		apellidos.setSize(220, 40);
		registro.add(apellidos);
			
		JTextField apellidos_field = new JTextField();
		apellidos_field.setBounds(347, 120, 180, 30);
		this.add(apellidos_field);
		
		//Selección del género
		JLabel genero = new JLabel("Genero:");
		genero.setFont(new Font("Agency FB", Font.BOLD, 18));
		genero.setLocation(45, 170);
		genero.setSize(50, 40);
		registro.add(genero);
		
		JRadioButton opcion = new JRadioButton("Hombre");
		opcion.setFont(new Font("Agency FB", Font.BOLD, 18));
		opcion.setOpaque(false);
		opcion.setLocation(100, 170);
		opcion.setSize(75, 41);
		registro.add(opcion);
		
		JRadioButton opcion2 = new JRadioButton("Mujer");
		opcion2.setFont(new Font("Agency FB", Font.BOLD, 18));
		opcion2.setOpaque(false);
		opcion2.setLocation(170, 170);
		opcion2.setSize(65, 41);
		registro.add(opcion2);
		
		//Seleccionar solo una opción del genero
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(opcion);
		grupo.add(opcion2);
		
		JLabel edad = new JLabel("Edad:");
		edad.setFont(new Font("Agency FB", Font.BOLD, 18));
		edad.setLocation(45, 230);
		edad.setSize(50, 40);
		registro.add(edad);
		
		JTextField edad_field = new JTextField();
		edad_field.setLocation(100, 240);
		edad_field.setSize(40, 20);
		this.add(edad_field);
		
		//Selección del Edo.Civil
		JLabel edoCivil = new JLabel("Edo Civil:");
		edoCivil.setFont(new Font("Agency FB", Font.BOLD, 18));
		edoCivil.setLocation(45,290);
		edoCivil.setSize(55, 40);
		registro.add(edoCivil);
		
		JRadioButton soltero = new JRadioButton("Soltero");
		soltero.setFont(new Font("Agency FB", Font.BOLD, 18));
		soltero.setOpaque(false);
		soltero.setLocation(100, 290);
		soltero.setSize(70, 40);
		this.add(soltero);
		
		JRadioButton casado = new JRadioButton("Casado");
		casado.setFont(new Font("Agency FB", Font.BOLD, 18));
		casado.setOpaque(false);
		casado.setLocation(170, 290);
		casado.setSize(70, 40);
		this.add(casado);
		
		//Seleccionar solo una opción del Edo.Civil
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(soltero);
		grupo2.add(casado);
		
		
		//Area de texto para una presentación descriptiva de si mismo
		JLabel presentacion = new JLabel("Descríbete:");
		presentacion.setFont(new Font("Agency FB", Font.BOLD, 18));
		presentacion.setLocation(350, 170);
		presentacion.setSize(220, 40);
		registro.add(presentacion);
		
		JTextArea bio = new JTextArea(10, 10);
		bio.setLocation(350, 210);
		bio.setSize(180, 110);
		registro.add(bio);
		
		JCheckBox confirmar = new JCheckBox("Acepto términos y condiciones");
		confirmar.setFont(new Font("Agency FB", Font.BOLD, 13));
		confirmar.setOpaque(false);
		confirmar.setLocation(350, 370);
		confirmar.setSize(180, 40);
		this.add(confirmar);
		
		JButton acceso = new JButton("Registrase");
		acceso.setLocation(350, 410);
		acceso.setSize(180, 30);
		registro.add(acceso);
		
		this.add(registro);
		this.repaint();
	}
}
