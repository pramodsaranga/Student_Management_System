package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AdminFormController {
    public AnchorPane AdminFormContext;
    public AnchorPane StudentContext;

    public void StudentManageFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/StudentManageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        StudentContext.getChildren().clear();
        StudentContext.getChildren().add(load);
    }

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminFormContext.getChildren().clear();
        AdminFormContext.getChildren().add(load);
    }
}
