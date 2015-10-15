
public class Priority implements Runnable{
		int count;
		Thread thread;
		static boolean stopFlag = false;
		static String currentName;
		
	Priority (String name){
		thread = new Thread(this, name);
		count = 0;
		currentName = name;
		
	}
	
	public void run(){
		System.out.println(thread.getName() + " starting");
		
		do {
			count++;
			
			if(currentName.compareTo(thread.getName()) != 0){
				currentName = thread.getName();
				System.out.println("In " + thread.getName() + " is different");
			}
			
		} while (stopFlag == false && count < 1000000000);
		stopFlag = true;
		
		System.out.println("\n" + thread.getName() + " terminating");

	}
}
