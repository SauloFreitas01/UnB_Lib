/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unblib;

/**
 *
 * @author saulo
 */
public class Teacher {
    private String name;
    private String id;
    private String email;
    private String password;
    private Book bookList;
    private Paper paperList;

    // Constructors (you can define your own constructors based on your requirements)

    public Teacher(String name, String id, String email, String password) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Book getBookList() {
        return bookList;
    }

    public void setBookList(Book bookList) {
        this.bookList = bookList;
    }

    public Paper getPaperList() {
        return paperList;
    }

    public void setPaperList(Paper paperList) {
        this.paperList = paperList;
    }

    // Methods

    public void checkoutBook() {
        // Implementation for checking out a book
    }

    public void returnBook() {
        // Implementation for returning a book
    }

    public void issuePaper() {
        // Implementation for issuing a paper
    }

}