import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printBoard(board);

        while (true) {
            userMove(board);
            printBoard(board);

            if (checkWinner(board, 'X')) {
                System.out.println("You win! Congratulations!");
                break;
            }

            if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                break;
            }

            computerMove(board);

            if (checkWinner(board, 'O')) {
                System.out.println("Computer wins! Better luck next time!");
                break;
            }

            if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void userMove(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.println("Enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (!isValidMove(board, row, col));
        board[row][col] = 'X';
    }

    private static void computerMove(char[][] board) {
        // First, check if the computer can win
        if (makeWinningMove(board, 'O')) {
            printBoard(board);
            return;
        }

        // Second, block the user from winning
        if (blockUserWinningMove(board, 'X', 'O')) {
            printBoard(board);
            return;
        }

        // Third, prioritize the center and corners
        int[] priorityMoves = {1, 1, 0, 2, 0, 0, 2, 2, 0, 2, 2, 1, 2, 0, 1, 0, 0, 1, 2};
        for (int i = 0; i < priorityMoves.length; i += 2) {
            int row = priorityMoves[i];
            int col = priorityMoves[i + 1];
            if (isValidMove(board, row, col)) {
                board[row][col] = 'O';
                printBoard(board);
                return;
            }
        }

        // Finally, make a random move
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!isValidMove(board, row, col));
        board[row][col] = 'O';
        printBoard(board);
    }

    private static boolean makeWinningMove(char[][] board, char symbol) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == ' ') ||
                    (board[i][1] == symbol && board[i][2] == symbol && board[i][0] == ' ') ||
                    (board[i][0] == symbol && board[i][2] == symbol && board[i][1] == ' ')) {
                board[i][2] = symbol;
                return true;
            }

            if ((board[0][i] == symbol && board[1][i] == symbol && board[2][i] == ' ') ||
                    (board[1][i] == symbol && board[2][i] == symbol && board[0][i] == ' ') ||
                    (board[0][i] == symbol && board[2][i] == symbol && board[1][i] == ' ')) {
                board[2][i] = symbol;
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == ' ') ||
                (board[1][1] == symbol && board[2][2] == symbol && board[0][0] == ' ') ||
                (board[0][0] == symbol && board[2][2] == symbol && board[1][1] == ' ')) {
            board[2][2] = symbol;
            return true;
        }

        if ((board[0][2] == symbol && board[1][1] == symbol && board[2][0] == ' ') ||
                (board[1][1] == symbol && board[2][0] == symbol && board[0][2] == ' ') ||
                (board[0][2] == symbol && board[2][0] == symbol && board[1][1] == ' ')) {
            board[2][0] = symbol;
            return true;
        }

        return false;
    }

    private static boolean blockUserWinningMove(char[][] board, char userSymbol, char computerSymbol) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == userSymbol && board[i][1] == userSymbol && board[i][2] == ' ') ||
                    (board[i][1] == userSymbol && board[i][2] == userSymbol && board[i][0] == ' ') ||
                    (board[i][0] == userSymbol && board[i][2] == userSymbol && board[i][1] == ' ')) {
                board[i][2] = computerSymbol;
                return true;
            }

            if ((board[0][i] == userSymbol && board[1][i] == userSymbol && board[2][i] == ' ') ||
                    (board[1][i] == userSymbol && board[2][i] == userSymbol && board[0][i] == ' ') ||
                    (board[0][i] == userSymbol && board[2][i] == userSymbol && board[1][i] == ' ')) {
                board[2][i] = computerSymbol;
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == userSymbol && board[1][1] == userSymbol && board[2][2] == ' ') ||
                (board[1][1] == userSymbol && board[2][2] == userSymbol && board[0][0] == ' ') ||
                (board[0][0] == userSymbol && board[2][2] == userSymbol && board[1][1] == ' ')) {
            board[2][2] = computerSymbol;
            return true;
        }

        if ((board[0][2] == userSymbol && board[1][1] == userSymbol && board[2][0] == ' ') ||
                (board[1][1] == userSymbol && board[2][0] == userSymbol && board[0][2] == ' ') ||
                (board[0][2] == userSymbol && board[2][0] == userSymbol && board[1][1] == ' ')) {
            board[2][0] = computerSymbol;
            return true;
        }

        return false;
    }

    private static boolean isValidMove(char[][] board, int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            return true;
        } else {
            System.out.println("Invalid move. Try again.");
            return false;
        }
    }

    private static boolean checkWinner(char[][] board, char symbol) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}