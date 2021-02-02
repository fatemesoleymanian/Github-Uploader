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

        // TODO: 2/1/2021 browse
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
        entity.setDirectory(tf1.getText());
        entity.setComment(tf4.getText());
        entity.setLink(tf3.getText());
        entity.setBranch(tf2.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add . && git commit -m  "+ "\""+entity.getComment()+" \" "+"  && git remote add origin "+entity.getLink()+" && git push -u origin "+entity.getBranch()+" && exit\"");
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setTitle("فایل ها با موفقیت آپلود شدند");
        alert.setContentText("به ریپازیتوری خود سر بزنید!");
        alert.show();

    }

    @FXML
    void submitBtn2(ActionEvent event) throws Exception {
        entity.setDirectory(tf1.getText());
        entity.setComment(tf4.getText());
        entity.setLink(tf3.getText());
        entity.setBranch(tf2.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add -A && git commit -m "+"\""+entity.getComment()+" \" "+ " && git push -u origin "+entity.getBranch()+" && exit\"");
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setTitle("اخطار گیت هاب");
        alert.setContentText("به ریپازیتوری خود سر بزنید!");
        alert.setHeaderText("فایل ها با موفقیت آپلود شدند");
        alert.show();

    }

                                        //****** BACK TO MENU ********
    @FXML
    void backBtn(MouseEvent event) throws IOException {backToMenu(backImg);

    }

}
