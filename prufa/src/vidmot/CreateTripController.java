package vidmot;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import prufa.src.vidmot.DayTripUI;

import java.io.IOException;

<<<<<<< HEAD:prufa/src/vidmot/CreateTripController.java
public class CreateTripController implements Controller{
=======
public class SignUpController implements vidmot.Controller {
>>>>>>> c09b14626f23f6e6523cb02b60ed300d268052e9:prufa/src/vidmot/SignUpController.java
    private String fxmlPrev;
    @FXML
    private JFXButton confirmSignUp;
    public void back() throws IOException {
        Stage stage = (Stage) confirmSignUp.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource(fxmlPrev),"CreateTrip.fxml");
    }
    public void bookingService() throws IOException{
        Stage stage = (Stage) confirmSignUp.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("BookingService.fxml"),"CreateTrip.fxml");
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
