package cinematicektbookingapplication;
/**
 * Enumeration class that represent the rating of the film
 */
public enum Rating {
    /**
     * elements corresponding to New Zealand’s film rating systems:
     * o GENERAL, films appropriate for all ages.
     * o PARENTALGUIDANCE, ages 12 and above.
     * o MATURE, ages 16 and above.
     */
    GENERAL,
    PARENTALGUIDANCE,
    MATURE;
    /**
     * minAge is the integer variable to store minimum age to watch a particular cinema according to rating
     */
    private int minAge;
    /**
     * Constructor with parameter of the Rating class
     * @param minAge is the minimum age to watch a particular cinema according to rating
     */
    private void Rating(int minAge)
    {
        this.minAge = minAge;
    }
    /**
     * Gets the minimum age to watch a particular cinema according to rating
     * @return minimum age
     */
    public int getMinAge()
    {
        return minAge;
    }
    /**
     * Sets the minimum age to watch a particular cinema according to rating
     * @param minAge to set the minimum age
     */
    public void setMinAge(int minAge)
    {
        this.minAge = minAge;
    }
}