class Solution {
    public long solution(long n) {
        long root = (long) Math.sqrt(n);
        
        if(n == Math.pow(root,2)){
            return (long) Math.pow(root+1, 2);
        }
        
        return -1;
    }
}

/*
Math 클래스 메서드 이용하기
sqrt(double a); // a의 제곱근(루트)을 반환 단, a는 양수 double값으로 줌
pow(double a, double b); //a의 b제곱 반환
*/