/** algo_hw15 20200982 */
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
      int bucket[] = new int[n];
      pick(bucket, n, n);
        
      sc.close();
	}
	
	public static void pick(int bucket[], int n, int k) {
	    if (k == 0) {
	        for (int i = 0; i < bucket.length; i++) {
	            System.out.print(bucket[i] + " ");
	        }
	        System.out.println();
	        return;
	    }
	    
	    int lastIndex = bucket.length - k - 1;
	    int smallest = 1;
	    
	    for (int item = smallest; item <= n; item++) {
	        boolean flag = false;
	        for (int i = 0; i <= lastIndex; i++) {
	            if (item == bucket[i]) {
	                flag = true;
	                break;
	            }
	        }
	        if (flag) {
	            continue;
	        }
	        bucket[lastIndex + 1] = item;
	        pick(bucket, n, k - 1);
	    }
	    
	}
	
}
