package unblib;


public class Book{
    //Atributes
    private String name;
    private String author;
    private int stock;
    private String genre;

    
    //Constructor
    public Book(String name, String author, int stock, String genre) {
        this.name = name;
        this.author = author;
        this.stock = stock;
        this.genre = genre;
    }
    

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}