package unblib;


import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alert{
    //Atributes
    private LocalDate issueDate;
    private Member member;
    private String bookName;
    private LocalDate returnDate;
    private int fine;

    
    //Constructor
    public Alert(LocalDate issueDate, Member member, String bookName, LocalDate returnDate, int fine) {
        this.issueDate = issueDate;
        this.member = member;
        this.bookName = bookName;
        this.returnDate = returnDate;
        this.fine = fine;
    }
    

    //Getters e setters for issueDate, member, bookName, returnDate and fine
    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    
    //Métodos
    public void fineCal(){
        long dif = ChronoUnit.DAYS.between(issueDate, returnDate);
        double multa = 0.0;
        
        if (dif > 7){
            multa = dif * 1.0;
        }
        
        System.out.println("A multa pelo atraso de " + dif + " dias é: R$" + multa);
    }
}