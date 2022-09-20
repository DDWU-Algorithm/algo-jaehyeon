/** algo_hw9 20200982 */

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    ArrayList<Integer> cases = new ArrayList<Integer>();
	    int max = 0;
	    int input = -1;
	    for (int i = 0; input != 0; i++) {
	        input = sc.nextInt();
	        cases.add(input);
	        if (input > max) {		// input 중 max 값을 저장
	            max = input;
	        }
	    }
	    
	    boolean[] decimal = new boolean[max + 1];	// index에 해당하는 숫자가 소수이면 true, 아니면 false
	    Arrays.fill(decimal, true);			// 일단 모든 수가 소수라고 가정
	    prime[1] = false;				// 1은 소수가 아님
	    for (int i = 2; i <= max; i++) {
	        if (prime[i] == true) {
			for (int j = 2; (i * j) <= max; j++) {
			    prime[i * j] = false;	// i의 배수(i * j)는 소수가 아니므로 false
			}
	        }
	    }
	    
	    for (int n = 0; n < cases.size() - 1; n++) {
		    for (int i = 3; i < max; i++) {		// 3부터 max까지 홀수인 소수
			if (prime[i] == true) {
			    if (prime[cases.get(n) - i] == true) {		// testcase - 홀수인 소수 = 소수일 때, 어차피 2의 배수는 제외되므로 둘 다 홀수 소수
				System.out.println(cases.get(n) + " = " + i + " + " + (cases.get(n) - i));		// 즉 testcase = 홀수 소수 + 홀수 소수
				break;
			    }
			}
		    }
	    }
		
		sc.close();
	}
}
