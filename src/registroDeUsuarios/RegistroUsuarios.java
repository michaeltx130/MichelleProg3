package registroDeUsuarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RegistroUsuarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public RegistroUsuarios() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 128));
		panel.setLayout(new BorderLayout());
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel titulo_registro_usuarios = new JLabel("     Registro de Usuarios");
		titulo_registro_usuarios.setForeground(Color.decode("#d20000"));
		titulo_registro_usuarios.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
		panel.add(titulo_registro_usuarios, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#80ff80"));
		panel_1.setLayout(null);
		panel.add(panel_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#3eeafd"));
		panel_2.setBounds(10, 11, 338, 273);
		panel_2.setLayout(new BorderLayout());
		panel_1.add(panel_2);
		
		JLabel titulo_datos_gral = new JLabel("   Datos Generales");
		titulo_datos_gral.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(titulo_datos_gral, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#80ffd6"));
		panel_3.setLayout(null);
		panel_2.add(panel_3, BorderLayout.CENTER);
		
		JLabel nombre_etiqueta = new JLabel("Nombres:");
		nombre_etiqueta.setBounds(57, 25, 56, 14);
		panel_3.add(nombre_etiqueta);
		
		JTextField nombre_field = new JTextField();
		nombre_field.setBounds(136, 22, 136, 20);
		nombre_field.setColumns(10);
		panel_3.add(nombre_field);
		
		JLabel ap_etiqueta = new JLabel("Apellido Paterno:");
		ap_etiqueta.setBounds(21, 62, 100, 14);
		panel_3.add(ap_etiqueta);
		
		JTextField ap_field = new JTextField();
		ap_field.setColumns(10);
		ap_field.setBounds(136, 59, 136, 20);
		panel_3.add(ap_field);
		
		JLabel am_etiqueta = new JLabel("Apellido Materno:");
		am_etiqueta.setBounds(21, 99, 100, 14);
		panel_3.add(am_etiqueta);
		
		JTextField am_field = new JTextField();
		am_field.setColumns(10);
		am_field.setBounds(136, 96, 136, 20);
		panel_3.add(am_field);
		
		JLabel fecha_etiqueta = new JLabel("Fecha Nacimiento:");
		fecha_etiqueta.setBounds(15, 136, 105, 14);
		panel_3.add(fecha_etiqueta);
		
		
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		JComboBox fechas_nacimiento = new JComboBox(meses);
		fechas_nacimiento.setBounds(136, 133, 136, 20);
		panel_3.add(fechas_nacimiento);
		
		JLabel genero_etiqueta = new JLabel("Sexo:");
		genero_etiqueta.setBounds(15, 173, 56, 14);
		panel_3.add(genero_etiqueta);
		
		JRadioButton opcion_1 = new JRadioButton("Masculino");
		opcion_1.setBackground(Color.decode("#80ffd6"));
		opcion_1.setBounds(163, 166, 109, 23);
		panel_3.add(opcion_1);
		
		JRadioButton opcion_2 = new JRadioButton("Femenino");
		opcion_2.setBackground(Color.decode("#80ffd6"));
		opcion_2.setBounds(163, 192, 109, 23);
		panel_3.add(opcion_2);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(opcion_1);
		grupo.add(opcion_2);
		
		JLabel nacionalidad_etiqueta = new JLabel("Nacionalidad:");
		nacionalidad_etiqueta.setBounds(40, 225, 76, 14);
		panel_3.add(nacionalidad_etiqueta);
			
		String paises[] = {"Canadá", "EEUU", "México", "Colombia", "Argentina", "Brasil"};
		
		JComboBox seleccion_paises = new JComboBox(paises);
		seleccion_paises.setBounds(136, 222, 136, 20);
		panel_3.add(seleccion_paises);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.decode("#ff6262"));
		panel_4.setBounds(10, 303, 338, 193);
		panel_4.setLayout(new BorderLayout());
		panel_1.add(panel_4);
		
		JLabel titulo_datos_op = new JLabel("   Datos Opcionales");
		titulo_datos_op.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_4.add(titulo_datos_op, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.decode("#ff7777"));
		panel_5.setLayout(null);
		panel_4.add(panel_5, BorderLayout.CENTER);
		
		JLabel descripcion_etiqueta = new JLabel("Descripción");
		descripcion_etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		descripcion_etiqueta.setBounds(23, 21, 77, 14);
		panel_5.add(descripcion_etiqueta);
		
		JTextArea biografia_area = new JTextArea();
		biografia_area.setBounds(23, 46, 125, 106);
		panel_5.add(biografia_area);
		
		JLabel preferencias_etiqueta = new JLabel("Preferencias");
		preferencias_etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		preferencias_etiqueta.setBounds(185, 22, 77, 14);
		panel_5.add(preferencias_etiqueta);
		
		
		String opcionesGustos[] = {"Cantar", "Escuchar Música", "Leer", "Deportes", "Videojuegos", "Bailar", "Otros"};
		
		JComboBox seleccion_preferencias = new JComboBox(opcionesGustos);
		seleccion_preferencias.setBounds(182, 47, 132, 20);
		panel_5.add(seleccion_preferencias);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.decode("#ff6262"));
		panel_6.setBounds(368, 11, 216, 273);
		panel_6.setLayout(new BorderLayout());
		panel_1.add(panel_6);
		
		JLabel titulo_perfil = new JLabel("   Perfil del usuario");
		titulo_perfil.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6.add(titulo_perfil, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.decode("#ff7777"));
		panel_7.setLayout(null);
		panel_6.add(panel_7, BorderLayout.CENTER);
		
		ImageIcon imagenUser = new ImageIcon("user.png");
		JLabel img_user = new JLabel();
		img_user.setLocation(43, 11);
		img_user.setSize(127, 126);
		img_user.setIcon(new ImageIcon(imagenUser.getImage().getScaledInstance(img_user.getWidth(), img_user.getHeight(), Image.SCALE_SMOOTH)));
		panel_7.add(img_user);
		
		JCheckBox mostrar_foto = new JCheckBox("Mostrar Foto de Perfil");
		mostrar_foto.setBackground(Color.decode("#ff7777"));
		mostrar_foto.setBounds(27, 144, 162, 23);
		panel_7.add(mostrar_foto);
		
		JCheckBox mostrar_fecha = new JCheckBox("Mostrar Fecha Nacimiento");
		mostrar_fecha.setBackground(Color.decode("#ff7777"));
		mostrar_fecha.setBounds(27, 182, 183, 23);
		panel_7.add(mostrar_fecha);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(128, 255, 255));
		panel_8.setBounds(367, 303, 217, 193);
		panel_8.setLayout(null);
		panel_1.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_8.setBackground(Color.decode("#80ffff"));
		panel_9.setBounds(62, 32, 92, 124);
		panel_9.setLayout(new GridLayout(3, 1, 0, 0));
		panel_8.add(panel_9);
		
		JButton nuevo_boton = new JButton("Nuevo");
		nuevo_boton.setForeground(Color.white);
		nuevo_boton.setBackground(Color.decode("#282828"));
		panel_9.add(nuevo_boton);
		
		JButton guardar_boton = new JButton("Guardar");
		guardar_boton.setForeground(Color.white);
		guardar_boton.setBackground(Color.decode("#282828"));
		panel_9.add(guardar_boton);
		
		JButton salir_boton = new JButton("Salir");
		salir_boton.setForeground(Color.white);
		salir_boton.setBackground(Color.decode("#282828"));
		panel_9.add(salir_boton);
		
	}
}
