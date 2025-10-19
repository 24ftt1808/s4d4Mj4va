public class ProductRating {
    public static void main(String[] args) {
        // Create and initialize the 2D array with customer ratings
        int[][] ratings = {
            {4, 5, 4},  // Customer 1
            {3, 5, 3},  // Customer 2
            {4, 5, 3},  // Customer 3
            {1, 2, 1}   // Customer 4
        };
        
        // Display header
        System.out.println("Rating\tProduct\tPackage\tDelivery");
        
        // Calculate and display average for each criterion
        System.out.print("Average ");
        for (int col = 0; col < ratings[0].length; col++) {
            double sum = 0;
            for (int row = 0; row < ratings.length; row++) {
                sum += ratings[row][col];
            }
            double average = sum / ratings.length;
            System.out.printf("%.2f\t", average);
        }
        System.out.println();
        
        // Calculate and display average for each customer
        for (int i = 0; i < ratings.length; i++) {
            double sum = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                sum += ratings[i][j];
            }
            double average = sum / ratings[i].length;
            System.out.printf("Customer %d provide the average rating %.2f\n", i + 1, average);
        }
    }
}