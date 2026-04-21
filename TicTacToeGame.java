import java.util.Scanner;

public class TicTacToeGame {

    // Function to print board
    static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to take player move
    static void makeMove(char[][] board, char player, Scanner sc) {
        int row, col;

        while (true) {
            System.out.print("Player " + player + ", enter row and column (0-2): ");
            row = sc.nextInt();
            col = sc.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            if (board[row][col] != '-') {
                System.out.println("Cell already occupied! Try again.");
                continue;
            }

            board[row][col] = player;
            break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create board
        char[][] board = new char[3][3];

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Print empty board
        System.out.println("Initial Board:");
        printBoard(board);

        // Player move
        char currentPlayer = 'X';
        makeMove(board, currentPlayer, sc);

        // Print updated board
        System.out.println("Updated Board:");
        printBoard(board);

        sc.close();
    }
}