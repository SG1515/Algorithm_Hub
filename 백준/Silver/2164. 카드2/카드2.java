import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // q 채우기 offer
        // 맨 앞을 버리고 poll
        // 맨 앞을 맨뒤로 두개를 반복 poll 값을 다시 offer 
        Queue<Integer> Q = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        for(int i=1; i<=n; i++) {
        	Q.offer(i);
        }
        
        int answer =0;
        while(!Q.isEmpty()) {
        	if(Q.size() ==1) {
        		answer = Q.poll();
        		break;
        	}
        	Q.poll();
        	int tmp = Q.poll();
        	Q.offer(tmp);
        	
        }
        
        
        System.out.println(answer);
        
    }
}