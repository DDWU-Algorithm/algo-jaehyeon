import java.io.*;
import java.util.*;

public class Main
{
    static final int BACKGROUND_COLOR = 0;
    static final int IMAGE_COLOR = 1;
    static final int ALREADY_COUNTED = 2;
    
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	  
	    int i = Integer.parseInt(st.nextToken());
	    int j = Integer.parseInt(st.nextToken());
	    
	    int n = 8;
        int cells[][] = {
                    {1,0,0,0,0,0,0,1},
                    {0,1,1,0,0,1,0,0},
                    {1,1,0,0,1,0,1,0},
                    {0,0,0,0,0,1,0,0},
                    {0,1,0,1,0,1,0,0},
                    {0,1,0,1,0,1,0,0},
                    {1,0,0,0,1,0,0,1},
                    {0,1,1,0,0,1,1,1}
        };
	    
	    System.out.println(countCells(cells, n, i, j));
	}
	
	public static int countCells(int[][] cells, int n, int i, int j) {
	   
	    if (cells[i][j] != IMAGE_COLOR) {
	        return 0;
	    }
	    
	    int count = 0;
	    if (cells[i][j] == IMAGE_COLOR) {
	        count++;
	        cells[i][j] = ALREADY_COUNTED;
	        
	        if (j > 0)      {   count += countCells(cells, n, i, j - 1); }
	        if (j < n - 1)  {   count += countCells(cells, n, i, j + 1); }
	        
	        if (i > 0) {
    	        count += countCells(cells, n, i - 1, j);
	            if (j > 0)      {   count += countCells(cells, n, i - 1, j - 1);  }
    	        if (j < n - 1)  {   count += countCells(cells, n, i - 1, j + 1);  }
	        }
	        
	        if (i < n - 1) {
    	        count += countCells(cells, n, i + 1, j);
    	        if (j > 0)      {   count += countCells(cells, n, i + 1, j - 1);  }
    	        if (j < n - 1)  {   count += countCells(cells, n, i + 1, j + 1);  }
	        }
	    }
	    
	    return count;
	}
	
}
