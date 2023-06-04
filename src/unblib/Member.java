/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unblib;

/**
 *
 * @author saulo
 */
public class Member {
    private String name;
    private String id;


    public void requestBook(){};

    public  void returnBook(){};

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
}