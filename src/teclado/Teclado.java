package teclado;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Teclado() {
		
		 Color randomColor = new Color((int) (Math.random() * 0x1000000));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(0, 128, 192));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panelNorth.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("[Palabra]");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 192));
		panelNorth.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Escriba la palabra:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cooper Black", Font.BOLD, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(174, 174, 255));
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("ESPACIO");
		panelSouth.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BORRAR");
		panelSouth.add(btnNewButton_1);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(128, 128, 255));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new GridLayout(0, 10, 0, 0));
		
		JButton btnQ = new JButton("Q");
		panelCenter.add(btnQ);
		
		JButton btnW = new JButton("W");
		panelCenter.add(btnW);
		
		JButton btnNewButton_2 = new JButton("E");
		panelCenter.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("R");
		panelCenter.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("T");
		panelCenter.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Y");
		panelCenter.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("U");
		panelCenter.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("I");
		panelCenter.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("O");
		panelCenter.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("P");
		panelCenter.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("A");
		panelCenter.add(btnNewButton_10);
		
		JButton btnNewButton_1_1 = new JButton("S");
		panelCenter.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("D");
		panelCenter.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("F");
		panelCenter.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("G");
		panelCenter.add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("H");
		panelCenter.add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("J");
		panelCenter.add(btnNewButton_6_1);
		
		JButton btnNewButton_7_1 = new JButton("K");
		panelCenter.add(btnNewButton_7_1);
		
		JButton btnNewButton_8_1 = new JButton("L");
		panelCenter.add(btnNewButton_8_1);
		
		JButton btnNewButton_9_1 = new JButton("Ñ");
		panelCenter.add(btnNewButton_9_1);
		
		JButton btnNewButton_10_1 = new JButton("Z");
		panelCenter.add(btnNewButton_10_1);
		
		JButton btnNewButton_10_2 = new JButton("X");
		panelCenter.add(btnNewButton_10_2);
		
		JButton btnNewButton_10_3 = new JButton("C");
		panelCenter.add(btnNewButton_10_3);
		
		JButton btnNewButton_10_4 = new JButton("V");
		panelCenter.add(btnNewButton_10_4);
		
		JButton btnNewButton_10_5 = new JButton("B");
		panelCenter.add(btnNewButton_10_5);
		
		JButton btnNewButton_10_6 = new JButton("N");
		panelCenter.add(btnNewButton_10_6);
		
		JButton btnNewButton_10_7 = new JButton("M");
		panelCenter.add(btnNewButton_10_7);
	}
}
