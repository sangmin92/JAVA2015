package view;


import entity.CMember;

public class CLoginView extends CView {

	public void login() {
		CMember member = new CMember();
		member = (CMember) this.getControl().process(member);

	}

}
