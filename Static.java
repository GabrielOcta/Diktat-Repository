/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public class Static {

    private String firstName;
    private String lastName;
    private static int count;

    public Static() {
    }
    public Static(String firstName, String lastName) {
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
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Static.count = count;
    }
}
