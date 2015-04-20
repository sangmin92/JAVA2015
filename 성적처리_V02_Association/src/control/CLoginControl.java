package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;


public class CLoginControl extends CControl {

	public VUser login(VLogin vLogin){
		VUser vUser = new VUser();
		try{
			CUser user = new CUser();
			
			//������ �о���ºκ�
			this.getDao().connect("member.txt");
			
			user = (CUser)this.getDao().read(user,vLogin.getUserID());
			//DAO���� �����׼�ġ�ش޶�
			this.getDao().disconnect();
			
			
			//result ���� �ʿ� !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
			if(user==null){
				vUser.seteLoginResult(ELoginResult.idError);
				return vUser;
			}
			
			if(!user.getPassword().equals(vLogin.getPassword())){
				vUser.seteLoginResult(ELoginResult.passwordError);
				return vUser;
			}
			vUser.seteLoginResult(ELoginResult.success);
			//!!!!!!!!!!!!!!!1
		
			//�����κ�
			vUser.setname(user.getName());
			vUser.setUserID(user.getId());
			/*
			while(this.getDao().hasNext()) {
				user = (CUser) this.getDao().read(user);
			
				if(user.getId().equals(vLogin.getUserID())){
					if(user.getPassword().equals(vLogin.getPassword())){
						vUser.seteLoginResult(ELoginResult.success);
						vUser.setname(user.getName());
						vUser.setUserID(user.getId());
					}else{ 
						vUser.seteLoginResult(ELoginResult.passwordError);
					}
					this.getDao().disconnect();
					return vUser;
				}
			}
			*/
			return vUser;
		}catch (FileNotFoundException e){
		//	e.printStackTrace();
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;
		}
	}
}

