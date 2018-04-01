package Controler;

import Model.Person;
import Model.Reveiw;

import java.util.ArrayList;
import java.util.Date;

public class Booking {

    /**
     * tilviksbreytur eru public í UML??
     */
    private Long bookingNo;
    private Person personInfo;
    private Long tripId;
    private int noGuest;

    /**
     * smiður
     *
     * @param bookingNo
     * @param personInfo
     * @param tripId
     * @param noGuest
     */
    public Booking(Long bookingNo, Person personInfo, Long tripId, int noGuest) {
        this.bookingNo = null;
        this.personInfo = null;
        this.tripId = null;
        this.noGuest = 0;
    }

    /**
     * Þarf þessar aðferðir?
     *
     * @return skil ef gengur
     */
    public boolean cancelBooking() {
        return true;
    }

    public boolean submitBooking() {
        return true;
    }

    /**
     * getters...? erum með skrýtna aðferð sem heitir getBooking í UML skoða hana!
     */

    public Long getBookingNo() {
        return bookingNo;
    }
}