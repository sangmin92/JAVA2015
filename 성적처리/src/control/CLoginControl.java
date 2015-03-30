package control;

import entity.CMember;

public class CLoginControl {	//로그인뷰와 차이는 컨트롤이 달려있는 것
	private CMember member;

	public CMember login(CMember member) {
		this.member = member;
		return this.member;
	}

}
