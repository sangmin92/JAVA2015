package DAOs;

import entity.CEntity;

//인터페이스만들기 함수만가짐
public interface IDAO {
	public Object read(CEntity entity, String filename);
	public void write(Object object,String filename);
	//
}
