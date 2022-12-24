import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //n과 m 입력받기
        long n = Long.parseLong(st.nextToken());  
        long m = Long.parseLong(st.nextToken());
        System.out.print(Math.abs(n-m));  //n - m을 절대값을 한 값을 출력하면 된다
    }
}