import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room(){
        this.room = new ArrayList<>();
    }

    public void add(Person person){
        room.add(person);
    }
    public boolean isEmpty(){
        if (room.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return room;
    }

    public Person shortest(){
        if (room.isEmpty()){
            return null;
        }
        Person c = this.room.get(0);
        for (Person person : room){
            if (person.getHeight() < c.getHeight()){

                c = person;
            }
        }
        return c;
    }
    public Person take(){
        if (room.isEmpty()){
            return null;
        }
        Person quit = shortest();
        room.remove(quit);
        return quit;
    }
}
