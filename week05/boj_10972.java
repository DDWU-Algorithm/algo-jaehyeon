/** algo_hw13 20200982 */

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int p[] = new int[n];
	    int next[] = new int[n];
	    for (int i = 0; i < n; i++) {
	        p[i] = sc.nextInt();
	        next[i] = p[i];
	    }
	    
       	    int fIndex = -1;
	    for (int i = n - 1; i > 0; i--) {
	        if (p[i - 1] < p[i]) {
	            fIndex = i - 1;
	            break;
	        }
	    }
	    if (fIndex == -1) {
	        System.out.println(fIndex);
	        return;
	    }
	    
	    int pick = fIndex;
	    for (int i = n - 1; i > fIndex; i--) {
	        if (p[i] > p[fIndex]) {
	            pick = i;
	            break;
	        }
	    }
	    
	    next[fIndex] = p[pick];
	    next[pick] = p[fIndex];
	    Arrays.sort(next, fIndex + 1, n);
	    
            for (int i = 0; i < n; i++) {
         	System.out.print(next[i] + " ");
     	    }
	    
	    sc.close();
	}
}
