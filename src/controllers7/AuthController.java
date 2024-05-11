package controllers7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models7.AuthModel;
import views7.AuthView;

public class AuthController {
	
    private AuthModel model;
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
                model = view.getUser();
                if(checkUser(model)){
                	view.validateColorTextfield(true);
                    view.messages("Login succesfully!");
                }else {
                	view.validateColorTextfield(false);
                    view.messages("Invalid username and/or password!");
                }                
            } catch (Exception e1) {
                view.messages(e1.getStackTrace().toString());
            }
        }
    }
    
    class SignListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			view.messages("Sign Up succesfully!");
		}
    	
    }
 
    public boolean checkUser(AuthModel user){
    	return user.getUserName().equals("usuario") && user.getPassword().equals("12345");	
    }    
} 
