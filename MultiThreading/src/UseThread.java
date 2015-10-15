
public class UseThread {

	public static void main(String[] args) {

		System.out.println("Main thread Starting" );
		
		//First construct a MyThread Object
		MyThread mt = new MyThread("Child 1");
		MyThread mt2 = new MyThread("Child 2");
		
		
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
		} while (mt.getThread().isAlive() || mt2.getThread().isAlive());
		
		System.out.println("Main Thread Ending.");
	}

}
