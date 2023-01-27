package Chapter6.Challenges.Checkerboard;
public class Checkerboard {
    /**
     * create a checkerboard of size n populated by 0's and 1's and starting with a 0 in the top left.
     * for example:
     * n = 2
     * 01
     * 10
     *
     * n=5
     * 01010
     * 10101
     * 01010
     * 10101
     * 01010
     *
     * @param n the size of the checkerboard.
     * @return a checkerboard pattern of 0's and 1's as demonstrated above.
     */
    public int[][] createCheckerboard(int n){
        int[][] board = new int[n][n];
        int tile = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = tile % 2;
                tile++;
            }
            if (board[i][0] == 0) {
                tile = 1;
            } else {
                tile = 0;
            }
        }
        return board;
    }
}
