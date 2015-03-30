package DAOs;
import java.io.*;

import entity.CGangjwa;

public class CGangjwaDAO {
	public CGangjwa read() {return null;}
	
	public void write(CGangjwa gangjwa){
		//강좌내용출ㄹ력
		System.out.println("강좌 인원 : "+gangjwa.getSuganginwon()+"명 ");
		System.out.println("강좌 반: "+gangjwa.getName());
	
		//serialize
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
 }
