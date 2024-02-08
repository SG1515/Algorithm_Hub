import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        int leng = elements.length;
        
        for(int k=1; k<=leng; k++) { // 길이 박스
            for(int i=0; i<leng; i++) { // 길이만큼 더해서 넣기
                int sum = 0;
                for(int j=i; j<i+k; j++){
                    sum += elements[j % leng];
                }
                set.add(sum);
            }
        }
    
        return answer = set.size(); 
    }
}