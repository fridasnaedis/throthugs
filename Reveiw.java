import sun.plugin.util.UserProfile;

import java.util.Date;

public class Reveiw {

    /**
     * Viðfangsbreytur
     * skoða UserProfile klasann
     */
    private Date date;
    private Long rewiewID;
    private UserProfile user;
    private String reviewText;
    private Long tripID;
    private Boolean visability;


    /**
     * Smiður
     * @param date
     * @param rewiewID
     * @param user
     * @param reviewText
     * @param tripID
     * @param visability
     */
    public Reveiw(Date date, Long rewiewID, UserProfile user, String reviewText, Long tripID, Boolean visability) {
        this.date = new Date();
        this.rewiewID = rewiewID;
        this.user = user;
        this.reviewText = reviewText;
        this.tripID = tripID;
        this.visability = visability;
    }

    /**
     * Getters og setters
     * Þurfum við þessar aðferðirð?
     * @return
     */
    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Date getDate() {
        return date;
    }
}
