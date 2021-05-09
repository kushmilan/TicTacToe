

/**
 *
 * @author Milan
 */
class PrintBoard {
    public void printBoard(String board[][]){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(j < 2) System.out.print(board[i][j] + " | ");
                else System.out.print(board[i][j]);
            }        
            System.out.println();
            if(i < 2) System.out.println("----------");
        }
    }
}
