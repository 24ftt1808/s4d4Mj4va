import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        
      
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] == numbers[j] && numbers[i] != 0) {
                    numbers[j] = 0; // Mark duplicate as 0
                }
            }
        }
        
    
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
       
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}