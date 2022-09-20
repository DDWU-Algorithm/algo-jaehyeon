/** algo_hw8 20200982 */

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int M = sc.nextInt();
	    int N = sc.nextInt();
	    
	    boolean[] decimal = new boolean[N + 1];		// index에 해당하는 숫자가 소수이면 true, 아니면 false
	    Arrays.fill(decimal, true);				// 일단 모든 수가 소수라고 가정
	    decimal[1] = false;					// 1은 소수 아님
	    
	    for (int i = 2; i <= N; i++) {
	        if (decimal[i] == true) {
    	        	for (int j = 2; (i * j) <= N; j++) {	// i의 배수(i * j)는 소수가 아니므로 false
    	            		decimal[i * j] = false;
    	        	}
	        }
	    }
	    
	    for (int i = M; i <= N; i++) {
	        if (decimal[i] == true) {
		        System.out.println(i);
	        }
	    }
	    
		sc.close();
	}
}
