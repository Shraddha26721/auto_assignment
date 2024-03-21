package Assignment_6;

public class CopyArray {
	public static void main(String[] args) 
    { 
        int a[] = { 1, 8, 3 }; 
  
        int b[] = new int[a.length];  
        b = a; 
        b[0]++; 
  
        System.out.println("Array a[] "); 
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\nArray b[] "); 
        for (int i = 0; i < b.length; i++) 
            System.out.print(b[i] + " "); 
    } 

}
