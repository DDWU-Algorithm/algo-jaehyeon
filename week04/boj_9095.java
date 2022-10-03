import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
      int[] cases = new int[n];
	    int max = 0;
	    for (int i = 0; i < n; i++) {
	        cases[i] = sc.nextInt();
	        if (cases[i] > max) {
	            max = cases[i];
	        }
	    }
	    
	    int[] ways = new int[max + 1];
	    ways[1] = 1;
	    ways[2] = 2;
	    ways[3] = 4;
	    for (int i = 4; i <= max; i++) {
	        ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
	    }
	    
	    for (int i = 0; i < n; i++) {
		    System.out.println(ways[cases[i]]);
	    }
	}
}
