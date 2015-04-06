package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CMember implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	private String userID;
	private String password;
	private ArrayList<CMember> memberlist = new ArrayList<>();
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public ArrayList<CMember> getMemberlist() {return memberlist;}
	public void setMemberlist(ArrayList<CMember> memberlist) {this.memberlist = memberlist;}
	public void read(Scanner scanner){
		userID = scanner.next();
		password=scanner.next();
	};
	public void write(){};
	
	
	

}
