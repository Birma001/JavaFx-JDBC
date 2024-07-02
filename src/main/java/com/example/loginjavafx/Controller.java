package com.example.loginjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button button_login;
    @FXML
    private Button button_signup;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_login.setOnAction(event -> {
            String username = tf_username.getText().trim();
            String password = tf_password.getText().trim();
            if (!username.isEmpty() && !password.isEmpty()) {
                DBUtils.logInUser(event, username, password);
            } else {
                System.out.println("Please enter both username and password.");
                // Optionally show an alert to inform the user
            }
        });

        button_signup.setOnAction(event -> DBUtils.changeScene(event, "sign-up.fxml", "Sign-up", null, null));
    }
}
