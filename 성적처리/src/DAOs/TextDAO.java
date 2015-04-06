package DAOs;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.*;

import entity.CEntity;


//ADD ���Ͽ����ϰ� ���°͸���°�..
public class TextDAO implements IDAO { 

	@Override
	public Object read(Class clazz,String filename) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(new File(filename));
			//��Ƽĳġ
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
		//�̰ɸ��÷���
		Field[] fields =object.getClass().getDeclaredFields();
		
	}

}
