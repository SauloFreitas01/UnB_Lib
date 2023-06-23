package unblib;

import java.util.*;

public class Library{
    //Atributes
    private String name;
    private String address;
    private Book[] bookCatalog;
    private Paper[] paperCatalog;
    private Member[] memberList;
    
    //Constructor
    public Library(String name, String address, Book[] bookCatalog, Paper[] paperCatalog) {
        this.name = name;
        this.address = address;
        this.bookCatalog = bookCatalog;
        this.paperCatalog = paperCatalog;
    }

    //Getters and setters for name, address, bookCatalog and paperCatalog
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

    //Método para emprestar livro
    public void emprestarLivro(Book book, Member member){
        if (book.getStock() > 0){
            book.setStock(book.getStock() - 1);
            book.setIssueDate(new Date());
            book.setMember(member);
            System.out.println("O livro " + book.getName() + " foi emprestado para " + member.getName());
        }else{
            System.out.println("O livro " + book.getName() + " não está disponível!");
        }
    }

    //Method to update info
    public void updateInfo(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Library information updated.");
    }

    //Method to issue books
    public void issueBooks(Book book, Member member) {
        if (book.getStock() > 0){
            book.setStock(book.getStock() - 1);
            book.setIssueDate(new Date());
            book.setMember(member);
            System.out.println("O livro " + book.getName() + " foi emprestado para " + member.getName());
        }else{
            System.out.println("O livro " + book.getName() + " não está disponível!");
        }
    }

    //Method to issue papers
    public void issuePaper(Book book, Member member) {
        book.setStock(book.getStock() + 1);
        book.setReturnDate(new Date());
        book.setMember(member);
        System.out.println("O livro " + book.getName() + " foi devolvido por " + member.getName());
    }

    //Method to display member information
    public void memberInfo(Member member) {
        System.out.println("Nome: " + member.getName());
        System.out.println("ID: " + member.getId());
    }

    //Method to search for a book
    public void searchBook(Book book) {
        if(book.isInLibrarian()){
            System.out.println("Livro encontrado na Biblioteca!");
        }else{
            System.out.println("Livro não encontrado na Biblioteca");
        }
    }

    //Method to return a book
    public Book returnBook(Book book) {
        if(book.isInLibrarian()){
            return book;
        }else{
            return null;
        }
    }

    //Method to delete an alert
    public void deleteAlert() {
        //Implementation to delete an alert
        System.out.println("Alert deleted.");
    }
}