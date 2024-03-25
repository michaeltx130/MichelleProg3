package juegoMemorama;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

public class JuegoMemoria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private LogicaJuego logica = new LogicaJuego();
	private boolean cartaVolteada = false;
	private boolean segundaCarta = false;
	private ImageIcon img1;
	private ImageIcon img2;
	private int contador = 0;
	
	//Se guarda el boton seleccionado anteriormente
	private JButton[] botonSelec = new JButton[2];

	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	JButton btn5 = new JButton();
	JButton btn6 = new JButton();
	JButton btn7 = new JButton();
	JButton btn8 = new JButton();
	
	JLabel movimientos = new JLabel("Movimientos: 0");
	
	public JuegoMemoria() {
		
		ImageIcon imagen = new ImageIcon("oculta.png");
		ImageIcon imagen2 = new ImageIcon("oculta Seleccionada.png");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		this.setTitle("Memorama");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setBackground(Color.decode("#c04323"));
		movimientos.setFont(new Font("Herculanum", Font.BOLD, 20));
		movimientos.setForeground(Color.decode("#ffffff"));
		panelNorth.add(movimientos);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setBackground(Color.decode("#4b2125"));
		
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setBackground(Color.decode("#fdbb64"));
		panelCenter.setLayout(new GridLayout(0, 4, 0, 0));
		
		btn1.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn1.setBorder(null);
		btn1.setFocusable(false);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn1.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn1);
            }
        });
		
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn1);
		
		
		btn2.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn2.setBorder(null);
		btn2.setFocusable(false);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn2);
            }
        });
		
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn2);
		
		
		btn3.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn3.setBorder(null);
		btn3.setFocusable(false);
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn3);
            }
        });
		
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn3);
		
		
		btn4.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn4.setBorder(null);
		btn4.setFocusable(false);
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);
		btn4.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn4);
            }
        });
		
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn4);
		
		
		btn5.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn5.setBorder(null);
		btn5.setFocusable(false);
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);
		btn5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn5);
            }
        });
		
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn5);
		

		btn6.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn6.setBorder(null);
		btn6.setFocusable(false);
		btn6.setContentAreaFilled(false);
		btn6.setBorderPainted(false);
		btn6.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn6);
            }
        });
		
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn6);
		
		
		btn7.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn7.setBorder(null);
		btn7.setFocusable(false);
		btn7.setContentAreaFilled(false);
		btn7.setBorderPainted(false);
		btn7.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn7);
            }
        });
		
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn7);
		

		btn8.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		btn8.setBorder(null);
		btn8.setFocusable(false);
		btn8.setContentAreaFilled(false);
		btn8.setBorderPainted(false);
		btn8.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
		
		btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	HabilitarCarta(btn8);
            }
        });
		
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Comparar();
			}
		});
		panelCenter.add(btn8);
		
		 JButton btnReiniciar = new JButton("Reiniciar");
	     btnReiniciar.setFont(new Font("Herculanum", Font.BOLD, 20));
	     btnReiniciar.setBackground(Color.decode("#fdbb64"));
	        
	     btnReiniciar.addActionListener(new ActionListener() {
	        	
	         public void actionPerformed(ActionEvent e) {
	                
	             btn1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn1.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn1.setEnabled(true);
	                
	             btn2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn2.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn2.setEnabled(true);
	                
	             btn3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn3.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn3.setEnabled(true);
	                
	             btn4.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn4.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn4.setEnabled(true);
	                
	             btn5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn5.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn5.setEnabled(true);
	                
	             btn6.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn6.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn6.setEnabled(true);
	                
	             btn7.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn7.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn7.setEnabled(true);
	               
	             btn8.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn8.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(250, 170, Image.SCALE_SMOOTH)));
	             btn8.setEnabled(true);
	             
	             segundaCarta = false;
	             cartaVolteada = false;
	             contador = 0;
	             movimientos.setText("Movimientos: " + contador);
	             OrdenarCartas();       
	         }
	     });
	     panelSouth.add(btnReiniciar);
	     
	     OrdenarCartas();
	}

	//Se encarga de asignar las imágenes de las cartas aleatoriamente
	private void OrdenarCartas() {
		
		int numero[] = logica.getCartasNumeros();
		
		ImageIcon carta1 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[0] + ".png"));
		btn1.setDisabledIcon(new ImageIcon(carta1.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));
		
	    ImageIcon carta2 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[1] + ".png"));
	    btn2.setDisabledIcon(new ImageIcon(carta2.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));
	    
	    ImageIcon carta3 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[2] + ".png"));
	    btn3.setDisabledIcon(new ImageIcon(carta3.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));
	    
	    ImageIcon carta4 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[3] + ".png"));
	    btn4.setDisabledIcon(new ImageIcon(carta4.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));
	    
	    ImageIcon carta5 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[4] + ".png"));
	    btn5.setDisabledIcon(new ImageIcon(carta5.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));
	    
	    ImageIcon carta6 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[5] + ".png"));
	    btn6.setDisabledIcon(new ImageIcon(carta6.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));
	    
	    ImageIcon carta7 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[6] + ".png"));
	    btn7.setDisabledIcon(new ImageIcon(carta7.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));
	    
	    ImageIcon carta8 = new ImageIcon(getClass().getResource("/imagenesProyecto/carta" + numero[7] + ".png"));
	    btn8.setDisabledIcon(new ImageIcon(carta8.getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH)));

	}
	
	private void HabilitarCarta(JButton btn) {
		
		if(!cartaVolteada) {
			btn.setEnabled(false);
			img1 = (ImageIcon) btn.getDisabledIcon();
			botonSelec[0] = btn;
			cartaVolteada = true;
			segundaCarta = false;
		}else {
			btn.setEnabled(false);
			img2 = (ImageIcon) btn.getDisabledIcon();
			botonSelec[1] = btn;
			Comparar();
			segundaCarta = true;
			contador++;
			movimientos.setText("Movimientos: " + contador);
		}
	}
	
	//Cuando un jugador selecciona una carta verificar si una carta ya está volteada
	private void Comparar() {
		//verifica si ambas cartas son true lo que significa que han sido seleccionadas
	    if (cartaVolteada && segundaCarta) {
	    	//Se almacenan sus imagenes en estas variables
	        Image img1 = ((ImageIcon) botonSelec[0].getDisabledIcon()).getImage();
	        Image img2 = ((ImageIcon) botonSelec[1].getDisabledIcon()).getImage();

	        if (sonIguales(img1, img2));
	        else {
	            // Las cartas no son iguales
	            botonSelec[0].setEnabled(true);
	            botonSelec[1].setEnabled(true);
	        }

	        cartaVolteada = false;
	    }
	}

	// Convierte las imágenes a BufferedImage para poder comparar píxel por píxel
	private boolean sonIguales(Image img1, Image img2) {
	    BufferedImage bufImg1 = imageToBufferedImage(img1);
	    BufferedImage bufImg2 = imageToBufferedImage(img2);
	    
	    //compara las dimensiones de la imagen si las imagenes seleccionadas no son iguales, devuelve false
	    if (bufImg1.getWidth() != bufImg2.getWidth() || bufImg1.getHeight() != bufImg2.getHeight()) {
	        return false;
	    }

	    for (int x = 0; x < bufImg1.getWidth(); x++) {
	        for (int y = 0; y < bufImg1.getHeight(); y++) {
	            if (bufImg1.getRGB(x, y) != bufImg2.getRGB(x, y)) {
	                return false;
	            }
	        }
	    }

	    return true;
	}

	//compara los pixeles de la imagen
	private BufferedImage imageToBufferedImage(Image img) {
	    if (img instanceof BufferedImage) {
	        return (BufferedImage) img;
	    }

	    BufferedImage bufferedImage = new BufferedImage(
	            img.getWidth(null), // Ancho igual al de la Image original
	            img.getHeight(null), // Altura igual a la de la Image original
	            BufferedImage.TYPE_INT_ARGB
	    );

	 // Crea un objeto Graphics2D para dibujar en el BufferedImage
	    Graphics2D bGr = bufferedImage.createGraphics();
	    bGr.drawImage(img, 0, 0, null);
	    bGr.dispose();

	    return bufferedImage;
	}
}
