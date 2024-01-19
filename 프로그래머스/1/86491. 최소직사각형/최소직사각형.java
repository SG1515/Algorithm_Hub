import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int ltMax = 0;
        int rtMax = 0;
        for(int i=0; i< sizes.length; i++){
            int tmp_lt = Math.max(sizes[i][0], sizes[i][1]);
            int tmp_rt = Math.min(sizes[i][0], sizes[i][1]);
            ltMax = Math.max(tmp_lt, ltMax);
            rtMax = Math.max(tmp_rt, rtMax);
        }
      
        
    
        
        return rtMax * ltMax;
    }
}

/*
가로를 두 변 중에서 가장 긴 부분으로 설정하고.(모든 명함 제일 긴부분으로 눕히기)
세로를 두 변 중에서 가장 작은 부분으로 설정
그 후, 가로와 세로의 길이가 모두 들어맞게 Max(가로)와 Max(세로)를 설정하면 됨.
*/