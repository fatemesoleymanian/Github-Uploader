package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;

import java.io.File;
import java.io.IOException;

public class PersianPuller extends AlertcreatorAndBack{
    @FXML
    private TextField tf1;

    @FXML
    private TextField tf3;

    @FXML
    private Button btn1;

    @FXML
    private TextField tf2;

    @FXML
    private ImageView backImg;

    Entity entity=new Entity();

    @FXML
    void backBtn(MouseEvent event) throws IOException {backToMenu(backImg);

    }

    @FXML
    void branchNameMoreInfoLbl(MouseEvent event) {
        super.branchNameMoreInfoLbl();

    }

    @FXML
    void directoryMoreInfoLbl(MouseEvent event) {
        DirectoryChooser directoryChooser=new DirectoryChooser();
        File selectedFiles=directoryChooser.showDialog(null);

        if (selectedFiles != null){

            tf1.setText(selectedFiles.getAbsolutePath());

        }else {
            super.directoryMoreInfoLbl();

        }

    }

    @FXML
    void linkMoreInfoLbl(MouseEvent event) {
        super.linkMoreInfoLbl();

    }

    @FXML
    void pullBtn(ActionEvent event) throws Exception {
        entity.setDirectory(tf1.getText());
        entity.setLink(tf3.getText());
        entity.setBranch(tf2.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git remote add origin "+entity.getLink()+" && git pull origin "+entity.getBranch()+ " && exit\"");
        Alert alert=new Alert(Alert.AlertType.WARNING);
        alert.setTitle("اخطار گیت هاب");
        alert.setContentText("فولدر خود را چک کنید!");
        alert.setHeaderText("با موفقیت دانلود شد");
        alert.show();


    }

}
