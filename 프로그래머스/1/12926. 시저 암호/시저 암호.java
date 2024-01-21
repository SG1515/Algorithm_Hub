class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int N = 0;
        
        for(int i = 0; i < s.length(); i++){
            N = s.charAt(i) + n;
            
            if(s.charAt(i) == ' '){
                answer += s.charAt(i);
            }else if(s.charAt(i) < 91 && N > 90 || N > 122){
                N -= 26;
                answer += (char) N;
            }else{
                answer += (char) N;
            }
        }
        return answer;
    }
}