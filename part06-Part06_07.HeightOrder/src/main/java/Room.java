import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    public Room(){
        this.persons=new ArrayList<>();
    }
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        int min=persons.get(0).getHeight();
        Person shortest=persons.get(0);  
        for (Person person : persons) {
            if(min>person.getHeight()){
                shortest=person;
                min=person.getHeight();
            }
        }

        return shortest;
    }
    public Person take(){
        if(this.isEmpty()){
            return null;
        }
        Person aux = shortest();
        persons.remove(aux);
        return aux;
        
    }
}
