
public class MyThreadSync implements Runnable {

	
	Thread thread;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	// Construct a new thread.
	
	MyThreadSync(String name, int nums[]){
		thread = new Thread(this, name);
		a = nums;
		thread.start();
	}
	
	public void run() {
		int sum;
		
		System.out.println (thread.getName() + " starting");
		
		answer = sa.sumArray(a);
		System.out.println("Sum for " + thread.getName() + " is " + answer);
		
		System.out.println(thread.getName() + " terminating.");
	}
}
