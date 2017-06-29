import java.util.LinkedList;

class GG
{
	int x;
	String y;
	GG(int x, String y){
		this.x = x;
		this.y = y;
		
	}
}
public class PutLoadOnHeap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Main Start...");
		long w=1;
		LinkedList l = new LinkedList();
		while(true){
			GG obj = new GG(1001,"Hello"+w);
			l.add(obj);
			w++;
			Thread.sleep(30);
		}
	}

}
