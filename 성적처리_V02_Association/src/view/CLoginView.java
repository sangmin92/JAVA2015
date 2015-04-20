package view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView {
	
	public void login() throws FileNotFoundException, UserIDNotFoundException, PasswordNotMatchException{
		Scanner scanner = new Scanner(System.in);
		//input from keyboard using scanner
		VLogin vLogin = new VLogin();
	//	System.out.println("login user id :");
	//	String userID = vLogin.setUserID(scanner.next());
		vLogin.setUserID("ID1");

	//	String password = vLogin.setPassword(scanner.next());
   // 	System.out.println("login password :");
		vLogin.setPassword("pw1");
		
		
		VUser vUser = (VUser) ((CLoginControl) this.getControl()).login(vLogin);
		System.out.println("login result :" +vUser.getname());
		
		
		//close scanner
		scanner.close();
		
	}
}