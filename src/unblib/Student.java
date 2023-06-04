/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unblib;

/**
 *
 * @author saulo
 */
public class Student extends Member {
    private String name;
    private String id;
    private String email;
    private String password;
    private Book bookList;

    public Student(String name, String id, String email, String password, Book bookList) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.bookList = bookList;
    }

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

    public void checkoutBook() {
        // Implementation for checking out a book
    }

    public void returnBook() {
        // Implementation for returning a book
    }
}