package unblib;


public class Member{
    //Atributes
    private String name;
    private String id;
    
    
    //Constructor
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
    public void requestBook(){
        
    }
    
    public void returnBook(){
        
    }
}