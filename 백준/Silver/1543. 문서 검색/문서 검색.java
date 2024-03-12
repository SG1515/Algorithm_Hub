import java.io.*;
import java.util.*;

public class Main{
  
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String str = br.readLine();
        
        int slen = s.length();
        int strlen = str.length();
        int count = 0;
        int idx = 0;
        
        while(idx <= slen-strlen) {
          
    	if(s.substring(idx,idx+strlen).equals(str)) {
    		idx+= strlen;
    		count++;
    	} else {
    		idx++;
    	}
        	
        }
        System.out.println(count);
    }
}