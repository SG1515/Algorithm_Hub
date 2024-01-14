import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        int half = s.length() / 2;
        
        if(s.length() % 2 == 0){
            // 가운데 두글자 가져오기
            //first index ~ last index -1 
            answer = s.substring( half-1, half+1 );
        } else {
            
            answer =  String.valueOf(c[s.length()/2]);
        }
        
        
        return answer;
    }
}