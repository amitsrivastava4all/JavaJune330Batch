import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class UserOperations {
	
	
	public static String isUserExist(User userObject) throws ClassNotFoundException, IOException{
		String path = "/Users/amit/Documents/FileOutput/users.dat";
		File file = new File(path);
		/*if(!file.exists()){
			return "User DB (File) is Not Exist , so u can't Login";
			//System.exit(0);
		}
		else{*/
			FileInputStream fs = new FileInputStream(file);
			ObjectInputStream os = new ObjectInputStream(fs);
			User user = (User)os.readObject();
			if(user!=null  && 
					(user.getUserid().equals(userObject.getUserid()) 
					&& user.getPassword().equals(userObject.getPassword()))){
				return "Welcome User "+user.getUserid();
			}
		//}
		return "Invalid Userid or Password ";
	}
	
	public static boolean registerUser(User userObject) throws IOException{
		String path = "/Users/amit/Documents/FileOutput/users.dat";
		File file = new File(path);
		FileOutputStream fs = new FileOutputStream(file);  // Binary Write in a File
		ObjectOutputStream os = new ObjectOutputStream(fs);  // Convert Object into Binary
		try{
		os.writeObject(userObject);
		}
		finally{
		os.close();
		fs.close();
		}
		return true;
	}

}
