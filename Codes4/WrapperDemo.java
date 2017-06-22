import java.util.LinkedList;

public class WrapperDemo {
	// 0 to N
	void show(int ...x){
		int sum = 0;
		for(int i : x){
			sum+=i;
		}
		System.out.println(sum);
		//System.out.println("Var Args...");
	}

	public static void main(String[] args) {
		WrapperDemo obj = new WrapperDemo();
		obj.show();
		obj.show(10);
		obj.show(10,20);
		obj.show(10,20,30);
		
		int q = 100;  // Value Type
		Integer w = 1000;  // Ref Type
//		int w1 = w.intValue();
//		w1++;
//		w  = new Integer(w1);
		w++;
		float b = 10.20f;
		Float bb = 10.20f;
		long vv = 9000L;
		Long v1 = 8989L;
		// Java D.S Object Based
		LinkedList l  = new LinkedList();
		l.add(w);
		l.add(bb);
		l.add(new Integer(q));
		l.add("ram");
		System.out.println(l);
		Object t = new Integer(q);
		t = new Integer(199);
		t = "ram";
		t= new Boolean(false);
		

	}

}
