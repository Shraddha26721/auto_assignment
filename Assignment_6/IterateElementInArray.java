package Assignment_6;

import java.util.Arrays;
import java.util.List;

public class IterateElementInArray {
	 public static void main(String[] args)
	    {
	   
	        List<Integer> numbers
	            = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	 
	        java.util.Iterator<Integer> it = numbers.iterator();
	 
	        while (it.hasNext())
	 
	            
	            System.out.print(it.next() + " ");
	    }

}
