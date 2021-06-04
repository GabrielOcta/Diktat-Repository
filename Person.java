/**
 * @author Gabriel Octa Mahardika 1972037
 */
public class Person {
    protected String firstName;
    protected String lastName;

    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName(){
        String gabungan = firstName +" "+ lastName;
        return gabungan;
    }
}
