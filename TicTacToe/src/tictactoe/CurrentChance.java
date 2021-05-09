package tictactoe;

import java.io.BufferedReader;
import java.util.Set;
import java.io.IOException;

/**
 *
 * @author Milan
 */
class CurrentChance {
    public static void currentChance(String player, Set<Integer> positions, BufferedReader br, String symbol, String[][] board) throws IOException{
        ValidPosition vp = new ValidPosition();
        UpdateBoard ub = new UpdateBoard();
        System.out.println(player + " choose a position from options : " + positions); //for showing remaining positions             
        int pos = vp.validPosition(positions, br);                
        positions.remove(pos); //Remove filled position from position set
        ub.updateBoard(board, pos, symbol);
    }
}
