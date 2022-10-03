/** algo_hw7 20200982 */

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int prime = 0;		// 소수의 개수
		for (int i = 0; i < n; i++) {
		    int num = sc.nextInt();
		    if (num == 1) {		// 1은 소수가 아니므로 넘어간다.
		        continue;		// 없어도 되는 코드
		    }
		    
		    int j = 0;
		    for (j = 2; j < num; j++) {		// 소수 판별
		        if (num % j == 0) {
		            break;
		        }
		    }
		    if (j == num) {
		        prime++;
		    }
		}
		System.out.println(prime);
		
		sc.close();
	}
}
