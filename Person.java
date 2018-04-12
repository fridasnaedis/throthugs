import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person
{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String firstName;
    private String lastName;
    private String userName;

    //gera foreign key
    private int bookingReference;
    private String email;


    public Person(){}

    public Person(String firstName, String lastName, String userName, int bookingReference, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.bookingReference = bookingReference;
        this.email = email;
    }

    public int getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(int bookingReference) {
        this.bookingReference = bookingReference;
    }


    //private List<Person> persons = new ArrayList<Person>();

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", bookingReference=" + bookingReference +
                ", email='" + email + '\'' +
                '}';
    }
}
