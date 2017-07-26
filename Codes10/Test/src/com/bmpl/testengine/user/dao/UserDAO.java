package com.bmpl.testengine.user.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.bmpl.testengine.common.dto.PropertyReader;
import com.bmpl.testengine.user.dto.UserDTO;

public class UserDAO {
	public boolean checkUserExist(UserDTO userDTO) throws ClassNotFoundException, IOException{
		// Logic to Check userid, pwd in a file
		FileInputStream fs= new FileInputStream(PropertyReader.getUserFilePath());
		ObjectInputStream os = new ObjectInputStream(fs);
		try{
		UserDTO userObject = (UserDTO)os.readObject();
		if(userObject.getUserid().equals(userDTO.getUserid()) && userObject.getPassword().equals(userDTO.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}
		}
		finally{
			if(os!=null){
				os.close();
			}
			if(fs!=null){
				fs.close();
			}
		}
		
	}
	
	public boolean registerUser(UserDTO userDTO) throws IOException{
		FileOutputStream fs = new FileOutputStream(PropertyReader.getUserFilePath());
		ObjectOutputStream os = new ObjectOutputStream(fs);
		try{
		os.writeObject(userDTO);
		return true;
		}
		finally{
			if(os!=null){
			os.close();
			}
			if(fs!=null){
				fs.close();
			}
		}
	}
}
