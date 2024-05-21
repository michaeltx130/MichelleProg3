//Ejercicio 10.- Utilizando de base el ejercicio 8 implementa Mysql
//MICHELLE OBESO IDS TV

package controllers7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models7.AuthModel;
import views7.AuthView;
import views7.RegisterView;

public class AuthController {
    
    private AuthView view;

    public AuthController(AuthView view) {
        this.view = view;

        view.addLoginListener(new LoginListener());
        view.addSignListener(new SignListener());
    }

    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
            	AuthModel model = view.getUser();
            	 if (model.getPassword().length() > 8) {
                     view.validateColorTextfield(false);
                     view.messages("Password should not exceed 8 characters!");
                 } else if (model.validateUser()) {
                     view.validateColorTextfield(true);
                     view.messages("Login successfully!");
                     view.clearFields();
                     view.clearBorderField();
                 } else {
                     view.validateColorTextfield(false);
                     view.messages("Invalid username and/or password!");
                 }
            } catch (Exception e1) {
                view.messages(e1.getStackTrace().toString());
            }
        }
    }

    class SignListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            RegisterView registerView = new RegisterView(view);
            registerView.setVisible(true);
            
            AuthModel newUser = registerView.getUser();
            if (newUser != null) {
                if (newUser.getPassword().length() > 8) {
                    view.messages("Password should not exceed 8 characters!");
                } else if (newUser.registerUser()) {
                    view.messages("Sign Up successfully!");
                } else {
                    view.messages("Registration failed!");
                }
            }
        }
    }
}
