import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Step 1: Create and shuffle array
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> numberList = Arrays.asList(numbers);
        Collections.shuffle(numberList);
        numberList.toArray(numbers);
        
        int chances = 10;
        boolean won = false;
         
        while (chances > 0 && !won) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guesses = new int[4];
            
    
            for (int i = 0; i < 4; i++) {
                guesses[i] = input.nextInt();
            }
            
    
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guesses[i] == numbers[i]) {
                    score++;
                }
            }
            
          
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                won = true;
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
                } else {
                    System.out.print("The actual number is ");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(numbers[i] + " ");
                    }
                    System.out.println(". You lose.");
                }
            }
        }
    }
}