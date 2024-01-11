import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0; 
        int sort[] = new int[rank.length];
        
        // sort 배열 채우기
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                sort[i] = rank[i]; 
            } else {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        
        // 정렬
        // false인 값들은 뒤로 다 밀림.
        Arrays.sort(rank);
        
        // 계산
        for(int i=0; i < sort.length; i++){
            if(rank[0] == sort[i]){
                answer += i * 10000;
            } else if (rank[1] == sort[i]){
                answer += i * 100;
            } else if (rank[2] == sort[i]){
                answer += i;
            }
        }
        
        return answer;
    }
}