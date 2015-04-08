package main;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;

public class CMain {

	public static void main(String[] args) {
	
		CLoginView loginView = new CLoginView();
		CLoginControl loginControl = new CLoginControl();		
		IDAO dao = new TextDAO();
		//association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		loginView.login();
		
		

	}

}
