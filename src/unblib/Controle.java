package unblib;


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

}
