package teclado;

import java.awt.EventQueue;

public class Main {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Teclado frame = new Teclado();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		});
	}
}
