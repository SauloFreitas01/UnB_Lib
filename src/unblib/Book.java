package unblib;

import java.util.*;

public class Book{
    //Atributes
    private String name;
    private String genre;
    private String author;
    private int stock;
    private String genre;
    private boolean inLibrarian;

    
    //Constructor
    public Book(String name, String genre, String author, int stock) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.stock = stock;
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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
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