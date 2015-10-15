
public class ExtendThread {

	
	// use extending thread instead of implementing Runnable
	
	public static void main(String[] args) {
		
		System.out.println("Main thread Starting" );
		
		//First construct a MyThread Object
		MyThreadExtend mt1 = new MyThreadExtend("Child 1");
		MyThreadExtend mt2 = new MyThreadExtend("Child 2");
		MyThreadExtend mt3 = new MyThreadExtend("Child 3");
		
		
		
		// two ways to wait for a thread to finish first is join  
		
		try{
		mt1.join();
		System.out.println("Child #1 joined.");
		}
		catch (InterruptedException exc){
		}
		finally{
			
			System.out.println("Child #1 finally statement.");
		}
		
		
		// second means is to check if threads are still alive
		
		do {
			System.out.println(".");
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException exc){
				System.out.println(" Main thread interupted.");
			}
			finally{
				//System.out.println("Main finally statement");
			} 
		}while ( mt2.isAlive() || mt3.isAlive());
			
		System.out.println("Main Thread Ending.");
	}

}
