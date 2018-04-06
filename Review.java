import sun.plugin.util.UserProfile;

import java.util.Date;

public class Review {

    /**
     * Viðfangsbreytur
     * skoða UserProfile klasann
     */
    private Date date;
    private Long reviewID;
    private UserProfile user;
    private String reviewText;
    private Long tripID;
    private Boolean visability;


    /**
     * Smiður
     * @param date
     * @param reviewID
     * @param user
     * @param reviewText
     * @param tripID
     * @param visability
     */
    public Review(Date date, Long reviewID, UserProfile user, String reviewText, Long tripID, Boolean visability) {
        this.date = new Date();
        this.reviewID = reviewID;
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
