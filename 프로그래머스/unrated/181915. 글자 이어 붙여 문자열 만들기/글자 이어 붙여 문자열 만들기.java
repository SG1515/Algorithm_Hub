
class Solution {
    
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] cArr = my_string.toCharArray();
        
        String s = "";
        for (int i =0; i<index_list.length; i++){
            s += cArr[index_list[i]];
        }

        return s;
    }
}