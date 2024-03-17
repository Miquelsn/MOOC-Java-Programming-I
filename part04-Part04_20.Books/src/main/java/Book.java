public class Book {
    private String name;
    private String pages;
    private String year;
    
    public Book(String name, String pages, String publicationYear){
        this.name = name;
        this.pages = pages;
        this.year = publicationYear;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}