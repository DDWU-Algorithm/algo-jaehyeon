/** algo_hw22 20200982 */

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
      int[] cases = new int[n];
	    int max = 0;
	    for (int i = 0; i < n; i++) {
	        cases[i] = Integer.parseInt(br.readLine());
	        if (cases[i] > max) {
	            max = cases[i];
	        }
	    }
	    
	    int[] cnt = new int[max + 1];
	    cnt[1] = 1;
	    cnt[2] = 2;
	    cnt[3] = 4;
	    for (int i = 4; i <= max; i++) {
	        cnt[i] = cnt[i - 1] + cnt[i - 2] + cnt[i - 3];
										// (i - 1) + 1
	    }
	    
	    for (int i = 0; i < n; i++) {
		      System.out.println(ways[cases[i]]);
	    }
	    
	    br.close();
	}
}
