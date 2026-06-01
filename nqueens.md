##  Save solution function
```java
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
        solution.add(row);
    }
    solboards.add(solution);
}
```
## BackTracking Function
```java
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
```
## Safe Square Function
```java
public static Boolean isSafe(char[][] board, int row, int col) {

    // Check row and column
    for (int i = 0; i < board.length; i++) {
        if (board[row][i] == 'q')
            return false;
        if (board[i][col] == 'q')
            return false;
    }

    // Upper left diagonal
    for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
        if (board[r][c] == 'q')
            return false;
    }

    // Upper right diagonal
    for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
        if (board[r][c] == 'q')
            return false;
    }

    // Lower left diagonal
    for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
        if (board[r][c] == 'q')
            return false;
    }

    // Lower right diagonal
    for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
        if (board[r][c] == 'q')
            return false;
    }

    return true;
}
```
### Time complexity 
```text n^n  as n queens has n ways to pick```