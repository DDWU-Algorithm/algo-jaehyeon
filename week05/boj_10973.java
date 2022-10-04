/** algo_hw14 20200982 */

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int p[] = new int[n];
	    int pre[] = new int[n];
	    for (int i = 0; i < n; i++) {
	        p[i] = sc.nextInt();
	        pre[i] = p[i];
	    }
	    
        int fIndex = -1;
	    for (int i = n - 1; i > 0; i--) {
	        if (p[i - 1] > p[i]) {
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
	        if (p[i] < p[fIndex]) {
	            pick = i;
	            break;
	        }
	    }
	    
        pre[fIndex] = p[pick];
        pre[pick] = p[fIndex];
        int tmp[] = new int[n];
        for (int i = fIndex + 1; i < n; i++) {
            tmp[i] = pre[i];
        }
        Arrays.sort(tmp);
        
        int j = n - 1;
        for (int i = fIndex + 1; i < n; i++) {
            pre[i] = tmp[j--];
        }
	    
        for (int i = 0; i < n; i++) {
            System.out.print(pre[i] + " ");
        }
	    
	    sc.close();
	}
}
