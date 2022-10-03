/** algo_hw6 20200982 */
  
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    int a, b;		// 두 자연수 중 큰 수는 a, 작은 수는 b
	    if (x > y) {
	        a = x;
	        b = y;
	    } else {
	        b = x;
	        a = y;
	    }
	    
	    int r = -1;			// r = a를 b로 나눈 나머지
	    while (r != 0) {		// 최대공약수를 구하는 코드
	        r = a % b;
	        if (r == 0) {
	            System.out.println(b);
	            break;
	        }
	        a = b;
	        b = r;
	    }
	    
	    r = b;		// r = 두 수의 최대공약수 b
	    for (int i = 1; r <= x * y; i++) {
		if (((r * i) % x == 0) && ((r * i) % y == 0)) {		// r의 배수 중에서 x와 y 둘 다 나누어 떨어지는 r * i를 구한다
		    System.out.println(r * i);
		    break;
		}
	    }
		
		
		sc.close();
	}
}
