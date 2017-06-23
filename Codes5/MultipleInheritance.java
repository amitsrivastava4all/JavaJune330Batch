interface K1
{
	void show();
	int X = 10;
}
interface K2{
	int X = 20;  //public static final int X = 20;
	void print();  //public abstract void print();
	void show();
}
interface K3 extends K1, K2{
	void display();
	
}
class K4 implements K3{

	@Override
	public void show() {
		System.out.println(K1.X + K2.X);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
