package entity;

import java.util.Scanner;
//VLogin ���� Ŭ�������� ��Ӿ��ְ�
public class VLogin{
	private String userID, password;
	//Method
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public void read(Scanner scanner){
		userID = scanner.next();
		password = scanner.next();
	}
	public void write(){}
}
