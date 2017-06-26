import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface Features
{
	void f1();
	void f2();
	void f3();
}
abstract class CommonFeaturesAdapter implements Features{
	public void f1(){
		
	}
	public void f2(){
		
	}
	public void f3(){
		
	}
}
class UsingFeature extends CommonFeaturesAdapter implements Features{
	public void f3(){
		
	}
}
class UsingFeature2 extends CommonFeaturesAdapter implements Features{
	public void f1(){
		
	}
}
public class InterfaceLimitation {
	public static void main(String[] args) {
		WindowListener l;
		WindowAdapter w;
		
	}

}
