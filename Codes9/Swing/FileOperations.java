import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {
	static String readFile(String path){
		final int EOF = -1;
		FileInputStream fs =null;
		//String path = "/Users/amit/Documents/Java330RegBatch/NotePad/src/FileOperations.java";
		File file = new File(path);
		StringBuffer sb = new StringBuffer();
		if(file.exists()){
			try {
				fs =  new FileInputStream(file);
				int singleByte = fs.read();
				while(singleByte!=EOF){
					sb.append((char)singleByte);
					//System.out.print((char)singleByte);
					singleByte = fs.read();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(fs!=null){
					try {
						fs.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return sb.toString();  // Convert StringBuffer into String
	}
	static void writeFile(String path, String data){
		//String path = "/Users/amit/Documents/FileOutput/test.txt";
		File file = new File(path);
		FileOutputStream fs=null ;
		//String data = "Hello this is sample Data to write in a file...";
		try {
			//System.out.println("Program Terminate...");
			//System.exit(0);
//			if(10>2){
//			return ;
//			}
			//int ee = 100/0;
			if(!file.exists()){
			if(file.createNewFile()){
				System.out.println("File Created...");
			}
			}
			else
			{
				System.out.println("File Already Exist");
			}
			fs = new FileOutputStream(file,true);
			fs.write(data.getBytes());
			//int gg = 100/0;
			System.out.println("Data Store ....");
		} catch (IOException e) {
			System.out.println("Problem in File Creation .... Check Ur File Path");
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a Number with Zero ");
		}
		catch(Exception e){
			System.out.println("Mis Exception Found...");
		}
		finally{
			// Resource Clean up
			System.out.println("Finally Call Always...");
			try {
				if(fs!=null){  //Checking if file is open 
				fs.close();
				
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	public static void main(String[] args) {
//		readFile();
//		//writeFile();
////		System.out.println("DB COnnection  Open");
////		System.out.println("Doing Query from the DB");
////		try{  // Here we guard the exception
////		int xx= 10/0;  // throw new ArithmeticException() 
////		}
////		catch(ArithmeticException e){  // Handling
////			System.out.println("U divide a number with Zero ");
////		}
////		System.out.println("Get the QUery Result");
////		System.out.println("Process the Query Result");
////		System.out.println("Print the Result");
////		System.out.println("Close the DB COnnection...");
//
//	}

}
