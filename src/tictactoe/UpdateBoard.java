

/**
 *
 * @author Milan
 */
class UpdateBoard {
    public void updateBoard(String board[][], int pos, String initial){
        pos--;
        board[pos / 3][pos % 3] = initial;
        return;
    }
}
