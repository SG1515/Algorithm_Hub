
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //스택에 인덱스를 저장하는 게 관건
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n]; 
        int[] ans = new int[n]; // 정답배열 
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        stack.push(0);
        for(int i=0; i<n; i++) {
        	while(!stack.isEmpty() && arr[stack.peek()] < arr[i] ) { // arr[0] 3 < arr[1] 5
        		ans[stack.pop()] = arr[i];
        	}
        	stack.push(i);
        }
        
        while(!stack.empty()) {
        	ans[stack.pop()] = -1;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n; i++) {
        	bw.write(ans[i]+ " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
       
    }
}