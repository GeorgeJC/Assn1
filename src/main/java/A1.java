
import java.util.ArrayList;
import java.util.Arrays;
public class A1 {
    static ArrayList<Integer> pair(int[] A,int k)
    {
    	if(A.length<=1)
    	{
    		throw new IllegalArgumentException("Length of Array must be atleast 2");
    	}
    	//if(k)
        ArrayList<Integer> B=new ArrayList<Integer>();
        Arrays.sort(A);
        int i=0;
        int j=A.length-1;
        while(i<j) 
        {
            if(A[i]+A[j]==k)
            {
                B.add(A[i]);
                B.add(A[j]);
                return B;
            }
            else if(A[i]+A[j]<k)
                i++;
            else
                j--;
        }
        return B;
    }
    static int numtriplets(int[] A,int k)
    {
    	if(A.length<=1)
    	{
    		throw new IllegalArgumentException("Length of Array must be atleast 2");
    	}
    	//if(k)
        int count=0;
        Arrays.sort(A);
        int n=A.length;
        for (int i = 0;i<n - 1; i++) 
        { 
               int l = i + 1; 
               int r = n - 1; 
               int x = A[i]; 
               while (l < r) { 
                   if (x + A[l] + A[r] == k) { 
                       count++;
                       l++; 
                       r--; 
                   } 
     
                   else if (x + A[l] + A[r] < k) 
                       l++; 
 
                   else
                       r--; 
               }
        }
        return count;
    }
}