import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //card count
        int m = Integer.parseInt(st.nextToken()); //max number
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){ 
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
          
        int result = 0;
        for(int k=0; k<n-2; k++){
            for(int j=k+1; j<n-1; j++){
                for(int i=j+1; i<n; i++){
                    
                    int max = arr[i] + arr[j] + arr[k];
                    if(m == max) {
                        result = max;
                        break;
                        
                    }
                    if (result < max && max < m){
                        result = max;
                    }
                }
            }
        }          
        
        System.out.println(result);
    }
}