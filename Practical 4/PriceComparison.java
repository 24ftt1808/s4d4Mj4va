import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the price of the 1st package:" );
            double price1 = input.nextDouble();

            System.out.print("Please enter the weight of the 1st package: ");
            double weight1 = input.nextDouble();

            System.out.print("Please enter the price of the 2nd package: ");
            double price2 = input.nextDouble();

            System.out.print("Please enter the weight of the 2nd package: ");
            double weight2 = input.nextDouble();

            double value1 = price1 / weight1;
            double value2 = price2 / weight2;

            if(value1 > value2) {
                System.out.println("it is worth more to buy the 1st package!");
            }else{
                System.out.println("It is worth more to buy the 2nd package!");
            }
        }

        
    }
    
}
