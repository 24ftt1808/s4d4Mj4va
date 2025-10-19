import java.util.Scanner;

public class TicTacToeWithComputer {
    private static char[][] board = new char[3][3];
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        initializeBoard();
        
        while (true) {
            // Player's turn
            displayBoard();
            playerTurn();
            
            if (checkWin('X')) {
                displayBoard();
                System.out.println("Game ended, Player Win");
                break;
            }
            
            if (isBoardFull()) {
                displayBoard();
                System.out.println("Game ended, Draw");
                break;
            }
            
            // Computer's turn
            computerTurn();
            
            if (checkWin('O')) {
                displayBoard();
                System.out.println("Game ended, CPU Win");
                break;
            }
            
            if (isBoardFull()) {
                displayBoard();
                System.out.println("Game ended, Draw");
                break;
            }
        }
    }
    
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    private static void displayBoard() {
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ");
    }
    
    private static void playerTurn() {
        System.out.println("Player's turn");
        int row, col;
        
        do {
            System.out.print("Enter a row (0,1 or 2): ");
            row = scanner.nextInt();
            System.out.print("Enter a column (0,1 or 2): ");
            col = scanner.nextInt();
        } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ');
        
        board[row][col] = 'X';
    }
    
    private static void computerTurn() {
        System.out.println("Computer's turn");
        int row, col;
        
        do {
            row = (int)(Math.random() * 3);
            col = (int)(Math.random() * 3);
        } while (board[row][col] != ' ');
        
        board[row][col] = 'O';
    }
    
    private static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        
        return false;
    }
    
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}