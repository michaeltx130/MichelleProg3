//Michelle Jesús Obeso Sánchez IDS TV
//Unidad 4 : Ejercicio 6

package leerArchivoJson;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.Cursor;
import javax.swing.JLabel;

public class LeerJson {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeerJson window = new LeerJson();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LeerJson() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 290, 216);
		frame.setTitle("Leer archivo Json");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		ImageIcon imgArchivo = new ImageIcon("documento.png");
		ImageIcon imgArchivoSelect = new ImageIcon("documentoSelect.png");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FileReader archivo;
				BufferedReader lector;
				
				try {
					archivo = new FileReader("users.json");
					if(archivo.ready()) {
						lector = new BufferedReader(archivo);		
						String cadena;
						while((cadena = lector.readLine()) != null) {
							System.out.println(cadena);
						}
					}else {
						System.out.println("El archivo no esta listo para ser leido.");
					}
					
				}catch(Exception e1){
					System.out.println("ERROR: " + e1.getMessage());
				}
			}
		});
		btnNewButton.setBounds(83, 11, 120, 120);
		btnNewButton.setIcon(new ImageIcon(imgArchivo.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), Image.SCALE_SMOOTH)));
		btnNewButton.setRolloverIcon(new ImageIcon(imgArchivoSelect.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Presione para leer archivo");
		lblNewLabel.setBounds(65, 142, 160, 14);
		panel.add(lblNewLabel);
	}
}
