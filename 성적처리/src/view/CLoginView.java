package view;

import java.io.*;
import java.util.StringTokenizer;

import entity.CMember;

public class CLoginView {
	

	public CMember login() {
		CMember member = new CMember();
		String textfilename= "idpassword.txt";
		String thisLine= "";
		StringTokenizer token;
		
		try{
			FileInputStream fin = new FileInputStream(textfilename);
			BufferedReader myInput = new BufferedReader(new InputStreamReader(fin));
			
			while((thisLine = myInput.readLine()) != null){
				token = new StringTokenizer(thisLine, " ");
				CMember idpassword = new CMember();
				for(int i = 0; token.hasMoreTokens(); i++){
					if(i == 0){
						idpassword.setUserID(token.nextToken());
					}else{
						idpassword.setPassword(token.nextToken());
					}
				}
				member.getMemberlist().add(idpassword);
			}
			myInput.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		

		return member;
			
	}

}
