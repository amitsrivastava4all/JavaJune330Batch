class TypePromotion{
	void show(byte x){
		System.out.println("byte..");
	}
	void show(short x){
		System.out.println("short..");
	}
//	void show(int x){
//		System.out.println("int..");
//	}
//	void show(long x){
//		System.out.println("long..");
//	}
//	void show(float x){
//		System.out.println("float..");
//	}
//	void show(double x){
//		System.out.println("double..");
//	}
//	void show(Integer x){
//		System.out.println("Integer Wrapper..");
//	}
	void show(Long x){
		System.out.println("Long Wrapper..");
	}
//	void show(int ...x){
//		System.out.println("int var args");
//	}
//	void show(long ...x){
//		System.out.println("long var args..");
//	}
}
public class OverloadingRules {

	public static void main(String[] args) {
		TypePromotion obj = new TypePromotion();
		obj.show((byte)1);

	}

}
