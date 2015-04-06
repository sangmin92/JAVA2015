package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.*;

import entity.CEntity;


//ADD 파일오픈하고 쓰는것만드는것..
public class TextDAO implements IDAO { 

	@Override
	public Object read(Class clazz,String filename) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(new File(filename));
			//멀티캐치
			try {
				CEntity entity = (CEntity) clazz.newInstance();
				entity.read(scanner);
				return entity;
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public void write(Object object, String filename) {
		// TODO Auto-generated method stub
		//이걸리플렉션
		Field[] fields =object.getClass().getDeclaredFields();
		
	}

}
