package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class dayTripUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("searchWindow.fxml"));
        primaryStage.setTitle("daytrip.exe");
        primaryStage.setScene(new Scene(root, 820, 535));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
