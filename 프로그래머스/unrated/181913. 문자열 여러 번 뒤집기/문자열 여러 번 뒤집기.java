
class Solution {
    
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] qArr = my_string.toCharArray();

        for(int[] query : queries){
            int start = query[0];
            int end = query[1];

            while (start < end) {
                char temp = qArr[start];
                qArr[start] = qArr[end];
                qArr[end] = temp;

                start++;
                end--;
            }
        }

        
        return new String(qArr);
    }
}