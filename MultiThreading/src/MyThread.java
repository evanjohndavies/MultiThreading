
public class MyThread implements Runnable{
	Thread thread;
	
	MyThread(String name){
		thread = new Thread(this, name); 
		thread.start();  //starts thread
	}
	
	// Throwing in finally for fun to see how that executes when class exits
	protected void finalize (){
		System.out.println("Finalizing " + thread.getName());
	}
	
	
	public Thread getThread(){
		return(thread);
	}
	
	
	//Entry point in thread
	public void run(){
		
		System.out.println(thread.getName() + "Starting");
		try{
			for (int count = 0; count < 10; count++){
				Thread.sleep(400);
				System.out.println("In " + thread.getName() + ", count is " + count);
			}
		}
		catch (InterruptedException exc){
			System.out.println(thread.getName() + " interupted");
		}
		finally{
			System.out.println(thread.getName() + " execute finally");
		}
		System.out.println(thread.getName() + " terminating.");
	}
	
}
