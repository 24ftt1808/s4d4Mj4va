import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Generate random number between 100 and 999
        int randomNumber = (int)(Math.random() * 900) + 100;
        
        // Get user input
        System.out.print("Enter the reverse of " + randomNumber + ": ");
        int userInput = input.nextInt();
        
        // Validate if user entered a 3-digit number
        if (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + randomNumber + ": ");
            userInput = input.nextInt();
        }
        
        // Reverse the original number
        int reversedNumber = reverse(randomNumber);
        
        // Check if it's a palindrome
        boolean isPalindrome = isPalindrome(userInput, reversedNumber);
        
        System.out.println("The digit " + userInput + " is palindrome of " + randomNumber + " is " + isPalindrome + ".");
        
        input.close();
    }
    
    // Method to reverse a number
    public static int reverse(int number) {
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        return reversed;
    }
    
    // Method to check if user input matches the reversed number
    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }
}