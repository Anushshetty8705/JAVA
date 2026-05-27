import java.util.*;

public class rec {

    public static void SaveSol(char[][] board, List<List<String>> solboards) {

        List<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'q')
                    row += 'q';
                else
                    row += '.';
            }
            System.out.println(row);
            solution.add(row);
        }
        solboards.add(solution);

    }

    public static void PlacerFunction(char[][] board, List<List<String>> solboards, int col) {
        if (col == board.length) {
            SaveSol(board, solboards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'q';
                PlacerFunction(board, solboards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static Boolean isSafe(char[][] board, int row, int col) {

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'q')
                return false;
            if (board[i][col] == 'q')
                return false;
        }

        // upper left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'q')
                return false;
        }

        // upper right
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {   // CHANGED
            if (board[r][c] == 'q')
                return false;
        }

        // lower left
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {   // CHANGED
            if (board[r][c] == 'q')
                return false;
        }

        // lower right
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {   // CHANGED
            if (board[r][c] == 'q')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        List<List<String>> solboards = new ArrayList<>();
        int n = 5;
        char[][] board = new char[n][n];

       

        PlacerFunction(board, solboards, 0);
        // System.out.println(solboards);
    }
}
// time complexity n^n