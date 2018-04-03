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
    public Person() {};
    public Person(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

}

    /** Dæmi um SQL töflu:
     *
     *     create table EMPLOYEE (
     *         email VARCHAR(30) NOT NULL,
     *         firstName VARCHAR(20) NOT NULL default NULL,
     *         lastName  VARCHAR(20) NOT NULL default NULL,
     *         userName  VARCHAR(20) default NULL,
     *         PRIMARY KEY (email)
     *         PRIMARY KEY (lasName)
     *         );
     *
     */
