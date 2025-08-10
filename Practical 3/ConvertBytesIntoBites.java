import java.util.Scanner;

public class ConvertBytesIntoBites {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of byte(s) to be converted: ");
        int bytes = input.nextInt();
        int bits = bytes * 8;
        System.out.println(bytes + "bytes(s) is" + bits + "bits.");

        
    }
    
}
