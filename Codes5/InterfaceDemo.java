 interface IPlayer{  // abstract interface IPlayer
	void run();  //public abstract void run();
	void jump();
	void attack();
	int MAX_SPEED = 50;  // public static final int MAX_SPEED = 50;
	int DEFAULT_SPEED =10;
	int MAX_JUMP = 100;
	int DEFAULT_JUMP = 10;
	int MAX_POWER = 100;
	int DEFAULT_POWER = 20;
}
 interface IStarPlayer{
	 void show();
	 void hide();
 }
 class YellowPlayer implements IPlayer,IStarPlayer{
	 int currentSpeed = DEFAULT_SPEED;
	 public void run(){
		 if(currentSpeed<MAX_SPEED){
			 currentSpeed+=10;
		 }
		 System.out.println("Yellow Player Run..."+currentSpeed);
	 }
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
 }
class RedPlayer implements IPlayer{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	 
 }
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
