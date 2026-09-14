package coding_test.solution;


import java.io.IOException;
import java.util.Scanner;

public class Main4_1 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        int count = 0;
        
        for(int i=0; i<input1.length(); i++) {
        	String[] splitArr = input1.split("");
        	if(splitArr[i].toUpperCase().equals(input2.toUpperCase())){
        		count++;
        	}
        }
        
        System.out.println(count);
    }

    
}