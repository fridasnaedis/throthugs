package vidmot;


import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListController implements Initializable, Controller {
    private static String location;
    private static boolean viewingTrip;
    @FXML
    private ListView list;
    @FXML
    private JFXTextField locationTXT;
    @FXML
    private JFXComboBox maxPrice;
    @FXML
    private JFXComboBox minPrice;
    @FXML
    private JFXComboBox dateFrom;
    @FXML
    private JFXComboBox dateTo;
    @FXML
    private JFXComboBox numbOfCustomers;
    @FXML
    private JFXComboBox difficulty;
    @FXML
    private JFXCheckBox couplesTrip;
    @FXML
    private JFXCheckBox familyTrip;
    @FXML
    private JFXCheckBox groupTrip;
    @FXML
    private JFXCheckBox wheelChairAccess;

    public static void setLocation(String loc) {
        location = loc;
    }

    public boolean isViewingTrip() {
        return this.viewingTrip;
    }

    public void setViewingTrip(boolean viewingTrip) {
        this.viewingTrip = viewingTrip;
    }

    @Override
    public void initialize(URL loc, ResourceBundle resources) {
        ObservableList<String> obs = FXCollections.observableArrayList("Holland, Amsterdam, Bjórsmökkun", "Holland, Rotterdam, Hestreiðar", "Holland, skotveiðikennsla", "Holland, Vaxsafn");
        ArrayList<String> data = new ArrayList();
        list.setItems(obs);
        locationTXT.setText(location);
        setPriceList(maxPrice);
        setPriceList(minPrice);
        list.getSelectionModel().selectedItemProperty().addListener(new ListSelectedModel(this));
    }

    private void setPriceList(JFXComboBox comboBox) {
        int price = 0;
        ArrayList<String> priceList = new ArrayList();
        for(int i = 0; i<5; i++) {
            priceList.add("" + price);
            price += 10000;
        }
        for(int i = 0; i<9; i++) {
            priceList.add("" + price);
            price += 50000;
        }
        ObservableList<String> obs = FXCollections.observableArrayList(priceList);
        comboBox.setItems(obs);
    }

    public void logIn() {

    }

    @Override
    public void setPrev(String prev) {

    }
}
