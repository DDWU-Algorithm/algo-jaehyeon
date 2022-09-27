import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int digitNum = 1;
		int tens = 1;
		
		int total = 0;
		for (int i = 1; i <= n; i++) {
		    if (i / tens == 10) {
		        tens *= 10;
		        digitNum++;
		    }
		    total += digitNum;
		}
	    System.out.println(total);
		
		sc.close();
	}
}
