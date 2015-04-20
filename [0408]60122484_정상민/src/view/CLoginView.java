package view;


import control.CLoginControl;
import entity.Clogininfo;

public class CLoginView extends CView {

	public void login() {
		Clogininfo member = new Clogininfo();
		member = (Clogininfo) ((CLoginControl)this.getControl()).login(member);

	}

}
