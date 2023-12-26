
class Solution {
    
    public String solution(String my_string, int n) {
        StringBuilder sb =new StringBuilder();
        char[] aArr = my_string.toCharArray();

        for(int i=my_string.length()-1; i> Math.max(-1, my_string.length() - n - 1); i--) {
            sb.append(aArr[i]);
        }

        return sb.reverse().toString();
    }
}