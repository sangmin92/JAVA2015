package DAOs;
import java.io.*;

import entity.CGwamok;

public class CGwamokDAO {
	public CGwamok read() {return null;}
	
	public void write(CGwamok gwamok){
		//���񳻿����
		System.out.println("����� : "+gwamok.getName());
		System.out.println("���� : "+gwamok.getHakjum());
		
	
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
