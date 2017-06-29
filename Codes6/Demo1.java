class G
{
	int x;
	String w;
	static G obj2;
	G(int x, String w){
		this.w  = w;
		this.x = x;
		System.out.println("Object Born...");
	}
	@Override
	protected void finalize(){
		System.out.println("Object Going to Dead..."+this.x);
		obj2 = this;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		G obj = new G(1001,"Hello");
		obj.x++;
		obj = null;
//		if(obj!=null){
//		obj.x ++;
//		}
		System.gc(); 
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
		obj = G.obj2;
		System.out.println(" Again Get the Value "+obj.x);

	}

}
