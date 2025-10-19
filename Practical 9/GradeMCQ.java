import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create 2D array with student answers
        char[][] studentAnswers = {
            {'A', 'B', 'C', 'D', 'A', 'B'},  // Student 1
            {'C', 'D', 'D', 'A', 'B', 'D'},  // Student 2
            {'D', 'D', 'A', 'B', 'B', 'A'},  // Student 3
            {'C', 'A', 'D', 'A', 'B', 'C'}   // Student 4
        };
        
       
        char[] answerKey = new char[6];
        System.out.println("Enter the key to the MCQ:");
        String input = scanner.nextLine();
        
      
        String[] keys = input.split(" ");
        for (int i = 0; i < keys.length && i < answerKey.length; i++) {
            answerKey[i] = keys[i].charAt(0);
        }
        
        // Grade each student
        for (int i = 0; i < studentAnswers.length; i++) {
            int correctCount = 0;
            
            // Compare each answer with the key
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (studentAnswers[i][j] == answerKey[j]) {
                    correctCount++;
                }
            }
            
            // Determine pass/fail and display result
            String result = (correctCount >= 3) ? "passed" : "failed";
            System.out.printf("Student %d's correct count is %d. Therefore, he/she %s the test.\n", 
                             i, correctCount, result);
        }
        
        scanner.close();
    }
}
