package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Homework2 {
    
     public static void main(String[] args) {

        try {
            System.out.println(divide(6,0));
        } catch (TrainingException ex) { // перехватываем TrainingException
            Logger.getLogger(TrainingException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   // метод деления двух чисел
    private static double divide(int a, int b) throws TrainingException {
        try {
            
            // один вариант решения
            if (b==0) throw new TrainingException("Argument can not be 0!");
            
            return a / b;
            
            // второе решение
        } catch (ArithmeticException ex) {// если будет ошибка деления на ноль (или любая ошибка ArithmeticException)
            throw new TrainingException(ex.getMessage());// так делать не рекомендуется!!! но для решения дом.задания так можно сделать
        } catch (Exception ex) {
            Logger.getLogger(Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    

}

class TrainingException extends Exception /*ArithmeticException*/{

    public TrainingException() {
        super();
    }

    public TrainingException(String s) {
        super(s);
    } 
}

