import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[100000];
        for(int i = 0 ; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }

        int tmp = 0;
        for(int i=0; i<count.length; i++){
            if (tmp<count[i]){
                tmp = count[i];
            }
        }
        
        
        return tmp;
    }
}