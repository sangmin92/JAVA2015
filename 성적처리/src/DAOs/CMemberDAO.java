package DAOs;
import java.io.BufferedWriter;
import java.io.FileWriter;

import entity.CMember;

public class CMemberDAO {		//data read or write
	public CMember read() {return null;}
	public void write(CMember member) {
		System.out.println("idpassword �ؽ�Ʈ  ����غ���.");
	
		
		for(int i=0;i<5;i++){
			System.out.print("id : "+member.getMemberlist().get(i).getUserID()+" / ");
			System.out.println("password : "+member.getMemberlist().get(i).getPassword()+" ");
		}
		String Newfile="newfile.txt";
		
		try{
			//���ϰ�ü����
			System.out.println("newfile�� ���ο� �ؽ�Ʈ�� �����մϴ�");
			System.out.println("newfile�� idpassword �ؽ�Ʈ�� �����մϴ�");
			BufferedWriter fw = new BufferedWriter(new FileWriter(Newfile, true));
			for(int i=0;i<5;i++){
				fw.write(member.getMemberlist().get(i).getUserID()+" ");
				fw.write(member.getMemberlist().get(i).getPassword()+" ");
				fw.newLine();
			}
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
//data access object