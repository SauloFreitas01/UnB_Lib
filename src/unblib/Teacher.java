package unblib;


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
    public void checkoutBook() {
        // Implementation for checking out a book
    }

    public void returnBook() {
        // Implementation for returning a book
    }

    public void issuePaper() {
        // Implementation for issuing a paper
    }
}