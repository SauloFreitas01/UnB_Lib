/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unblib;

/**
 *
 * @author saulo
 */
public class Paper extends Book {
    private String topic;

    public Paper(String name, String author, int stock, String genre, String topic) {
        super(name, author, stock, genre);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}