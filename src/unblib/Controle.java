package unblib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;


//Classe destinada a formatacao, validacao, serializacao e outras funcionalidades envolvendo manipulação de objetos
public class Controle {
    public static boolean validadorEmail(String email) {
        return email.contains("@gmail.com");
    }
    
    public static boolean validadorMatricula(String matricula) {
        try {
            Integer.parseInt(matricula);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean validadorNome(String nome) {
        char[] arrayChars = nome.toCharArray();

        for (char c : arrayChars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static ArrayList<Member> lerArquivo(String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream input = new FileInputStream(nomeArquivo);
        ObjectInputStream objectInput = new ObjectInputStream(input);
        ArrayList<Member> listaUsuarios = (ArrayList<Member>)objectInput.readObject();
        return listaUsuarios;
    }
    
    public static void escreverArquivo(Object objeto, String nomeArquivo) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(nomeArquivo);
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(objeto);
        ous.close();
    }
    
    public static ArrayList<Book> lerArquivoLivros(String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream input = new FileInputStream(nomeArquivo);
        ObjectInputStream objectInput = new ObjectInputStream(input);
        ArrayList<Book> listaUsuarios = (ArrayList<Book>)objectInput.readObject();
        return listaUsuarios;
    }
    
    public static boolean verificarCredenciaisLogin(String email, String senha, ArrayList<Member> listaUsuarios) {
        for (Member usuario : listaUsuarios) {
            if (email.equals(usuario.getEmail()) && senha.equals(usuario.getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    public static ArrayList<Book> inicializarListaLivros() {
        ArrayList<Book> listaLivros = new ArrayList<>();
        
        listaLivros.add(new Book("Effective Java", "Programação", "Joshua Bloch", 7));
        listaLivros.add(new Book("Game of Thrones", "Fantasia", "George R.R. Martin", 5));
        listaLivros.add(new Book("Crafting Interpreters", "Programação", "Robert Nystrom", 3));
        listaLivros.add(new Book("The Faithful Executioner", "Biografia", "Joel F. Harrington", 2));
        listaLivros.add(new Book("Introduction to Graph Theory", "Matemática", "Richard J. Trudeau", 4));
        listaLivros.add(new Book("At the Mountains of Madness", "Terror", "H.P Lovecraft", 6));
        listaLivros.add(new Book("The Black Cat", "Terror", "Edgar Allan Poe", 3));
        listaLivros.add(new Book("The Divine Comedy", "Poesia", "Dante Alighieri", 1));
        listaLivros.add(new Book("War and Peace", "Romance", "Leo Tolstoy", 2));
        listaLivros.add(new Book("The Kamarazov Brothers", "Romance", "Fyodor Dostoevsky", 5));
        
        return listaLivros;
    }
    
    public static String formatadorData(String data) { 
        String novaData = data.substring(6) + "/" + data.substring(3,5) + "/" + data.substring(0,2);
        return novaData;
    }
    
    public static boolean checkAtraso(LocalDate dataRetorno) {
        if (LocalDate.now().isAfter(dataRetorno)) {
            return true;
        } return false;
    }
    
    
    
    
}