class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(str[0]);
        for(int i=1; i<str.length; i++){
            n = Integer.parseInt(str[i]);
            if (min > n) min = n;
            if (max < n) max = n;
            
        }
        
        answer = min + " " + max;

        
        return answer;
    }
}