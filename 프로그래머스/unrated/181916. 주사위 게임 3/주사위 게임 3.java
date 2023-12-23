import java.util.ArrayList;
import java.util.Arrays; 

class Solution {
    
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        int result = 0; 
        if (dice[0] == dice[3])
            result = 1111 * dice[0];
            else if(dice[0] == dice[2])
            result = (int)Math.pow(10 * dice[0] + dice[3],2);
            else if(dice[1] == dice[3])
            result = (int)Math.pow(10 * dice[1] + dice[0],2);
            else if(dice[0] == dice[1] && dice[2] == dice[3])
            result = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
            else if(dice[0] == dice[1])
            result = dice[2] * dice[3];
            else if(dice[1] == dice[2])
            result = dice[3] * dice[0];
            else if(dice[2] == dice[3])
            result = dice[0] * dice[1];
            else
            result = dice[0];





        return result;

        
        
        
    }
}