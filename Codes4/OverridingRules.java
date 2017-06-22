/*
 * Override - Must be Inheritance
 * Method Signature of Parent and Child Must be same
 */
class X
{
	int a,b,c;
}
class XPlus extends X{
	int d,e;
}
class Parent2
{
	protected X show(){
		System.out.println("Parent show...");
		X obj =new X();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		return obj;
	}
	void print(){
		System.out.println("Parent Print....");
	}
}
class Child2 extends Parent2
{
	@Override
	public XPlus show(){
		System.out.println("Child Show...");
		XPlus obj = new XPlus();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		obj.d= 99;
		obj.e = 88;
		return obj;
	}
	void show(int x){
		System.out.println("Int Show");
	}
	void show(double x){
		System.out.println("double show");
	}
}
public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj = new Child2();
		obj.show();
		obj.show(90.20);

	}

}
