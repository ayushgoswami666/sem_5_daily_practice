// Last updated: 10/17/2025, 4:55:49 PM
class Solution {
    public int totalNQueens(int n) {
        List<List<String>> ll = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        Queen(board, ll, 0, n);
        return ll.size();
    }

    public static void Queen(boolean[][] board, List<List<String>> ll, int row, int n) {
        if (row == n) {
            ll.add(display(n, board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isitsafe(row, col, board)) {
                board[row][col] = true;
                Queen(board, ll, row + 1, n);
                board[row][col] = false;
            }
        }
    }

    public static boolean isitsafe(int row, int col, boolean[][] board) {
        // up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) return false;
        }

        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }

    public static List<String> display(int n, boolean[][] board) {
        List<String> l1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                str.append(board[i][j] ? 'Q' : '.');
            }
            l1.add(str.toString());
        }
        return l1;
    }
}


        
    
