package prufa.src.vidmot;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class loginHandler implements EventHandler {


    public void handle(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("login.exe");
        primaryStage.setScene(new Scene(root, 820, 535));
        primaryStage.show();
    }

    @Override
    public void handle(Event event) {

    }
}
