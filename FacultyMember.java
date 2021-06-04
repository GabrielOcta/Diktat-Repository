import java.util.ArrayList;

/**
 * @author Gabriel Octa Mahardika 1972037
 */
public class FacultyMember {
    private ArrayList<Person> persons;

    public FacultyMember() {
        persons = new ArrayList<>();
    }
    public void showAll(){
        persons.forEach(Person::writeOutput);
    }
    public boolean addPerson(Person person){
        return persons.add(person);
    }
    public void showAllLecturer(){
        persons.forEach(person -> {
            if(person instanceof Lecturer){
                System.out.println("This is lecturer");
                System.out.println("Name: " + person.getName());
                System.out.println("NIDN: " + ((Lecturer) person).getNidn());
            }
        });
    }
}
