
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        boolean result = true;
        
        //입력 수열 배열만들기
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int num = 1; // 오름차순 숫자
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] >= num) { // 수열값 >= 오름차순 값 
        		while(arr[i]>= num) {
        			stack.push(num++); 
        			sb.append("+\n");
        		}
        		stack.pop(); // 같아졌으니까 꺼내고 - 
        		sb.append("-\n"); 
        		
        	} else { // 수열값 < 오름차순값 
        		int chNum = stack.pop(); //하나씩 꺼내서 탐색
        		if(chNum > arr[i]) { //현재 수열값보다 맨위의 숫자가 더 크면 break
        			System.out.println("NO");
        			result = false;
        			break;
        		}
        		sb.append("-\n");
        	}
        }
        if(result) System.out.println(sb);
    }
}