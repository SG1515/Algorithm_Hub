class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int i1 = overwrite_string.length();
        int i2 = my_string.length();
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+i1, i2);
        
        
        return answer;
    }
}