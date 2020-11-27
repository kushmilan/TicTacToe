package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Milan
 */
class Begin {
    public static void beginGame() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first player's name: ");
        String firstPlayer = br.readLine();
        System.out.print("Enter second player's name: ");
        String secondPlayer = br.readLine();
        System.out.print(firstPlayer + " choose your symbol: ");
        String first = br.readLine();
        System.out.print(secondPlayer + " choose your symbol: ");
        String second = br.readLine();
        PlayGame pg = new PlayGame();
        System.out.print(pg.playGame(first, second, firstPlayer, secondPlayer, br));
    }

}
