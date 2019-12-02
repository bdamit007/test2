package cinematicektbookingapplication;
/**
 * Represents a customer wants to book cinema ticket 
 * A customer can book cinema ticket
 */
public class Customer {
    /**
     * name is a string variable to store customer's name
     * age is an integer variable to store customer's age
     * isStudent is a boolean variable to store customer is student or not
     */
    private static String name;
    private static int age;
    private static boolean isStudent;
    /**
     * Default Constructor of Customer class
     */
    public void Customer()
    {
        this.name = null;
        this.age = 0;
        this.isStudent = false;
    }
    /**
     * Constructor with parameter of Customer class
     * Parameters are name, age, isStudent of the customer
     */    
    public void Customer(String name, int age, boolean isStudent)
    {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }
    /**
     * toString method to represent of a Customer object
     * @return string value
     */
    public String toString()
    {
        return name+" "+age+" "+isStudent;
    }
    /**
     * Gets the name of the customer
     * @return name of the customer
     */
    public static String getName()
    {
        return name;
    }
    /**
     * Set customer's name
     * @param name of the customer to set
     */
    public static void setName(String name)
    {
        Customer.name = name;
    }
     /**
     * Gets the age of the customer
     * @return age of the customer
     */
    public static int getAge()
    {
        return age;
    }
     /**
     * Set customer's age
     * @param age of the customer to set
     */
    public static void setAge(int age)
    {
        Customer.age = age;
    }
    /**
     * Gets weather the customer is a student or not
     * @return isStudent boolean value according to student or not
     */
    public static boolean isStudent()
    {
        return isStudent;
    }
     /**
     * Set value of the boolean variable according to a customer is a student or not
     * @param isStudentValue is the value weather the customer is a student or not
     */
    public static void setStudent(boolean isStudentValue)
    {
        Customer.isStudent = isStudentValue;
    }
}
