package Model;

import java.util.ArrayList;
import java.util.Date;

public class Trip {


    /**
     * Viðfangsbreytur
     */
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
    private ArrayList<Reveiw> reveiws;
    private  String tripLocation;
    private int availableSeats;

    /**
     * Smiður
     */

    public Trip(Long tripID, Date tripStartDate, Date tripEndDate, String tripDescription, double tripPrice,
                int tripDifficulty, boolean wheelchairAccess, boolean familyFriendly, boolean coupleFriendly,
                boolean goupFriendly, ArrayList<Reveiw> reveiws, String tripLocation, int availableSeats) {
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
        this.reveiws = reveiws;
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
        return null;
    }
}

