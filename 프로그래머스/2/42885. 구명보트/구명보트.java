import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int lt = 0;
        
        for(int rt=people.length-1; rt>=lt; rt--){ //큰 사람부터
            if(people[lt] + people[rt] <= limit){
                lt++;
                answer++;
                
            }else {
                answer++;
            }
            
        }
            
        
        return answer;
    }
}