//MICHELLE JESÚS OBESO SÁNCHEZ IDS TV
//Cambios para el ejercicio 17

package panelDeRegistro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PanelDeRegistro extends JFrame{
	
	private JPasswordField pwd_field;
	private JPasswordField confirmar_field;
	
	public PanelDeRegistro() {
		
		//Características de la ventana
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Panel de registro");
		this.setResizable(false);
		this.setLayout(null);
		
		this.Componentes();
		this.BarraMenu();
		
	}
	
	public void Componentes() {
		
		//Características del panel
		JPanel registro = new JPanel();
		
		registro.setSize(this.getWidth(), this.getHeight());
		registro.setLocation(0, 0);
		registro.setLayout(null);
		registro.setBackground(Color.decode("#85c1e9"));
		
		JLabel title = new JLabel("Registro", SwingConstants.CENTER);
		title.setFont(new Font("Agency FB", Font.BOLD, 40));
		title.setLocation(50, 10);
		title.setSize(350, 45);
		registro.add(title);
				
		//Datos generales
		ImageIcon imagenUser = new ImageIcon("hombre.png");
		JLabel imgUser = new JLabel();
		imgUser.setLocation(30, 100);
		imgUser.setSize(40, 40);
		imgUser.setIcon(new ImageIcon(imagenUser.getImage().getScaledInstance(imgUser.getWidth(), imgUser.getHeight(), Image.SCALE_SMOOTH)));
		registro.add(imgUser);
		
		JLabel nombres = new JLabel("Nombres/s:");
		nombres.setFont(new Font("Agency FB", Font.BOLD, 18));
		nombres.setLocation(100, 70);
		nombres.setSize(220, 40);
		registro.add(nombres);
		
		JTextField nombres_field = new JTextField();
		nombres_field.setBounds(100, 110, 250, 30);
		this.add(nombres_field);
		
		JLabel apellidos = new JLabel("Apellidos/s:");
		apellidos.setFont(new Font("Agency FB", Font.BOLD, 18));
		apellidos.setLocation(100, 140);
		apellidos.setSize(220, 40);
		registro.add(apellidos);
			
		JTextField apellidos_field = new JTextField();
		apellidos_field.setBounds(100, 180, 250, 30);
		this.add(apellidos_field);
		
		ImageIcon imagenEmail = new ImageIcon("email.png");
		JLabel imgEmail = new JLabel();
		imgEmail.setLocation(30, 240);
		imgEmail.setSize(40, 40);
		imgEmail.setIcon(new ImageIcon(imagenEmail.getImage().getScaledInstance(imgEmail.getWidth(), imgEmail.getHeight(), Image.SCALE_SMOOTH)));
		registro.add(imgEmail);
		
		JLabel correo = new JLabel("Correo electrónico:");
		correo.setFont(new Font("Agency FB", Font.BOLD, 18));
		correo.setLocation(100, 210);
		correo.setSize(220, 40);
		registro.add(correo);
			
		JTextField correo_field = new JTextField();
		correo_field.setBounds(100, 250, 250, 30);
		this.add(correo_field);
		
		ImageIcon imagenPassword = new ImageIcon("candado.png");
		JLabel imgPassword = new JLabel();
		imgPassword.setLocation(30, 380);
		imgPassword.setSize(40, 40);
		imgPassword.setIcon(new ImageIcon(imagenPassword.getImage().getScaledInstance(imgPassword.getWidth(), imgPassword.getHeight(), Image.SCALE_SMOOTH)));
		registro.add(imgPassword);
		
		JLabel pwd = new JLabel("Contraseña:");
		pwd.setFont(new Font("Agency FB", Font.BOLD, 18));
		pwd.setLocation(100, 280);
		pwd.setSize(220, 40);
		registro.add(pwd);
			
		pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 320, 250, 30);
		this.add(pwd_field);
		
		JLabel confirmarPwd = new JLabel("Confimar contraseña:");
		confirmarPwd.setFont(new Font("Agency FB", Font.BOLD, 18));
		confirmarPwd.setLocation(100, 350);
		confirmarPwd.setSize(220, 40);
		registro.add(confirmarPwd);
			
		confirmar_field = new JPasswordField();
		confirmar_field.setBounds(100, 390, 250, 30);
		this.add(confirmar_field);
		
		JCheckBox terminos = new JCheckBox("Acepto términos y condiciones");
		terminos.setFont(new Font("Agency FB", Font.BOLD, 13));
		terminos.setOpaque(false);
		terminos.setLocation(20, 480);
		terminos.setSize(180, 40);
		this.add(terminos);
		
		JButton acceso = new JButton("Registrase");
		acceso.setFont(new Font("Agency FB", Font.BOLD, 18));
		acceso.setLocation(230, 480);
		acceso.setSize(180, 40);
		
		//Eventos
		acceso.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String pwd = new String(pwd_field.getPassword());
				String confirmar = new String(confirmar_field.getPassword());
				
				if(nombres_field.getText().isEmpty() || apellidos_field.getText().isEmpty()
                        || correo_field.getText().isEmpty() || pwd.isEmpty() || confirmar.isEmpty() || !terminos.isSelected()) {
					
					nombres_field.setBorder(new LineBorder(Color.RED, 2));
					apellidos_field.setBorder(new LineBorder(Color.RED, 2));
					correo_field.setBorder(new LineBorder(Color.RED, 2));
					pwd_field.setBorder(new LineBorder(Color.RED, 2));
					confirmar_field.setBorder(new LineBorder(Color.RED, 2));
					terminos.setBorderPainted(true);
					terminos.setBorder(new LineBorder(Color.RED, 2));
					
					JOptionPane.showMessageDialog(null, "Asegúrese de completar los datos.");
				}else if(!pwd.equals(confirmar)){
					pwd_field.setBorder(new LineBorder(Color.YELLOW, 2));
					confirmar_field.setBorder(new LineBorder(Color.YELLOW, 2));
					
					JOptionPane.showMessageDialog(null, "Asegúrese de que las contraseñas coincidan.");
				}else {
					nombres_field.setBorder(new LineBorder(Color.GREEN, 2));
					apellidos_field.setBorder(new LineBorder(Color.GREEN, 2));
					correo_field.setBorder(new LineBorder(Color.GREEN, 2));
					pwd_field.setBorder(new LineBorder(Color.GREEN, 2));
					confirmar_field.setBorder(new LineBorder(Color.GREEN, 2));
					terminos.setBorderPainted(true);
					terminos.setBorder(new LineBorder(Color.GREEN, 2));
					
                    JOptionPane.showMessageDialog(null, "Te has registrado exitosamente.");
                }
			}	
		});
		
		registro.add(acceso);
		
		this.add(registro);
		this.repaint();
	}
	
	public void BarraMenu() {
		
		JMenuBar barra = new JMenuBar();
		this.setJMenuBar(barra);
		
		JMenu menu = new JMenu("Opciones");
		JMenu menu2 = new JMenu("Ayuda");

		JMenuItem eleccion1 = new JMenuItem("Nuevo cuenta");
		menu.add(eleccion1);
		JMenuItem eleccion2 = new JMenuItem("Iniciar sesion");
		menu.add(eleccion2);
		JMenuItem eleccion3 = new JMenuItem("Cerrar");
		menu.add(eleccion3);
		
		JMenuItem seleccion1 = new JMenuItem("Contactenos");
		menu2.add(seleccion1);
		JMenuItem seleccion2 = new JMenuItem("Acerca De");
		menu2.add(seleccion2);
		JMenuItem seleccion3 = new JMenuItem("Repotar problema");
		menu2.add(seleccion3);
		
		barra.add(menu);
		barra.add(menu2);
		barra.updateUI();
	}
}
