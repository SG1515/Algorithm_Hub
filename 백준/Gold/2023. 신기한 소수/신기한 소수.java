import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static boolean isPrime(int num) { // 소수판별
        if(num < 2) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i ==0){ // num이 i의 배수에 나눠지면 소수
                return false;
            }
        }
        return true; // 소수
    }

    
    static void DFS(int num, int n){
        if(n==0){
            System.out.println(num);
        } else {
            for(int i=1; i<10; i++){
                int tmp = 10 * num + i; // 1자리부터 n자리까지 숫자만들기
                if(n>0 && isPrime(tmp)){
                    DFS(tmp, n-1);
                }
            }
        }
    
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        T.DFS(0,n);


    } //end of main
}