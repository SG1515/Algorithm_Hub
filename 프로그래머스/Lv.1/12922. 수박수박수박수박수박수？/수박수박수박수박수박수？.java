class Solution {
    public String solution(int n) {
        String answer = "";
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                answer += "수";
            } else {
                answer += "박";
            }
        }
        
        
        return answer;
    }
}