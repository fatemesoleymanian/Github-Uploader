package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Appspace.fxml"));
        primaryStage.setTitle("Github App");
        primaryStage.getIcons().add(new Image("sample/gitIcon.jpg"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }

    // TODO: 1/20/2021 1.checking right/wrong filled field and tell user pushed or not
    // TODO: 1/20/2021 2.push and pull both
    // TODO: 1/20/2021 3.how to solve username password problem
}
