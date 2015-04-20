package entity;

import java.io.Serializable;
import java.util.Scanner;


public class Clogininfo extends CEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	// attributes
	private String userID;
	private String password;
	//0,1,2,3한정 
	public enum ELoginResult{succees,idError,passwordError,error};
	ELoginResult eLoginResult;
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public void read(Scanner scanner) {
		userID = scanner.next();
		password = scanner.next();
	};
	public void write() {}
	public ELoginResult geteLoginResult() {return eLoginResult;}
	public void seteLoginResult(ELoginResult eLoginResult) {this.eLoginResult = eLoginResult;};
	
}
