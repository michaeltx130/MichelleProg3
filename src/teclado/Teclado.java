//Michelle Jesús Obeso Sánchez IDS TV
//Juego del Teclado

package teclado;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Teclado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Timer tiempo;
	private int segundos = 0;
	
	JLabel timer = new JLabel("0 s ");
	JLabel lblNewLabel_1 = new JLabel();
	private JLabel labelPalabrasRand;
	JButton btnNewButton = new JButton();
	private JButton btnEspacio;

	String[] palabras = {
			"gato negro", "perro pitbull", "casa", "flor amarilla", "Sol brillante", "mesa", "taza", "manzana", "Pelota roja", "Agua fria",
			"libro fantastico", "coche rojo", "Planta", "silla rota", "arbol grande", "luz", "mesa", "tren", "hoja", "reloj",
			"Puerta", "ventana sucia", "foto borrosa", "azul", "verde", "rojo", "amarillo", "naranja", "blanco", "negro",
			"lapiz", "teclado mecanico", "ordenador", "telefono", "televisor antiguo", "pared", "ciudad", "jardin", "zapato blanco", "papel",
			"cafe frio", "guitarra", "musica", "cancion", "cine", "pera", "Banana", "Nube esponjosa", "Techo de lamina", "escalera",
			"pie grande", "pequeño", "rapido", "Caracol lento", "alto", "bajo", "fuerte", "debil", "bueno", "malo",
			"bonito", "feo", "alegre", "triste", "frio", "caliente", "viejo", "Año nuevo", "largo", "corto",
			"amigo", "Familia", "trabajo", "estudio", "viaje", "Deporte extremo", "futbol", "tenis", "Nadar", "correr",
			"comer pizza", "Dormir mucho", "jugar", "leer el libro", "escribir", "ver", "escuchar", "hablar bajito", "cantar", "Bailar"};
	
	Random rand = new Random();
	int oraciones = rand.nextInt(palabras.length);
	String palabrasRand = palabras[oraciones];
	
	public Teclado() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 387);
		contentPane = new JPanel();
		this.setTitle("Juego de teclado");
		this.setResizable(false);
        this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelNorth.setBackground(new Color(0, 128, 192));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panelNorth.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		labelPalabrasRand = new JLabel("Escribe la palabra: " + palabrasRand);
		labelPalabrasRand.setForeground(new Color(255, 255, 255));
		labelPalabrasRand.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		panel.add(labelPalabrasRand);
		
		timer.setHorizontalAlignment(SwingConstants.RIGHT);
		timer.setForeground(new Color(255, 255, 255));
		timer.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		panel.add(timer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 192));
		panelNorth.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(128, 128, 255));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(null);
		
		JButton btnQ = new JButton("Q");
		btnQ.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnQ.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnQ.setBounds(23, 25, 66, 58);
		panelCenter.add(btnQ);
		
		JButton btnW = new JButton("W");
		btnW.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnW.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnW.setBounds(99, 25, 66, 58);
		panelCenter.add(btnW);
		
		JButton btnE = new JButton("E");
		btnE.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnE.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnE.setBounds(175, 25, 66, 58);
		panelCenter.add(btnE);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnR.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnR.setBounds(251, 25, 66, 58);
		panelCenter.add(btnR);
		
		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnT.setBounds(327, 25, 66, 58);
		panelCenter.add(btnT);
		
		JButton btnY = new JButton("Y");
		btnY.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnY.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnY.setBounds(403, 25, 66, 58);
		panelCenter.add(btnY);
		
		JButton btnU = new JButton("U");
		btnU.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnU.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnU.setBounds(479, 25, 66, 58);
		panelCenter.add(btnU);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnI.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnI.setBounds(555, 25, 66, 58);
		panelCenter.add(btnI);
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnO.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnO.setBounds(631, 25, 66, 58);
		panelCenter.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnP.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnP.setBounds(707, 25, 66, 58);
		panelCenter.add(btnP);
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnA.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnA.setBounds(23, 94, 66, 58);
		panelCenter.add(btnA);
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnS.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnS.setBounds(99, 94, 66, 58);
		panelCenter.add(btnS);
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnD.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnD.setBounds(175, 94, 66, 58);
		panelCenter.add(btnD);
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnF.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnF.setBounds(251, 94, 66, 58);
		panelCenter.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnG.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnG.setBounds(327, 94, 66, 58);
		panelCenter.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnH.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnH.setBounds(403, 94, 66, 58);
		panelCenter.add(btnH);
		
		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnJ.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnJ.setBounds(479, 94, 66, 58);
		panelCenter.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnK.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnK.setBounds(555, 94, 66, 58);
		panelCenter.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnL.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnL.setBounds(631, 94, 66, 58);
		panelCenter.add(btnL);
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setFont(new Font("Cooper Black", Font.PLAIN, 19));
		btnÑ.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnÑ.setBounds(707, 94, 66, 58);
		panelCenter.add(btnÑ);
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnZ.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnZ.setBounds(137, 163, 66, 58);
		panelCenter.add(btnZ);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnX.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnX.setBounds(213, 163, 66, 58);
		panelCenter.add(btnX);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnC.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnC.setBounds(289, 163, 66, 58);
		panelCenter.add(btnC);
		
		JButton btnV = new JButton("V");
		btnV.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnV.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnV.setBounds(365, 163, 66, 58);
		panelCenter.add(btnV);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnB.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnB.setBounds(441, 163, 66, 58);
		panelCenter.add(btnB);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnN.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnN.setBounds(517, 163, 66, 58);
		panelCenter.add(btnN);
		
		JButton btnM = new JButton("M");
		btnM.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnM.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnM.setBounds(593, 163, 66, 58);
		panelCenter.add(btnM);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					btnQ.setBorder(new LineBorder(colorAleatorio(), 8));
					btnQ.repaint();
				}else if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					btnW.setBorder(new LineBorder(colorAleatorio(), 8));
					btnW.repaint();
				}else if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					btnE.setBorder(new LineBorder(colorAleatorio(), 8));
					btnE.repaint();
				}else if(e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					btnR.setBorder(new LineBorder(colorAleatorio(), 8));
					btnR.repaint();
				}else if(e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					btnT.setBorder(new LineBorder(colorAleatorio(), 8));
					btnT.repaint();
				}else if(e.getKeyChar() == 'y' || e.getKeyChar() == 'Y') {
					btnY.setBorder(new LineBorder(colorAleatorio(), 8));
					btnY.repaint();
				}else if(e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {
					btnU.setBorder(new LineBorder(colorAleatorio(), 8));
					btnU.repaint();
				}else if(e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
					btnI.setBorder(new LineBorder(colorAleatorio(), 8));
					btnI.repaint();
				}else if(e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
					btnO.setBorder(new LineBorder(colorAleatorio(), 8));
					btnO.repaint();
				}else if(e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
					btnP.setBorder(new LineBorder(colorAleatorio(), 8));
					btnP.repaint();
				}else if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					btnA.setBorder(new LineBorder(colorAleatorio(), 8));
					btnA.repaint();
				}else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					btnS.setBorder(new LineBorder(colorAleatorio(), 8));
					btnS.repaint();
				}else if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
					btnD.setBorder(new LineBorder(colorAleatorio(), 8));
					btnD.repaint();
				}else if(e.getKeyChar() == 'f' || e.getKeyChar() == 'F') {
					btnF.setBorder(new LineBorder(colorAleatorio(), 8));
					btnF.repaint();
				}else if(e.getKeyChar() == 'g' || e.getKeyChar() == 'G') {
					btnG.setBorder(new LineBorder(colorAleatorio(), 8));
					btnG.repaint();
				}else if(e.getKeyChar() == 'h' || e.getKeyChar() == 'H') {
					btnH.setBorder(new LineBorder(colorAleatorio(), 8));
					btnH.repaint();
				}else if(e.getKeyChar() == 'j' || e.getKeyChar() == 'J') {
					btnJ.setBorder(new LineBorder(colorAleatorio(), 8));
					btnJ.repaint();
				}else if(e.getKeyChar() == 'k' || e.getKeyChar() == 'K') {
					btnK.setBorder(new LineBorder(colorAleatorio(), 8));
					btnK.repaint();
				}else if(e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
					btnL.setBorder(new LineBorder(colorAleatorio(), 8));
					btnL.repaint();
				}else if(e.getKeyChar() == 'ñ' || e.getKeyChar() == 'Ñ') {
					btnÑ.setBorder(new LineBorder(colorAleatorio(), 8));
					btnÑ.repaint();
				}else if(e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
					btnZ.setBorder(new LineBorder(colorAleatorio(), 8));
					btnZ.repaint();
				}else if(e.getKeyChar() == 'x' || e.getKeyChar() == 'X') {
					btnX.setBorder(new LineBorder(colorAleatorio(), 8));
					btnX.repaint();
				}else if(e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
					btnC.setBorder(new LineBorder(colorAleatorio(), 8));
					btnC.repaint();
				}else if(e.getKeyChar() == 'v' || e.getKeyChar() == 'V') {
					btnV.setBorder(new LineBorder(colorAleatorio(), 8));
					btnV.repaint();
				}else if(e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
					btnB.setBorder(new LineBorder(colorAleatorio(), 8));
					btnB.repaint();
				}else if(e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
					btnN.setBorder(new LineBorder(colorAleatorio(), 8));
					btnN.repaint();
				}else if(e.getKeyChar() == 'm' || e.getKeyChar() == 'M') {
					btnM.setBorder(new LineBorder(colorAleatorio(), 8));
					btnM.repaint();
				}else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		            btnEspacio.setBorder(new LineBorder(Color.RED, 2)); 
		            
		        }
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					btnQ.setBorder(new LineBorder(Color.BLACK, 2));
					btnQ.repaint();
				}else if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					btnW.setBorder(new LineBorder(Color.BLACK, 2));
					btnW.repaint();
				}else if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					btnE.setBorder(new LineBorder(Color.BLACK, 2));
					btnE.repaint();
				}else if(e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					btnR.setBorder(new LineBorder(Color.BLACK, 2));
					btnR.repaint();
				}else if(e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					btnT.setBorder(new LineBorder(Color.BLACK, 2));
					btnT.repaint();
				}else if(e.getKeyChar() == 'y' || e.getKeyChar() == 'Y') {
					btnY.setBorder(new LineBorder(Color.BLACK, 2));
					btnY.repaint();
				}else if(e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {
					btnU.setBorder(new LineBorder(Color.BLACK, 2));
					btnU.repaint();
				}else if(e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
					btnI.setBorder(new LineBorder(Color.BLACK, 2));
					btnI.repaint();
				}else if(e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
					btnO.setBorder(new LineBorder(Color.BLACK, 2));
					btnO.repaint();
				}else if(e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
					btnP.setBorder(new LineBorder(Color.BLACK, 2));
					btnP.repaint();
				}else if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					btnA.setBorder(new LineBorder(Color.BLACK, 2));
					btnA.repaint();
				}else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					btnS.setBorder(new LineBorder(Color.BLACK, 2));
					btnS.repaint();
				}else if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
					btnD.setBorder(new LineBorder(Color.BLACK, 2));
					btnD.repaint();
				}else if(e.getKeyChar() == 'f' || e.getKeyChar() == 'F') {
					btnF.setBorder(new LineBorder(Color.BLACK, 2));
					btnF.repaint();
				}else if(e.getKeyChar() == 'g' || e.getKeyChar() == 'G') {
					btnG.setBorder(new LineBorder(Color.BLACK, 2));
					btnG.repaint();
				}else if(e.getKeyChar() == 'h' || e.getKeyChar() == 'H') {
					btnH.setBorder(new LineBorder(Color.BLACK, 2));
					btnH.repaint();
				}else if(e.getKeyChar() == 'j' || e.getKeyChar() == 'J') {
					btnJ.setBorder(new LineBorder(Color.BLACK, 2));
					btnJ.repaint();
				}else if(e.getKeyChar() == 'k' || e.getKeyChar() == 'K') {
					btnK.setBorder(new LineBorder(Color.BLACK, 2));
					btnK.repaint();
				}else if(e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
					btnL.setBorder(new LineBorder(Color.BLACK, 2));
					btnL.repaint();
				}else if(e.getKeyChar() == 'ñ' || e.getKeyChar() == 'Ñ') {
					btnÑ.setBorder(new LineBorder(Color.BLACK, 2));
					btnÑ.repaint();
				}else if(e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
					btnZ.setBorder(new LineBorder(Color.BLACK, 2));
					btnZ.repaint();
				}else if(e.getKeyChar() == 'x' || e.getKeyChar() == 'X') {
					btnX.setBorder(new LineBorder(Color.BLACK, 2));
					btnX.repaint();
				}else if(e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
					btnC.setBorder(new LineBorder(Color.BLACK, 2));
					btnC.repaint();
				}else if(e.getKeyChar() == 'v' || e.getKeyChar() == 'V') {
					btnV.setBorder(new LineBorder(Color.BLACK, 2));
					btnV.repaint();
				}else if(e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
					btnB.setBorder(new LineBorder(Color.BLACK, 2));
					btnB.repaint();
				}else if(e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
					btnN.setBorder(new LineBorder(Color.BLACK, 2));
					btnN.repaint();
				}else if(e.getKeyChar() == 'm' || e.getKeyChar() == 'M') {
					btnM.setBorder(new LineBorder(Color.BLACK, 2));
					btnM.repaint();
				}else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		            btnEspacio.setBorder(new LineBorder(Color.BLACK, 2)); 
		            
		        }
			}
		});
		
		textField.setBorder(null);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(0, 128, 192));
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		textField.setColumns(10);
		panel_1.add(textField);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBounds(0, 247, 794, 58);
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setBackground(new Color(174, 174, 255));
		panelSouth.setLayout(new GridLayout(0, 2, 0, 0));
		
		btnEspacio = new JButton("ESPACIO");
		btnEspacio.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelSouth.add(btnEspacio);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBorder(new LineBorder (new Color(0, 0, 0), 2));
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBorrar.setBorder(new LineBorder(Color.RED, 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBorrar.setBorder(new LineBorder (new Color(0, 0, 0), 2));
			}
		});
	

		btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText();
                if (!texto.isEmpty()) {
                    String newTexto = texto.substring(0, texto.length() - 1);
                    textField.setText(newTexto);
                }
                
            }
		});
		panelSouth.add(btnBorrar);
		
		Instrucciones();
		Cronometro();
		VerificarPalabra();
	}
	
	private Color colorAleatorio() {
		Random random = new Random();
		return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	}
	
	 private void Instrucciones() {
	     String mensaje = "¡Bienvenido al juego de teclado!\n\n"
	             + "Instrucciones:\n"
	             + "- Escribe la palabra que ves en la parte superior.\n"
	             + "- Con el teclado de tu computadora escribe las palabras.\n"
	             + "- Cada vez que presionas una tecla de tu computadora, el color "
	             + "cambiará en el teclado del juego.\n"
	             + "- Completa la palabra correctamente lo más rápido posible, se medirá el tiempo "
	             + "en que logres escribirlo.\n"
	             + "- ¡Diviértete :D !";
	     JOptionPane.showMessageDialog(null, mensaje, "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
	    }
	 
	 private void Cronometro() {
		 tiempo = new Timer(1000, (ActionEvent e) -> {
			 segundos++;
			 ActualizarTimer();
			
		 }); 
		 tiempo.start();
	 }

	 private void ActualizarTimer() {
		 String cronometro = segundos + " s ";
		 timer.setText(cronometro);
	 }
	 
	 private void ReiniciarCronometro() {
		 if(tiempo.isRunning()) {
			 tiempo.stop();
		 }
		 
		 segundos = 0;
		 ActualizarTimer();
	 }
	 
	 private void VerificarPalabra() {
		 textField.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String palabraTextField = textField.getText();
				
				if(palabraTextField.equals(palabrasRand)) {
					tiempo.stop();
					JOptionPane.showMessageDialog(null, "Haz completado la palabra en " + timer.getText());
					SiguienteRonda();
				}else {
					JOptionPane.showMessageDialog(null, "Intentalo de nuevo");
				}
			}
		 });
	 }
	 
	 private void SiguienteRonda() {
		
		 ReiniciarCronometro();
		 textField.setText(null);
		 oraciones = rand.nextInt(palabras.length);
		 palabrasRand = palabras[oraciones];
		 labelPalabrasRand.setText("Escribe la palabra: " + palabrasRand);
		 tiempo.start();
	 }
}
