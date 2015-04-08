package DAOs;

import java.util.Vector;

import entity.CEntity;

public interface IDAO {
	public Vector<CEntity> read(CEntity entity, String fileName);
	public void write(Object object, String fileName);
}
