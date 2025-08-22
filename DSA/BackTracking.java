package DSA;

import java.util.ArrayList;
import java.util.List;

class BackTracking {

    static void printPermutation(String str, String permutations) {

        if (str.length() == 0) {
            System.out.println(permutations);
            return;
        }

        for (int j = 0; j < str.length(); j++) {

            char curr = str.charAt(j);
            String newStr = str.substring(0, j) + str.substring(j + 1);

            printPermutation(newStr, permutations + curr);

        }

    }

    // N-Queens

    static void saveBoard(char[][] board, List<List<String>> allBoards) {

        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    static boolean isSafe(int row, int col, char[][] board) {

        // Horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper Left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Upper Right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Lower Left
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Lower Right
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;

    }

    static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }

    }

    static List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;

    }

    public static void main(String[] args) {

        // printPermutation("abc", "");
        
        // N-Queens

        System.out.println(solveNQueens(4)); 

        /*
         * // chess board
         * 
         * // List<List<String>> solutions = solveNQueens(4);
         * 
         * // int n = 4; // board size
         * // for (int s = 0; s < solutions.size(); s++) {
         * // List<String> board = solutions.get(s);
         * // System.out.println("Solution " + (s + 1) + ":");
         * 
         * // // Print top border
         * // System.out.println("  " + "-".repeat(n * 4 + 1));
         * 
         * // for (int r = 0; r < board.size(); r++) {
         * // String row = board.get(r);
         * // System.out.print("  |");
         * // for (int c = 0; c < row.length(); c++) {
         * // System.out.print(" " + row.charAt(c) + " |");
         * // }
         * // System.out.println();
         * // System.out.println("  " + "-".repeat(n * 4 + 1));
         * // }
         * // System.out.println();
         * // }
         * 
         * // grid style
         * 
         * List<List<String>> solutions = solveNQueens(4);
         * 
         * System.out.println("[");
         * for (int s = 0; s < solutions.size(); s++) {
         * List<String> board = solutions.get(s);
         * System.out.println("  [");
         * for (int r = 0; r < board.size(); r++) {
         * String row = board.get(r);
         * System.out.print("    [ ");
         * for (int c = 0; c < row.length(); c++) {
         * System.out.print(row.charAt(c));
         * if (c < row.length() - 1) {
         * System.out.print(" , ");
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println("]" + (r < board.size()-1 ? "," : ""));
         * }
         * System.out.println("  ]" + (s < solutions.size()-1 ? "," : ""));
         * }
         * System.out.println("]");
         * 
         */ 
        

        



    }
}
