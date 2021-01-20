package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PullSection {
    public TextField tf1;
    public TextField tf3;
    public Button btn1;
    Entity entity=new Entity();
    public void pullBtn(ActionEvent actionEvent)throws Exception {
        entity.setDirectory(tf1.getText());
        entity.setLink(tf3.getText());
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd "+entity.getDirectory()+" && git init && git remote add origin "+entity.getLink()+" && git pull origin master\"");
    }
}
