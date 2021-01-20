package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EnglishUploader {

    Entity entity=new Entity();

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private TextField tf3;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    public void submitBtn1(ActionEvent actionEvent)throws Exception {
        Alert alert1=new Alert(Alert.AlertType.INFORMATION,"Please Wait...");
        alert1.setAlertType(Alert.AlertType.INFORMATION);
        alert1.show();
        entity.setDirectory(tf1.getText());
        entity.setComment(tf2.getText());
        entity.setLink(tf3.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add . && git commit -m "+entity.getComment()+" && git remote add origin "+entity.getLink()+" && git push -u origin master\"");
        alert1.close();
        Alert alert2=new Alert(Alert.AlertType.INFORMATION,"File Pushed Successfully!");
        alert2.setAlertType(Alert.AlertType.INFORMATION);
        alert2.show();
    }

    public void submitBtn2(ActionEvent actionEvent)throws Exception {
        Alert alert1=new Alert(Alert.AlertType.INFORMATION,"Please Wait...");
        alert1.setAlertType(Alert.AlertType.INFORMATION);
        alert1.show();
        entity.setDirectory(tf1.getText());
        entity.setComment(tf2.getText());
        entity.setLink(tf3.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add -A && git commit -m "+entity.getComment()+ " && git push -u origin master\"");
        Alert alert2=new Alert(Alert.AlertType.INFORMATION,"File Pushed Successfully!");
        alert2.setAlertType(Alert.AlertType.INFORMATION);
        alert1.close();
        alert2.show();
    }

    @FXML
    void btnsMoreInfoLbl(MouseEvent event) {
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("If there's a hidden .git file in your file/project directory \n" +
                             "click 'Submit If Git folder Exists' Button But if there's no \nclick 'Submit For The First Time' .");
        alert3.showAndWait();

    }

    @FXML
    void directoryMoreInfoLbl(MouseEvent event) {
        Alert alert4=new Alert(Alert.AlertType.INFORMATION);
        alert4.setHeaderText("Go to where project file is located and copy then paste it here .");
        alert4.showAndWait();

    }

    @FXML
    void linkMoreInfoLbl(MouseEvent event) {
        Alert alert5=new Alert(Alert.AlertType.INFORMATION);
        alert5.setHeaderText("Go to your github repository which you want it to be updated \n" +
                             "by your upload ,copy your  repository HTTPS and paste it here .");
        alert5.showAndWait();


    }


}
