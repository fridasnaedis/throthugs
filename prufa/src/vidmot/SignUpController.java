package vidmot;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.io.IOException;

public class SignUpController implements Controller{
    private String fxmlPrev;
    @FXML
    private JFXButton confirmSignUp;
    public void back() throws IOException {
        Stage stage = (Stage) confirmSignUp.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource(fxmlPrev),"SearchWindow.fxml");
    }
    public void logIn() throws IOException{
        Stage stage = (Stage) confirmSignUp.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("LogIn.fxml"),"SearchWindow.fxml");
    }
    @Override
    public void setPrev(String prev) {
        this.fxmlPrev = prev;
    }
}
