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

		//������ �о���ºκ�
		this.getDao().connect("member.txt");

		user = (CUser)this.getDao().read(user,vLogin.getUserID());
		//DAO���� �����׼�ġ�ش޶�
		this.getDao().disconnect();

		if(user==null) throw new UserIDNotFoundException();

		if(!user.getPassword().equals(vLogin.getPassword())) 
			throw new PasswordNotMatchException();

		//�����κ�
		vUser.setname(user.getName());
		vUser.setUserID(user.getId());

		return vUser;
	}

	
}

