package Assignment_6;

public class ThreadByExtendingThreadClass extends Thread{
	 public void run()
	    {
	        System.out.println("Thread Started Running...");
	    }
	    public static void main(String[] args)
	    {
	        ThreadByExtendingThreadClass g1 = new ThreadByExtendingThreadClass();
	 
	        g1.start();
	    
			
		}
		

}
