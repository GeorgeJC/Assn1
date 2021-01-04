
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class A1_test {
    
    A1 a=new A1();
    /**
     * Test of pair method, of class pairsum.
     */
    @Test
    public void testhappycase() {
        //System.out.println("pair");
        int[] A = {1,2,3,4,5};
        int k = 4;
        ArrayList<Integer> exp = new ArrayList<Integer>();
        exp.add(1);
        exp.add(3);
        ArrayList<Integer> result = A1.pair(A, k);
        assertEquals(exp, result);
    }
    @Test
    public void testimpossible()
    {
        int[] A = {1,2,3,4,5};
        int k = 10;
        ArrayList<Integer> exp = new ArrayList<Integer>();
        ArrayList<Integer> result = A1.pair(A, k);
        assertEquals(exp, result);
    }
    
    @Test
    public void happy2()
    {
        int[] A = {1,2,3,4,5};

        ArrayList<Integer> exp = new ArrayList<Integer>();
        int k = 7;
        exp.add(2);
        exp.add(5);
        
        ArrayList<Integer> result = A1.pair(A, k);
        assertEquals(exp, result);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIllegalArgumentException1() {
    	int[] A = new int[0]; 
    	ArrayList<Integer> result =A1.pair(A, 1);
        
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
    	int[] A = {1}; 
    	int result =A1.numtriplets(A, 1);
        
    }
    @Test
    public void testimpossible2()
    {
        int[] A = {3,2,3,4,10};
        int k = 0;
        int exp=0;
        int result = A1.numtriplets(A, k);
        assertEquals(exp, result);
    }
    @Test
    public void happy_triplet()
    {
        int[] A = {1,1,2,3,4,5};
        int k = 6;
        int exp=3;
        int result = A1.numtriplets(A, k);
        assertEquals(exp, result);
    }
    @Test
    public void happy_triplet2()
    {
        int[] A = {1,1,2,3,4,5};
        int k = 8;
        int exp=4;
        int result = A1.numtriplets(A, k);
        assertEquals(exp, result);
    }
    

}

