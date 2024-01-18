class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        for(int i=1; i<=n; i++){
            int tmp = n;    
            int minusNum = i;
            while (tmp >= 0){
                tmp -= minusNum;    
                minusNum++;
                if(tmp == 0){
                    answer++;
                }
                if (n < 0){
                    break;
                }
            }
            
        }
        
        return answer;
    }
}