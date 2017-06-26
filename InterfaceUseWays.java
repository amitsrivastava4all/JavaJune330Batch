// SAM Interface
@FunctionalInterface
interface Calc
{
	public int compute(int x, int y);
	
}
class MyCalc implements Calc{
	@Override
	public int compute(int x, int y){
		return x + y;
	}
}
interface Calculator{
	int add(int x, int y);
	int subtract(long x, long y);
}
class Parent1{
	void show(){
		System.out.println("this is parent1 show...");
	}
	void print(){
		System.out.println("this is parent1 print...");
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// Upcasting
		Parent1 p = new Parent1(){
			@Override
			public void show(){
				super.show();
				System.out.println("this is anonymous child class method");
				this.display();
			}
			void display(){
				System.out.println("this is child display....");
			}
		};
		p.show();
		p.print();
		//p.display();
		
		
		//WW obj1 = new WW();
		// TODO Auto-generated method stub
		//Calc obj = new MyCalc();
		/*MyCalc calc = new MyCalc();
		System.out.println(calc.compute(10, 20));
		MyCalc calc2 = new MyCalc();
		System.out.println(calc2.compute(100, 20));*/
		Calculator calcObj = new Calculator() {
			
			@Override
			public int subtract(long x, long y) {
				// TODO Auto-generated method stub
				return (int)(x - y);
			}
			
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
		System.out.println(calcObj.add(1,2));
		System.out.println(calcObj.subtract(1, 2));
		if(10>2){
		Calc calc = new Calc(){  //class ______ implements Calc{
			@Override
			public int compute(int x, int y){
				return x * y;
			}
		};
		System.out.println(calc.compute(10, 20));
		}
		
		// Java 8 Lambda Expression
		Calc obj2 = (a,b)->a+b;
		Calc obj3 = (a,b)->{
			System.out.println("A is "+a+ " and b is "+b);
			int c = a + b;
			return c;
		};
		System.out.println(obj2.compute(1000, 2000));
		
		
		

	}

}
