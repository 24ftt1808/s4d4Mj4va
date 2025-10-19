import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there?");
        int num = input.nextInt();

        int[] numbers = new int[num];

        System.out.println("Enter the " + num + " numbers: ");
        for(int i = 0; i < num; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();

        for (int s = 0; s < shift; s++){
            int temp = numbers[0];
            for(int i = 1; i < num; i++){
                numbers [i - 1] = numbers[i];
            }
            numbers[num - 1] = temp;
        }

        System.out.println("The shifted arrangement is: ");
        for (int i = 0; i < num; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();




    }

}
