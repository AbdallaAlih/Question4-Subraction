
package vu.subtraction;
/**
  @author ABDULLAHI
 */
import java.util.Scanner;
import java.util.Random;

public class Subtraction {
       public static void main(String[] args) {
        
        Random random = new Random();
        int number1 = random.nextInt(10); 
        int number2 = random.nextInt(10); 

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
       
        if (answer == number1 - number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2) + ".");
        }
        scanner.close();
    }
}

