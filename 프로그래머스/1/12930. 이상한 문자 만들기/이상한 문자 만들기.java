class Solution {
    public String solution(String s) {
        String answer = "";
        
        int cnt = 0;
        String[] str = s.split("");
        
        for(String x : str){
            cnt = x.contains(" ") ? 0 : cnt+1;
            answer += cnt % 2 == 0 ? x.toLowerCase() : x.toUpperCase();
            
        }
        
   //answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 

        
      
        
        return answer;
    }
}