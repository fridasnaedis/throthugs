package vidmot;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable {

    @FXML
    Button forwardButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //forwardButton.addEventHandler()
    }

    public void logIn() {
        System.out.println("LogIn");
    }
}
