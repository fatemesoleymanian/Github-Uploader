package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class PersianPusher extends AlertcreatorAndBack {

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf4;

    @FXML
    private TextField tf3;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private TextField tf2;

    @FXML
    private ImageView backImg;

    Entity entity=new Entity();


                                //****** MORE INFO LABELS *****
    @FXML
    void btnsMoreInfoLbl(MouseEvent event) {
        super.btnsMoreInfoLbl();
    }

    @FXML
    void directoryMoreInfoLbl(MouseEvent event) {
        super.directoryMoreInfoLbl();
    }

    @FXML
    void linkMoreInfoLbl(MouseEvent event) {
        super.linkMoreInfoLbl();

    }
    @FXML
    void branchNameMoreInfoLbl(MouseEvent event) {super.branchNameMoreInfoLbl(); }


                                        //***** PUSH BUTTONS ******
    @FXML
    void submitBtn1(ActionEvent event) throws Exception {
        Alert alert1=new Alert(Alert.AlertType.INFORMATION,"لطفا صبر کنید ...");
        alert1.setAlertType(Alert.AlertType.INFORMATION);
        alert1.show();
        entity.setDirectory(tf1.getText());
        entity.setComment(tf2.getText());
        entity.setLink(tf3.getText());
        entity.setBranch(tf4.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add . && git commit -m  "+ entity.getComment()+"  && git remote add origin "+entity.getLink()+" && git push -u origin "+entity.getBranch()+"\"");
        alert1.close();
        Alert alert2=new Alert(Alert.AlertType.INFORMATION,"فایل با موفقیت آپلود شد !");
        alert2.setAlertType(Alert.AlertType.INFORMATION);
        alert2.show();

    }

    @FXML
    void submitBtn2(ActionEvent event) throws Exception {
        Alert alert=new Alert(Alert.AlertType.INFORMATION,"لطفا صبر کنید ...");
        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.show();
        entity.setDirectory(tf1.getText());
        entity.setComment(tf2.getText());
        entity.setLink(tf3.getText());
        entity.setBranch(tf4.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add -A && git commit -m "+entity.getComment()+ " && git push -u origin "+entity.getBranch()+"\"");
        Alert alert2=new Alert(Alert.AlertType.INFORMATION,"فایل با موفقیت آپلود شد !");
        alert2.setAlertType(Alert.AlertType.INFORMATION);
        alert2.close();
        alert2.show();

    }

                                        //****** BACK TO MENU ********
    @FXML
    void backBtn(MouseEvent event) throws IOException {backToMenu(backImg);

    }

}
