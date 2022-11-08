/** algo_hw19 20200982 */

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 
		 int n = Integer.parseInt(st.nextToken());
		 int[] cnt = new int[n + 1];
		 
		 cnt[1] = 0;
		 for (int i = 2; i <= n; i++) {
		     cnt[i] = cnt[i - 1] + 1;
		     
		     int two = cnt[i / 2] + 1;
		     int thr = cnt[i / 3] + 1;
		     
		     if (i % 6 == 0) {
    		     if (two < thr) {
    		         cnt[i] = two;
    		     } else {
    		         cnt[i] = thr;
    		     }
		     } else if (i % 3 == 0 && cnt[i] > thr) {
		         cnt[i] = thr;
		     } else if (i % 2 == 0 && cnt[i] > two) {
		         cnt[i] = two;
		     }
		 }
		 
		 System.out.println(cnt[n]);
		 
		 br.close();
	}
}
