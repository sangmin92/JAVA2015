package control;
import entity.Clogininfo;

public class CLoginControl extends CControl {

	public Clogininfo login(Clogininfo logininfo) {
		this.getDao().connect("member.txt"); // surround trycatch 로직컨컨트롤  아래꺼 try diconnect 얘도 getdao
		whie(true){ 
			CLogininfo logininfodao = new (Clogininfo)this.getdao().read();
			if(logininfodao.getUserID()==logininfo.getUserID()){
				if(logininfodao.getPassword()==logininfo.getPassword()){
					logininfo.seteloginresult(eLoginesult.succees);
				}
			}
		}
		CLogininfo logininfo =(Clogininfo)this.getDao().read();
		this.getDao().disconnect();
		return logininfo;
	
		
		
		/*	Vector<CEntity> list = ((TextDAO)dao).read(entity, "member.txt");
		Scanner scanner = new Scanner(System.in);
		String searchid;
		String searchpw;
		System.out.println("사용자의 아이디 입력 : ");
		searchid=scanner.next();
		for (CEntity data : list) {
			if (((CMember) data).getUserID().equals(searchid)) {
				System.out.println("사용자의 비밀번호 입력 : ");
				searchpw=scanner.next();
				if (((CMember) data).getPassword().equals(searchpw)) {
					System.out.println("환영합니다. ");
					scanner.close();
					return entity;
				} else {
					System.out.println("패스워드가 틀렸습니다. ");
					scanner.close();
					return null;
				}
			}
		}
		scanner.close();
		System.out.println("해당 사용자 아이디가 없습니다. ");
		return null;
		*/
		
		
	}
}
