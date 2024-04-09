//Examen Unidad 2

package examen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class Examen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField documentoField;
	private JTextField direccionField;
	private JTextField nombresField;
	private JTextField telefonoField;
	private JTextField descuentoField;

	public Examen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 550);
		contentPane = new JPanel();
		this.setTitle("Exámen");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setBackground(Color.decode("#006699"));
		panelNorth.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel tituloPanelNorth = new JLabel("Factura en Java - Eclipse - ArrayList y POO");
		tituloPanelNorth.setForeground(new Color(255, 255, 255));
		panelNorth.add(tituloPanelNorth);
		
		JLabel lblNewLabel = new JLabel("[Sin Base de Datos]");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panelNorth.add(lblNewLabel);
		
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(0, 102, 153));
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(255, 255, 255));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 238, 238));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 464, 97);
		panelCenter.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel tituloPanel1 = new JLabel("Datos del cliente");
		tituloPanel1.setBackground(new Color(211, 211, 211));
		panel_1.add(tituloPanel1, BorderLayout.NORTH);
		
		JPanel contenidoPanel1 = new JPanel();
		contenidoPanel1.setBackground(new Color(255, 255, 255));
		panel_1.add(contenidoPanel1, BorderLayout.CENTER);
		contenidoPanel1.setLayout(null);
		
		JLabel tituloDocumento = new JLabel("Documento:");
		tituloDocumento.setBounds(24, 11, 73, 14);
		contenidoPanel1.add(tituloDocumento);
		
		JLabel tituloDireccion = new JLabel("Dirección:");
		tituloDireccion.setBounds(24, 56, 62, 14);
		contenidoPanel1.add(tituloDireccion);
		
		documentoField = new JTextField();
		documentoField.setBounds(96, 8, 110, 20);
		contenidoPanel1.add(documentoField);
		documentoField.setColumns(10);
		
		direccionField = new JTextField();
		direccionField.setColumns(10);
		direccionField.setBounds(96, 53, 110, 20);
		contenidoPanel1.add(direccionField);
		
		JLabel tituloNombres = new JLabel("Nombres:");
		tituloNombres.setBounds(248, 11, 68, 14);
		contenidoPanel1.add(tituloNombres);
		
		JLabel tituloTelefono = new JLabel("Teléfono:");
		tituloTelefono.setBounds(248, 56, 56, 14);
		contenidoPanel1.add(tituloTelefono);
		
		nombresField = new JTextField();
		nombresField.setColumns(10);
		nombresField.setBounds(326, 8, 110, 20);
		contenidoPanel1.add(nombresField);
		
		telefonoField = new JTextField();
		telefonoField.setColumns(10);
		telefonoField.setBounds(326, 53, 110, 20);
		contenidoPanel1.add(telefonoField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 119, 464, 69);
		panelCenter.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel tituloPanel2 = new JLabel("Datos de factura");
		tituloPanel2.setBackground(new Color(255, 255, 255));
		panel_2.add(tituloPanel2, BorderLayout.NORTH);
		
		JPanel contenidoPanel2 = new JPanel();
		contenidoPanel2.setBackground(new Color(255, 255, 255));
		panel_2.add(contenidoPanel2, BorderLayout.CENTER);
		contenidoPanel2.setLayout(null);
		
		JLabel tituloNFactura = new JLabel("N°  Factura:");
		tituloNFactura.setBounds(10, 21, 71, 14);
		contenidoPanel2.add(tituloNFactura);
		
		JLabel labelNFactura = new JLabel("1");
		labelNFactura.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelNFactura.setBounds(96, 21, 20, 14);
		contenidoPanel2.add(labelNFactura);
		
		JLabel tituloFecha = new JLabel("Fecha:");
		tituloFecha.setBounds(248, 21, 71, 14);
		contenidoPanel2.add(tituloFecha);
		
		JLabel labelFecha = new JLabel("31/03/2024");
		labelFecha.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelFecha.setBounds(326, 21, 109, 14);
		contenidoPanel2.add(labelFecha);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 255, 255));
		panel3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel3.setBounds(10, 199, 464, 31);
		panelCenter.add(panel3);
		panel3.setLayout(null);
		
		ImageIcon imagenListado = new ImageIcon("listado.png");
		JButton imgListado = new JButton();
		imgListado.setLocation(15, 3);
		imgListado.setSize(25, 25);
		imgListado.setIcon(new ImageIcon(imagenListado.getImage().getScaledInstance(imgListado.getWidth(), imgListado.getHeight(), Image.SCALE_SMOOTH)));
		panel3.add(imgListado);
		
		JLabel tituloListado = new JLabel("Ver listado de facturas");
		tituloListado.setBounds(48, 11, 141, 14);
		panel3.add(tituloListado);
		
		ImageIcon imagenAñadir = new ImageIcon("añadir.png");
		JButton imgAñadir = new JButton();
		imgAñadir.setLocation(280, 3);
		imgAñadir.setSize(25, 25);
		imgAñadir.setIcon(new ImageIcon(imagenAñadir.getImage().getScaledInstance(imgAñadir.getWidth(), imgAñadir.getHeight(), Image.SCALE_SMOOTH)));
		panel3.add(imgAñadir);
		
		JLabel tituloAñadir = new JLabel("Añadir");
		tituloAñadir.setBounds(312, 11, 53, 14);
		panel3.add(tituloAñadir);
		
		ImageIcon imagenEliminar = new ImageIcon("eliminar.png");
		JButton imgEliminar = new JButton();
		imgEliminar.setLocation(365, 3);
		imgEliminar.setSize(25, 25);
		imgEliminar.setIcon(new ImageIcon(imagenEliminar.getImage().getScaledInstance(imgEliminar.getWidth(), imgEliminar.getHeight(), Image.SCALE_SMOOTH)));
		panel3.add(imgEliminar);
		
		JLabel tituloEliminar = new JLabel("Eliminar");
		tituloEliminar.setBounds(401, 11, 53, 14);
		panel3.add(tituloEliminar);
		
		String titulosTabla[] = {"Producto", "Cantidad", "Valor", "Sub Total"};
		String datos[][] = {
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "3000", "600.0"}};
		
		JTable tabla = new JTable(datos, titulosTabla);
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setLocation(10, 229);
		scroll.setSize(464, 70);
		panelCenter.add(scroll);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBounds(10, 310, 464, 142);
		panelCenter.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBtns = new JPanel();
		panelBtns.setBackground(new Color(255, 255, 255));
		FlowLayout fl_panelBtns = (FlowLayout) panelBtns.getLayout();
		fl_panelBtns.setAlignment(FlowLayout.RIGHT);
		panel_4.add(panelBtns, BorderLayout.SOUTH);
		
		JButton btnFinalizar = new JButton("Finalizar factura");
		panelBtns.add(btnFinalizar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		panelBtns.add(btnLimpiar);
		
		JPanel contenidoPanel4 = new JPanel();
		contenidoPanel4.setBackground(new Color(255, 255, 255));
		panel_4.add(contenidoPanel4, BorderLayout.CENTER);
		contenidoPanel4.setLayout(null);
		
		JLabel tituloSubTotal = new JLabel("Sub Total:");
		tituloSubTotal.setBounds(10, 11, 73, 14);
		contenidoPanel4.add(tituloSubTotal);
		
		JLabel tituloDescuento = new JLabel("%  Descuento:");
		tituloDescuento.setBounds(10, 36, 94, 14);
		contenidoPanel4.add(tituloDescuento);
		
		JLabel tituloIVA = new JLabel("IVA 19% :");
		tituloIVA.setBounds(10, 60, 73, 14);
		contenidoPanel4.add(tituloIVA);
		
		JLabel tituloTotalFactura = new JLabel("Total Factura:");
		tituloTotalFactura.setBounds(10, 85, 94, 14);
		contenidoPanel4.add(tituloTotalFactura);
		
		descuentoField = new JTextField();
		descuentoField.setColumns(10);
		descuentoField.setBounds(114, 33, 37, 20);
		contenidoPanel4.add(descuentoField);
		
		JLabel labelSubTotal = new JLabel("6600.0");
		labelSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelSubTotal.setBounds(114, 11, 67, 14);
		contenidoPanel4.add(labelSubTotal);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBackground(new Color(255, 255, 255));
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBounds(157, 32, 29, 23);
		contenidoPanel4.add(checkBox);
		
		JLabel tituloValorDescontado = new JLabel("Valor descontado:");
		tituloValorDescontado.setBounds(195, 36, 105, 14);
		contenidoPanel4.add(tituloValorDescontado);
		
		JLabel labelIVA = new JLabel("1254.0");
		labelIVA.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelIVA.setBounds(114, 60, 67, 14);
		contenidoPanel4.add(labelIVA);
		
		JLabel labelTotalFactura = new JLabel("7524.0");
		labelTotalFactura.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelTotalFactura.setBounds(114, 85, 67, 14);
		contenidoPanel4.add(labelTotalFactura);
		
		JLabel labelValorDescontado = new JLabel("330.0");
		labelValorDescontado.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelValorDescontado.setBounds(312, 36, 67, 14);
		contenidoPanel4.add(labelValorDescontado);
	}
}
