class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] c = s.toCharArray();
        
        if(s.length() != 4 && s.length() != 6){
            answer = false;
        }
        
        for(int i=0; i<s.length(); i++) {
            if(Character.isAlphabetic(c[i])){
                answer = false;
            }
        }
        
        
        
        
        return answer;
    }
}