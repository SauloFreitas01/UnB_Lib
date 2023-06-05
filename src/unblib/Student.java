package unblib;


public class Student extends Member{
    //Atributes
    private String email;
    private String password;
    private Book bookList;
    
    
    //Constructors
    public Student(String name, String id, String email, String password, Book bookList) {
        super(name, id);
        this.email = email;
        this.password = password;
        this.bookList = bookList;
    }
    

    //Getters e setters for email, password and bookList
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

    
    //Methods
    public void checkoutBook() {
        // Implementation for checking out a book
    }

    public void returnBook() {
        // Implementation for returning a book
    }
}