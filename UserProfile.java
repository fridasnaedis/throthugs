public class UserProfile {

    /**
     * Getum við notað eitthvað sem er til í JAVA?
     */

    private String userName;
    private boolean tourManager;
    private boolean tourBooker;


    /**
     * Smiður
     * @param userName
     * @param tourManager
     * @param tourBooker
     */
    public UserProfile(String userName, boolean tourManager, boolean tourBooker) {
        this.userName = userName;
        this.tourManager = tourManager;
        this.tourBooker = tourBooker;
    }

    public UserProfile() {
    }

    public boolean deleteAccount() {
        return true;
    }

    public void editProfile() {

    }

    public boolean changePassword(String newPassword) {
        return true;
    }

    public TripList listTrips() {
        return new TripList( List<Booking.Trip> trips);
    }

    public Booking listBookings() {
        return new Booking(bookingNo, personInfo, tripId, noGuest);

    }

    public Reveiw listReviews() {
        return new Reveiw(date, rewiewID, user, reviewText, tripID, visability);
    }




}
