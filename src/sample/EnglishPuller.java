package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class EnglishPuller extends AlertcreatorAndBack {
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf3;

    @FXML
    private TextField tf2;

    @FXML
    private Button btn1;

    @FXML
    private ImageView backImg;


    Entity entity=new Entity();


                                //***** PULL BUTTON *****
    public void pullBtn(ActionEvent actionEvent)throws Exception {
        entity.setDirectory(tf1.getText());
        entity.setLink(tf3.getText());
        entity.setBranch(tf2.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git remote add origin "+entity.getLink()+" && git pull origin "+entity.getBranch()+ " && exit\"");
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Github Warning");
        alert.setContentText("Check your folder!");
        alert.setHeaderText("Pulled Successfully");
        alert.show();
    }


                                //******* BACK TO MENU *****
    @FXML
    void backBtn(MouseEvent event) throws IOException { backToMenu(backImg);}


                            //****** MORE INFO LABELS *****
    @FXML
    void branchNameMoreInfoLbl(MouseEvent event) { branchNameAlert();}

    @FXML
    void directoryMoreInfoLbl(MouseEvent event) { directoryAlert();}

    @FXML
    void linkMoreInfoLbl(MouseEvent event) {linkAlert(); }
}
