import java.util.Date;
import java.util.Scanner;
class MessageDTO{
	private String message;
	private Date date;
	private String userid;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
class UserDTO{
	private String userid;
	private String pwd;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}

class View
{
	void login(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid  = scanner.nextLine();
		System.out.println("Enter the Password");
		String pwd = scanner.nextLine();
		DB db = new DB();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPwd(pwd);
		MessageDTO messageDTO = db.checkLogin(userDTO);
		System.out.println(messageDTO.getUserid());
		System.out.println(messageDTO.getMessage());
		System.out.println(messageDTO.getDate());
	}
}
class DB{
	
	
	
	MessageDTO checkLogin(UserDTO userDTO){
		MessageDTO messageDTO = new MessageDTO();
		if(userDTO.getUserid().equals(userDTO.getPwd()) ){
			messageDTO.setMessage("Welcome User");
		}
		else{
			messageDTO.setMessage("Invalid Userid or Pwd");
		}
		messageDTO.setDate(new Date());
		messageDTO.setUserid(userDTO.getUserid());
		return messageDTO;
	}
}
public class PassByRefReturnRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		view.login();

	}

}
