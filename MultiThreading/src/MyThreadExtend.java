
public class MyThreadExtend extends Thread {

	public MyThreadExtend() {
		start();
	}

	public MyThreadExtend(Runnable target) {
		super(target);
		start();
		}

	public MyThreadExtend(String name) {
		super(name);
		start();
	}

	public MyThreadExtend(ThreadGroup group, Runnable target) {
		super(group, target);
		start();
	}

	public MyThreadExtend(ThreadGroup group, String name) {
		super(group, name);
		start();
		}

	public MyThreadExtend(Runnable target, String name) {
		super(target, name);
		start();
	}

	public MyThreadExtend(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		start();
	}

	public MyThreadExtend(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		start();
	}
	
	public void run(){
		
		System.out.println(getName() + "Starting");
		try{
			for (int count = 0; count < 10; count++){
				Thread.sleep(400);
				System.out.println("In " + getName() + ", count is " + count);
			}
		}
		catch (InterruptedException exc){
			System.out.println(getName() + " interupted");
		}
		finally{
			System.out.println(getName() + " execute finally");
		}
		System.out.println(getName() + " terminating.");
	}
}
