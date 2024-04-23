public class Item {
    private String identifier;
    private String name;
    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    public String getIdentifier(){
        return identifier;
    }
    public String getName(){
        return name;
    }
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the object into a Person object
        Item comparedItem = (Item) compared;

        // if the values of the object variables are equal, the objects are equal
        return this.identifier.equals(comparedItem.identifier);

    }
    public String toString(){
        return getIdentifier()+": "+getName();
    }

}
