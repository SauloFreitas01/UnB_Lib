package unblib;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static unblib.Controle.checkAtraso;

public class Alert{
    //Atributes
    private LocalDate dataEmprestimo;    
    private LocalDate returnDate;
    private double fine;

    
    //Constructor
    public Alert(LocalDate dataEmprestimo, LocalDate returnDate, double fine) {
        this.dataEmprestimo = dataEmprestimo;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    Alert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    //Getters e setters for issueDate, member, bookName, returnDate and fine
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
    

    
    //Métodos
    public void fineCalc(LocalDate dataDevolucao){
        if(checkAtraso(dataDevolucao)){
            long dif = ChronoUnit.DAYS.between(dataDevolucao, LocalDate.now());
            
            double fine = dif * 1.5;
        }
    }
}