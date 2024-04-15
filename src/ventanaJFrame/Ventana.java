//MICHELLE JESÚS OBESO SÁNCHEZ IDS TV

package ventanaJFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import panelDeRegistro.PanelDeRegistro;
import panelDeRegistro.PanelRecuperacion;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Ventana() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 520);
		this.setLocationRelativeTo(null);
		this.setTitle("Panel de login");
		this.setResizable(false);
		this.setLayout(null);
		
		BarraMenu(this);
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
	
		frame.add(irRegistro);
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
	
	public void BarraMenu(JFrame frame) {
		
		JMenuBar barra = new JMenuBar();
		this.setJMenuBar(barra);
		
		JMenu menu = new JMenu("Cuenta");
		JMenu menu2 = new JMenu("Usuarios");
		JMenu menu3 = new JMenu("Ayuda");
		
		JMenuItem eleccion1 = new JMenuItem("Nueva cuenta");
		
		JPanel login = new JPanel();
		eleccion1.addActionListener(new ActionListener() {
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
		menu.add(eleccion1);
		
		JMenuItem eleccion2 = new JMenuItem("Iniciar sesion");
		
		JPanel registro = new JPanel();
		eleccion2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(registro);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				dispose();
				
				Ventana vntLogin = new Ventana();
				Registro(vntLogin);
			}			
		});
		menu.add(eleccion2);
		
		JMenuItem eleccion3 = new JMenuItem("Recuperación de cuenta");
		
		JPanel contentPane = new JPanel();
		eleccion3.addActionListener(new ActionListener() {
			private PanelRecuperacion panelRecuperacion;

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(contentPane);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
				dispose();
				
				this.panelRecuperacion = new PanelRecuperacion();
				this.panelRecuperacion.setVisible(true);
				
			}
		});
		menu.add(eleccion3);
		
		JMenuItem opcion1 = new JMenuItem("Alta");
		menu2.add(opcion1);
		JMenuItem opcion2 = new JMenuItem("Baja");
		menu2.add(opcion2);
		JMenuItem opcion3 = new JMenuItem("Consultar");
		menu2.add(opcion3);
		
		JMenuItem seleccion1 = new JMenuItem("¿Cómo crear un usuario?");
		menu3.add(seleccion1);
		JMenuItem seleccion2 = new JMenuItem("¿Cómo acceder al sistema?");
		menu3.add(seleccion2);
		JMenuItem seleccion3 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		menu3.add(seleccion3);
		
		barra.add(menu);
		barra.add(menu2);
		barra.add(menu3);
		barra.updateUI();
	}
	
	public void Registro(Ventana vntLogin) {
			
	}
}
