package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {

    public AnchorPane DashBoardContext;
    public TextField txtUsername;
    public PasswordField txtPassword;

    public void AdminFormOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUsername.getText().equalsIgnoreCase("Admin") && txtPassword.getText().equals("1998")) {
            URL resource = getClass().getResource("../view/AdminForm.fxml");
            Parent load = FXMLLoader.load(resource);
            DashBoardContext.getChildren().clear();
            DashBoardContext.getChildren().add(load);
        } else if(txtUsername.getText().equalsIgnoreCase("Admin") && txtPassword.getText().equals("2021")){
            URL resource = getClass().getResource("../view/AdminForm.fxml");
            Parent load = FXMLLoader.load(resource);
            DashBoardContext.getChildren().clear();
            DashBoardContext.getChildren().add(load);
        }else{
            new Alert(Alert.AlertType.ERROR, "Invalid Username Or Password.Please Try Again" ).show();
        }
    }
}
