import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder("");
        int maxLeng = number.length() - k; //7-3 =4
        int start = 0;
        
        while (start < number.length() && answer.length() != maxLeng){
            int leftNum = k + answer.length() + 1; //+1빼서 answer에 넣어주기
            int max =0;
            for(int i=start; i<leftNum; i++){
                if(number.charAt(i) - '0' > max ){
                    max = number.charAt(i) - '0';
                    start = i+1; // 숫자 answer추가하고 다음수부터 시작하기
                }                
            }
            answer.append(Integer.toString(max));
        }
        
        return answer.toString();
    }
}