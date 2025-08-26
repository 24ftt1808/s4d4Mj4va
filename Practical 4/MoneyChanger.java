import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter 1 to convert bnd to rm and 2 to convert rm to bnd: ");
            int choice = input.nextInt();

            System.out.print("Please enter the amount you want to convert: $");
            double amount = input.nextDouble();

            double result;
            if (choice == 1) {
                result = amount * 3;
            } else {
                result = amount / 3;
            }

            System.out.printf("Your change now is $%.2f\n" ,result);
        }







        
    }
    
}
