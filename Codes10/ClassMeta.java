import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

class A
{
	int a;
	protected int b;
}
interface FF{
	
}
class B extends A implements FF
{
	int tt ;
	private int mm;
	public int d;
	final int e=100;
	static int m;
	void show(){
		
	}
	void print(){
		
	}
}
public class ClassMeta {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		B obj = new B();
		Class cls = obj.getClass();  // Data + MetaData of a Class
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Field Name");
		String fieldName = scanner.next();
		Field field = cls.getDeclaredField(fieldName);	
		field.setAccessible(true);
		System.out.println("Enter the Field value");
		int fieldValue = scanner.nextInt();
		field.set(obj, fieldValue);
		System.out.println("After Field Set "+field.get(obj));
		
		Class c = B.class;  // Meta Data of Class
		System.out.println("No of Fields "+c.getDeclaredFields().length);
		for(Field f: c.getDeclaredFields()){
			if(Modifier.isPrivate(f.getModifiers())){
				System.out.println("Private "+f.getName());
			}
			if(Modifier.isFinal(f.getModifiers())){
				System.out.println("Final "+f.getName());
			}
			if(Modifier.isPublic(f.getModifiers())){
				System.out.println("public "+f.getName());
			}
			if(Modifier.isStatic(f.getModifiers())){
				System.out.println("Static "+f.getName());
			}
		}
		System.out.println("No of Methods "+c.getDeclaredMethods().length);
		
		System.out.println("Parent Class "+c.getSuperclass());
		System.out.println("Interfaces "+c.getInterfaces().length);
	}

}
