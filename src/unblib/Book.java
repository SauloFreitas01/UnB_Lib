package unblib;

import java.time.LocalDate;

public class Book{
    //Atributes
    private String name;
    private String author;
    private int stock;
    private String genre;
    private LocalDate issueDate;
    private LocalDate returnDate;    
    private boolean inLibrarian;
    private Member member;

    
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

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public boolean isInLibrarian() {
        return inLibrarian;
    }

    public void setInLibrarian(boolean inLibrarian) {
        this.inLibrarian = inLibrarian;
    }
}