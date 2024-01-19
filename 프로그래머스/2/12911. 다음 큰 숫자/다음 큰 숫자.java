class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_cnt = Integer.bitCount(n);
        int b_cnt =0;
        
        while (true){
            n++;
            b_cnt = Integer.bitCount(n);
            
            if(n_cnt == b_cnt){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}

/*
  더 나은 풀이가 없을까 하고 찾아보았더니 Integer.bitCount()라는 메소드가 존재했다. 이 메소드는 입력된 정수를 2진수로 변환한 뒤, 2진수에 포함된 1을 카운팅 해주는 메소드라고 한다. 이를 활용한 풀이는 아래이다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1. 입력받은 n의 1 개수를 저장.
        int n_cnt = Integer.bitCount(n);
        // 2. 증가하는 n의 1 개수를 저장 할 변수.
        int b_cnt = 0;
        // 3. 무한반복.
        while(true){
            // 4. n을 증가.
            n++;
            // 5. 증가된 n의 1 개수를 저장.
            b_cnt = Integer.bitCount(n);
            // 6. 일치하면, answer에 n을 담고 반복문을 빠져나온다.
            if(n_cnt == b_cnt){
                answer = n;
                break;
            }            
        }
                
        return answer;
    }
}*/