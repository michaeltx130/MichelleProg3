//Ejercicio 10.- Utilizando de base el ejercicio 8 implementa Mysql
//MICHELLE OBESO IDS TV

package views7;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import models7.AuthModel;

public class RegisterView extends JDialog {
	
    private JTextField userField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton registerBtn;
    private AuthModel model;

    public RegisterView(JFrame frame) {
        super(frame, "User Registration", true);
        this.setSize(400, 250);
        this.setLayout(null);
        this.setLocationRelativeTo(frame);

        JLabel titleRegister = new JLabel("User Registration", SwingConstants.CENTER);
        titleRegister.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
        titleRegister.setForeground(Color.decode("#2b488a"));
        titleRegister.setBounds(50, 10, 300, 30);
        this.add(titleRegister);

        JLabel userLabel = new JLabel("Username:", SwingConstants.LEFT);
        userLabel.setBounds(50, 50, 100, 25);
        this.add(userLabel);

        userField = new JTextField();
        userField.setBounds(150, 50, 200, 25);
        this.add(userField);

        JLabel passwordLabel = new JLabel("Password:", SwingConstants.LEFT);
        passwordLabel.setBounds(50, 90, 100, 25);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 90, 200, 25);
        this.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:", SwingConstants.LEFT);
        confirmPasswordLabel.setBounds(50, 130, 150, 25);
        this.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(200, 130, 150, 25);
        this.add(confirmPasswordField);

        registerBtn = new JButton("Register");
        registerBtn.setBounds(150, 170, 100, 30);
        registerBtn.setBackground(Color.decode("#e9cc68"));
        this.add(registerBtn);

        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (!password.equals(confirmPassword)) {
                    showMessage("Passwords do not match!");
                } else if (username.isEmpty() || password.isEmpty()) {
                    showMessage("Username and password cannot be empty!");
                } else {
                    model = new AuthModel(username, password);
                    dispose(); 
                }
            }
        });
    }

    public AuthModel getUser() {
        return model;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}

