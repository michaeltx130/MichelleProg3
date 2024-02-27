//MICHELLE JESÚS OBESO SÁNCHEZ IDS TV
//unidad 2: ejercicio 8

package ventanaJFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Mi primera ventana");
		this.setResizable(false);
		this.setLayout(null);
		
		this.loadComponents();
	}
	
	public void loadComponents() {
		JPanel login = new JPanel();
		
		login.setSize(this.getWidth(), this.getHeight());
		login.setLocation(0, 0);
		login.setLayout(null);
		login.setBackground(Color.lightGray);
		
		JLabel title = new JLabel("Inicio de sesión", SwingConstants.CENTER);
		title.setFont(new Font("Agency FB", Font.BOLD, 40));
		title.setLocation(80, 20);
		title.setSize(220, 40);
		login.add(title);
		
		JLabel user_tag = new JLabel("Correo electrónico:");
		user_tag.setFont(new Font("Agency FB", Font.BOLD, 18));
		user_tag.setLocation(130, 100);
		user_tag.setSize(220, 40);
		login.add(user_tag);
		
		JTextField user_field = new JTextField();
		user_field.setBounds(100, 140, 180, 30);
		this.add(user_field);
		
		JLabel pwd_tag = new JLabel("Contraseña:");
		pwd_tag.setFont(new Font("Agency FB", Font.BOLD, 18));
		pwd_tag.setLocation(150, 200);
		pwd_tag.setSize(180, 30);
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 235, 180, 30);
		this.add(pwd_field);
		
		JButton login_btn = new JButton("ACCEDER");
		login_btn.setBounds(100, 330, 180, 30);
		this.add(login_btn);
		
		/*JLabel recordar = new JLabel("Recuerdame");
		recordar.setFont(new Font("Agency FB", Font.BOLD, 13));
		recordar.setLocation(70, 410);
		recordar.setSize(220, 40);
		login.add(recordar);
		
		JButton confirmar = new JButton("✔");
		confirmar.setBounds(20, 424, 44, 13);
		this.add(confirmar);*/
		
		JCheckBox confirmar = new JCheckBox("Recuerdame");
		confirmar.setFont(new Font("Agency FB", Font.BOLD, 13));
		confirmar.setOpaque(false);
		confirmar.setBounds(20, 424, 90, 10);
		this.add(confirmar);
		
		
		JLabel olvidar = new JLabel("¿Olvidaste tu contraseña?");
		olvidar.setFont(new Font("Agency FB", Font.BOLD, 13));
		olvidar.setLocation(235, 410);
		olvidar.setSize(220, 40);
		login.add(olvidar);
		
		this.add(login);
		this.repaint();
	}
}
