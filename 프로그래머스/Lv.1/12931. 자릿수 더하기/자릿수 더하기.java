import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String tmp = "" + n;
        String[] s = tmp.split("");
        
        
        for(int i=0; i<s.length; i++) {
            answer += Integer.parseInt(s[i]);
        }
       

        return answer;
    }
}