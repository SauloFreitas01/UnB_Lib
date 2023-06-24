package unblib;

import java.util.*;


public class Teacher extends Member{
    //Atributes
    private ArrayList paperList;

    //Constructors

    public Teacher() {
        
    }

    public Teacher(String name, String id, String email) {
        super(name, id, email);
    }

    public Teacher(String name, String id, String email, String password, ArrayList bookList, ArrayList paperList) {
        super(name, id, email, password, bookList);
        this.paperList = paperList;
    }
    
    
    //Getters e setters for email and password
    /*public String getPassword() {
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
    }*/

    public ArrayList getPaperList() {
        return paperList;
    }

    public void setPaperList(ArrayList paperList) {
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