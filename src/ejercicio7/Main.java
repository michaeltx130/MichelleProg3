package ejercicio7;

import controllers7.AuthController;
import views7.AuthView;

public class Main {

	public static void main(String[] args) {
		AuthView view = new AuthView();
        AuthController controller = new AuthController(view);        
        view.setVisible(true);
	}
}
