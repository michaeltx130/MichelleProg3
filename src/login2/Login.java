//MICHELLE JESÚS OBESO SÁNCHEZ IDS TV

package login2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame{
	
	public Login() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 650);
		this.setLocationRelativeTo(null);
		this.setTitle("User Login");
		this.setResizable(false);
		this.setLayout(null);
		
		this.loadComponents();
	}
	
	public void loadComponents() {
		JPanel panel1 = new JPanel();
		
		panel1.setSize(this.getWidth(), this.getHeight());
		panel1.setLocation(0, 0);
		panel1.setLayout(null);
		panel1.setBackground(Color.decode("#2b488a"));
		
		JLabel titleLogin = new JLabel("User Login", SwingConstants.CENTER);
		titleLogin.setFont(new Font("Segoe UI Black", Font.ITALIC, 40));
		titleLogin.setForeground(Color.decode("#ffffff"));
		titleLogin.setLocation(200, 20);
		titleLogin.setSize(300, 60);
		panel1.add(titleLogin);
		
		JPanel panel2 = new JPanel();
		
		panel2.setSize(600, 370);
		panel2.setLocation(45, 120);
		panel2.setLayout(null);
		panel2.setBackground(Color.decode("#23396c"));
		this.add(panel2);
		
		JLabel titleAccount = new JLabel("My Account", SwingConstants.CENTER);
		titleAccount.setFont(new Font("Segoe UI Black", Font.ITALIC, 50));
		titleAccount.setForeground(Color.decode("#e0ca7c"));
		titleAccount.setLocation(120, 20);
		titleAccount.setSize(350, 70);
		panel2.add(titleAccount);
		
		JLabel titleUsername = new JLabel("Enter Your Username", SwingConstants.CENTER);
		titleUsername.setFont(new Font("Segoe UI Black", Font.ITALIC, 15));
		titleUsername.setForeground(Color.decode("#ffffff"));
		titleUsername.setLocation(100, 110);
		titleUsername.setSize(170, 30);
		panel2.add(titleUsername);
		
		ImageIcon imagenUser = new ImageIcon("hombre.png");
		JLabel imgUser = new JLabel();
		imgUser.setLocation(60, 150);
		imgUser.setSize(40, 40);
		imgUser.setIcon(new ImageIcon(imagenUser.getImage().getScaledInstance(imgUser.getWidth(), imgUser.getHeight(), Image.SCALE_SMOOTH)));
		panel2.add(imgUser);
		
		JTextField userField = new JTextField();
		userField.setSize(390, 40);
		userField.setLocation(110, 150);
		panel2.add(userField);
		
		JLabel titlePassword = new JLabel("Enter Your Password", SwingConstants.CENTER);
		titlePassword.setFont(new Font("Segoe UI Black", Font.ITALIC, 15));
		titlePassword.setForeground(Color.decode("#ffffff"));
		titlePassword.setLocation(100, 210);
		titlePassword.setSize(170, 30);
		panel2.add(titlePassword);
		
		ImageIcon imagenPassword = new ImageIcon("candado.png");
		JLabel imgPassword = new JLabel();
		imgPassword.setLocation(60, 250);
		imgPassword.setSize(40, 40);
		imgPassword.setIcon(new ImageIcon(imagenPassword.getImage().getScaledInstance(imgPassword.getWidth(), imgPassword.getHeight(), Image.SCALE_SMOOTH)));
		panel2.add(imgPassword);
		
		JPasswordField password_field = new JPasswordField();
		password_field.setSize(390, 40);
		password_field.setLocation(110, 250);
		panel2.add(password_field);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setFont(new Font("Segoe UI Black", Font.ITALIC, 20));
		loginBtn.setBackground(Color.decode("#e9cc68"));
		loginBtn.setSize(200, 50);
		loginBtn.setLocation(200, 310);
		panel2.add(loginBtn);
		
		JLabel titleSignUp = new JLabel("Don´t have a account ?", SwingConstants.CENTER);
		titleSignUp.setFont(new Font("Segoe UI Black", Font.ITALIC, 15));
		titleSignUp.setForeground(Color.decode("#FFFFFF"));
		titleSignUp.setLocation(260, 500);
		titleSignUp.setSize(170, 30);
		panel1.add(titleSignUp);
		
		JButton signUpBtn = new JButton("Sign Up");
		signUpBtn.setFont(new Font("Segoe UI Black", Font.ITALIC, 13));
		signUpBtn.setBackground(Color.decode("#e9cc68"));
		signUpBtn.setLocation(300, 540);
		signUpBtn.setSize(90, 40);
		panel1.add(signUpBtn);
	
		this.add(panel1);
		this.repaint();
	}
}
