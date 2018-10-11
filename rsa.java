/*
 * 
 * Author: Schahin Rajab
 * 
 * Cracks rsa private key. enter number of test cases followed by 2 integers,
 * first integer is the value of n (4 <= n < 10^6) and second is the value of e
 * (1 < e < fi(n))
 * 
 * Output is the private key d.
 */

import java.util.*;

public class rsa {
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	       long d, k, fi, n, e;
	       int count;
	       int t = sc.nextInt();
    	   long[] pq = new long[2];
	       
	       for(int test = 0; test < t; test++) {
	    	   count = 0;
	    	   k = 0;
	    	   fi = 0;
	    	   n = sc.nextLong();
	    	   e = sc.nextLong();
	    	   pq[0] = pq[1] = 0;
	    	   
	    	   //calculate prime factors from n
	    	   for(int j = 2; j < n; j++) {
	    		   if(count >= 2)
	    			   break;
	    		  
	    		   if(n % j == 0) {
	    			   pq[count] = j;
	    			   count++;
	    		   }
	    	   }
	      
	    	   //calculate fi
	    	   fi = (pq[0] - 1) * (pq[1] - 1);
	      
	    	   //calculate k
	    	   for(int i = 0; i < e; i++) {
	    		   if((i * fi + 1) % e == 0) {
	    			   k = i;
	    			   break;
	    		   }   
	    	   }
	       
	    	   //calculate private key d
	    	   d = (k * fi + 1) / e;
	    	   
	    	   System.out.println(d);
	     
	     //close for loop  
	     }
	        
	//close main        		
	}
//close class
}