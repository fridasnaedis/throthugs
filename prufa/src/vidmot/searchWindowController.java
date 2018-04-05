package vidmot;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import com.jfoenix.controls.JFXTextField;
import javafx.stage.Stage;

import java.io.IOException;

public class searchWindowController {
    @FXML
    private Button forwardbutton;

    @FXML
    private JFXTextField locationTXT;

    public void forwardButton() throws IOException {
        ListController.setLocation(locationTXT.getText());
        Parent root;
        Stage stage;
        stage = (Stage) forwardbutton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("List.fxml"));
        Scene scene = new Scene(root, 820, 535);
        stage.setScene(scene);
        stage.show();
    }

    public void logIn() {
        System.out.println("LogIn");
    }
}
