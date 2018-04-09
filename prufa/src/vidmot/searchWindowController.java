package vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import com.jfoenix.controls.JFXTextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchWindowController implements Controller {
    @FXML
    private Button forwardbutton;

    @FXML
    private JFXTextField locationTXT;

    public void forwardButton() throws IOException {
        ListController.setLocation(locationTXT.getText());
        Stage stage = (Stage) forwardbutton.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("List.fxml"),"SearchWindow.fxml");
    }

    public void logIn() throws IOException {
        Stage stage = (Stage) forwardbutton.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("LogIn.fxml"),"SearchWindow.fxml");
    }
    public void signUp() throws IOException {
        Stage stage = (Stage) forwardbutton.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("SignUp.fxml"),"SearchWindow.fxml");
    }

    @Override
    public void setPrev(String prev) {

    }
}
