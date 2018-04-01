package Model;

public class Person {

    /**
     * viðfangsbreytur
     */
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String email;


    /**
     * Smiður
     */
    public Person(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }


}
