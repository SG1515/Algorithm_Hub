
class Solution {
    
    public String solution(int q, int r, String code) {
        String answer;
        StringBuilder sb = new StringBuilder();

        for(int i=r; i<code.length(); i+=q){
            sb.append(code.charAt(i));
        }

        answer = sb.toString();
        return answer;
    }
}