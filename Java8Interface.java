interface X1{
	int MAX = 100;
	void show(); //public abstract void show();
	public default void print(){
		System.out.println("this is X1 print...");
	}
}
interface X3{
	public default void print(){
		System.out.println("this is X3 print...");
	}
}
interface X4 extends X1, X3{
	@Override
	public default void print(){
		X1.super.print();
		X3.super.print();
		System.out.println("this is child Print...");
	}
}
class X2 implements X4{
	public void show(){
		System.out.println("this is show");
	}
}

public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X2 obj = new X2();
		obj.show();
		obj.print();

	}

}
