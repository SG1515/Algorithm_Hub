import java.util.ArrayList;
class Solution {
    
    public int[] solution(int n, int k) {
        int arrSize = n/k;
        int[] answer = new int[arrSize];
        

        for(int i=1; i<=n/k; i++){
            answer[i-1] = k * i ; 
        }
        
        
        return answer;
    }
}