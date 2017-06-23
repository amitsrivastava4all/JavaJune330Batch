abstract class Product
{
	int id;
	String name;
	void displayProductDetails(){
		System.out.println("Id "+id);
		System.out.println("Name  "+name);
	}
	abstract void offers();
	
}
class Shoes extends Product
{
	void getSize(){
		System.out.println("Size .....");
	}
	@Override
	void offers(){
		System.out.println("Shoes 45% Off...");
	}
}
class Mobile extends Product{
	@Override
	void offers(){
		System.out.println("Exchange Ur Old Mobile...");
	}
	void insurance(){
		System.out.println("Insurance ....");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product product = new Product();
		Shoes shoes = new Shoes();
		Product p  = shoes;
		p.displayProductDetails();
		//shoes.getSize();
	}

}
