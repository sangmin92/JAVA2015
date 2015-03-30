package DAOs;
import java.io.*;

import entity.CGwamok;

public class CGwamokDAO {
	public CGwamok read() {return null;}
	
	public void write(CGwamok gwamok){
		//과목내용출력
		System.out.println("과목명 : "+gwamok.getName());
		System.out.println("학점 : "+gwamok.getHakjum());
		
	
		//serialize
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("g"));
			out.writeObject(gwamok);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
 }
