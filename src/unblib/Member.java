package unblib;

import java.util.*;


public class Member{
    //Atributes
    private String name;
    private String id;
    
    
    //Constructors
    public Member(){
        
    }
    
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
    

    // Getters and Setters for name and id
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