package DAOs;
import java.io.*;

import entity.CGangjwa;

public class CGangjwaDAO {
	public CGangjwa read() {return null;}
	
	public void write(CGangjwa gangjwa){
		//���³����⤩��
		System.out.println("���� �ο� : "+gangjwa.getSuganginwon()+"�� ");
		System.out.println("���� ��: "+gangjwa.getName());
	
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
