package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import entity.CEntity;
import entity.CMember;

public class TextDAO implements IDAO {

	@Override
	public Vector<CEntity> read(CEntity entity, String fileName) {
		Vector<CEntity> list = new Vector<CEntity>();
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNextLine()) {
				CMember temp = new CMember();
				temp.read(scanner);
				list.add(temp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return list;
	}

	@Override
	public void write(Object object, String fileName) {
		// TODO Auto-generated method stub
	}

}
