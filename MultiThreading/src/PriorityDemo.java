
public class PriorityDemo {


	public static void main(String[] args) {
		Priority mt1 = new Priority("Low Priority");
		Priority mt2 = new Priority("High Priority");

		
		// set priorites
		
		mt1.thread.setPriority(Thread.NORM_PRIORITY -2);
		mt2.thread.setPriority(Thread.NORM_PRIORITY +2);
		
		// start threads
		
		mt1.thread.start();
		mt2.thread.start();
		
		try{
			mt1.thread.join();
			mt2.thread.join();
		} catch (InterruptedException exc){
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("\n High Priority thread counted to " + mt2.count);

		System.out.println("\n Low Priority thread counted to " + mt1.count);

	}

}
