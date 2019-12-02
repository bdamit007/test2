package cinematicektbookingapplication;
import java.util.Scanner;
/**
 * Represents the CinemaTicketBookingApplication class 
 */
public class CinemaTicektBookingApplication {
    /**
     * NUMBER_OF_FILMS is the number of films from where customer can choose film
     * films[] is an array to hard code films to display to customer to choose from
     * Ratings[] is an array to store the ratings of the films displayed to customer
     * keyboard variable to scan the customer's inputs
     */
    //private int NUMBER_OF_FILMS = 4;
    private static String films[]= {"Ant-Man", "Jurassic World", "Inside Out", "Minions"};
    private static String Ratings[] = {"P", "P", "M", "G"};
    private static Scanner keyboard = new Scanner(System.in);
    /**
    * Method which prompts the user to enter their customer information, 
    * constructs and returns a Customer object 
    * @return customer object
    */
    private static Customer customerDetailsInput()
    {
        /**
         * Creating a customer object
         */
        Customer customer = new Customer();
        /**
         * Prompts the user to input name and sets the name of the customer
         */
        System.out.println("Please enter your name:");
        String name = keyboard.nextLine();
        customer.setName(name);
        /**
         * Prompts the user to input age and sets the age of the customer
         */
        System.out.println("Please enter your age:");
        String age = keyboard.nextLine();
        customer.setAge(Integer.parseInt(age));
        /**
         * Prompts the user to input weather student or not and sets the value accordingly 
         * by checking the users input Y or N
         */
        System.out.println("Are you a student?(Y/N)");
        String isStudentValue = keyboard.nextLine();
        if(isStudentValue.equals("Y"))
        {
            customer.setStudent(true);
        }
        else if(isStudentValue.equals("N"))
        {
            customer.setStudent(false);
        }
        return customer;
    }
    /**
     * Method prompt the user to type the number corresponding to the film they want to watch
     * returning the appropriate Film object
     * @return Film object
     */
    private static Film filmSelection()
    {
         /**
         * Creating a film object
         */
        Film film = new Film();
         /**
         * Prompts the user to choose film from the displayed list
         * Films ratings are displayed by traversing the film and rating array
         */
        System.out.println("Which film would you like to watch:");
        for(int i=0; i<films.length; i++)
        {
            System.out.println((i+1)+" "+films[i]+" rating: "+"("+Ratings[i]+")");
        }
        int selection = Integer.parseInt(keyboard.nextLine());
        /**
         * According to customers selection film title rating is stored
         */
        for(int i=0; i<films.length; i++)
        {
            if(selection == i+1)
            {
                film.setTitle(films[i]);
                if(Ratings[i] == "P")
                {
                    film.setRating(Rating.PARENTALGUIDANCE);
                }
                else if(Ratings[i] == "G")
                {
                    film.setRating(Rating.GENERAL);
                }
                else
                {
                    film.setRating(Rating.MATURE);
                }
            }
        }
        return film;
    }
    /**
     * Method which constructs and returns a Ticket object if the customer’s
     * age is appropriate to the film they wish to view
     * @param aCustomer is Customer object
     * @param aFilm is a Film object
     * @return Ticket object
     */
    public static Ticket issueTicket(Customer aCustomer, Film aFilm)
    {
        /**
         * Creating Ticket object
         */
        Ticket ticket = new Ticket();
        /**
         * Checking the customers age to decide weather the customer is eligible to watch the film
         */
        if(Film.getRating() == Rating.MATURE)
        {
            if(Customer.getAge() > 15)
            {
                return ticket;
            }
            else
            {
                return null;
            }
        }
        /**
        * Checking weather customer is eligible to watch PARENTALGUIDANCE film
        */
        else if(Film.getRating() == Rating.PARENTALGUIDANCE)
        {
            if(Customer.getAge() > 12)
            {
                return ticket;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return ticket;
        }
    }
    /**
     * Represents the main method
     */
    public static void main(String[] args) {
        Ticket ticket;
        /**
         * Invoking other methods
         */
        ticket = issueTicket(customerDetailsInput(), filmSelection());
        /**
         * Booking failed message showing if customer is not eligible
         */
        if(ticket == null)
        {
            System.out.println("Sorry, cannot issue ticket for age restricted film.");
        }
        /**
         * If eligible to watch the film displays the details along with cost 
         */
        else
        {
            System.out.println("Your ticket is ready to be collected!");
            System.out.println("-------------------------------------------------------");

            String ratingtext = "";
            if(Film.getRating() == Rating.GENERAL)
            {
                ratingtext = "(G)";
            }
            else if(Film.getRating() == Rating.MATURE)
            {
                ratingtext = "(M)";
            }
            else if(Film.getRating() == Rating.PARENTALGUIDANCE)
            {
                ratingtext = "P";
            }
            String stu = "";
            if(Customer.isStudent()==true)
            {
                stu = "Yes";
            }
            else if(Customer.isStudent()==false)
            {
                stu = "No";
            }
            System.out.println("FILM TICKET for: "+Film.getTitle()+" rating: "+ratingtext);
            System.out.println("CUSTOMER DETAILS: "+Customer.getName()+" age: "+Customer.getAge()+" Student? "+stu);
            System.out.println("TOTAL COST: "+Ticket.cost());
            System.out.println("-------------------------------------------------------");
        }
        /**
         * Prompts if customer want to book another ticket and shows accordingly
         */
        System.out.println("Issue another ticket? (Y/N)");
        String again = keyboard.nextLine();
        if(again.equals("Y"))
        {
            CinemaTicektBookingApplication.main(args);
        }
    }
}
