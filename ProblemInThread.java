class Logic{
	public static void myLogic(){
		for(int i = 1; i<=5; i++){
			System.out.println(" I is "+i+" Thread "+Thread.currentThread().getName());
			System.out.println(Thread.currentThread().isAlive());
			//Thread.currentThread().stop();
		}
	}
}

class Task implements Runnable{
	int x ;
	Logic logic = new Logic();
	@Override
	public  void run(){
		System.out.println("With out Lock "+Thread.currentThread().getName());
		/*synchronized(Logic.class){
			Logic.myLogic();
		}*/
		logic.myLogic();
		/*synchronized (logic) {
			logic.myLogic();
		}*/
		//logic.myLogic();
		/*synchronized(this){
		for(int i = 1; i<=5; i++,x++){
			System.out.println("X is "+x+" I is "+i+" Thread "+Thread.currentThread().getName());
		}
		}*/
		System.out.println("With out Lock2... "+Thread.currentThread().getName());
	}
}
public class ProblemInThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task job = new Task();
		Thread worker = new Thread(job,"ram");
		
		//Task job2 = new Task();
		Thread worker2 = new Thread(job,"shyam");
		worker.setPriority(Thread.MAX_PRIORITY);
		worker.setDaemon(true);
		worker.start();
		worker.join();
		worker2.setPriority(Thread.MIN_PRIORITY);
		Thread worker3 = new Thread(job,"mike");
		worker2.start();
		worker3.start();
		
		//StringBuffer vs StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		//StringBuffer sb = new StringBuffer("Hello");
		synchronized(sb){
		sb.append("Hi");
		}
		sb.append("Not Locked ");
		
	}

}
