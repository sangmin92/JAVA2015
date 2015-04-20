package main;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;

public class CMain {

	public static void main(String[] args) {
		//View
		CLoginView loginView = new CLoginView();
		//Control
		CLoginControl loginControl = new CLoginControl();
		//dao
		IDAO dao = new TextDAO();
		//Association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		//Start program
		loginView.login();
	}
}