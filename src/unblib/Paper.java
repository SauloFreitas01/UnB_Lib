package unblib;


public class Paper extends Book{
    //Atributes
    private String topic;

    
    //Constructor
    public Paper(String name, String genre, String author, int stock, String topic) {
        super(name, genre, author, stock);
        this.topic = topic;
    }

    
    //Getters and setters for topic
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}