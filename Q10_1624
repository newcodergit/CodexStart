/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link:  https://cses.fi/paste/252edefca366679c70c2d0/
*/
import java.util.Scanner;
 
public class Main {
    private static final int SIZE = 8;
    private static int count = 0;
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            board[i] = scanner.next().toCharArray();
        }
 
        solveNQueens(board, 0);
        System.out.println(count);
    }
 
    private static boolean isSafe(char[][] board, int row, int col) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
 
        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
 
        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < SIZE; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
 
        return true;
    }
 
    private static void solveNQueens(char[][] board, int row) {
        if (row == SIZE) {
            count++;
            return;
        }
 
        for (int col = 0; col < SIZE; col++) {
            if (board[row][col] == '.' && isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solveNQueens(board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }
}
