import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";        
        String[] tmp = s.split(" ");
        
        for(int i=0; i<tmp.length; i++){
            String tmpStr = tmp[i];
            
            if(tmp[i].length() == 0){
                answer += " ";
            }else {
                answer += tmpStr.substring(0,1).toUpperCase();
                answer += tmpStr.substring(1, tmpStr.length()).toLowerCase();
                answer += " ";
                
            }   
        }
        
        // 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
    	if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	}
        
        return answer.substring(0, answer.length()-1) ;
    }
}