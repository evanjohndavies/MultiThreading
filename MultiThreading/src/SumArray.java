
public class SumArray {

	private int sum;
	
	synchronized int sumArray(int nums[]) {
		sum = 0; //reset sum
		
		for (int i:nums){
			sum += i;
			System.out.println("Running total for " + Thread.currentThread().getName() + 
					" is " + sum);
			
			try{
				Thread.sleep(10);; // allow task switch
			}
			catch(InterruptedException exv){
				System.out.println("Thread interrupted.");
			}
		}
		return sum;
	}
}
