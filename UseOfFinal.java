// S  O L I D
// S - SRP 
// D - DRY 
// O- Open Close
// Class is open for extension and close for modification

//final class Parent
class Parent
{
	private int x;
	private final void show(){
		
	}
	void print(){
		
	}
}
class Child extends Parent
{
	//@Override
	void show(){
		
	}
	void display(){
		
	}
}
public class UseOfFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_POWER = 200;
		int currentPower = 10;
		if(currentPower<=MAX_POWER){
			currentPower++;
		}
	}

}
