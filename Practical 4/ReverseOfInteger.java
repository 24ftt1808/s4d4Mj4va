import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer between 100 and 999: ");
            int integer = input.nextInt();

            int hundreds = integer / 100;
            int tens = (integer / 10) % 10;
            int units = integer % 10;

            int reversed = units * 100 + tens  * 10 + hundreds;

            System.out.println("The reverse of " + integer + " is " + reversed);
        }





        
        
    }
    
}
