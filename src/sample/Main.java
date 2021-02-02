package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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


    // TODO: 1/20/2021 1.checking right/wrong filled field and tell user pushed or not -------> Still being worked on
    // TODO: 1/20/2021 2.push and pull both ------->It's Done!!! ;) awesome!:D
    //  Just please make a menu for user for choosing between Pull/Push in the Appspace.fxml! Make it like the persian/English options menu.
    // TODO: 1/20/2021 3.how to solve username password problem -----> It will be done, I'll show you how!
}
//TODO: Can it be any BETTER?? :)))))))))))))))))
//todo  always think about a better one !
