package unblib;

import java.util.*;

public class Library{
    //Atributes
    //trocar arrays por listas
    //List<String> list = new ArrayList<String>();
    //list.add("1");
    private String name;
    private String address;
    private Book[] bookCatalog;
    private Paper[] paperCatalog;
    private Member[] memberList;
    private Alert[] issueList;
    private Alert[] lateList;
    
    
    //Constructor
    public Library(String name, String address, Book[] bookCatalog, 
            Paper[] paperCatalog, Member[] memberList, Alert[] issueList,Alert[] lateList) {
        this.name = name;
        this.address = address;
        this.bookCatalog = bookCatalog;
        this.paperCatalog = paperCatalog;
        this.memberList = memberList;
        this.issueList = issueList;
        this.lateList = lateList;
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

    public Book[] getBookCatalog() {
        return bookCatalog;
    }

    public void setBookCatalog(Book[] bookCatalog) {
        this.bookCatalog = bookCatalog;
    }

    public Paper[] getPaperCatalog() {
        return paperCatalog;
    }

    public void setPaperCatalog(Paper[] paperCatalog) {
        this.paperCatalog = paperCatalog;
    }

    
    
    public Member[] getMemberList() {
        return memberList;
    }

    public void setMemberList(Member[] memberList) {
        this.memberList = memberList;
    }
    public Alert[] getIssueList() {
        return issueList;
    }

    public void setIssueList(Alert[] issueList) {
        this.issueList = issueList;
    }

    public Alert[] getLateList() {
        return lateList;
    }

    public void setLateList(Alert[] lateList) {
        this.lateList = lateList;
    }
    

    //Method to update info
    public void updateInfo(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Library information updated.");
    }

    public void addBook(Book book){
    // insert book into book catalog
    }
    
    
    //Method to issue books
    //empresta livro a usuario
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
 //Method to search for a book
    public void searchBook(Book book) {
        //metodo de checagem se livro está em catalogo
        if(book.isInLibrarian()){
            System.out.println("Livro encontrado na Biblioteca!");
            //retorna infos do livro 
        }else{
            System.out.println("Livro não encontrado na Biblioteca");
        }
    }

    //Method to return a book
    public void returnBook(Book book) {
       //calcula se livro foi entregue no prazo, se não gera multa.
       //subtrai livro de lista de emprestimos do usuário
       // adiciona livro ao estoque.
    }
    
    // redundante, issueBook cumpriria a função
    //Method to issue papers
    public void issuePaper(Book book, Member member) {
        // usuario Teacher Adiciona obj Paper ao catalogo 
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

   

    //Method to delete an alert
    public void deleteAlert() {
        //Implementation to delete an alert
        System.out.println("Alert deleted.");
    }
}