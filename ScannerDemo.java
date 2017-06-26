import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/Java330RegBatch/OOPSDemo/src/ScannerDemo.java";
		File file = new File(path);
		int lineCounter = 0;
		Scanner s = new Scanner(file);
		while(s.hasNext()){
		//while(s.hasNextLine()){
			s.next();
			//s.nextLine();
			lineCounter++;
			//System.out.println(s.nextLine());
		}
		System.out.println(lineCounter);
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = scanner.nextLine();
		System.out.println("NAme is "+name);*/

	}

}
