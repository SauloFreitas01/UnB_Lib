package unblib;

import java.util.*;


public class Teacher extends Member{
    //Atributes
    private String email;
    private String password;
    private Book bookList;
    private Paper paperList;

    //Constructors
    public Teacher(String name, String id, String email, String password) {
        super(name, id);
        this.email = email;
        this.password = password;
    }


    //Getters e setters for email and password
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

    
    //Methods
    public void checkoutBook(Book book, Teacher teacher) {
        if (book.getStock() > 0){
            book.setStock(book.getStock() - 1);
            book.setIssueDate(new Date());
            book.setMember(teacher);
            System.out.println("O livro " + book.getName() + " foi emprestado para " + teacher.getName());
        }else{
            System.out.println("O livro " + book.getName() + " não está disponível!");
        }
    }

    public void returnBook(Book book, Teacher teacher) {
        book.setStock(book.getStock() + 1);
        book.setReturnDate(new Date());
        book.setMember(teacher);
        System.out.println("O livro " + book.getName() + " foi devolvido por " + teacher.getName());
    }

    public void issuePaper() {
        // Implementation for issuing a paper
    }
}