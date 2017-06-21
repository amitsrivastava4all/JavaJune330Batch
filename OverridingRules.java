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
		return obj;
	}
}
public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
