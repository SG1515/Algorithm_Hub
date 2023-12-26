
class Solution {
    
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int firNum = 0;
        String[] tmp = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            tmp[i] = my_string.substring(0, firNum+1);
            firNum++;
        }
        int count =0;
        for(int i=0; i<tmp.length; i++){
            if(is_prefix.equals(tmp[i])){
                count++;
            }
        }

        return count;
    }
}