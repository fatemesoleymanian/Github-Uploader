package sample;


import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppSpace {

    @FXML
    private MenuItem persianItem;

    @FXML
    private MenuItem englishItem;

    @FXML
    private JFXButton enterBtn;
    public String picked="none";

    @FXML
    void englishPicked(ActionEvent event) { picked=englishItem.getText(); }

    @FXML
    void goToSystemBtn(ActionEvent event) throws IOException {
        if ( picked.equals("English")){
            Stage stage=(Stage) enterBtn.getScene().getWindow();
            stage.close();
            Stage primarystage=new Stage();
            GridPane root= FXMLLoader.load(getClass().getResource("EnglishUploader.fxml"));
            primarystage.setTitle("Github App");
            primarystage.getIcons().add(new Image("sample/gitIcon.jpg"));
            Scene scene=new Scene(root,370,632);
            primarystage.setScene(scene);
            primarystage.show();

        }
        else if(picked.equals("فارسی")) {
            Stage stage=(Stage) enterBtn.getScene().getWindow();
            stage.close();
            Stage primarystage=new Stage();
            GridPane root= FXMLLoader.load(getClass().getResource("PersianUploader.fxml"));
            primarystage.setTitle("Github App");
            primarystage.getIcons().add(new Image("sample/gitIcon.jpg"));
            Scene scene=new Scene(root,371,632);
            primarystage.setScene(scene);
            primarystage.show();
        }else {
            Alert alert1=new Alert(Alert.AlertType.INFORMATION);
            alert1.setHeaderText("choose a language !");
            alert1.showAndWait();

        }
    }

    @FXML
    void persianPickesd(ActionEvent event) { picked=persianItem.getText(); }

}
