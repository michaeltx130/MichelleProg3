package juego;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Memorama extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    public Memorama() {

        ImageIcon imagen = new ImageIcon("carta.png");
        ImageIcon imagen2 = new ImageIcon("carta2.png");
        
        ImageIcon corazon = new ImageIcon("corazon.png");
        ImageIcon trebol = new ImageIcon("trebol.png");
        ImageIcon picas = new ImageIcon("picas.png");
        ImageIcon diamante = new ImageIcon("diamante.png");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 635, 486);
        contentPane = new JPanel();
        this.setTitle("Memorama");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 619, 447);
        contentPane.add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.decode("#5dade2"));
        panel.add(panel_1, BorderLayout.NORTH);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.decode("#af7ac5"));
        panel.add(panel_2, BorderLayout.SOUTH);

        JPanel panel_3 = new JPanel();
        panel.add(panel_3, BorderLayout.CENTER);
        panel_3.setBackground(Color.decode("#9ede4c"));
        panel_3.setLayout(new GridLayout(0, 4, 0, 0));

        JButton btn1 = new JButton("");
        btn1.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn1.setBorder(null);
        btn1.setFocusable(false);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        btn1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        panel_3.add(btn1);
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn1.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	 btn1.setRolloverIcon(null);
            }
        });
        panel_3.add(btn1);

        JButton btn2 = new JButton("");
        btn2.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn2.setBorder(null);
        btn2.setFocusable(false);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(false);
        btn2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn2.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	 btn2.setRolloverIcon(null);
            }
        });
        panel_3.add(btn2);

        JButton btn3 = new JButton("");
        btn3.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn3.setBorder(null);
        btn3.setFocusable(false);
        btn3.setContentAreaFilled(false);
        btn3.setBorderPainted(false);
        btn3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn3.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	btn3.setRolloverIcon(null);
            }
        });
        panel_3.add(btn3);

        JButton btn4 = new JButton("");
        btn4.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn4.setBorder(null);
        btn4.setFocusable(false);
        btn4.setContentAreaFilled(false);
        btn4.setBorderPainted(false);
        btn4.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn4.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));     
            	btn4.setRolloverIcon(null);
            }
        });
        panel_3.add(btn4);

        JButton btn5 = new JButton("");
        btn5.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn5.setBorder(null);
        btn5.setFocusable(false);
        btn5.setContentAreaFilled(false);
        btn5.setBorderPainted(false);
        btn5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn5.setIcon(new ImageIcon(picas.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	 btn5.setRolloverIcon(null);
            }
        });
        panel_3.add(btn5);

        JButton btn6 = new JButton("");
        btn6.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn6.setBorder(null);
        btn6.setFocusable(false);
        btn6.setContentAreaFilled(false);
        btn6.setBorderPainted(false);
        btn6.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn6.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	btn6.setRolloverIcon(null);
            }
        });
        panel_3.add(btn6);

        JButton btn7 = new JButton("");
        btn7.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn7.setBorder(null);
        btn7.setFocusable(false);
        btn7.setContentAreaFilled(false);
        btn7.setBorderPainted(false);
        btn7.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn7.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	btn7.setRolloverIcon(null);
            }
        });
        panel_3.add(btn7);

        JButton btn8 = new JButton("");
        btn8.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        btn8.setBorder(null);
        btn8.setFocusable(false);
        btn8.setContentAreaFilled(false);
        btn8.setBorderPainted(false);
        btn8.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
        
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btn8.setIcon(new ImageIcon(picas.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	btn8.setRolloverIcon(null);
            }
        });
        panel_3.add(btn8);
        
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
        
        btnReiniciar.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                
                btn1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
            	btn1.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn1.setEnabled(true);
                
                btn2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn2.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn2.setEnabled(true);
                
                btn3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn3.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn3.setEnabled(true);
                
                btn4.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn4.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn4.setEnabled(true);
                
                btn5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn5.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn5.setEnabled(true);
                
                btn6.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn6.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn6.setEnabled(true);
                
                btn7.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn7.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn7.setEnabled(true);
                
                btn8.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn8.setRolloverIcon(new ImageIcon(imagen2.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH)));
                btn8.setEnabled(true);
                
                
                System.out.println("Juego reiniciado.");
               
            }
        });
        panel_2.add(btnReiniciar);  
    }
}