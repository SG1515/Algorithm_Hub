import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            int lt=0;
            int rt=n-1;
            
            while (true){

                if(i==lt) lt++;
                else if(i==rt) rt--;

                if(lt >= rt) break;
                
                if(arr[lt] + arr[rt] > arr[i]) {
                    rt--;
                } else if (arr[lt] + arr[rt] < arr[i]) {
                    lt++;
                } else {
                    answer++;
                    break;
                }

                
            }
        }
        
        System.out.println(answer);
        
    }
}
