package tictactoe;

import java.io.BufferedReader;
import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;

/**
 *
 * @author Milan
 */
class PlayGame {
    public String playGame(String first, String second, String firstPlayer, String secondPlayer, BufferedReader br) throws IOException{
        String board[][] = new String[3][3]; //Board
        
        Set<Integer> positions = new TreeSet<>(); //For storing remaining indexes
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = (i * 3 + j + 1) +"";
            }
        }

        for(int i = 1; i < 10; i++) positions.add(i);        

        int chance = 1;

        PrintBoard pb = new PrintBoard();
        IsWinner iw = new IsWinner();

        for(int i = 0; i < 9 && !positions.isEmpty(); i++){                        
            pb.printBoard(board); //printing board
            if(chance % 2 == 1){                
                CurrentChance.currentChance(firstPlayer, positions, br, first, board);
                if(iw.isWinner(board, first)) return (firstPlayer + " is winner! and " + secondPlayer + " is Looser!");
            }else{
                CurrentChance.currentChance(secondPlayer, positions, br, second, board);
                if(iw.isWinner(board, second)) return (secondPlayer + " is winner! and " + firstPlayer + " is Looser!");
            }            
            chance++;
        }
            
        return "Match Tie";
    }
}
