package vidmot;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class ListSelectedModel implements ChangeListener {
    private vidmot.ListController listController;
    private FXMLLoader viewingTripLoader;
    public ListSelectedModel(vidmot.ListController lc) {
        this.listController = lc;
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        Parent root;
        Stage stage;
        stage = new Stage();
        if(!listController.isViewingTrip()) {
            try {
                FXMLLoader loader = new FXMLLoader();
                root = loader.load(getClass().getResource("Trip.fxml").openStream());
                viewingTripLoader = loader;
                Scene scene = new Scene(root, 820, 535);
                stage.setScene(scene);
                stage.show();
                stage.setX(stage.getX() + 200);
                stage.setY(stage.getY() + 200);
                listController.setViewingTrip(true);
                stage.setOnCloseRequest((WindowEvent event1) -> {
                    listController.setViewingTrip(false);
                });

            } catch(IOException ex) {
                System.err.println("Error while loading Trip.fxml "+ex.getMessage());
            }
        }
        else {
            vidmot.TripController viewingTripWindow =  this.viewingTripLoader.getController();
            viewingTripWindow.makeTab();

        }

    }
}
