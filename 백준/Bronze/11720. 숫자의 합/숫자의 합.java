import java.util.*;
import java.io.*;
 
public class Main {
   public static void main(String[] args) throws IOException{      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());
        String number = br.readLine();

       String[] str = number.split("");
        int sum=0;
       for(int i=0; i<str.length; i++) {
           sum += Integer.parseInt(str[i]);
       }
       

       System.out.print(sum);
   }
}