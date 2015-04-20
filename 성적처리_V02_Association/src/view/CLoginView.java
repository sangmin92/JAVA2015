package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;

public class CLoginView extends CView {
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		//input from keyboard using scanner
		VLogin vLogin = new VLogin();
	//	System.out.println("login user id :");
	//	String userID = vLogin.setUserID(scanner.next());
		vLogin.setUserID("ID5");

	//	String password = vLogin.setPassword(scanner.next());
   // 	System.out.println("login password :");
		vLogin.setPassword("pw5");

		VUser vUser = (VUser) ((CLoginControl) this.getControl()).login(vLogin);
		System.out.println("login result :" +vUser.geteLoginResult().toString());
		scanner.close();
		
	}
}