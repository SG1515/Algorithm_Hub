class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] s = num_str.split("");
        
        char[] c = num_str.toCharArray();
        for(int i=0; i<c.length; i++){
            answer += Integer.parseInt(s[i]);
        }
        return answer;
    }
}