package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.stage.Stage;
import java.io.IOException;

public class AlertcreatorAndBack {

    public void directoryAlert(){
        Alert alert4=new Alert(Alert.AlertType.INFORMATION);
        alert4.setHeaderText("Chosen file is invalid !");
        alert4.showAndWait();


    }

    public void linkAlert(){
        Alert alert5=new Alert(Alert.AlertType.INFORMATION);
        alert5.setHeaderText("Go to your github repository which you want it to be updated \n" +
                "by your upload ,copy your  repository HTTPS or SSH and paste it here.");
        alert5.showAndWait();


    }
    public void pushAlerts(){
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("If there's a hidden .git file in your file/project directory \n" +
                "click 'Submit If Git folder Exists' Button But if there's no \nclick 'Submit For The First Time' ");
        alert3.showAndWait();

    }
    public void branchNameAlert(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("You can just pull from or push into existing\n" +
                " branch or add a new branch \n(this action will need your github username and password !)");
        alert.showAndWait();
    }
    public void backToMenu(ImageView backImg) throws IOException {
        Stage stage = (Stage) backImg.getScene().getWindow();
        stage.close();
        Stage primarystage = new Stage();
        SplitPane root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/Appspace.fxml"));
        primarystage.setTitle("Github App");
        primarystage.getIcons().add(new Image("sample/gitIcon.jpg"));
        Scene scene = new Scene(root, 600, 400);
        primarystage.setScene(scene);
        primarystage.show();

    }
    public void languageAler(){
        Alert alert1=new Alert(Alert.AlertType.INFORMATION);
        alert1.setHeaderText("choose a language !");
        alert1.showAndWait();
    }
    public void btnsMoreInfoLbl(){
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("در صورت وجود داشتن پوشه پنهانی git. در فایل آپلودی مورد نظر \nدکمه ثبت و آپلود و در غیر اینصورت دکمه ثبت و آپلود برای اولین بار در این مخرن داخلی را بفشارید .");
        alert3.showAndWait();
    }
    public void directoryMoreInfoLbl(){
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("فولدر انتخاب شده نامعتبر است !");
        alert3.showAndWait();

    }
    public void linkMoreInfoLbl(){
        Alert alert3=new Alert(Alert.AlertType.INFORMATION);
        alert3.setHeaderText("به مخزنی که میخواهید در آن آپلود را انجام دهید در گیت هاب بروید\nو لینک HTTPS مخزن را کپی و دراینجا پیست کنید .");
        alert3.showAndWait();

    }
    public void branchNameMoreInfoLbl(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("میتوانید به شعبه مورد نظر خود اطلاعات را فرستاده \nیا از آن اطلاعات را بگیرید و درصورت ایجاد شعبه جدید\n باید نام و رمز عبور گیت هاب خودرا وارد کنید.");
        alert.showAndWait();
    }
}
