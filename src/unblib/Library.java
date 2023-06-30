package unblib;

import java.util.*;

public class Library{
    //Atributes
    //trocar arrays por listas
    //List<String> list = new ArrayList<String>();
    //list.add("1");
    private String name;
    private String address;
    List<Book> bookCatalog = new ArrayList<Book>();
    List<Paper> paperCatalog = new ArrayList<Paper>();
    List<Member> memberList = new ArrayList<Member>();
    
    
    
    //Constructor
    public Library(String name, String address, List<Book> bookCatalog, 
            List<Paper> paperCatalog, List<Member> memberList) {
        this.name = name;
        this.address = address;
        this.bookCatalog = bookCatalog;
        this.paperCatalog = paperCatalog;
        this.memberList = memberList;
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

    public List<Book> getBookCatalog() {
        return bookCatalog;
    }

    public void setBookCatalog(List<Book> bookCatalog) {
        this.bookCatalog = bookCatalog;
    }

    public List<Paper> getPaperCatalog() {
        return paperCatalog;
    }

    public void setPaperCatalog(List<Paper> paperCatalog) {
        this.paperCatalog = paperCatalog;
    }

    
    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }


    //Method to update info
    public void updateLibInfo(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Library information updated.");
    }

    public void addBook(Book newBook){
    // insert book into book catalog
        this.bookCatalog.add(newBook);
    }
    
    public void updateBook(Book book, String name,String author,int stock,String genre){
        book.setName(name);
        book.setAuthor(author);
        book.setStock(stock);
        book.setGenre(genre);
    }
    //remove book given its id
    
    public static void removeBookByName(List<Book> bookCatalog, String name) {
        // Iterate over the book catalog
        for (Book book : bookCatalog) {
            // Check if the book has the matching id
            if (book.getName().equals(name)) {
                // Remove the book from the catalog
                bookCatalog.remove(book);
                break; // Stop iterating after removing the book
            }
        }
    }
    
    //Method to request books
    //empresta livro a usuario
    public void requestBook(Book book, Member member) {
        if (book.getStock() > 0){
            book.setStock(book.getStock() - 1);
            
            book.setRequestDate(new Date());
            book.setMember(member);
            System.out.println("O livro " + book.getName() + " foi emprestado para " + member.getName());
        }else{
            System.out.println("O livro " + book.getName() + " não está disponível!");
        }
    }
 //Method to search for a book
    public boolean searchBook(Book book) {
        //metodo de checagem se livro está em catalogo
        if(book.isInLibrarian()){
            return true;
            //retorna infos do livro 
        }else{
            return false;
        }
    }

    //Method to return a book
    public void returnBook(Book book) {
       //calcula se livro foi entregue no prazo, se não gera multa.
       //subtrai livro de lista de emprestimos do usuário
       // adiciona livro ao estoque.
    }
    
    // redundante, requestBook cumpriria a função
    //Method to request papers
    public void requestPaper(Book book, Member member) {
        // usuario Teacher Adiciona obj Paper ao catalogo 
        book.setStock(book.getStock() + 1);
        book.setReturnDate(new Date());
        book.setMember(member);
        System.out.println("O livro " + book.getName() + " foi devolvido por " + member.getName());
    }

    //adds member to memberList
    public void addMember(Member newMember){
        this.memberList.add(newMember);
    }
    //Method to display member information
    public void memberInfo(Member member) {
        System.out.println("Nome: " + member.getName());
        System.out.println("ID: " + member.getId());
    }

   // method to update member
     public static void updateMember(Member member, String name, int age, String email) {
        // Update the properties of the member object
     }    
   //method to delete member 

    //Method to delete an alert
    //deprecated?
  
}