import java.util.ArrayList;
import java.util.List;

public abstract class EMailClient {

    private List<Person> personen = new ArrayList<Person>();

    public void addPerson(Person person) {
        personen.add(person);
    }

    public void removePerson(Person person) {
        personen.remove(person);
    }

    public void sendEMail(EMail email) {
        for (Person person : personen) {
            person.erhalteEmail(email);
        }
    }

}
