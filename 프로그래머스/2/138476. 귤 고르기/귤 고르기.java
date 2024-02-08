import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values()); //value값 list에 넣기
        Collections.sort(list, Collections.reverseOrder()); // collection으로 내림차순
        
        for(int x : list) {
            if(sum + x >= k){
                answer++;
                break;
            } else {
                sum += x; 
                answer++;
            }
        }
        
        
        
        
        return answer;
    }
}