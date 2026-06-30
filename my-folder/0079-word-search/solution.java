class Solution {
    
    int ROWS,COLS;
    
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;

        for(int r=0;r<ROWS;r++) {
            for(int c=0;c<COLS;c++) {
                if(exist(r,c,board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exist(int row, int col, char[][] board, String word, int index) {
        if(index==word.length()) {
            //we matched all chars in the word on the board;
            return true;
        } 

        if(row<0 || col<0 || row>=ROWS || col>=COLS) {
            return false;
        }

        if (board[row][col]!=word.charAt(index)) {
            return false;
        }

        //one char matches. mark that character as seen, save that char, and then move forward with the next char 

        char saved = board[row][col];
        board[row][col] = '0';

        index++;

        boolean wordExists = exist(row+1,col,board, word, index)
        || exist(row,col+1,board, word, index)
        || exist(row-1,col,board, word, index)
        || exist(row,col-1,board, word, index);

        if (wordExists) {
            return true;
        }

        board[row][col] = saved;

        return false;
    }
}
