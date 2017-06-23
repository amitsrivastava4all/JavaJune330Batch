import java.util.LinkedList;

public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  number = "100";
		int e = Integer.parseInt(number);  // Convenience Method
		Long t = 1000l;
		byte rr = t.byteValue(); // Convenience Method
		int bb = t.intValue();
		float cc = t.floatValue();  // xxxValue method
		long r = 1000L;
		int r1 = (int)r;
		
		//********************************
		int r3 = 1000;
		Integer r4 = new Integer(r3);  // Old Way Boxing
		int r6 = r4.intValue(); // Old Way UnBoxing
		r6++;  // Increment
		r4 = new Integer(r6); // Old Way boxing
		
		Integer r5 = r3; // New Way Boxing
		r5++;  // Unboxing , Increment , Boxing
		LinkedList l  = new LinkedList();
		l.add(1000);
		int p1 = 1000;  
		Integer p2 = 128; //-128 to 127
		Integer p3 = 128;
		if(p2==p3){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
