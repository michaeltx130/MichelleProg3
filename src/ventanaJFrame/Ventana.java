//MICHELLE JESÚS OBESO SÁNCHEZ IDS TV
//Cambios para el ejercicio 17

package ventanaJFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import panelDeRegistro.PanelDeRegistro;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Ventana() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Panel de login");
		this.setResizable(false);
		this.setLayout(null);
		
		Login(this);
	}
	
	public void Login(JFrame frame) {
		JPanel login = new JPanel();
		
		login.setSize(this.getWidth(), this.getHeight());
		login.setLocation(0, 0);
		login.setLayout(null);
		login.setBackground(Color.decode("#a3e4d7"));
		
		JLabel title = new JLabel("Inicio de sesión", SwingConstants.CENTER);
		title.setFont(new Font("Agency FB", Font.BOLD, 40));
		title.setLocation(80, 20);
		title.setSize(220, 40);
		login.add(title);
		
		JLabel user_tag = new JLabel("Usuario:");
		user_tag.setFont(new Font("Agency FB", Font.BOLD, 18));
		user_tag.setLocation(100, 90);
		user_tag.setSize(220, 40);
		login.add(user_tag);
		
		JTextField user_field = new JTextField();
		user_field.setBounds(100, 130, 180, 30);
		login.add(user_field);
		
		JLabel pwd_tag = new JLabel("Contraseña:");
		pwd_tag.setFont(new Font("Agency FB", Font.BOLD, 18));
		pwd_tag.setLocation(100, 190);
		pwd_tag.setSize(180, 30);
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 225, 180, 30);
		login.add(pwd_field);
		
		JButton login_btn = new JButton("ACCEDER");
		login_btn.setBounds(100, 300, 180, 30);
		
		//Eventos
		login_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(user_field.getText().length() <= 0) {
					user_field.setBorder(new LineBorder(Color.RED, 2));
				}else {
					user_field.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				String pwd = new String(pwd_field.getPassword());
				
				if(pwd.length() <= 0) {
					pwd_field.setBorder(new LineBorder(Color.RED, 2));
				}else {
					pwd_field.setBorder(new LineBorder(Color.GREEN, 2));
				}
				JOptionPane.showMessageDialog(null, "Error", "Acceder", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		login.add(login_btn);
		
		JLabel o_tag = new JLabel("O");
		o_tag.setFont(new Font("Agency FB", Font.BOLD, 18));
		o_tag.setLocation(185, 335);
		o_tag.setSize(180, 30);
		login.add(o_tag);
		
		JButton irRegistro = new JButton("REGISTRARSE");
		irRegistro.setBounds(100, 370, 180, 30);
		
		irRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(login);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				dispose();
				
				PanelDeRegistro vntRegistro = new PanelDeRegistro();
				Login(vntRegistro);
			}
		});
	
		login.add(irRegistro);
		
		JCheckBox confirmar = new JCheckBox("Recuerdame");
		confirmar.setFont(new Font("Agency FB", Font.BOLD, 13));
		confirmar.setOpaque(false);
		confirmar.setBounds(20, 424, 90, 10);
		login.add(confirmar);
		
		
		JLabel olvidar = new JLabel("¿Olvidaste tu contraseña?");
		olvidar.setFont(new Font("Agency FB", Font.BOLD, 13));
		olvidar.setLocation(235, 410);
		olvidar.setSize(220, 40);
		login.add(olvidar);
		

		this.add(login);
		this.repaint();
	}
}
