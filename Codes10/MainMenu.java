import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class ScCalc{
	ScCalc(){
		System.out.println("ScCalc Cons Call");
	}
	public int pow(int x, int y){
		return (int)Math.pow(x,y);
	}
}
class Calculator{
	Calculator(){
		System.out.println("Calc Cons Call");
	}
	public int add(int x, int y){
		return x + y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
}
public class MainMenu {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//Calculator c = new Calculator(); // Compile Time Class Resolve Eager Way
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type Calculator or ScCalc");
		String className = scanner.next();
		Object object = Class.forName(className).newInstance(); // Lazy Way
		System.out.println("Type add for Addition");
		System.out.println("Type subtract for Subtraction");
		System.out.println("Type multiply for Multiplication");
		System.out.println("Type divide for division");
		System.out.println("Type pow for Power");
		String methodName = scanner.next();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class,int.class); 
		Object result= method.invoke(object, 100,200);
		System.out.println("Result is "+result);
		/*int choice = scanner.nextInt();
		if(choice == 1){
		int result = 	c.add(10, 20);
		System.out.println("Result is "+result);
		}*/
	}

}
