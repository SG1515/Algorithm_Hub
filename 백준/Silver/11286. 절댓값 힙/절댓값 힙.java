import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> Q = new PriorityQueue<>((o1, o2) -> {
        	int first_abs = Math.abs(o1);
        	int second_abs = Math.abs(o2);
        	if(first_abs == second_abs) {
        		return o1 > o2 ? 1 : -1; // 절대값 같으면 음수 우선
        	} else {
        		return first_abs - second_abs;
        	}
        });
        for(int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	int request = Integer.parseInt(st.nextToken());
        	if(request == 0) {
        		if(Q.isEmpty()) {
        			System.out.println("0");
        		}else {
            		System.out.println(Q.poll());
        		}
        	} else {
        		Q.offer(request);
        	}
       
        }
        
    }
}