package vidmot;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import prufa.src.vidmot.DayTripUI;

import java.io.IOException;

public class SignUpController implements vidmot.Controller {
    private String fxmlPrev;
    @FXML
    private JFXButton confirmSignUp;
    public void back() throws IOException {
        Stage stage = (Stage) confirmSignUp.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource(fxmlPrev),"SignUp.fxml");
    }
    public void logIn() throws IOException{
        Stage stage = (Stage) confirmSignUp.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("LogIn.fxml"),"SignUp.fxml");
    }
    public void searchPage() throws IOException{
        Stage stage = (Stage) confirmSignUp.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("SearchWindow.fxml"),"");
    }
    @Override
    public void setPrev(String prev) {
        this.fxmlPrev = prev;
    }
}
