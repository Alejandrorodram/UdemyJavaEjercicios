package Alejandrorodram.JavaEjercicios.Udemy.ControlFlowMethods;

public class PrintFactorsOfNumber {
    public static void printFactors(int number){
        if(number<1) System.out.print("Invalid Value");
        for(int i=1; i<=number; i++){
            if(number%i==0) System.out.print(i + " ");
        }
    }
}