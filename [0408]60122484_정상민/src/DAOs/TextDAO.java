package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



import entity.CEntity;

public class TextDAO implements IDAO {
	private Scanner scanner;
	
	@Override
	public void connect(String name) throws FileNotFoundException {
		this.scanner = new Scanner(new File(name));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		this.scanner.close();
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public CEntity read() {
		CEntity entity = new CEntity();
		
			entity.read(scanner);
			return entity;
	}

	@Override
	public void write(CEntity entity) {
		// TODO Auto-generated method stub
	}


}
