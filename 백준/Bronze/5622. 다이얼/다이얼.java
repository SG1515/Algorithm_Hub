import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int count = 0; //시간 카운트
		int k = S.length(); //총 단어의 길이
		
		for(int i = 0; i < k; i++) { //알파벳 갯수만큼 루프
			
			switch(S.charAt(i)) {
			case 'A' : 	case 'B' : case 'C' :
				count += 3;
				break;
			case 'D' : 	case 'E' : case 'F' :
				count += 4;
				break;
			case 'G' : 	case 'H' : case 'I' :
				count += 5;
				break;
			case 'J' : 	case 'K' : case 'L' :
				count += 6;
				break;
			case 'M' : 	case 'N' : case 'O' :
				count += 7;
				break;
			case 'P' : 	case 'Q' : case 'R' : case 'S' :
				count += 8;
				break;
			case 'T' : 	case 'U' : case 'V' :
				count += 9;
				break;
			case 'W' : 	case 'X' : case 'Y' : case 'Z':
				count += 10;
				break;
			}
		}
		System.out.println(count);
		
		
		

	}

}
