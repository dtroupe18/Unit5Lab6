/*
 * Created by Dave on 1/23/17.
 */


public class Queens {

    // n Queens
    private final  int N;
    private int[][] board;

    public Queens(int n) {
        N = n;
        board = new int[n][n];
    }

    public void printSolution(int [][] board) {
        for (int i =0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // helper function to determine if a queen can be placed
    public boolean isSafe(int [][] board, int row, int col) {
        int i, j;

        // check row for queen
        for (i = 0; i < col; i++) {
            if(board[row][i] == 1)
                return false;
        }

        // Check lower diagonal on left side
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper diagonal on left side
        for (i=row, j=col; j>=0 && i<N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    public boolean solveQueens8(int [][] board, int col) {

        // base case all queens have been placed
        if (col >= N) {
            return true;
        }

        for (int i = 0; i < N; i++) {
            // check if we can place a queen
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveQueens8(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
            }
        }

        return false;
    }

    public int[][] getBoard() {
        return board;
    }
}
