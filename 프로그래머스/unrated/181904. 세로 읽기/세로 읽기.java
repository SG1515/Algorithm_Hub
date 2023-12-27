
class Solution {
    
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        char[] mArr = my_string.toCharArray();
        
        
        for(int i=c-1; i<my_string.length(); i= m+i){
        
            sb.append(mArr[i]);
        }
        
        


        return sb.toString();
    }
}