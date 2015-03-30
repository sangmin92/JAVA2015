package 성적처리V1;

import DAOs.CGangjwaDAO;
import DAOs.CGwamokDAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;

public class CMain {

	public static void main(String[] args) {
	//login
		//view
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();					
		//control	
		CLoginControl loginControl = new CLoginControl();		
		member = loginControl.login(member);
		//entity
	//	CMemberDAO memberDAO = new CMemberDAO();
    //  memberDAO.write(member);
	//과목개설
		CGwamokView gwamokView =new CGwamokView();
		CGwamok gwamok = gwamokView.processGwamok();
		CGwamokControl gwamokControl =new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		
		CGwamokDAO gwamokDAO = new CGwamokDAO();
		gwamokDAO.write(gwamok);
	//강좌개설
		CGangjwaView gangjwaView =new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.processGangjwa();
		CGangjwaControl gangjwaControl =new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		
		CGangjwaDAO gangjwaDAO = new CGangjwaDAO();
		gangjwaDAO.write(gangjwa);
	    
	
	}
}
			
	