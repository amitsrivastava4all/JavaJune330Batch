
public class User {
	private String userid;
	private String password;
	private String gender;
	private String address;
	private String country;
	public User(String userid , String password, String gender, String address, String country){
		this.userid = userid;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.country = country;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
