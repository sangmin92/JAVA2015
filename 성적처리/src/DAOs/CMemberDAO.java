package DAOs;
import java.io.BufferedWriter;
import java.io.FileWriter;

import entity.CMember;

public class CMemberDAO {		//data read or write
	public CMember read() {return null;}
	public void write(CMember member) {
		System.out.println("idpassword 텍스트  출력해보기.");
	
		
		for(int i=0;i<5;i++){
			System.out.print("id : "+member.getMemberlist().get(i).getUserID()+" / ");
			System.out.println("password : "+member.getMemberlist().get(i).getPassword()+" ");
		}
		String Newfile="newfile.txt";
		
		try{
			//파일객체생성
			System.out.println("newfile란 새로운 텍스트를 생성합니다");
			System.out.println("newfile에 idpassword 텍스트를 복사합니다");
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