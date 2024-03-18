package botonesAleatorios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class BotonesAleatorios extends JFrame {

    public BotonesAleatorios() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Mi ventana");
        this.setResizable(false);
        this.setLayout(null);

        this.Componentes();
    }

    public void Componentes() {
        JPanel panel = new JPanel();

        panel.setSize(this.getWidth(), this.getHeight());
        panel.setLocation(0, 0);
        panel.setLayout(null);
        panel.setBackground(Color.decode("#8084ff"));

        JButton btn = new JButton("Click me!");
        btn.setFont(new Font("Super Bloom", Font.BOLD, 25));
        btn.setBorder(new LineBorder(Color.RED, 4));
        btn.setBounds(65, 370, 250, 50);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Medidas de los botones
                int width = (int) (Math.random() * 100 + 20);
                int height = (int) (Math.random() * 100 + 20);

                // Ubicacion de los botones en la ventana
                int x = (int) (Math.random() * 300);
                int y = (int) (Math.random() * 400);

                // Generar color aleatorio
                Color randomColor = new Color((int) (Math.random() * 0x1000000));
                
                JButton btnAleatorio = new JButton(Integer.toHexString(randomColor.getRGB()));
                btnAleatorio.setBounds(x, y, width, height);
                btnAleatorio.setBorder(new LineBorder(randomColor, 4));
                panel.add(btnAleatorio);
                panel.repaint();

                // Mostrar el código de color como texto al presionar el botón
                btnAleatorio.addActionListener(new ActionListener() {
                	
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	JButton button = (JButton) e.getSource();
                        JOptionPane.showMessageDialog(null, button.getText());
                    }
                });
            }
        });

        panel.add(btn);
        
        this.add(panel);
        this.repaint();
    }
}
