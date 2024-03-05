
import java.io.*;
import java.util.*;

public class Main{
    static int[] arr; 
    static String s, answer;
    static int end;
    static int count;
    public static void DFS(int v) {
    	
    	if (v < end) {
    		s += "" + arr[v];
        	DFS(v+1);	
    	
    	}
    		
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        end = 8;
        arr = new int[end];
        for(int i=0; i<end; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        answer = "";
        
        DFS(0);
        s = s.substring(4,end+4);
   
        
        if(s.equals("12345678")){
            answer = "ascending";
        } else if(s.equals("87654321")) {
            answer = "descending";
        } else {
        	
            answer = "mixed";
        }
        
        System.out.println(answer);
    }   
}