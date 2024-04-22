public class Book {
    private String name;
    private int pages;
    private int pubDate;
    public Book(String name, int pages, int pubDate){
        this.name = name;
        this.pages = pages;
        this.pubDate = pubDate;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return this.name + ", " + pages + " pages, " + pubDate;
    }
}
