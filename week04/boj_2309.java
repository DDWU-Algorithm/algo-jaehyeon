/** algo_hw10 20200982 */

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		ArrayList<Integer> heights = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
		    heights.add(sc.nextInt());
		    sum += heights.get(i);
		}
		sum -= 100;
		
        Collections.sort(heights);
		for (int i = 0; i < 9; i++) {
		    for (int j = 1; j < 9; j++) {
		        int a = heights.get(i);
		        int b = heights.get(j);
		        if (a + b == sum) {
		            heights.remove(i);
		            heights.remove(j - 1);
		            break;
		        } else if (a + b > sum) {
		            break;
		        }
		    }
		    if (heights.size() == 7) {
		        break;
		    }
		}
		
		for (int i = 0; i < 7; i++) {
		    System.out.println(heights.get(i));
		}
		
		sc.close();
	}
}
