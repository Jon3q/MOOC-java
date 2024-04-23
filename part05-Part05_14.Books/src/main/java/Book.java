
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Book)) {
            return false;
        }
        Book book = (Book) compared;
        if (this.name.equals(book.name) && this.publicationYear == book.publicationYear){
            return true;
        }
        return false;
    }
}
