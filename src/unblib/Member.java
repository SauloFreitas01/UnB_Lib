package unblib;

import java.io.Serializable;
import java.util.*;


public class Member implements Serializable{
    //Atributes
    private String name;
    private String id;
    private String email;
    private String password;
    private ArrayList bookList;
    private String tipo;
    
    
    //Constructors
    public Member(){
        
    }
    
    public Member(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }
    
    public Member(String name, String id, String email, String password, ArrayList bookList){
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.bookList = bookList;
    }    
    

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList bookList) {
        this.bookList = bookList;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    //Methods
    public void requestBook(Book book, Member member){
        if (book.getStock() > 0){
            book.setStock(book.getStock() - 1);
            book.setIssueDate(new Date());
            book.setMember(member);
            System.out.println("O livro " + book.getName() + " foi emprestado para " + member.getName());
        }else{
            System.out.println("O livro " + book.getName() + " não está disponível!");
        }
    }
    
    public void returnBook(Book book, Member member){
        book.setStock(book.getStock() + 1);
        book.setReturnDate(new Date());
        book.setMember(member);
        System.out.println("O livro " + book.getName() + " foi devolvido por " + member.getName());
    }
}