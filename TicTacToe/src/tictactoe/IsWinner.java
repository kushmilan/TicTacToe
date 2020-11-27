package tictactoe;

/**
 *
 * @author Milan
 */
class IsWinner {
    public boolean isWinner(String board[][], String s){
        int count = 0;
        //For rows
        for(int i = 0; i < 3; i++){
            count = 0;
            for(int j = 0; j < 3; j++){
                if(board[i][j].equals(s)) count++;
            }
            if(count == 3) return true;
        }
        count = 0;
        
        //For columns
        for(int i = 0; i < 3; i++){
            count = 0;
            for(int j = 0; j < 3; j++){
                if(board[j][i].equals(s)) count++;
            }
            if(count == 3) return true;
        }
        count = 0;

        int i = 0, j = 0;
        while(i <= 2 && j <= 2){
            if(board[i][j].equals(s)) count++;
            i++;j++;
        }

        if(count == 3) return true;
        count = 0;

        i = 0; j = 2;
        while(i <= 2 && j >= 0){
            if(board[i][j].equals(s)) count++;
            i++;j--;
        }

        if(count == 3) return true;

        return false;
    }
}
