class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        //최대 공약수 (유클리드 호제법)
        while(min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        
        //최소 공배수 
        int gcd = n*m /max; 
        
        int[] answer = {max, gcd};
        
        return answer;
        
    }
}

/*
a. Math함수를 이용해서 입력받은 두 수 중 큰수를 max변수에 담아준다.
b. Math함수를 이요해서 입력받은 두 수 중 작은수를 min변수에 담아준다.
c. 최대공약수를 구하는 반복문을 작성해준다. 여기서 유클리드 호제법을 이용해준다.
TIP_유클리드 호제법이란?두 수의 최대공약수를 구하는 알고리즘이다.
2개의 자연수  a,b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단,a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
d. 최소공배수는 위와 같은 공식으로 구해준다.
*/