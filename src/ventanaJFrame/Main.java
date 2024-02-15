package ventanaJFrame;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		
		//Hacemos visible la ventana
		ventana.setVisible(true);
		
		//Acabar su ejecución cuando se cierre la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Tamaño
		ventana.setSize(600, 500);
		
		//Centrar
		ventana.setLocationRelativeTo(null);
		
		//Titulo
		ventana.setTitle("Mi primera ventana");
		
		//No modificar el tamaño
		ventana.setResizable(false);

	}
}
