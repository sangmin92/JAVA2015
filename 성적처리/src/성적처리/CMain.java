package ����ó��;

import DAOs.ObjectDAO;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
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
		//����
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();					
		//control	
		CLoginControl loginControl = new CLoginControl();		
		member = loginControl.login(member);
		//entity
		IDAO memberDAO = new TextDAO();
	//	CMember member =new CMember();
    // memberDAO.write(member,"member");
        member=(CMember)memberDAO.read(member.getClass(),"member.txt");
	
        
        
	}
}
        //���񰳼�
        /*
        
		CGwamokView gwamokView =new CGwamokView();
		CGwamok gwamok = gwamokView.processGwamok();
		CGwamokControl gwamokControl =new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		
		IDAO gwamokDAO = new ObjectDAO();
	//	gwamokDAO.write(gwamok,"gwamok");
		
		//�θ�Ŭ������ ������Ʈ�� �ڽ�Ŭ������ ������ ����
		gwamok=(CGwamok) gwamokDAO.read("gwamok");
	//���°���	
		CGangjwaView gangjwaView =new CGangjwaView();	
		CGangjwa gangjwa = gangjwaView.processGangjwa();
		CGangjwaControl gangjwaControl =new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		
		IDAO gangjwaDAO = new ObjectDAO();
	//	gangjwaDAO.write(gangjwa,"gangjwa");
		gangjwa=(CGangjwa) gwamokDAO.read("gangjwa");
	
	}
	*/
			
	