package 己利贸府;


import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;
import view.CLoginView;
import entity.CMember;

public class CMain {

	public static void main(String[] args) {
	//login
		//view
		//荐沥
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();					
		//control	
		CLoginControl loginControl = new CLoginControl();		
		member = loginControl.login(member);
		//entity
		IDAO memberDAO = new TextDAO();
	//	CMember member =new CMember();
    // memberDAO.write(member,"member");
        member=(CMember)memberDAO.read(member,"member.txt");
	
        
        
	}
}
	