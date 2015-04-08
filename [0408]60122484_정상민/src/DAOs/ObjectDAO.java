package DAOs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import entity.CEntity;

public class ObjectDAO implements IDAO {

	public Vector<CEntity> read(CEntity entity, String fileName) {
		Vector<CEntity> list = new Vector<CEntity>();
		Object object = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					fileName));
			object = in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void write(Object object, String fileName) {
		// serialize
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(fileName));
			out.writeObject(object);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
