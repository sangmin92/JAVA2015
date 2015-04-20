package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;


public class CLoginControl extends CControl {

	public VUser login(VLogin vLogin) 
			throws UserIDNotFoundException, PasswordNotMatchException, FileNotFoundException{
		VUser vUser = new VUser();

		CUser user = new CUser();

		//파일을 읽어오는부분
		this.getDao().connect("member.txt");

		user = (CUser)this.getDao().read(user,vLogin.getUserID());
		//DAO보고 나한테서치해달라
		this.getDao().disconnect();

		if(user==null) throw new UserIDNotFoundException();

		if(!user.getPassword().equals(vLogin.getPassword())) 
			throw new PasswordNotMatchException();

		//가공부분
		vUser.setname(user.getName());
		vUser.setUserID(user.getId());

		return vUser;
	}

	
}

