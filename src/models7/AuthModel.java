//Ejercicio 10.- Utilizando de base el ejercicio 8 implementa Mysql
//MICHELLE OBESO IDS TV

package models7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthModel {
    
    private String username;
    private String password;

    public AuthModel() {}

    public AuthModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public boolean validateUser() {
        String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_programacionDataBase";
        String user = "freedb_mchlDeveloper";
        String pass = "ZbZeqqUR@P!wb4r";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, this.username);
            statement.setString(2, this.password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean registerUser() {
    	
        String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_programacionDataBase";
        String user = "freedb_mchlDeveloper";
        String pass = "ZbZeqqUR@P!wb4r";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, this.username);
            statement.setString(2, this.password);

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

