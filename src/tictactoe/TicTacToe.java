

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Milan
 */
public class TicTacToe {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String newLine = System.getProperty("line.separator");

        String developer = "***Developed By Milan!***";
        String rules = "Rules: " + newLine + "Only Two players can play this game. Instead of using traditional X's and 0's " + newLine + "you can choose your own symbol in this game, which can be any character from {A - Z} or {a - z}!";

        System.out.println(developer + newLine + rules);

        Begin.beginGame();      
        br.close();
    }
    
}