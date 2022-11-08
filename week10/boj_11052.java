/** algo_hw23 20200982 */

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    
		StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = new int[n + 1];
	    for (int i = 1; i <= n; i++) {
	        p[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    int[] pMax = new int[n + 1];
	    for (int i = 1; i <= n; i++) {
	        pMax[i] = p[i];
	        for (int j = i; j >= i / 2; j--) {
	            if (pMax[j] + pMax[i - j] > pMax[i]) {
	                pMax[i] = pMax[j] + pMax[i - j];
	            }
	        }
	        
	    }
	    
	    System.out.println(pMax[n]);
	    
	    br.close();
	}
}
