import java.util.ArrayList;
class Solution {
    
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answerBuilder = new StringBuilder();
    
        for (int i=0; i<parts.length; i++) {
            StringBuilder sb = new StringBuilder();
    
            int s = parts[i][0];
            int l = parts[i][1];
    
            
            sb.append(my_strings[i].substring(s, l+1));
            
    
            answerBuilder.append(sb.toString());
        }
    
        return answerBuilder.toString();
    }
}