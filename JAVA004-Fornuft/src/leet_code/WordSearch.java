package leet_code;

public class WordSearch {
    boolean[][] visited;


    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (word.charAt(0) == board[i][j] && searchWord(i, j, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean searchWord(int i, int j, int index, String word, char[][] board) {


        if (index == word.length()) {
            return true;
        }



        visited[i][j] = true;

        if (searchWord(i + 1, j, index + 1, word, board) ||
                searchWord(i - 1, j, index + 1, word, board) ||
                searchWord(i, j + 1, index + 1, word, board) ||
                searchWord(i, j - 1, index + 1, word, board)) return true;

        visited[i][j] = false;
        return false;

    }
}
