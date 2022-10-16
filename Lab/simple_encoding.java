import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    int[] nums = new int[n];
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for (int i = 0; i < n; i++) {
	        nums[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    Arrays.sort(nums);
	    int result = nums[0] + 1;
	    for (int i = 1; i < n; i++) {
	        result *= nums[i];
	    }
	    System.out.println(result);
	    
	    
	    br.close();
	    bw.close();
	}
}
