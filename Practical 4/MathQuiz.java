import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1 = (int)(Math.random() *101);
            int num2 = (int)(Math.random() * 101);

            System.out.println("What is the sum of " + num1 + " + " + num2 + "?");
            int sumAnswer = input.nextInt();

            boolean isSumCorrect = (sumAnswer == num1 + num2);
            System.out.println(num1 + " + " + num2 + " = " + sumAnswer + " is " + isSumCorrect );

            System.out.println("What is " + num1 + " % " + num2 + " ? ");
            int modulusAnswer = input.nextInt();

            boolean isModulusCorrect = (modulusAnswer == num1 % num2);
            System.out.println(num1 + " % " + num2 + " = " + modulusAnswer + " is " + isModulusCorrect);
        }
        
    }
    
}

