package unblib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    public static boolean verificarCredenciaisLogin(String email, String senha, ArrayList<Member> listaUsuarios) {
        for (Member usuario : listaUsuarios) {
            if (email.equals(usuario.getEmail()) && senha.equals(usuario.getPassword())) {
                return true;
            }
        }
        return false;
    }

}