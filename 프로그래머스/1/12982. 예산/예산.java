import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            if(budget -d[i] < 0) {
                break;
            }
            if (budget >0){
                budget -= d[i];    
            } else if (budget ==0){
                break;
            } else if (budget <0){
                break;
            }
            
            
            answer++;
        }
            
        
        
        return answer;
    }
}