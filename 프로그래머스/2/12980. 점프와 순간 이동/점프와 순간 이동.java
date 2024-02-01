import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int tmp = n;
        
        while (tmp != 0){
            if(tmp % 2 == 1 || tmp == 1){
                ans++;
                tmp = tmp -1;
            }else {
                tmp /= 2;
            }
        }
        
        return ans;
    }
}