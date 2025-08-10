import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your target amount? $");
        double target = input.nextDouble();

        System.out.print("How many month(s) to reach your goal? ");
        int months = input.nextInt();

        double perDay = target / (months * 30);
        System.out.printf("The amount you need to save per day is $%.2f" , perDay);
    }
    
}
