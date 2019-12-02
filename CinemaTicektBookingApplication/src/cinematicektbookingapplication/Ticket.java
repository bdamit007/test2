package cinematicektbookingapplication;
/**
 * Represents the ticket of the cinema
 */
public class Ticket {
    /**
     * film is a Film object
     * customer is a Customer object
     */
    private static Film film;
    private static Customer customer;
    /**
     * Constructor with parameters of the Ticket class
     * @param customer is a Customer object
     * @param film is a Film object
     */
    public void Ticket(Customer customer, Film film)
    {
        Ticket.film = film;
        Ticket.customer = customer;
    }
    /**
     * Calculate the cost of a film booking
     * @return double type calculated cost value
     */
    public static double cost()
    {
        double cost = 0;
        int age = Customer.getAge();
        boolean stu = Customer.isStudent();
        /**
         * Standard ticket for adults: (aged 18 years or more) $10
         */
        if(age>17)
        {
            if(age<71)
            {
                    cost = 10;
            }
        }
        /**
         * Standard tickets for children: (aged less than 18 years) $7
         */
        if(age<18)
        {
            if(stu==false)
            {
                cost = 7;
            }
        }
        /**
         * Seniors (above the age of 70) and are not students have a 5% discount from the cost of their ticket
         * 10*0.05=0.5
         */
        if(age>=70)
        {
            if(stu==false)
            {
                cost = 10-0.5;
            }
        }
        /**
         * Students above 25 have a 7% discount off their ticket
         * 10*0.07=0.7
         */
        if(age>25)
        {
            if(stu==true)
            {
                cost = 10-0.7;
            }
        }
        /**
         * Students between the ages of 8‐20 (inclusive) have a 20% discount of their ticket standard cost
         * Student between 8 to 17
         * 7*0.2=1.4
         */
        if(age>7)
        {
            if(age<18)
            {
                if(stu==true)
                {
                    cost = 7-1.4;
                }
            }
        }
        /**
         * Students between the ages of 8‐20 (inclusive) have a 20% discount of their ticket standard cost
         * Student between 18 to 20
         * 10*0.2=2
         */
        if(age>17)
        {
            if(age<21)
            {
                if(stu==true)
                {
                    cost = 10-2;
                }
            }
        }
        return cost;
    }
    /**
     * Gets the film object that customer choose
     * @return film object
     */
    public Film getFilm()
    {
        return film;
    }
    /**
     * Gets the customer object
     * @return customer object
     */
    public Customer getCustomer()
    {
        return customer;
    }
}
