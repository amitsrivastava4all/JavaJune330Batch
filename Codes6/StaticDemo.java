/*
 * static variable
 * static block
 * static method
 * static import
 */
// Utility Class
//final class MathOpr
import static java.lang.System.out;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

interface MathOpr
{
	//private MathOpr(){}
	static void cube(int a){
		out.println(a*a*a);
	}
	
}

class Customer{
	int id;  // Instance Variables
	String name;
	double balance;
	static int noOfCustomers;
	int noOfCustomer2;
	// This is Param Cons
	Customer(int id , String name , double balance){
		out.println("Game is Loaded..... and Player is Loading..");
		this.id = id;
		this.name = name;
		this.balance = balance;
		out.println("Customer Object is Created ");
		noOfCustomers++;
		noOfCustomer2++;
		out.println(noOfCustomers+" "+noOfCustomer2);
	}
	static{
		out.println("Game is Loading.....");
		out.println("Sound is Loading...");
		out.println("Graphics is Loading....");
		out.println("I Will Call Only "
				+ "Once When Class is Loaded.. "+noOfCustomers);
	}
	
}
class CC
{
	static class DD
	{
		static void print(){
			System.out.println("DD Print...");
		}
	}
}
class VV1
{
	int x =10;
    VV1(){
    	System.out.println("VV COns Call");
    }
	class FF
	{
		FF(){
			System.out.println("FF CONs Call");
		}
		void show(){
			System.out.println("FF Show...");
		}
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		VV1 obj = new VV1();
//		System.out.println(obj.x);
//		VV1.FF obj2 = obj.new FF();
//		obj2.show();
		VV1.FF obj = new VV1().new FF();
		obj.show(); 
		CC.DD.print();
		
		
		double result = pow(2, 3);
		System.out.println(result);
		System.out.println(abs(-99));
		// Class Load 
		// Object Create , Instance Variables Memory, Constructor Call
		Customer ram = new Customer(1001,"Ram",9999);
		Customer shyam =new Customer(1002,"Shyam",8888);
		//MathOpr opr =new MathOpr();
		MathOpr.cube(3);

	}

}
