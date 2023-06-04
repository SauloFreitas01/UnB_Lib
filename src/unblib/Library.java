/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unblib;

/**
 *
 * @author saulo
 */
public class Library {
    private String name;
    private String address;
    private Book bookCatalog;
    private Paper paperCatalog;

    public Library(String name, String address, Book bookCatalog, Paper paperCatalog) {
        this.name = name;
        this.address = address;
        this.bookCatalog = bookCatalog;
        this.paperCatalog = paperCatalog;
    }

    // Getter and Setter methods for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book getBookCatalog() {
        return bookCatalog;
    }

    public void setBookCatalog(Book bookCatalog) {
        this.bookCatalog = bookCatalog;
    }

    public Paper getPaperCatalog() {
        return paperCatalog;
    }

    public void setPaperCatalog(Paper paperCatalog) {
        this.paperCatalog = paperCatalog;
    }

    // Method to update library information
    public void updateInfo(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Library information updated.");
    }

    // Method to issue books
    public void issueBooks() {
        // Implementation for issuing books
        System.out.println("Books issued.");
    }

    // Method to issue papers
    public void issuePaper() {
        // Implementation for issuing papers
        System.out.println("Papers issued.");
    }

    // Method to display member information
    public void memberInfo() {
        // Implementation to display member information
        System.out.println("Member information displayed.");
    }

    // Method to search for a book
    public void searchBook() {
        // Implementation to search for a book
        System.out.println("Book searched.");
    }

    // Method to return a book
    public void returnBook() {
        // Implementation to return a book
        System.out.println("Book returned.");
    }

    // Method to delete an alert
    public void deleteAlert() {
        // Implementation to delete an alert
        System.out.println("Alert deleted.");
    }
}
    

