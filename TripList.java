import java.util.ArrayList;
import java.util.List;

public class TripList {

    /**
     * initializa arraylist í smið ekki hér
     */
    private List<Trip> trips;


    /**
     * smiður
     */

    public TripList(List<Trip> trips) {
        this.trips = new ArrayList<Trip>();
    }

    /**
     * + filterTrips(filter: Filter): void
     *   Pæling hér að sleppa að vera með sér Filter klasa og leita í ferðunum
     *   beint útfrá viðmótinu þar sem að Filter er aðeins notað í þeim tilgangi,
     *   hvergi annarstaðar.
     */
    public  void filterTrips() {
    }

    /**
     * + showTrip(tripID: long): void
     */
    public  void showTrip() {
    }

    /**
     * + resetFilters(): void
     * sækja allar ferðir úr DB og setja í arrayList<Trip>
     * Láta þessa aðferð kalla á getTrips();?
     */
    public  void resetFilters() {

    }


    /**
     * + getTrips(): ArrayList<Trip>
     *  Þurfum við sér aðferð? er ekki hægt að ná í þetta í gegnum DBmanager?
     * @return skilar lista yfir allar ferðir (út frá filter?)
     * Kíkja betur á List - Arraylist dæmið
     */
    public ArrayList<Trip> getTrips() {
        //sækja hér úr DB
        return (ArrayList<Trip>) trips;
    }
}
