package entity;

public class VUser {
	public static enum ELoginResult {
		success, 
		idError,
		passwordError,
		fileNotFound
	};
	
	private ELoginResult eLoginResult;
	public ELoginResult geteLoginResult() {return eLoginResult;}
	public void seteLoginResult(ELoginResult eLoginResult) {this.eLoginResult = eLoginResult;}
	
	
	private String userID, name;
	//Method
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getname() {return name;}
	public void setname(String name) {this.name = name;}
}
