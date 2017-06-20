class KK{
	int j=10;
	int j1= 1000;
	void show(){
		System.out.println("KK Show...");
	}
}
class ZZ extends KK{
	int j = 20;
	@Override
	void show(){
		System.out.println("ZZ Show..."+this.j + super.j1);
	}
	void display(){
		System.out.println("ZZ Disp...");
	}
}
public class OverridingBindingAndInstanceVarBinding {

	public static void main(String[] args) {
		KK obj = new ZZ();
		obj.show();
		System.out.println(obj.j);
		//obj.display();
	}

}
