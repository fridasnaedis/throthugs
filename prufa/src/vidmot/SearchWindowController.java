package vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import com.jfoenix.controls.JFXTextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchWindowController implements vidmot.Controller {
    @FXML
    private Button forwardbutton;

    @FXML
    private JFXTextField locationTXT;

    public void forwardButton() throws IOException {
        vidmot.ListController.setLocation(locationTXT.getText());
        Stage stage = (Stage) forwardbutton.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("List.fxml"),"SearchWindow.fxml");
    }

    public void bookingService() throws IOException {
        Stage stage = (Stage) forwardbutton.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("BookingService.fxml"),"SearchWindow.fxml");
    }
    public void createTrip() throws IOException {
        Stage stage = (Stage) forwardbutton.getScene().getWindow();
        DayTripUI.changeStage(stage, getClass().getResource("CreateTrip.fxml"),"SearchWindow.fxml");
    }

    @Override
    public void setPrev(String prev) {

    }
}
