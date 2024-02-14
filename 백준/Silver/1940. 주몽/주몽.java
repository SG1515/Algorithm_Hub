import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int answer =0;
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        int lt =0;    
        for(int rt=1; rt<n; rt ++){
            lt = 0; 
            while(lt < rt){
                if(m==arr[lt]+arr[rt]) {
                  answer++; 
                } 
                lt++;
            }
        }
        System.out.println(answer);
    }
}
