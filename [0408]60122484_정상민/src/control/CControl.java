package control;

import DAOs.IDAO;
import entity.CEntity;

public class CControl {
	protected IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;}
	public  CEntity process(CEntity entity) {
		return entity;
	}	
}
