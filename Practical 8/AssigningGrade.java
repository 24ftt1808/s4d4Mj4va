import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
   
        System.out.println("Enter the number of students:");
        int numStudents = input.nextInt();
        
     
        int[] scores = new int[numStudents];
        char[] grades = new char[numStudents];
        
        
        System.out.println("Enter the " + numStudents + " scores");
        int bestScore = 0;
        
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }
        

        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= bestScore - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
       
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }
}