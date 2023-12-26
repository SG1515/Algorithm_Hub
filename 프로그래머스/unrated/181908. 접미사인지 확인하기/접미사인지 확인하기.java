
class Solution {
    
    public int solution(String my_string, String is_suffix) {
        int answer =0 ;

        String[] tmp = new String[my_string.length()] ;
        int num =0;
        for(int i=0; i<my_string.length(); i++){
            tmp[i] = my_string.substring(num, my_string.length());            num++;
        }
        
        for(int i=0; i<my_string.length(); i++){
            if (is_suffix.equals(tmp[i])){
                answer++;
            }
        }

        return answer;
    }
}