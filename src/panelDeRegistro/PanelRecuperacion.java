//MICHELLE JESÚS OBESO SÁNCHEZ IDS TV

package panelDeRegistro;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ventanaJFrame.Ventana;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PanelRecuperacion extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelRecuperacion frame = new PanelRecuperacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PanelRecuperacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		this.setLocationRelativeTo(null);
		this.setTitle("Recuperación de cuenta");
		this.setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BarraMenu(this);
		
		JLabel titulo = new JLabel("Recuperación");
		titulo.setFont(new Font("Agency FB", Font.BOLD, 40));
		titulo.setLocation(126, 34);
		titulo.setSize(191, 45);
		contentPane.add(titulo);
		
		ImageIcon imagenAviso = new ImageIcon("aviso.png");
		JLabel imgAviso = new JLabel();
		imgAviso.setLocation(20, 115);
		imgAviso.setSize(50, 50);
		imgAviso.setOpaque(true);
		imgAviso.setIcon(new ImageIcon(imagenAviso.getImage().getScaledInstance(imgAviso.getWidth(), imgAviso.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(imgAviso);
		
		JLabel aviso = new JLabel("Ingresa el correo electronico que usas para ");
		aviso.setHorizontalAlignment(SwingConstants.CENTER);
		aviso.setBackground(new Color(185, 185, 255));
		aviso.setOpaque(true);
		aviso.setFont(new Font("Agency FB", Font.BOLD, 18));
		aviso.setLocation(85, 109);
		aviso.setSize(319, 32);
		contentPane.add(aviso);
		
		JLabel aviso2 = new JLabel("poder recuperar tu cuenta.");
		aviso2.setBackground(new Color(185, 185, 255));
		aviso2.setOpaque(true);
		aviso2.setHorizontalAlignment(SwingConstants.CENTER);
		aviso2.setFont(new Font("Agency FB", Font.BOLD, 18));
		aviso2.setBounds(85, 136, 319, 32);
		contentPane.add(aviso2);
		
		ImageIcon imagenEmail = new ImageIcon("email.png");
		JLabel imgEmail = new JLabel();
		imgEmail.setLocation(30, 240);
		imgEmail.setSize(40, 40);
		imgEmail.setIcon(new ImageIcon(imagenEmail.getImage().getScaledInstance(imgEmail.getWidth(), imgEmail.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(imgEmail);
		
		JLabel correo = new JLabel("Correo electrónico:");
		correo.setFont(new Font("Agency FB", Font.BOLD, 18));
		correo.setLocation(100, 210);
		correo.setSize(220, 40);
		contentPane.add(correo);
					
		JTextField correo_field = new JTextField();
		correo_field.setBounds(100, 250, 250, 30);
		contentPane.add(correo_field);
				
		ImageIcon imagenPassword = new ImageIcon("candado.png");
		JLabel imgPassword = new JLabel();
		imgPassword.setLocation(30, 380);
		imgPassword.setSize(40, 40);
		imgPassword.setIcon(new ImageIcon(imagenPassword.getImage().getScaledInstance(imgPassword.getWidth(), imgPassword.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(imgPassword);
				
		JLabel pwd = new JLabel("Contraseña:");
		pwd.setFont(new Font("Agency FB", Font.BOLD, 18));
		pwd.setLocation(100, 280);
		pwd.setSize(220, 40);
		contentPane.add(pwd);
					
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 320, 250, 30);
		contentPane.add(pwd_field);
				
		JLabel confirmarPwd = new JLabel("Confimar contraseña:");
		confirmarPwd.setFont(new Font("Agency FB", Font.BOLD, 18));
		confirmarPwd.setLocation(100, 350);
		confirmarPwd.setSize(220, 40);
		contentPane.add(confirmarPwd);
					
		JPasswordField confirmar_field = new JPasswordField();
		confirmar_field.setBounds(100, 390, 250, 30);
		contentPane.add(confirmar_field);
		
		JCheckBox confirmar = new JCheckBox("Recuerdame");
		confirmar.setFont(new Font("Agency FB", Font.BOLD, 13));
		confirmar.setOpaque(false);
		confirmar.setBounds(20, 550, 90, 10);
		contentPane.add(confirmar);
		
		JButton btnNewButton = new JButton("RECUPERAR CUENTA");
		btnNewButton.setBounds(138, 463, 165, 40);
		contentPane.add(btnNewButton);
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

	public void Login(PanelDeRegistro vntRegistro) {

	}

	public void Registro(Ventana vntLogin) {

	}
}
