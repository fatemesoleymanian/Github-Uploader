package sample;


import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppSpace extends AlertcreatorAndBack{

    @FXML
    private MenuItem persianItem;

    @FXML
    private MenuButton pickedButton;


    @FXML
    private MenuItem englishItem;

    @FXML
    private JFXButton pushBtn;

    @FXML
    private JFXButton pullBtn;

    public String picked="none";

    @FXML
    void englishPicked(ActionEvent event) {
        picked=englishItem.getText();
        pickedButton.setText(picked);
    }

    @FXML
    void persianPickesd(ActionEvent event) {
        picked=persianItem.getText();
    pickedButton.setText(picked);}


     public void leader(JFXButton button,String fxmAddress,double width,double height) throws IOException {

            Stage stage=(Stage) button.getScene().getWindow();
            stage.close();
            Stage primarystage=new Stage();
            AnchorPane root= FXMLLoader.load(getClass().getClassLoader().getResource(fxmAddress));
            primarystage.setTitle("Github App");
            primarystage.getIcons().add(new Image("sample/gitIcon.jpg"));
            Scene scene=new Scene(root,width,height);
            primarystage.setScene(scene);
            primarystage.show();

    }

    @FXML
    void goToPullBtn(ActionEvent event) throws IOException {
        if (picked.equals("English")){
        leader(pullBtn,"sample/EnglishPuller.fxml",367,550);}

        else if(picked.equals("فارسی")) {
            leader(pullBtn,"sample/PersianPuller.fxml",367,550); }

        else { languageAler(); }

    }

    @FXML
    void goToPushBtn(ActionEvent event) throws IOException {
        if (picked.equals("English")){
            leader(pushBtn,"sample/EnglishPusher.fxml",370,690);}

        else if(picked.equals("فارسی")) {
            leader(pushBtn,"sample/PersianPusher.fxml",370,690); }

        else { languageAler(); }

    }



}
