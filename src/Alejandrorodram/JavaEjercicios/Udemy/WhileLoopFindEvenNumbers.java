package Alejandrorodram.JavaEjercicios.Udemy;

public class WhileLoopFindEvenNumbers {
    public static void main (String[] args){
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
        }
        System.out.println("Even numbers found: " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        if((number%2)== 0){
            return true;
        }else{
            return false;
        }
    }
}