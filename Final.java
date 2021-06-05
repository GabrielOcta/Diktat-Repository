/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public final class Final {

    private String firstName;
    private String lastName;

    public Final() {
    }
    public Final(String firstName, String lastName) {
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
    public final void deactivateUser(String username){
        //TODO
    }
    public final void deactivateUser(String username, String password){
        //TODO
    }
}
