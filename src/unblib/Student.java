package unblib;

import java.util.*;

public class Student extends Member{
    //Constructors
    public Student(){
        
    }

    public Student(String name, String id, String email, String password, ArrayList bookList){
        super(name, id, email, password, bookList);
    }
    

    //Getters e setters for email, password and bookList
    /*public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Book getBookList(){
        return bookList;
    }

    public void setBookList(Book bookList){
        this.bookList = bookList;
    }*/

    
    //Methods
    public void checkoutBook(Book book, Student student){
        if (book.getStock() > 0){
            book.setStock(book.getStock() - 1);
            book.setIssueDate(new Date());
            book.setMember(student);
            System.out.println("O livro " + book.getName() + " foi emprestado para " + student.getName());
        }else{
            System.out.println("O livro " + book.getName() + " não está disponível!");
        }
    }

    public void returnBook(Book book, Student student){
        book.setStock(book.getStock() + 1);
        book.setReturnDate(new Date());
        book.setMember(student);
        System.out.println("O livro " + book.getName() + " foi devolvido por " + student.getName());
    }
}