package formularioDeRegistro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class VentanaRegistro extends JFrame{
	
	public VentanaRegistro() {
		
		//Características de la ventana
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(590, 550);
		this.setLocationRelativeTo(null);
		this.setTitle("Ventana de registro");
		this.setResizable(false);
		this.setLayout(null);
		
		this.Componentes();
		this.BarraMenu();
		//this.Admin();
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
		
		//Seleccionar la nacionalidad con ComboBox
		JLabel elegir_nacionalidad = new JLabel("Nacionalidad:");
		elegir_nacionalidad.setFont(new Font("Agency FB", Font.BOLD, 18));
		elegir_nacionalidad.setLocation(45,365);
		elegir_nacionalidad.setSize(80, 40);
		registro.add(elegir_nacionalidad);
		
		String paises[] = {"Canadá", "EEUU", "México", "Colombia", "Argentina", "Brasil"};
		
		JComboBox nacionalidad = new JComboBox(paises);
		nacionalidad.setFont(new Font("Agency FB", Font.BOLD, 18));
		nacionalidad.setLocation(130, 370);
		nacionalidad.setSize(95, 30);
		registro.add(nacionalidad);
			
		//Area de texto para una presentación descriptiva de si mismo
		JLabel presentacion = new JLabel("Descríbete:");
		presentacion.setFont(new Font("Agency FB", Font.BOLD, 18));
		presentacion.setLocation(350, 170);
		presentacion.setSize(120, 40);
		registro.add(presentacion);
		
		JTextArea bio = new JTextArea(10, 10);
		bio.setLocation(350, 210);
		bio.setSize(180, 110);
		registro.add(bio);
		
		JCheckBox confirmar = new JCheckBox("Acepto términos y condiciones");
		confirmar.setFont(new Font("Agency FB", Font.BOLD, 13));
		confirmar.setOpaque(false);
		confirmar.setLocation(350, 365);
		confirmar.setSize(180, 40);
		this.add(confirmar);
		
		JButton acceso = new JButton("Registrase");
		acceso.setFont(new Font("Agency FB", Font.BOLD, 18));
		acceso.setLocation(350, 410);
		acceso.setSize(180, 40);
		
		//Eventos
		acceso.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Registrarse");
				
				if(nombres_field.getText().length() <= 0) {
					nombres_field.setBorder(new LineBorder(Color.RED, 2));
				}else {
					nombres_field.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				if(apellidos_field.getText().length() <= 0) {
					apellidos_field.setBorder(new LineBorder(Color.RED, 2));
				}else {
					apellidos_field.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				if(opcion.isSelected() == false && opcion2.isSelected() == false) {
					opcion.setBorderPainted(true);
					opcion.setBorder(new LineBorder(Color.RED, 2));
					
					opcion2.setBorderPainted(true);
					opcion2.setBorder(new LineBorder(Color.RED, 2));
				}else {
					opcion.setBorderPainted(true);
					opcion.setBorder(new LineBorder(Color.GREEN, 2));
					
					opcion2.setBorderPainted(true);
					opcion2.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				if(edad_field.getText().length() <= 0) {
					edad_field.setBorder(new LineBorder(Color.RED, 2));
				}else {
					edad_field.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				if(soltero.isSelected() == false && casado.isSelected() == false) {
					soltero.setBorderPainted(true);
					soltero.setBorder(new LineBorder(Color.RED, 2));
					
					casado.setBorderPainted(true);
					casado.setBorder(new LineBorder(Color.RED, 2));
				}else {
					soltero.setBorderPainted(true);
					soltero.setBorder(new LineBorder(Color.GREEN, 2));
					
					casado.setBorderPainted(true);
					casado.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				
				if(bio.getText().length() <= 0) {
					bio.setBorder(new LineBorder(Color.RED, 2));
				}else {
					bio.setBorder(new LineBorder(Color.GREEN, 2));
				}
				
				if(confirmar.isSelected() == false) {
					confirmar.setBorderPainted(true);
					confirmar.setBorder(new LineBorder(Color.RED, 2));
					
				}else {
					confirmar.setBorderPainted(true);
					confirmar.setBorder(new LineBorder(Color.GREEN, 2));

				}
				
				System.out.println(nombres_field.getText());
				System.out.println(apellidos_field.getText());
				System.out.println(edad_field.getText());
				System.out.println(bio.getText());
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
	
	public void Admin() {

		JPanel admin = new JPanel();
		
		admin.setSize(this.getWidth(), this.getHeight());
		admin.setLocation(0, 0);
		admin.setLayout(null);
		admin.setBackground(Color.decode("#d5a3f5"));
		add(admin);
		
		JLabel widget_titulo = new JLabel("Usuarios", SwingConstants.CENTER);
		widget_titulo.setFont(new Font("Namecat", Font.BOLD, 30));
		widget_titulo.setLocation(200, 30);
		widget_titulo.setSize(150, 40);
		admin.add(widget_titulo);
		
		String titulosTabla[] = {"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"};
		String datos[][] = {
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},	
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"},
				{"No. Control", "Nombre", "Apellido", "Correo", "Semestre", "Carrera"}	
		};
		
		JTable tabla = new JTable(datos, titulosTabla);
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setLocation(40, 180);
		scroll.setSize(500, 200);
		
		admin.add(scroll);
		
	}
	
	/*@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawArc(100, 100, 100, 200, 0, 180);
		
		g2d.setColor(Color.red);
		
		g2d.drawLine(0, 0, 500, 500);
		
		g2d.drawOval(150, 200, 80, 80);
		
		g2d.drawOval(390, 180, 80, 80);
		
		g2d.setColor(Color.blue);
		
		int xS [] = {225, 150, 300, 225};
		int yS [] = {50, 150, 150, 50};
		
		g2d.drawPolygon(xS, yS, 3);
		
		g2d.drawRect(300, 300, 200, 150);
		
		g2d.drawRoundRect(350, 350, 200, 200, 15, 15);
		
		g2d.setFont(new Font("Namecat", Font.BOLD, 80));
		
		g2d.drawString("Hola", 350, 140);
		
		g2d.fillArc(500, 100, 200, 200, 0, 90);
		
		g2d.fillOval(180, 230, 80, 80);
		
		int xS2 [] = {255, 150, 330, 225};
		int yS2 [] = {80, 180, 180, 80};
		
		g2d.fillPolygon(xS2, yS2, 4);
		
		g2d.setColor(Color.black);
		
		g2d.fillRect(600, 300, 300, 100);
		
		g2d.clearRect(650, 350, 100, 50);
		
		try {
			BufferedImage imagen = ImageIO.read(new File("avion.png"));
			
			g2d.drawImage(imagen, 400, 180, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
