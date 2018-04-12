package prufa.src.vidmot;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController implements vidmot.Controller {
    private String fxmlBack;
    @FXML
    private JFXButton logIn;
    @Override
    public void setPrev(String prev) {
        this.fxmlBack = prev;
    }
    public void back() throws IOException {
        Stage stage = (Stage) this.logIn.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource(fxmlBack),"LogIn.fxml");
    }
    public void signUp() throws IOException {
        Stage stage = (Stage) this.logIn.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("SignUp.fxml"),"LogIn.fxml");
    }
    public void searchPage() throws IOException{
        Stage stage = (Stage) logIn.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("SearchWindow.fxml"),"");
    }
}
