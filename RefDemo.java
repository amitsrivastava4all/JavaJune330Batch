import java.math.BigDecimal;
class RefDemo
{

	public static void main(String args[]){
	BigDecimal bg = new BigDecimal("100000000000.20");
	BigDecimal bg2 = new BigDecimal("20000000000.20");
	BigDecimal bg3 = bg.add(bg2);
	System.out.println("Amount is "+bg3);
	StringBuffer sb = new StringBuffer(500); // 5 (Length) + 16 Space= 21 Array
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	sb.append("hgjdhhghkfdgkghdfjkgjdfk");
	Integer r1 = 128;
	Integer r2 = 128;
	if(r1==r2){
	System.out.println("Same Ref of Integer");
	}
	else
	{
		System.out.println("Not Same Ref of Integer");
	}
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	int t;
	int hh = 100;
	float bb = 90.20f;
		String a = "Hello".intern();  // String Literal (1 or 0 )
		String b = "Hello".intern();
		String d = "Hi";
		String e = "Hi";
		String c = new String("Hello"); //2 or 1 
		a="OK";
		
		System.out.println("A is "+a+" and B is "+b);
		if(a==b){
		System.out.println("Same Ref ");
		}
		else
		{
		System.out.println("Not Same Ref ");
		}
	}
	}