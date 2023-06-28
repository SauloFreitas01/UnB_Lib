package unblib;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Book implements Serializable{
    //Atributes
    private String name;
    private String genre;
    private String author;
    private int stock;
    private Date issueDate;
    private Date returnDate;    
    private boolean inLibrarian;
    private Member member;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String status;

    
    //Constructors
    public Book(){
        
    }
    
    public Book(String name, String genre, String author, int stock) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.stock = stock;
        this.status = "Em dia";
    }
    
    public Book(String name, Member member, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.name = name;
        this.member = member;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = "Em dia";
    }
    

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public boolean isInLibrarian() {
        return inLibrarian;
    }

    public void setInLibrarian(boolean inLibrarian) {
        this.inLibrarian = inLibrarian;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}