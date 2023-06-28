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
public class Controle{
    public static boolean validadorEmail(String email){
        return email.contains("@gmail.com");
    }
    
    public static boolean validadorMatricula(String matricula){
        try{
            Integer.parseInt(matricula);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean validadorNome(String nome){
        char[] arrayChars = nome.toCharArray();

        for (char c : arrayChars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
    
    public static ArrayList<Member> lerArquivo(String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream input = new FileInputStream(nomeArquivo);
        ObjectInputStream objectInput = new ObjectInputStream(input);
        ArrayList<Member> listaUsuarios = (ArrayList<Member>)objectInput.readObject();
        return listaUsuarios;
    }
    
    public static void escreverArquivo(Object objeto, String nomeArquivo) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(nomeArquivo);
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(objeto);
        ous.close();
    }
    
    public static ArrayList<Book> lerArquivoLivros(String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream input = new FileInputStream(nomeArquivo);
        ObjectInputStream objectInput = new ObjectInputStream(input);
        ArrayList<Book> listaUsuarios = (ArrayList<Book>)objectInput.readObject();
        return listaUsuarios;
    }
    
    public static boolean verificarCredenciaisLogin(String email, String senha, ArrayList<Member> listaUsuarios){
        for (Member usuario : listaUsuarios){
            if (email.equals(usuario.getEmail()) && senha.equals(usuario.getPassword())){
                return true;
            }
        }
        return false;
    }
    
    public static ArrayList<Book> inicializarListaLivros(){
        ArrayList<Book> listaLivros = new ArrayList<>();
        
        listaLivros.add(new Book("Manual da Sinuca", "Educação", "Baianinho", 5, "Em dia"));        
        listaLivros.add(new Book("Cálculo 2", "Educação", "Ricardo F.", 8, "Em dia"));        
        listaLivros.add(new Book("Hidrografia do Brasil", "Educação", "Jorge C. L.", 3, "Em dia"));        
        
        return listaLivros;
    }
    
    public static String formatadorData(String data){ 
        String novaData = data.substring(6) + "-" + data.substring(3,5) + "-" + data.substring(0,2);
        return novaData;
    }
    
    public static boolean checkAtraso(LocalDate dataDevolucao, LocalDate dataDevolucaoCriada){
        if (dataDevolucao.isAfter(dataDevolucaoCriada)){
            return true;
        }else{
            return false;
        }
    }
}