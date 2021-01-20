package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PersianUploader {

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

    Entity entity=new Entity();

    @FXML
    void btnsMoreInfoLbl(MouseEvent event) {
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("در صورت وجود داشتن پوشه پنهانی git. در فایل آپلودی مورد نظر \nدکمه ثبت و آپلود و در غیر اینصورت دکمه ثبت و آپلود برای اولین بار در این مخرن داخلی را بفشارید .");
        alert3.showAndWait();
    }

    @FXML
    void directoryMoreInfoLbl(MouseEvent event) {
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("به پوشه ای که میخواهید محتویات آن را آپلود کنید بروید\nو سپس از نوار بالا مسیر را کپی کنید و دراینجا پیست کنید .");
        alert3.showAndWait();

    }

    @FXML
    void linkMoreInfoLbl(MouseEvent event) {
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("به مخزنی که میخواهید در آن آپلود را انجام دهید در گیت هاب بروید\nو لینک HTTPS مخزن را کپی و دراینجا پیست کنید .");
        alert3.showAndWait();


    }

    @FXML
    void submitBtn1(ActionEvent event) throws Exception {
        Alert alert1=new Alert(Alert.AlertType.INFORMATION,"لطفا صبر کنید ...");
        alert1.setAlertType(Alert.AlertType.INFORMATION);
        alert1.show();
        entity.setDirectory(tf1.getText());
        entity.setComment(tf2.getText());
        entity.setLink(tf3.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add . && git commit -m "+entity.getComment()+" && git remote add origin "+entity.getLink()+" && git push -u origin master\"");
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
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git add -A && git commit -m "+entity.getComment()+ " && git push -u origin master\"");
        Alert alert2=new Alert(Alert.AlertType.INFORMATION,"فایل با موفقیت آپلود شد !");
        alert2.setAlertType(Alert.AlertType.INFORMATION);
        alert2.close();
        alert2.show();

    }

}
