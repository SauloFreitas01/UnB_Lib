package unblib;


import java.util.*;

public class Alert{
    //Atributes
    private Date issueDate;
    private Member member;
    private String bookName;
    private Date returnDate;
    private int fine;

    
    //Constructor
    public Alert(Date issueDate, Member member, String bookName, Date returnDate, int fine) {
        this.issueDate = issueDate;
        this.member = member;
        this.bookName = bookName;
        this.returnDate = returnDate;
        this.fine = fine;
    }
    

    //Getters e setters for issueDate, member, bookName, returnDate and fine
    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
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

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    
    //Métodos
    public void fineCal() {
        // Calculate the fine logic goes here
    }

    public void viewAlert() {
        // Display the alert details logic goes here
    }
}