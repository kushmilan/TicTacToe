package tictactoe;

import java.io.BufferedReader;
import java.util.Set;
import java.io.IOException;

/**
 *
 * @author Milan
 */
class ValidPosition {
    public int validPosition(Set<Integer> positions, BufferedReader br) throws IOException{
        int pos = 0;
        while (!positions.contains(pos)) { // For taking only integer as input
            String temp = br.readLine();
            while(!temp.chars().allMatch( Character::isDigit )){
                System.out.println("Please enter a valid integer number!");
                temp = br.readLine();
            }
            pos = Integer.parseInt(temp);
            
            if (!positions.contains(pos)) { // For handling valid input from user
                if(pos > 9 || pos < 1){
                    System.out.println("Please choose a valid position, position " + pos + " is out of range.");
                }else{
                    System.out.println("Please choose a valid position, position " + pos + " is already filled.");
                }
            } 
        }
        return pos;
    }  
}
