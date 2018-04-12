import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;


@Entity
@Table(name = "TRIP")
public class Trip {


    /**
     * Viðfangsbreytur
     */

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long tripID;

    private Date tripStartDate;
    private Date tripEndDate;
    private String tripDescription;
    private double tripPrice;
    private int tripDifficulty;
    private boolean wheelchairAccess;
    private boolean familyFriendly;
    private boolean coupleFriendly;
    private boolean goupFriendly;
    private ArrayList<Review> reviews;
    private  String tripLocation;
    private int availableSeats;

    /**
     * Smiður
     */

    public Trip(){};
    public Trip(Long tripID, Date tripStartDate, Date tripEndDate, String tripDescription, double tripPrice,
                int tripDifficulty, boolean wheelchairAccess, boolean familyFriendly, boolean coupleFriendly,
                boolean goupFriendly, ArrayList<Review> reviews, String tripLocation, int availableSeats) {
        this.tripID = null;
        this.tripStartDate = null;
        this.tripEndDate = null;
        this.tripDescription = tripDescription;
        this.tripPrice = 0;
        this.tripDifficulty = 0;
        this.wheelchairAccess = wheelchairAccess;
        this.familyFriendly = familyFriendly;
        this.coupleFriendly = coupleFriendly;
        this.goupFriendly = goupFriendly;
        this.reviews = reviews;
        this.tripLocation = tripLocation;
        this.availableSeats = 0;
    }

    /**
     *  Getters og setters?
     * +getTripID(): Long
     * sækir ferð eftir ID
     * þarf þessa aðferð eða getum við kalla beint í gagnagrunn?
     */
    public Long getTripID() {
        return tripID;
    }

    public void setTripID(Long tripID) {
        this.tripID = tripID;
    }

    public Date getTripStartDate() {
        return tripStartDate;
    }

    public void setTripStartDate(Date tripStartDate) {
        this.tripStartDate = tripStartDate;
    }

    public Date getTripEndDate() {
        return tripEndDate;
    }

    public void setTripEndDate(Date tripEndDate) {
        this.tripEndDate = tripEndDate;
    }

    public String getTripDescription() {
        return tripDescription;
    }

    public void setTripDescription(String tripDescription) {
        this.tripDescription = tripDescription;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getTripDifficulty() {
        return tripDifficulty;
    }

    public void setTripDifficulty(int tripDifficulty) {
        this.tripDifficulty = tripDifficulty;
    }

    public boolean isWheelchairAccess() {
        return wheelchairAccess;
    }

    public void setWheelchairAccess(boolean wheelchairAccess) {
        this.wheelchairAccess = wheelchairAccess;
    }

    public boolean isFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    public boolean isCoupleFriendly() {
        return coupleFriendly;
    }

    public void setCoupleFriendly(boolean coupleFriendly) {
        this.coupleFriendly = coupleFriendly;
    }

    public boolean isGoupFriendly() {
        return goupFriendly;
    }

    public void setGoupFriendly(boolean goupFriendly) {
        this.goupFriendly = goupFriendly;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public String getTripLocation() {
        return tripLocation;
    }

    public void setTripLocation(String tripLocation) {
        this.tripLocation = tripLocation;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripID=" + tripID +
                ", tripStartDate=" + tripStartDate +
                ", tripEndDate=" + tripEndDate +
                ", tripDescription='" + tripDescription + '\'' +
                ", tripPrice=" + tripPrice +
                ", tripDifficulty=" + tripDifficulty +
                ", wheelchairAccess=" + wheelchairAccess +
                ", familyFriendly=" + familyFriendly +
                ", coupleFriendly=" + coupleFriendly +
                ", goupFriendly=" + goupFriendly +
                ", reviews=" + reviews +
                ", tripLocation='" + tripLocation + '\'' +
                ", availableSeats=" + availableSeats +
                '}';
    }
}

