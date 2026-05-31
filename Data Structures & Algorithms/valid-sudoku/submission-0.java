class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows[][] = new boolean[9][10];
        boolean cols[][] = new boolean[9][10];
        boolean boxs[][] = new boolean[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                int num = board[i][j] - '0';
                int box = (i / 3) * 3 + (j / 3);
                if (rows[i][num] || cols[j][num] || boxs[box][num])
                    return false;
                rows[i][num] = true;
                cols[j][num] = true;
                boxs[box][num] = true;
            }
        }
        return true;
    }
}
