package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

public class TextDAO implements IDAO{
	//Attribute
	private Scanner scanner;
	//Method
	@Override
	public void connect(String name) throws FileNotFoundException{
		// TODO Auto-generated method stub	
		this.scanner = new Scanner(new File(name));
	}
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		this.scanner.close();
	}
	@Override
	public CEntity read(CEntity entity,String ID) {
		while(scanner.hasNext()){
			entity.read(scanner);
			if(entity.getId().equals(ID)){
				return entity;
			}
		}
		return null;
	}
	@Override
	public void write(CEntity entity) {
		entity.write(scanner);
		
	}

}
