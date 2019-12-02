package cinematicektbookingapplication;
/**
 * Represents a cinema the customer wants to book
 */
public class Film {
    /**
     * title is a string variable to store the cinema name customer choose
     * rating is a Rating type variable to store the cinema rating 
     */
    private static String title;
    private static Rating rating;
    /**
     * Default constructor of the Film class
     */
    public void Film()
    {
        this.title = null;
        this.rating = null;
    }
    /**
     * Constructor with parameters of the Film class
     * @param title is the name of the cinema
     * @param rating is the rating of the cinema
     */
    public void Film(String title, Rating rating)
    {
        this.title = title;
        this.rating = rating;
    }
    /**
     * toString method to represent of a Film object
     * @return string value
     */
    public String toString()
    {
        return title+" "+rating;
    }
    /**
     * Gets the title of the cinema
     * @return title of the cinema
     */
    public static String getTitle() {
        return title;
    }
    /**
     * Sets the title of the cinema
     * @param title is the name of the cinema
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Gets the rating of the cinema
     * @return the rating of the cinema
     */
    public static Rating getRating() {
        return rating;
    }
    /**
     * Sets the rating of the cinema
     * @param rating is the rating of the cinema
     */
    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
